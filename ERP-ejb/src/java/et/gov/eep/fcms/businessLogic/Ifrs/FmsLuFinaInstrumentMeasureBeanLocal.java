/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.fcms.businessLogic.Ifrs;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import et.gov.eep.fcms.entity.Ifrs.FmsLuFinaInstrumentMeasure;

/**
 *
 * @author mz
 */
@Local
public interface FmsLuFinaInstrumentMeasureBeanLocal {

    public List<FmsLuFinaInstrumentMeasure> searchall();

    public List<FmsLuFinaInstrumentMeasure> defualtAndPL();

    public ArrayList<FmsLuFinaInstrumentMeasure> searchfinIntMeasureList(FmsLuFinaInstrumentMeasure finInstMeasure);

}
