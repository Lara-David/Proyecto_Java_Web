/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Local;
import proyecto.entidades.Region;

/**
 *
 * @author luisd
 */
@Local
public interface RegionFacadeLocal {

    void create(Region region);

    void edit(Region region);

    void remove(Region region);

    Region find(Object id);

    List<Region> findAll();

    List<Region> findRange(int[] range);

    int count();
    
}
