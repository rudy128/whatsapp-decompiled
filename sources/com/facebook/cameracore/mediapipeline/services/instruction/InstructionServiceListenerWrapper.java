package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass7Q7;
import X.C17890vO;
import X.C185449cb;
import X.C21452AkJ;
import X.C27082DTh;
import android.os.Handler;
import java.util.List;

public class InstructionServiceListenerWrapper {
    public final C185449cb mListener;
    public final Handler mUIHandler = C17890vO.A0D();

    public void setVisibleAutomaticInstruction(int i, List list, List list2, List list3) {
        List list4 = list3;
        this.mUIHandler.post(new AnonymousClass7Q7(this, list4, list, list2, i, 2));
    }

    public void hideInstruction() {
        this.mUIHandler.post(new C27082DTh((Object) this, 3));
    }

    public void showInstructionForToken(String str) {
        this.mUIHandler.post(new C21452AkJ(4, str, this));
    }

    public void showInstructionWithCustomText(String str) {
        this.mUIHandler.post(new C21452AkJ(5, str, this));
    }

    public InstructionServiceListenerWrapper(C185449cb r2) {
        this.mListener = r2;
    }
}
