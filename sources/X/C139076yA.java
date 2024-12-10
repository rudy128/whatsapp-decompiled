package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.expressionstray.expression.stickers.StickerMakerChoiceBottomSheet;

/* renamed from: X.6yA  reason: invalid class name and case insensitive filesystem */
public final class C139076yA {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public static final void A00(Activity activity, C139076yA r19, AnonymousClass1BI r20, int i) {
        C138046wR r1 = (C138046wR) r19.A03.get();
        Activity activity2 = activity;
        C18070vi.A0d(activity2, 0);
        AnonymousClass1BI r6 = r20;
        C18070vi.A0d(r6, 1);
        r1.A01.get();
        Intent A0d = AnonymousClass1LU.A0d(activity2, r6, (AnonymousClass1EC) null, AnonymousClass6WK.A00(r6), (Integer) null, "", C18460wS.A00, 1, i, 37, 0, false, true, false, false);
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r1.A00), 9646)) {
            A0d.putExtra("default_tab", 0);
        }
        A0d.putExtra("include_media", 1);
        A0d.putExtra("should_hide_caption_view", true);
        A0d.putExtra("disable_shared_activity_transition_animation", true);
        activity2.startActivityForResult(A0d, 22);
    }

    public void A01(AnonymousClass1FL r22, AnonymousClass1BI r23, AnonymousClass778 r24, int i, int i2, boolean z) {
        AnonymousClass1FL r5 = r22;
        AnonymousClass1BI r6 = r23;
        AnonymousClass778 r2 = r24;
        int i3 = i;
        int i4 = i2;
        if (z || !((C133806pW) this.A04.get()).A00()) {
            if (!C25291Nq.A04((C18030ve) this.A00.get(), 11312)) {
                A00(r5, this, r6, i3);
                return;
            }
        } else if (!C25291Nq.A04((C18030ve) this.A00.get(), 11312)) {
            C20098A7b.A04(new StickerMakerChoiceBottomSheet(new AnonymousClass7wJ(r5, this, r2, i4), new AnonymousClass7wK(r5, this, r6, i3)), r5.getSupportFragmentManager(), "sticker_maker_choice_bottom_sheet");
            return;
        }
        ((C138046wR) this.A03.get()).A01.get();
        Intent A0d = AnonymousClass1LU.A0d(r5, r6, (AnonymousClass1EC) null, AnonymousClass6WK.A00(r6), 0, "", C18460wS.A00, 1, i3, 37, 0, false, true, false, true);
        A0d.putExtra("default_tab", 0);
        A0d.putExtra("include_media", 1);
        A0d.putExtra("should_hide_caption_view", true);
        A0d.putExtra("disable_shared_activity_transition_animation", true);
        A0d.putExtra("fun_sticker_data", r2);
        A0d.putExtra("sticker_picker_origin", i4);
        r5.startActivityForResult(A0d, 22);
    }

    public C139076yA(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r5;
    }
}
