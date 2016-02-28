package ListModels;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by reiner on 2/27/2016.
 */
public class UiModels {

   public static ObservableList getBarangayListModel(){

       ObservableList<String> baranagayList = FXCollections.observableArrayList();
       baranagayList.add("Atlo Bola");
       baranagayList.add("Bical");
       baranagayList.add("Bundangul");
       baranagayList.add("Cacutud");
       baranagayList.add("Calumpang");
       baranagayList.add("Camchilles");
       baranagayList.add("Dapdap");
       baranagayList.add("Dau");
       baranagayList.add("Dolores");
       baranagayList.add("Duquit");
       baranagayList.add("Lakandula");
       baranagayList.add("Mabiga");
       baranagayList.add("Macapagal village");
       baranagayList.add("Mamatitang");
       baranagayList.add("Mangalit");
       baranagayList.add("Marcos village");
       baranagayList.add("Mawaque");
       baranagayList.add("Paralayunan");
       baranagayList.add("Publasyon");
       baranagayList.add("San Francisco");
       baranagayList.add("San Joaquin");
       baranagayList.add("Sta. Ines");
       baranagayList.add("Sta. Maria");
       baranagayList.add("Sto. Rosario");
       baranagayList.add("Sapang Balen");
       baranagayList.add("Sapang Biabas");
       baranagayList.add("Tabun");

       return  baranagayList;

   }

    public static ObservableList<String> getMonthListModel(){
        ObservableList<String> monthList = FXCollections.observableArrayList();

        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");

        return  monthList;
    }

    public static ObservableList<String> getChildrenSchoolCategoryList(){

        ArrayList list = new ArrayList(Arrays.asList(ChildrenSchoolCategory.values()));
        ObservableList<String> childrenCategoriesList = FXCollections.observableArrayList(list);
        return  childrenCategoriesList;
    }


}