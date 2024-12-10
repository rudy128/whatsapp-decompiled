package com.google.firebase.ktx;

import X.C18070vi;
import X.C18520wb;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public List getComponents() {
        List singletonList = Collections.singletonList(C18520wb.A00("fire-core-ktx", "20.4.2"));
        C18070vi.A0X(singletonList);
        return singletonList;
    }
}
