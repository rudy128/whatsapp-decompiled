package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallerypicker.PhotoViewPager;
import java.util.HashSet;

/* renamed from: X.7J3  reason: invalid class name */
public final class AnonymousClass7J3 implements AnonymousClass87N {
    public float A00;
    public float A01;
    public AnonymousClass87N A02;
    public AnonymousClass85E A03;
    public final Context A04;
    public final RecyclerView A05;
    public final C18000vb A06;
    public final PhotoViewPager A07;
    public final C131086kU A08;
    public final C112155l1 A09;
    public final boolean A0A;
    public final C18030ve A0B;

    public AnonymousClass7J3(RecyclerView recyclerView, AnonymousClass1T1 r35, C25131Mz r36, C18000vb r37, AnonymousClass2E5 r38, AnonymousClass1KW r39, C18030ve r40, AnonymousClass73D r41, C136166tN r42, PhotoViewPager photoViewPager, C34501ka r44, C25291Nq r45, AnonymousClass7JS r46, C131086kU r47, C26631Sw r48, C26521Sl r49, HashSet hashSet) {
        RecyclerView recyclerView2 = recyclerView;
        C18070vi.A0d(recyclerView2, 1);
        PhotoViewPager photoViewPager2 = photoViewPager;
        C26521Sl r4 = r49;
        AnonymousClass1KW r20 = r39;
        C18070vi.A0p(photoViewPager2, r20, r4);
        C34501ka r7 = r44;
        C18070vi.A0d(r7, 5);
        C18000vb r10 = r37;
        C131086kU r6 = r47;
        C18030ve r9 = r40;
        AnonymousClass73D r16 = r41;
        C136166tN r8 = r42;
        C18070vi.A0x(r6, r8, r10, r9, r16);
        AnonymousClass7JS r12 = r46;
        HashSet hashSet2 = hashSet;
        C25131Mz r17 = r36;
        C26631Sw r5 = r48;
        AnonymousClass2E5 r19 = r38;
        C18070vi.A0y(r12, hashSet2, r17, r5, r19);
        C25291Nq r1 = r45;
        AnonymousClass1T1 r18 = r35;
        C18070vi.A0m(r1, r18);
        this.A05 = recyclerView2;
        this.A07 = photoViewPager2;
        this.A08 = r6;
        this.A06 = r10;
        this.A0B = r9;
        boolean A002 = C138766xe.A00(r12.A0A);
        this.A0A = A002;
        Context A042 = AnonymousClass3MY.A04(recyclerView2);
        this.A04 = A042;
        int i = A002 ? 2131168912 : 2131168010;
        Context context = A042;
        AnonymousClass1T1 r162 = r18;
        C18000vb r182 = r10;
        this.A09 = new C112155l1(context, r162, r17, r182, r19, r20, r9, r16, r8, r7, r1, r12, r6, this, r5, r4, hashSet2, AnonymousClass3MZ.A01(A042, i));
        recyclerView2.setItemAnimator((C37961qT) null);
        recyclerView2.A0R = true;
    }

    public void C8c(int i) {
        AnonymousClass87N r0 = this.A02;
        if (r0 != null) {
            r0.C8c(i);
        }
    }
}
