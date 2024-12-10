package X;

import androidx.work.impl.WorkDatabase;

/* renamed from: X.AHb  reason: case insensitive filesystem */
public class C20345AHb implements B4L {
    public final B4Q A00;
    public final BD8 A01;
    public final C71973Kb A02;

    static {
        A5Z.A01("WMFgUpdater");
    }

    public C20345AHb(WorkDatabase workDatabase, B4Q b4q, C71973Kb r4) {
        this.A00 = b4q;
        this.A02 = r4;
        this.A01 = workDatabase.A0E();
    }
}
