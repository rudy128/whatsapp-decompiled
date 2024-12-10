package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.creator.PollCreatorViewModel;

/* renamed from: X.96h  reason: invalid class name and case insensitive filesystem */
public final class C1769296h extends AnonymousClass8IL {
    public int A00 = -1;
    public final Drawable A01;
    public final WaEditText A02;
    public final AnonymousClass11C A03;
    public final PollCreatorViewModel A04;
    public final C28931bI A05;
    public final C28931bI A06;
    public final C19880zA A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1769296h(View view, C19880zA r16, AnonymousClass11C r17, C18000vb r18, AnonymousClass1L2 r19, AnonymousClass1KW r20, C18030ve r21, PollCreatorViewModel pollCreatorViewModel, C18010vc r23) {
        super(view);
        AnonymousClass1KW r10 = r20;
        C18030ve r11 = r21;
        int A0G = C72453Mb.A0G(r11, r10, 1);
        AnonymousClass11C r3 = r17;
        C18000vb r5 = r18;
        C18010vc r13 = r23;
        C72473Md.A1M(r3, r5, r13, 3);
        AnonymousClass1L2 r9 = r19;
        C19880zA r4 = r16;
        C18070vi.A0q(r9, r4, view);
        PollCreatorViewModel pollCreatorViewModel2 = pollCreatorViewModel;
        C18070vi.A0d(pollCreatorViewModel2, 9);
        this.A03 = r3;
        this.A07 = r4;
        this.A04 = pollCreatorViewModel2;
        WaEditText waEditText = (WaEditText) C18070vi.A05(view, 2131433929);
        this.A02 = waEditText;
        this.A05 = C28931bI.A00(view, 2131430188);
        this.A06 = C28931bI.A00(view, 2131432341);
        Drawable mutate = AnonymousClass3MX.A06(view.getContext(), 2131231872).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130971978, 2131103153), PorterDuff.Mode.SRC_ATOP));
        this.A01 = mutate;
        waEditText.setRawInputType(16385);
        AFX.A00(waEditText, this, 11);
        InputFilter[] inputFilterArr = new InputFilter[A0G];
        inputFilterArr[0] = new InputFilter.LengthFilter(2500);
        C72453Mb.A1H(waEditText, inputFilterArr, C18020vd.A00(C18040vf.A02, r11, 1407), 1);
        AnonymousClass1Y5.A05(waEditText, 2131894681);
        mutate.setAlpha(0);
        if (AnonymousClass3MW.A1Z(r5)) {
            waEditText.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            waEditText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        waEditText.addTextChangedListener(new AnonymousClass9AK(r9, r10, r11, this, r13));
    }
}
