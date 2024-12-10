package X;

/* renamed from: X.2R0  reason: invalid class name */
public enum AnonymousClass2R0 {
    A03("IMAGE_UNDERSTANDING", "image_understanding"),
    A02("AUDIO_UNDERSTANDING", "audio_understanding");
    
    public final String capability;
    public final long flagValue;

    /* access modifiers changed from: public */
    static {
        AnonymousClass2R0[] r1;
        A00 = C19780yz.A00(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass2R0(String str, String str2) {
        this.capability = str2;
        this.flagValue = 1 << (r5 - 1);
    }
}
