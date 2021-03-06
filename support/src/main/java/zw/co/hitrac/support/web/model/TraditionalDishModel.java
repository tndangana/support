/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalDish;
import zw.co.hitrac.support.business.service.TraditionalDishService;

/**
 *
 * @author pchikumba
 */
public class TraditionalDishModel extends LoadableDetachableModel<TraditionalDish>{
 
  private Long id;  
    
  @SpringBean
    private TraditionalDishService traditionalDishService;
    public TraditionalDishModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected TraditionalDish load() {
        
      if (id==null){
         return new TraditionalDish();
      } else{
          return traditionalDishService.find(id);
      } 
    }

 
}
