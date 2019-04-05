/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tim
 */
public class ArrayListReader implements Reader{
   List <String> list;
  
    public ArrayListReader(){
        list = new ArrayList();
        list.add("hi");
        list.add("hello");
        list.add("hey");
        
      
    }

    @Override
    public String readln() {
        
        if(list.isEmpty()){
            return "";
        }else {
            return list.get(0);
        }
           
       
        
        
       
       
       }
    
    
}
