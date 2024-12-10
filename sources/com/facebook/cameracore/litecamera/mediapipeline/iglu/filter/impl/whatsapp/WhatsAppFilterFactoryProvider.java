package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.whatsapp;

import X.AnonymousClass1A8;
import X.C18070vi;
import X.C8M;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.SingleFilterFactory;

public final class WhatsAppFilterFactoryProvider {
    public static final C8M Companion = new Object();
    public boolean isLibraryLoaded;

    public static final native SingleFilterFactory createFilterFactoryNative(String str);

    public SingleFilterFactory createFilterFactory(String str) {
        C18070vi.A0d(str, 0);
        if (!this.isLibraryLoaded) {
            AnonymousClass1A8.A06("mediapipeline-iglufilter-whatsapp");
            this.isLibraryLoaded = true;
        }
        return createFilterFactoryNative(str);
    }
}
