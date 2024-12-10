package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.98m  reason: invalid class name and case insensitive filesystem */
public final class C1774198m extends C20083A6j {
    public final C18030ve A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1774198m(C18030ve r2, C20285AEt aEt, C185129c4 r4) {
        super(aEt, r4);
        C18070vi.A0d(r2, 3);
        this.A00 = r2;
    }

    public CharSequence A08(Context context, Paint paint) {
        String str;
        CharSequence obj;
        C20279AEn aEn = this.A02.A02;
        if (aEn == null || (str = aEn.A0L) == null || str.length() == 0) {
            return super.A08(context, paint);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C17890vO.A0R(context, str, 1, 0, 2131893955));
        Drawable A05 = A05(context);
        if (A05 != null) {
            obj = C72813Np.A03(paint, A05, A10);
        } else {
            obj = A10.toString();
        }
        C18070vi.A0X(obj);
        return obj;
    }

    public String A0F(Context context) {
        String str;
        C18070vi.A0d(context, 0);
        C20279AEn aEn = this.A02.A02;
        if (aEn == null || (str = aEn.A0L) == null || str.length() == 0) {
            return super.A0F(context);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('*');
        return AnonymousClass8BW.A0l(str, A10, '*');
    }

    public void A0H(C19998A2m a2m, AnonymousClass206 r10) {
        boolean A17 = C18070vi.A17(a2m, r10);
        C20285AEt aEt = this.A02;
        C20279AEn aEn = aEt.A02;
        if (aEn == null || aEn.A0S != A17) {
            AnonymousClass8X8 r4 = a2m.A00;
            C165858bs r0 = ((C166418cr) r4.A00).buttonsMessage_;
            if (r0 == null) {
                r0 = C165858bs.DEFAULT_INSTANCE;
            }
            C163728Wc r3 = (C163728Wc) r0.A0O();
            byte[] bArr = null;
            C20279AEn aEn2 = aEt.A02;
            if (aEn2 == null || aEn2.A0U == null) {
                r3.A0G(AnonymousClass9KT.EMPTY);
            } else {
                C163748We r6 = (C163748We) C166268cc.DEFAULT_INSTANCE.A0N();
                C20279AEn aEn3 = aEt.A02;
                if (aEn3 != null) {
                    bArr = aEn3.A0U;
                }
                C23581BmB A0F = AnonymousClass8BR.A0F(bArr, 0);
                C166268cc A0G = AnonymousClass8BS.A0G(r6);
                A0G.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                A0G.jpegThumbnail_ = A0F;
                r3.A0G(AnonymousClass9KT.IMAGE);
                C165858bs r5 = (C165858bs) C17880vN.A0G(r3);
                C23577Bm6 A0C = r6.A0C();
                int i = C165858bs.BUTTONS_FIELD_NUMBER;
                A0C.getClass();
                r5.header_ = A0C;
                r5.headerCase_ = 3;
            }
            String str = aEt.A0B;
            if (str != null) {
                C165858bs r1 = (C165858bs) C17880vN.A0G(r3);
                int i2 = C165858bs.BUTTONS_FIELD_NUMBER;
                r1.bitField0_ |= 32;
                r1.contentText_ = str;
            }
            String str2 = aEt.A0C;
            if (str2 != null) {
                C165858bs r12 = (C165858bs) C17880vN.A0G(r3);
                int i3 = C165858bs.BUTTONS_FIELD_NUMBER;
                r12.bitField0_ |= 64;
                r12.footerText_ = str2;
            }
            C23624Bmt A0N = C164458Yx.DEFAULT_INSTANCE.A0N();
            C164458Yx r13 = (C164458Yx) C17880vN.A0G(A0N);
            r13.bitField0_ |= 1;
            r13.name_ = "review_and_pay";
            C20279AEn aEn4 = aEt.A02;
            if (aEn4 != null) {
                try {
                    String obj = C20122A8h.A06(aEn4, a2m.A0D).toString();
                    C164458Yx r14 = (C164458Yx) C17880vN.A0G(A0N);
                    obj.getClass();
                    r14.bitField0_ |= 2;
                    r14.paramsJson_ = obj;
                } catch (JSONException e) {
                    C108995ce.A1M("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ", AnonymousClass000.A10(), e);
                }
            }
            C23624Bmt A08 = AnonymousClass8BS.A08(C165228an.DEFAULT_INSTANCE);
            C165228an r15 = (C165228an) A08.A00;
            C164458Yx r02 = (C164458Yx) A0N.A0C();
            r02.getClass();
            r15.nativeFlowInfo_ = r02;
            r15.bitField0_ |= 8;
            C179729Jr r03 = C179729Jr.NATIVE_FLOW;
            C165228an r16 = (C165228an) C17880vN.A0G(A08);
            r16.type_ = r03.value;
            r16.bitField0_ |= 4;
            C23624Bmt A082 = AnonymousClass8BS.A08(AnonymousClass8XY.DEFAULT_INSTANCE);
            AnonymousClass8XY r17 = (AnonymousClass8XY) A082.A00;
            r17.bitField0_ |= 1;
            r17.displayText_ = "review_and_pay";
            C165228an r18 = (C165228an) C17880vN.A0G(A08);
            AnonymousClass8XY r04 = (AnonymousClass8XY) A082.A0C();
            r04.getClass();
            r18.buttonText_ = r04;
            r18.bitField0_ |= 2;
            C165858bs r52 = (C165858bs) C17880vN.A0G(r3);
            C23577Bm6 A0C2 = A08.A0C();
            int i4 = C165858bs.BUTTONS_FIELD_NUMBER;
            A0C2.getClass();
            EE9 ee9 = r52.buttons_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r52.buttons_ = ee9;
            }
            ee9.add(A0C2);
            if (C19998A2m.A00(a2m, r10)) {
                C166278cd A01 = A79.A01(r3, this.A01, a2m, r10);
                C165858bs r19 = (C165858bs) r3.A00;
                A01.getClass();
                r19.contextInfo_ = A01;
                r19.bitField0_ |= 128;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r4);
            C165858bs r05 = (C165858bs) r3.A0C();
            r05.getClass();
            A0M.buttonsMessage_ = r05;
            A0M.bitField1_ |= 1;
            return;
        }
        super.A0H(a2m, r10);
        AnonymousClass8X8 r62 = a2m.A00;
        C163878Wr A002 = AnonymousClass8X8.A00(r62);
        C163758Wf r42 = (C163758Wf) ((C166398cp) A002.A00).A0S().A0O();
        String A003 = aEt.A00();
        if (A003 == null) {
            A003 = "review_and_pay";
        }
        C163888Ws r32 = (C163888Ws) AnonymousClass8Z3.DEFAULT_INSTANCE.A0N();
        r32.A0H(A003);
        C20279AEn aEn5 = aEt.A02;
        if (aEn5 != null) {
            try {
                r32.A0G(C20122A8h.A06(aEn5, a2m.A0D).toString());
            } catch (JSONException e2) {
                C108995ce.A1M("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ", AnonymousClass000.A10(), e2);
            }
        }
        r42.A0G((AnonymousClass8Z3) r32.A0C());
        A002.A0H(r42);
        AnonymousClass8X8.A06(A002, r62);
    }

    public String A0B() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        C20285AEt aEt = this.A02;
        String str2 = null;
        C20279AEn aEn = aEt.A02;
        if (aEn != null) {
            List list = aEn.A0D.A09;
            if (list == null || list.isEmpty()) {
                str = null;
            } else {
                str = C29431cG.A0h(", ", list, B3I.A00);
            }
            C20083A6j.A03(str, "\n", A10);
            C20279AEn aEn2 = aEt.A02;
            if (aEn2 != null) {
                str2 = aEn2.A06(this.A00);
            }
            C20083A6j.A03(str2, "\n", A10);
        }
        C20083A6j.A03(aEt.A0B, "\n", A10);
        C20083A6j.A03(aEt.A0C, "\n", A10);
        C20083A6j.A03(this.A00.A09(2131888278), "\n", A10);
        return C18070vi.A0H(A10);
    }
}
