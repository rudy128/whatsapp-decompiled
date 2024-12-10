package com.whatsapp.messagetranslation;

import X.AnonymousClass1DF;
import X.C18070vi;
import X.C18100vl;
import X.C181449Qn;
import X.C21539Alm;
import X.C72453Mb;
import com.whatsapp.unity.UnityLib;
import com.whatsapp.unity.UnityTranslationResult;
import java.util.List;

public final class UnityMessageTranslation {
    public static final C181449Qn Companion = new Object();
    public final C18100vl nativeObject$delegate;

    public UnityMessageTranslation(String str) {
        C18070vi.A0d(str, 1);
        UnityLib.A00.A01();
        this.nativeObject$delegate = AnonymousClass1DF.A01(new C21539Alm(str));
    }

    public static final native long create(String str);

    public static final long nativeObject_delegate$lambda$0(String str) {
        C18070vi.A0d(str, 0);
        return create(str);
    }

    public static final native void release(long j);

    public static final native UnityTranslationResult translateText(List list, long j);

    public final UnityTranslationResult translate(List list) {
        C18070vi.A0d(list, 0);
        return translateText(list, C72453Mb.A0K(this.nativeObject$delegate));
    }

    private final long getNativeObject() {
        return C72453Mb.A0K(this.nativeObject$delegate);
    }

    public final void release() {
        release(C72453Mb.A0K(this.nativeObject$delegate));
    }
}
