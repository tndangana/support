package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.Religion;
import zw.co.hitrac.support.business.service.ReligionService;

import zw.co.hitrac.support.web.model.ReligionModel;
import zw.co.hitrac.support.web.page.HomePage;

/**
 *
 * @author pchikumba 27/04/2016
 *
 */
public class ReligionEditPage extends WebPage {

    private ReligionModel religionModel;

    @SpringBean
    private ReligionService religionService;

    public ReligionEditPage(PageParameters parameters) {
        super(parameters);
        createReligionModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", HomePage.class));
        Form<Religion> form = new Form<Religion>("form", new CompoundPropertyModel<Religion>(religionModel));;
        form.add(new RequiredTextField("religiontype"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Religion religion = religionModel.getObject();
                religionService.save(religion);
                setResponsePage(ReligionListPage.class);
            }
        });
        add(form);

    }

    private void createReligionModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        religionModel = new ReligionModel(id);

    }

}
