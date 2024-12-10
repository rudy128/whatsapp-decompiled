package X;

/* renamed from: X.33X  reason: invalid class name */
public final class AnonymousClass33X implements AnonymousClass3L1 {
    public final AnonymousClass00H A00;

    public AnonymousClass33X(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void C19(C20077A6d a6d, AnonymousClass206 r5) {
        Integer num;
        C18070vi.A0d(r5, 1);
        C20944Aby aby = (C20944Aby) r5.A0M(C20944Aby.class).A02;
        if (aby != null && (num = aby.A01) != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                AnonymousClass72E.A01((AnonymousClass72E) this.A00.get(), 0);
            } else if (intValue == 1) {
                AnonymousClass72E r2 = (AnonymousClass72E) this.A00.get();
                synchronized (r2) {
                    if (!r2.A04()) {
                        r2.A05.get();
                        AnonymousClass72E.A01(r2, System.currentTimeMillis());
                    }
                }
            }
        }
    }
}
