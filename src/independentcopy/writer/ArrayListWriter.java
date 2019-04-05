/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tim
 */
public class ArrayListWriter implements Writer {
    
    List<String> list;
    
    public ArrayListWriter(){
        list = new ArrayList();
    }

    @Override
    public void writeln(String line) {
        
        list.add(line);
  
    }
    
}
