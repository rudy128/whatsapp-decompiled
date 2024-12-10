package X;

import androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1;
import androidx.compose.foundation.ClickableKt$handlePressInteraction$2;

/* renamed from: X.0AX  reason: invalid class name */
public abstract class AnonymousClass0AX extends C014308l implements C17690v4, C17540up, C17560ur {
    public C17210uI A00;
    public boolean A01;
    public C18090vk A02;
    public final C03200Ha A03;
    public final C17680v3 A04;
    public final C18090vk A05;

    public /* synthetic */ AnonymousClass0AX(C03200Ha r1, C17210uI r2, C18090vk r3, AnonymousClass1Y1 r4, boolean z) {
        this(r1, r2, r3, z);
    }

    public static final Object A01(C03200Ha r5, C17720v7 r6, C17210uI r7, C30391dr r8, C18090vk r9, long j) {
        Object A002 = AnonymousClass1OW.A00(r8, new ClickableKt$handlePressInteraction$2(r5, r6, r7, (C30391dr) null, r9, j));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public abstract Object A0P(C17730v8 r1, C30391dr r2);

    public /* synthetic */ Object BPr(AnonymousClass0OJ r2) {
        return C02670Ex.A00(this, r2);
    }

    public final Object A0O(C17720v7 r8, C30391dr r9, long j) {
        Object A022;
        C17210uI r2 = this.A00;
        if (r2 == null || (A022 = A01(this.A03, r8, r2, r9, this.A05, j)) != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A022;
    }

    /* renamed from: Bnm */
    public void CA7() {
        this.A04.Bnm();
    }

    public void C0v(AnonymousClass0Hm r2, AnonymousClass0CQ r3, long j) {
        this.A04.C0v(r2, r3, j);
    }

    public AnonymousClass0AX(C03200Ha r3, C17210uI r4, C18090vk r5, boolean z) {
        this.A01 = z;
        this.A00 = r4;
        this.A02 = r5;
        this.A03 = r3;
        this.A05 = new C07760e0(this);
        AnonymousClass09X A022 = AnonymousClass0PB.A02(new AbstractClickablePointerInputNode$pointerInputNode$1(this, (C30391dr) null));
        A0N(A022);
        this.A04 = A022;
    }

    public final C18090vk A0Q() {
        return this.A02;
    }

    public /* synthetic */ C02080Cq BXh() {
        return AnonymousClass0AP.A00;
    }

    public /* synthetic */ boolean Bdj() {
        return false;
    }

    public /* synthetic */ boolean CLc() {
        return false;
    }

    public final void A0R(C18090vk r1) {
        this.A02 = r1;
    }
}
