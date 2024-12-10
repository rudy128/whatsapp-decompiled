package X;

import java.lang.ref.WeakReference;

/* renamed from: X.8fg  reason: invalid class name and case insensitive filesystem */
public class C167238fg extends C167258fi implements B8O {
    public final C188539ha A00;
    public final WeakReference A01;

    public C167238fg(C182679Vh r14, String str, String str2, WeakReference weakReference) {
        AnonymousClass10E r1 = r14.A00.A00;
        C18030ve A8r = AnonymousClass10E.A8r(r1);
        AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r1);
        this.A00 = new C188539ha(AnonymousClass3MY.A0N(r1), C108965cb.A0H(r1), A0l, A8r, AnonymousClass8BT.A0J(r1), this, (C25461Oh) r1.A76.get(), (C24481Km) r1.AA8.get(), (C220418j) r1.A9d.get(), str, str2);
        this.A01 = weakReference;
    }

    public boolean BeV() {
        return this.A02.isCancelled();
    }
}
