package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.1rQ  reason: invalid class name and case insensitive filesystem */
public final class C38521rQ {
    public final Context A00;
    public final Fragment A01;
    public final AnonymousClass11C A02;
    public final C18030ve A03;
    public final C38501rO A04;
    public final C36401np A05;
    public final C28931bI A06;
    public final boolean A07;
    public final View A08;
    public final AnonymousClass17N A09 = ((AnonymousClass17N) AnonymousClass12Q.A02(AnonymousClass114.A00(), 16447));

    public C38521rQ(View view, Fragment fragment, AnonymousClass11C r6, C18030ve r7, C38501rO r8, C36401np r9, boolean z) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(view, 5);
        this.A03 = r7;
        this.A05 = r9;
        this.A02 = r6;
        this.A04 = r8;
        this.A08 = view;
        this.A07 = z;
        this.A01 = fragment;
        this.A00 = view.getContext();
        C28931bI r2 = new C28931bI(view.findViewById(2131429647));
        r2.A07(new AnonymousClass3AR(this, 5));
        this.A06 = r2;
    }
}
