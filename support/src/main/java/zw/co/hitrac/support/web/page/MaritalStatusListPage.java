/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.MaritalStatus;
import zw.co.hitrac.support.web.model.MaritalStatusListModel;

/**
 *
 * @author hitrac
 */
public class MaritalStatusListPage extends WebPage {
    
    
    public MaritalStatusListPage(PageParameters parameters) {
        super(parameters);

        add(new BookmarkablePageLink("new", MaritalStatusEditPage.class));
        add(new PropertyListView<MaritalStatus>("maritalstatus", new MaritalStatusListModel()){

            @Override
            protected void populateItem(ListItem<MaritalStatus> item) {
               item.add(new Label("statustype"));
               
                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", MaritalStatusEditPage.class, pageParameters));
               
               
            }
            
            });

        }
    
    
    
}
