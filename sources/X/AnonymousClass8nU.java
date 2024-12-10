package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.PaymentInfoMessageView;
import com.whatsapp.payments.ui.components.PixPaymentInfoView;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8nU  reason: invalid class name */
public final class AnonymousClass8nU extends AnonymousClass3uP {
    public AR0 A00;
    public AnonymousClass121 A01;
    public AnonymousClass1QS A02;
    public AnonymousClass1R2 A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public String A06;
    public boolean A07;
    public final InteractiveButtonsRowContentLayout A08 = ((InteractiveButtonsRowContentLayout) C18070vi.A05(this, 2131428628));
    public final AnonymousClass4LL A09;
    public final PaymentInfoMessageView A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8nU(Context context, C108875cR r5, AnonymousClass21L r6) {
        super(context, r5, r6);
        C18070vi.A0d(context, 1);
        A1M();
        PaymentInfoMessageView paymentInfoMessageView = (PaymentInfoMessageView) C18070vi.A05(this, 2131433550);
        this.A0A = paymentInfoMessageView;
        AnonymousClass122 r1 = this.A0x;
        C18070vi.A0W(r1);
        this.A09 = new AnonymousClass4LL(r1);
        View.OnLongClickListener onLongClickListener = this.A2t;
        C18070vi.A0W(onLongClickListener);
        paymentInfoMessageView.setOnLongClickListener(onLongClickListener);
        paymentInfoMessageView.A03.setOnLongClickListener(onLongClickListener);
        A00();
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public final void setCoreMessageStoreWrapper(AnonymousClass121 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCtwaAdsPrivateStatsConversionInfoStore(AR0 ar0) {
        C18070vi.A0d(ar0, 0);
        this.A00 = ar0;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        C17960vV.A0D(r2 instanceof AnonymousClass21L);
        this.A0I = r2;
    }

    public final void setPaymentUtils(AnonymousClass1R2 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setPaymentsManager(AnonymousClass1QS r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setViewMessageEventLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWamPsStructuredMessageInteractionReporter(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public void A1M() {
        if (!this.A07) {
            this.A07 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r1 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r1, A0O, this);
            AnonymousClass10G r3 = r1.A00;
            AnonymousClass3uQ.A16(r3, this);
            AnonymousClass3uQ.A0w(A0n, r1, r3, this);
            AnonymousClass3uQ.A12(r1, r3, this);
            AnonymousClass3uQ.A0y(A0n, r1, this, BE8.A0d(r1));
            AnonymousClass3uQ.A13(r1, r3, this, r1.ABq);
            AnonymousClass3uQ.A0x(A0n, r1, r3, this, r1.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r1, r3, A0O, this);
            AnonymousClass3uQ.A11(r1, r3, this);
            AnonymousClass3uQ.A15(r1, this);
            AnonymousClass3uQ.A0s(r0, A0n, r1, r3, this);
            AnonymousClass3uQ.A0u(r0, r1, r3, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r1, A0O, this);
            AnonymousClass3uQ.A10(r1, r3, this);
            AnonymousClass3uQ.A0z(r1, r3, A0O, this, AnonymousClass3uQ.A0o(r1));
            this.A01 = (AnonymousClass121) r1.A2y.get();
            this.A00 = (AR0) r1.AJe.get();
            this.A03 = (AnonymousClass1R2) r1.A8L.get();
            this.A02 = (AnonymousClass1QS) r1.A8J.get();
            this.A04 = C000200d.A00(A0O.A0l);
            this.A05 = C000200d.A00(r1.An8);
        }
    }

    public boolean A1X() {
        C26131Qy r1 = this.A16;
        AnonymousClass206 fMessage = getFMessage();
        C18070vi.A0X(fMessage);
        return AnonymousClass000.A1O(r1.A01(fMessage));
    }

    public final AnonymousClass121 getCoreMessageStoreWrapper() {
        AnonymousClass121 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("coreMessageStoreWrapper");
        throw null;
    }

    public final AR0 getCtwaAdsPrivateStatsConversionInfoStore() {
        AR0 ar0 = this.A00;
        if (ar0 != null) {
            return ar0;
        }
        C18070vi.A11("ctwaAdsPrivateStatsConversionInfoStore");
        throw null;
    }

    public final AnonymousClass1R2 getPaymentUtils() {
        AnonymousClass1R2 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("paymentUtils");
        throw null;
    }

    public final AnonymousClass1QS getPaymentsManager() {
        AnonymousClass1QS r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("paymentsManager");
        throw null;
    }

    public final AnonymousClass00H getViewMessageEventLogger() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("viewMessageEventLogger");
        throw null;
    }

    public final AnonymousClass00H getWamPsStructuredMessageInteractionReporter() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("wamPsStructuredMessageInteractionReporter");
        throw null;
    }

    private final void A00() {
        AnonymousClass206 fMessage = getFMessage();
        C18070vi.A0X(fMessage);
        if (fMessage instanceof AnonymousClass21K) {
            C20285AEt BPK = ((AnonymousClass21K) fMessage).BPK();
            if (BPK == null || BPK.A03 == null) {
                Log.e("ConversationRowPaymentInfo/fillBubbleContent/invalid content");
                return;
            }
            getPaymentUtils();
            AEY aey = BPK.A03;
            C18070vi.A0z(aey, "null cannot be cast to non-null type com.whatsapp.protocol.PaymentInfoContent");
            BDZ A022 = AnonymousClass1R2.A02(aey);
            if (A022 != null) {
                PaymentInfoMessageView paymentInfoMessageView = this.A0A;
                C20934Abo abo = (C20934Abo) A022;
                PixPaymentInfoView pixPaymentInfoView = new PixPaymentInfoView(AnonymousClass3MY.A04(paymentInfoMessageView), (AttributeSet) null);
                pixPaymentInfoView.A04.setText(abo.A01);
                TextEmojiLabel textEmojiLabel = pixPaymentInfoView.A05;
                Context context = paymentInfoMessageView.getContext();
                Context context2 = paymentInfoMessageView.getContext();
                String str = abo.A03;
                AnonymousClass3MY.A0y(context, textEmojiLabel, new Object[]{context2.getString(A3V.A00(str)), A3V.A01(str, abo.A02)}, 2131888299);
                int applyDimension = (int) TypedValue.applyDimension(1, 2.0f, AnonymousClass3Ma.A09(paymentInfoMessageView));
                int A002 = C19740yt.A00(paymentInfoMessageView.getContext(), 2131103259);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(A002);
                pixPaymentInfoView.A01.setBackground(gradientDrawable);
                int A003 = C19740yt.A00(paymentInfoMessageView.getContext(), 2131103233);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(TypedValue.applyDimension(1, 8.0f, AnonymousClass3Ma.A09(paymentInfoMessageView)));
                gradientDrawable2.setColor(A003);
                ConstraintLayout constraintLayout = pixPaymentInfoView.A02;
                constraintLayout.setBackground(gradientDrawable2);
                int i = applyDimension * 4;
                constraintLayout.setPadding(i, i, i, i);
                C43531zx.A03(pixPaymentInfoView.A03, new C39351sv(applyDimension * 3, 0, 0, 0));
                paymentInfoMessageView.A03.addView(pixPaymentInfoView);
                if (A022 instanceof C20934Abo) {
                    C18070vi.A0z(aey, "null cannot be cast to non-null type com.whatsapp.protocol.PaymentInfoContent");
                    ArrayList A13 = AnonymousClass000.A13();
                    getPaymentUtils();
                    C18070vi.A0z(aey, "null cannot be cast to non-null type com.whatsapp.protocol.PaymentInfoContent");
                    BDZ A023 = AnonymousClass1R2.A02(aey);
                    A13.add(new C85524Ns(new AQM(this, A023, fMessage, aey), getContext().getString(2131889051), 2131231835, false));
                    InteractiveButtonsRowContentLayout.A01(this, this.A08, A13, A13.size());
                    A2N(fMessage);
                    return;
                }
            }
            Log.e("ConversationRowPaymentInfo/fillBubbleContent/unsupported option");
        }
    }

    public void A1u() {
        A00();
        super.A1u();
    }

    public int getCenteredLayoutId() {
        return 2131624892;
    }

    public int getIncomingLayoutId() {
        return 2131624892;
    }

    public int getOutgoingLayoutId() {
        return 2131624893;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) getViewMessageEventLogger().get()).A00(getFMessage(), i);
    }
}
