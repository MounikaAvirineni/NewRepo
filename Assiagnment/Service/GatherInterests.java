package com.example.Assiagnment.Service;

import com.example.Assiagnment.model.IntersetList;
import com.example.Assiagnment.model.PersonInterests;

import java.lang.reflect.Array;
import java.util.*;

public class GatherInterests {

    private Map<String, List<PersonInterests>> filteredInterests ;

    public void gather(List<PersonInterests> filteringList){
        this.filteredInterests = new HashMap<String, List<PersonInterests>>();
        filteringList.stream().filter(x -> {
            if(!(filteredInterests.containsKey(x.getFirstName()) && filteredInterests.get(x.getFirstName()).size()>=2)){
                if (filteredInterests.containsKey(x.getFirstName())) {
                    filteredInterests.get(x.getFirstName()).add(x);
                } else {
                    filteredInterests.put(x.getFirstName(), Arrays.asList(x));
                }
            }

                    return false;
                }
        );
    }
}
