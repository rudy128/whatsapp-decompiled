package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.stickers.StickerView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3tR  reason: invalid class name */
public final class AnonymousClass3tR extends AnonymousClass3uL implements C108405be {
    public int A00;
    public int A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final FrameLayout A09 = ((FrameLayout) C18070vi.A05(this, 2131429617));
    public final WaImageView A0A = ((WaImageView) C18070vi.A05(this, 2131431862));
    public final ViewGroup A0B = ((ViewGroup) C18070vi.A05(this, 2131432248));
    public final ConstraintLayout A0C = ((ConstraintLayout) C18070vi.A05(this, 2131431005));
    public final TextEmojiLabel A0D = C72453Mb.A0c(this, 2131428830);
    public final TextEmojiLabel A0E = C72453Mb.A0c(this, 2131436458);
    public final TextEmojiLabel A0F = C72453Mb.A0c(this, 2131436466);
    public final C28931bI A0G = C28931bI.A00(this, 2131431009);

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public void CKk() {
        this.A06 = true;
        Iterator A002 = C99434so.A00(this.A09, 1);
        while (A002.hasNext()) {
            View view = (View) A002.next();
            if (view instanceof StickerView) {
                StickerView stickerView = (StickerView) view;
                stickerView.A02 = true;
                stickerView.A07();
            }
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void setFMessage(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        C17960vV.A0H(r4 instanceof C441522i, AnonymousClass001.A1E(r4, "Expected a message of type FMessageStickerPack but instead found ", AnonymousClass000.A10()));
        super.setFMessage(r4);
    }

    public final void setStickerHandlerFactory(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setStickerPackZipEntrySaver(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWamRuntime(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public static final void A01(Context context, AnonymousClass3tR r8, C441522i r9) {
        String str = r9.A06;
        if (str != null) {
            C219217x r0 = r8.A03;
            C18070vi.A0W(r0);
            Long l = null;
            boolean A17 = C18070vi.A17(context, r0);
            if (!r0.A0G()) {
                context.startActivity(AnonymousClass74O.A03(context, 2131894471, 2131894471, false));
            } else if (A17) {
                if (C18020vd.A05(C18040vf.A02, r8.A0F, 12217)) {
                    C47102Hc r1 = new C47102Hc();
                    r1.A00 = 4;
                    List list = r9.A08;
                    if (list != null) {
                        l = C17880vN.A0n(list.size());
                    }
                    r1.A02 = l;
                    r1.A01 = Integer.valueOf(C64002u3.A04(r9.A0v.A00));
                    ((AnonymousClass18K) r8.getWamRuntime().get()).CC7(r1);
                }
                Iterator A002 = C99434so.A00(r8.A09, 1);
                while (A002.hasNext()) {
                    View view = (View) A002.next();
                    if (view instanceof StickerView) {
                        StickerView stickerView = (StickerView) view;
                        if (!stickerView.A02) {
                            stickerView.A08();
                        }
                    }
                }
                AnonymousClass205 r3 = r9.A0v;
                C18070vi.A0W(r3);
                C18070vi.A0d(context, 0);
                Intent intent = new Intent();
                intent.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity");
                intent.putExtra("sticker_pack_id", str);
                AnonymousClass4aU.A00(intent, r3);
                intent.putExtra("sticker_pack_preview_source", 6);
                context.startActivity(intent);
            }
        }
    }

    public static final void A02(AnonymousClass3tR r11, C1418377d r12, int i) {
        Context context = r11.A08;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166306);
        StickerView stickerView = new StickerView(context);
        stickerView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = i;
        stickerView.setLayoutParams(layoutParams);
        stickerView.setImportantForAccessibility(2);
        stickerView.A02 = r11.A06;
        r11.A09.addView(stickerView);
        r11.A1P.A06(new C59842my(stickerView, r12, new AnonymousClass7MK(r11, 0), dimensionPixelSize, dimensionPixelSize, 1, 0, true, true, false));
    }

    public static final void A03(AnonymousClass3tR r4, boolean z) {
        r4.A01++;
        if (z) {
            r4.A00++;
        }
        int thumbnailStickersToLoad = r4.getThumbnailStickersToLoad();
        int i = r4.A00;
        if (i == thumbnailStickersToLoad || (r4.A01 == thumbnailStickersToLoad && i > 0 && !r4.A05)) {
            r4.A0A.setVisibility(8);
            FrameLayout frameLayout = r4.A09;
            frameLayout.setVisibility(0);
            Iterator A002 = C99434so.A00(frameLayout, 1);
            while (A002.hasNext()) {
                View view = (View) A002.next();
                if (view instanceof StickerView) {
                    StickerView stickerView = (StickerView) view;
                    if (AnonymousClass73J.A00) {
                        stickerView.A00 = 7;
                    } else {
                        stickerView.A00 = 1;
                        if (!stickerView.A02) {
                        }
                    }
                    if (r4.A0v.A2H()) {
                        stickerView.A07();
                    }
                }
            }
        }
    }

    public void A1M() {
        if (!this.A07) {
            this.A07 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            AnonymousClass3tU.A08(r1, r4, r2, this);
            this.A02 = C000200d.A00(r4.Ajt);
            this.A03 = C000200d.A00(r4.Ak1);
            this.A04 = C000200d.A00(r4.A9B);
        }
    }

    public void CNi() {
        StickerView stickerView;
        Iterator A002 = C99434so.A00(this.A09, 1);
        while (A002.hasNext()) {
            View view = (View) A002.next();
            if ((view instanceof StickerView) && (stickerView = (StickerView) view) != null) {
                stickerView.A07();
            }
        }
    }

    public void COV() {
        StickerView stickerView;
        Iterator A002 = C99434so.A00(this.A09, 1);
        while (A002.hasNext()) {
            View view = (View) A002.next();
            if ((view instanceof StickerView) && (stickerView = (StickerView) view) != null) {
                stickerView.A08();
            }
        }
    }

    public C441522i getFMessage() {
        AnonymousClass21V r1 = (AnonymousClass21V) this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.stickerpack.fmessage.FMessageStickerPack");
        return (C441522i) r1;
    }

    public final AnonymousClass00H getStickerHandlerFactory() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stickerHandlerFactory");
        throw null;
    }

    public final AnonymousClass00H getStickerPackZipEntrySaver() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stickerPackZipEntrySaver");
        throw null;
    }

    public final AnonymousClass00H getWamRuntime() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("wamRuntime");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3tR(Context context, C108875cR r3, C441522i r4) {
        super(context, r3, r4);
        C18070vi.A0j(context, r4);
        A1M();
        this.A08 = context;
        A00();
    }

    private final void A00() {
        C441522i fMessage = getFMessage();
        ConstraintLayout constraintLayout = this.A0C;
        constraintLayout.setClipToOutline(true);
        this.A0D.setText(fMessage.A18());
        this.A0F.setText(fMessage.A03);
        String str = fMessage.A04;
        if (str == null || str.length() == 0) {
            List list = fMessage.A08;
            if (list != null && !list.isEmpty()) {
                TextEmojiLabel textEmojiLabel = this.A0E;
                Resources resources = this.A08.getResources();
                int size = list.size();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, list.size());
                textEmojiLabel.setText(resources.getQuantityString(2131755413, size, objArr));
            }
        } else {
            this.A0E.setText(str);
        }
        AnonymousClass205 r4 = fMessage.A0v;
        if (!r4.A02) {
            this.A0G.A02();
        }
        C84084Hu.A00(constraintLayout, new C106115Up(this, fMessage));
        AnonymousClass3uP.A0W(constraintLayout, this);
        A2C(this.A0B, new C98814rl(this, fMessage, 31), 2131897962, true);
        A2N(fMessage);
        this.A05 = false;
        WaImageView waImageView = this.A0A;
        waImageView.setVisibility(0);
        this.A09.setVisibility(8);
        waImageView.setImageResource(2131233051);
        C32021gV r2 = this.A1S;
        if (r2 != null) {
            r2.A0E(waImageView, fMessage, new C98124qc(this, 2));
        }
        AnonymousClass10I r3 = this.A1X;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r4.A01);
        r3.CGL(new C98814rl(this, fMessage, 32), AnonymousClass000.A0y("renderStickersPreview", A10));
    }

    private final int getThumbnailStickersToLoad() {
        int i;
        List list = getFMessage().A08;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return Math.min(i, 4);
    }

    public boolean A1Y() {
        return A1f();
    }

    public void A1u() {
        A00();
        AnonymousClass3uP.A0h(this, false);
    }

    public boolean Be6() {
        return C72463Mc.A1Y(getFMessage().A1G());
    }

    public int getCenteredLayoutId() {
        return 2131624928;
    }

    public int getIncomingLayoutId() {
        return 2131624928;
    }

    public int getOutgoingLayoutId() {
        return 2131624929;
    }
}
