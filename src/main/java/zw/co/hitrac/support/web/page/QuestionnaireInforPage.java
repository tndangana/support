/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author TONDERAI NDANGANA
 * CREATED ON 02/05/2016
 */
public class QuestionnaireInforPage extends TemplatePage {

    public QuestionnaireInforPage(PageParameters parameters) {
        super(parameters);
        
             add(new BookmarkablePageLink("demographic",DemographicListPage.class));
             add(new BookmarkablePageLink("ps", PyschSupportListPage.class));
             add(new BookmarkablePageLink("employmentdetail", EmploymentDetailListPage.class));
              add(new BookmarkablePageLink("agricactivity", AgricActivityListPage.class));
              add(new BookmarkablePageLink("nutrition", NutritionListPage.class));
             
            
             
             
        
    }
    
    

    

   
    
    
    
}
