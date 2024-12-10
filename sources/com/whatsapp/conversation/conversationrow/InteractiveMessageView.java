package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass12Q;
import X.AnonymousClass174;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Q8;
import X.AnonymousClass70E;
import X.AnonymousClass781;
import X.C17880vN;
import X.C17900vP;
import X.C18000vb;
import X.C18030ve;
import X.C19740yt;
import X.C27691Xc;
import X.C27831Xu;
import X.C28931bI;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C88484Zw;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class InteractiveMessageView extends LinearLayout implements AnonymousClass009 {
    public View.OnLongClickListener A00;
    public View A01;
    public AnonymousClass1GP A02;
    public AnonymousClass11S A03;
    public WaImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public AnonymousClass70E A08;
    public C88484Zw A09;
    public C18000vb A0A;
    public C18030ve A0B;
    public AnonymousClass10I A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass031 A0K;
    public Map A0L;
    public boolean A0M;
    public View A0N;
    public WaTextView A0O;
    public final TextEmojiLabel A0P;
    public final C28931bI A0Q;
    public final FrameLayout A0R;
    public final TextEmojiLabel A0S;
    public final AnonymousClass4Q8 A0T;
    public final DynamicMessageView A0U;
    public final C28931bI A0V;

    public static JSONObject A00(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return C17880vN.A16(str);
            } catch (JSONException e) {
                C17900vP.A0h("InteractiveMessageView/parseNfmMessageParamsJson/invalid json=", str, AnonymousClass000.A10(), e);
            }
        }
        return C17880vN.A15();
    }

    private void A01(int i, int i2) {
        AnonymousClass3MY.A0v(getContext(), this.A04, 2131231157);
        C27831Xu.A0C(this.A04.getDrawable(), AnonymousClass3MY.A02(this, i));
        AnonymousClass1HF.A0L(C19740yt.A03(getContext(), i2), this.A04);
    }

    public static void A02(InteractiveMessageView interactiveMessageView) {
        interactiveMessageView.A04.setImageResource(2131231944);
        interactiveMessageView.A01(2131101285, 2131101283);
        if (interactiveMessageView.A09.A04 == null) {
            interactiveMessageView.A01.setOnClickListener(new AnonymousClass781(4));
            interactiveMessageView.A0R.setOnClickListener(new AnonymousClass781(5));
            interactiveMessageView.setOnClickListener(new AnonymousClass781(6));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b0, code lost:
        if (r7.has("limited_time_offer") == false) goto L_0x02b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass3uP r19, X.AnonymousClass206 r20, int r21) {
        /*
            r18 = this;
            r2 = r20
            boolean r0 = r2 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x04e1
            r0 = r2
            X.21K r0 = (X.AnonymousClass21K) r0
            r17 = r0
            X.AEt r6 = r17.BPK()
            r0 = r18
            X.00H r1 = r0.A0H
            java.lang.Object r3 = r1.get()
            X.1y1 r3 = (X.C42341y1) r3
            r1 = r17
            X.A6j r10 = r3.A01(r1)
            X.Abv r4 = X.C60532oB.A00(r2)
            X.1GP r1 = r0.A02
            r7 = 0
            r8 = r19
            if (r1 == 0) goto L_0x00bd
            if (r6 == 0) goto L_0x00bd
            boolean r1 = r6.A03()
            if (r1 == 0) goto L_0x00bd
            if (r4 == 0) goto L_0x00bd
            r3 = 0
            X.78A r1 = new X.78A
            r1.<init>(r0, r4, r2, r3)
            X.4Q8 r4 = r0.A0T
            r4.A00(r1, r8, r2)
        L_0x003f:
            r3 = 8
            r5 = 0
            if (r6 == 0) goto L_0x00f7
            boolean r1 = r6.A04()
            if (r1 == 0) goto L_0x00f7
            X.AEk r1 = r6.A06
            if (r1 == 0) goto L_0x00f7
            int r9 = r1.A01
            r1 = 2
            if (r9 != r1) goto L_0x00f7
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r13 = r0.A0U
            r13.setVisibility(r5)
            X.AEk r1 = r6.A06
            java.util.List r12 = r1.A04
            X.C18070vi.A0d(r2, r5)
            java.lang.Object r9 = r13.getTag()
            X.205 r1 = r2.A0v
            java.lang.String r11 = r1.A01
            boolean r1 = X.C18070vi.A18(r9, r11)
            if (r1 != 0) goto L_0x00d0
            if (r12 == 0) goto L_0x00c9
            java.util.Iterator r16 = r12.iterator()
        L_0x0073:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r14 = r16.next()
            X.4c9 r14 = (X.AnonymousClass4c9) r14
            boolean r1 = r14 instanceof X.AnonymousClass465
            if (r1 == 0) goto L_0x00c4
            X.465 r14 = (X.AnonymousClass465) r14
            android.content.Context r1 = r13.getContext()
            com.whatsapp.StarRatingBar r10 = new com.whatsapp.StarRatingBar
            r10.<init>(r1, r7)
            java.lang.String r1 = r14.A01
            r10.setTag(r1)
            r15 = -2
            r9 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r15, r9)
            r10.setLayoutParams(r1)
            r1 = 17
            r10.setGravity(r1)
            r9 = 1
            X.4gu r1 = new X.4gu
            r1.<init>(r14, r9)
            r10.A01 = r1
            X.AD7 r9 = r14.A00
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.layout.RatingType.Stars"
            X.C18070vi.A0z(r9, r1)
            X.466 r9 = (X.AnonymousClass466) r9
            int r1 = r9.A00
            r10.setRating(r1)
            r13.addView(r10)
            goto L_0x0073
        L_0x00bd:
            X.4Q8 r4 = r0.A0T
            r4.A00(r7, r8, r2)
            goto L_0x003f
        L_0x00c4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00c9:
            r13.A04 = r12
            r13.A03 = r2
            r13.setTag(r11)
        L_0x00d0:
            X.AEk r1 = r6.A06
            X.ADE r1 = r1.A00
            if (r1 == 0) goto L_0x00ed
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x00ed
            r13.A05 = r5
            r13.setClickable(r5)
            r13.setFocusable(r5)
        L_0x00e2:
            com.whatsapp.TextEmojiLabel r1 = r0.A0P
            r1.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r1 = r0.A0S
            r1.setVisibility(r3)
            goto L_0x0147
        L_0x00ed:
            r1 = 1
            r13.A05 = r1
            r13.setClickable(r1)
            r13.setFocusable(r1)
            goto L_0x00e2
        L_0x00f7:
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r1 = r0.A0U
            r1.setVisibility(r3)
            X.5c7 r1 = r8.A0l
            int r9 = r1.BQ6()
            if (r10 == 0) goto L_0x0304
            android.content.Context r1 = r0.getContext()
            java.lang.String r1 = r10.A0E(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0304
            android.content.Context r1 = r0.getContext()
            java.lang.String r12 = r10.A0E(r1)
            com.whatsapp.TextEmojiLabel r1 = r0.A0P
            X.4Cr r10 = X.C82924Cr.BODY
            X.206 r11 = r8.getFMessage()
            boolean r16 = X.AnonymousClass000.A1O(r9)
            r14 = 1
            r13 = r21
            r9 = r1
            r15 = r14
            r8.A2F(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.setVisibility(r5)
        L_0x0131:
            if (r6 == 0) goto L_0x02fd
            java.lang.String r1 = r6.A0C
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02fd
            com.whatsapp.TextEmojiLabel r10 = r0.A0S
            r10.setVisibility(r5)
            java.lang.String r9 = r6.A0C
            X.4Cr r1 = X.C82924Cr.FOOTER
            r8.setMessageText(r9, r10, r2, r1)
        L_0x0147:
            r11 = 0
            X.AEt r10 = r17.BPK()
            r12 = 1
            if (r10 == 0) goto L_0x02fa
            X.AEk r1 = r10.A06
            if (r1 == 0) goto L_0x02fa
            java.util.List r9 = r1.A03
            boolean r1 = X.C20120A8f.A09(r2)
            if (r1 == 0) goto L_0x02e8
            int r1 = r9.size()
            if (r1 != 0) goto L_0x02e8
        L_0x0161:
            android.widget.FrameLayout r9 = r0.A0R
            if (r11 == 0) goto L_0x02e0
            r1 = 38
            X.C90074dU.A01(r9, r0, r2, r1)
            r1 = 39
            X.C90074dU.A00(r0, r2, r1)
        L_0x016f:
            X.205 r1 = r2.A0v
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x0198
            android.view.ViewGroup r10 = r8.getDateWrapper()
            X.C17960vV.A05(r10)
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            X.0vb r1 = r0.A0A
            boolean r7 = X.AnonymousClass3MY.A1b(r1)
            r1 = 3
            if (r7 == 0) goto L_0x018a
            r1 = 5
        L_0x018a:
            r7 = r1 | 80
            boolean r1 = r9 instanceof android.widget.LinearLayout.LayoutParams
            if (r1 == 0) goto L_0x02d5
            r1 = r9
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.gravity = r7
        L_0x0195:
            r10.setLayoutParams(r9)
        L_0x0198:
            boolean r1 = X.C20120A8f.A09(r2)
            if (r1 == 0) goto L_0x01a7
            android.widget.ImageView r1 = r8.getStatusView()
            if (r1 == 0) goto L_0x01a7
            r1.setVisibility(r3)
        L_0x01a7:
            android.widget.FrameLayout r4 = r4.A00
            r3 = 2131431006(0x7f0b0e5e, float:1.848373E38)
            android.view.View r1 = r4.findViewById(r3)
            if (r1 == 0) goto L_0x01bf
            android.view.View r3 = r4.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            android.graphics.drawable.Drawable r1 = r8.getInnerFrameForegroundDrawable()
            r3.setForeground(r1)
        L_0x01bf:
            if (r6 == 0) goto L_0x04e1
            X.AEk r1 = r6.A06
            if (r1 == 0) goto L_0x0258
            java.lang.String r1 = r1.A02
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0258
            X.1bI r7 = r0.A0V
            if (r7 == 0) goto L_0x0258
            X.AEk r1 = r6.A06
            java.lang.String r1 = r1.A02
            org.json.JSONObject r4 = A00(r1)
            X.00H r1 = r0.A0J
            r1.get()
            android.content.Context r8 = r0.getContext()
            X.C18070vi.A0d(r8, r5)
            java.lang.String r3 = "reminder_info"
            boolean r1 = r4.has(r3)
            if (r1 == 0) goto L_0x0258
            org.json.JSONObject r9 = r4.optJSONObject(r3)
            if (r9 == 0) goto L_0x0258
            java.lang.String r1 = "reminder_status"
            java.lang.String r4 = r9.optString(r1)
            if (r4 == 0) goto L_0x0258
            int r3 = r4.hashCode()
            r1 = -954581179(0xffffffffc71a3f45, float:-39487.27)
            if (r3 == r1) goto L_0x02b8
            r1 = -750561850(0xffffffffd34355c6, float:-8.3895766E11)
            if (r3 == r1) goto L_0x02c4
            r1 = 682647242(0x28b05eca, float:1.9581033E-14)
            if (r3 != r1) goto L_0x0258
            java.lang.String r1 = "reminder_pending"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0258
            java.lang.String r1 = "scheduled_timestamp"
            java.lang.String r1 = r9.optString(r1)
            if (r1 == 0) goto L_0x0258
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            if (r1 == 0) goto L_0x0258
            java.util.Date r10 = new java.util.Date
            r10.<init>(r3)
            java.text.SimpleDateFormat r1 = X.AnonymousClass174.A00
            java.lang.String r9 = r1.format(r10)
            java.text.SimpleDateFormat r1 = X.AnonymousClass174.A01
            java.lang.String r4 = r1.format(r10)
            r3 = 2131892390(0x7f1218a6, float:1.9419527E38)
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r9, r5)
            java.lang.String r3 = X.C17880vN.A0q(r8, r4, r1, r12, r3)
        L_0x0244:
            if (r3 == 0) goto L_0x0258
            android.view.View r1 = X.AnonymousClass3MY.A0I(r7, r5)
            r0.A0N = r1
            r1 = 2131434472(0x7f0b1be8, float:1.8490759E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass3MW.A0U(r0, r1)
            r0.A0O = r1
            r1.setText(r3)
        L_0x0258:
            X.AEk r1 = r6.A06
            if (r1 == 0) goto L_0x04e1
            java.lang.String r1 = r1.A02
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x04e1
            X.00H r1 = r0.A0D
            java.lang.Object r1 = r1.get()
            X.6tZ r1 = (X.C136286tZ) r1
            X.0ve r1 = r1.A00
            r4 = 4693(0x1255, float:6.576E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r3, r1, r4)
            if (r1 == 0) goto L_0x04e1
            X.1bI r1 = r0.A0Q
            if (r1 == 0) goto L_0x04e1
            X.4Zw r1 = r0.A09
            if (r1 == 0) goto L_0x04e1
            X.AEk r1 = r6.A06
            java.lang.String r1 = r1.A02
            org.json.JSONObject r7 = A00(r1)
            X.4Zw r14 = r0.A09
            android.content.Context r13 = r0.getContext()
            X.4Q7 r1 = new X.4Q7
            r1.<init>(r0, r2)
            r14.A02 = r1
            int r5 = r2.A0u
            X.00H r1 = r14.A09
            java.lang.Object r1 = r1.get()
            X.6tZ r1 = (X.C136286tZ) r1
            X.0ve r1 = r1.A00
            boolean r1 = X.C18020vd.A05(r3, r1, r4)
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x02b2
            java.lang.String r1 = "limited_time_offer"
            boolean r2 = r7.has(r1)
            r1 = 1
            if (r2 != 0) goto L_0x02b3
        L_0x02b2:
            r1 = 0
        L_0x02b3:
            r14.A05 = r1
            if (r1 == 0) goto L_0x042d
            goto L_0x030b
        L_0x02b8:
            java.lang.String r1 = "reminder_sent"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0258
            r1 = 2131892395(0x7f1218ab, float:1.9419537E38)
            goto L_0x02cf
        L_0x02c4:
            java.lang.String r1 = "reminder_canceled"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0258
            r1 = 2131892388(0x7f1218a4, float:1.9419523E38)
        L_0x02cf:
            java.lang.String r3 = r8.getString(r1)
            goto L_0x0244
        L_0x02d5:
            boolean r1 = r9 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L_0x0195
            r1 = r9
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.gravity = r7
            goto L_0x0195
        L_0x02e0:
            r9.setOnClickListener(r7)
            r0.setOnClickListener(r7)
            goto L_0x016f
        L_0x02e8:
            X.AEk r10 = r10.A06
            int r9 = r10.A01
            r1 = 2
            if (r9 == r1) goto L_0x0161
            java.util.List r1 = r10.A03
            int r1 = r1.size()
            if (r1 > r12) goto L_0x0161
            r11 = 1
            goto L_0x0161
        L_0x02fa:
            r11 = 1
            goto L_0x0161
        L_0x02fd:
            com.whatsapp.TextEmojiLabel r1 = r0.A0S
            r1.setVisibility(r3)
            goto L_0x0147
        L_0x0304:
            com.whatsapp.TextEmojiLabel r1 = r0.A0P
            r1.setVisibility(r3)
            goto L_0x0131
        L_0x030b:
            java.lang.String r1 = "limited_time_offer"
            org.json.JSONObject r2 = r7.optJSONObject(r1)     // Catch:{ JSONException -> 0x0338 }
            if (r2 == 0) goto L_0x0346
            java.lang.String r1 = "text"
            java.lang.String r9 = r2.getString(r1)     // Catch:{ JSONException -> 0x0338 }
            java.lang.String r1 = "url"
            java.lang.String r8 = r2.getString(r1)     // Catch:{ JSONException -> 0x0338 }
            java.lang.String r1 = "copy_code"
            java.lang.String r6 = r2.optString(r1)     // Catch:{ JSONException -> 0x0338 }
            java.lang.String r1 = "expiration_time"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ JSONException -> 0x0338 }
            X.C18070vi.A0b(r1)     // Catch:{ JSONException -> 0x0338 }
            java.lang.Long r2 = X.AnonymousClass1YD.A04(r1)     // Catch:{ JSONException -> 0x0338 }
            X.4Nw r1 = new X.4Nw     // Catch:{ JSONException -> 0x0338 }
            r1.<init>(r2, r9, r8, r6)     // Catch:{ JSONException -> 0x0338 }
            goto L_0x0347
        L_0x0338:
            r6 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "LimitedTimeOfferParser/parseLimitedTimeOfferParams/invalid json="
            java.lang.String r1 = X.AnonymousClass001.A1E(r7, r1, r2)
            com.whatsapp.util.Log.e(r1, r6)
        L_0x0346:
            r1 = 0
        L_0x0347:
            r14.A03 = r1
            X.4Q7 r1 = r14.A02
            if (r1 == 0) goto L_0x038f
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r6 = r1.A00
            X.1bI r1 = r6.A0Q
            android.view.View r2 = X.AnonymousClass3MY.A0I(r1, r4)
            r6.A01 = r2
            android.view.View$OnLongClickListener r1 = r6.A00
            r2.setOnLongClickListener(r1)
            r1 = 2131429604(0x7f0b08e4, float:1.8480885E38)
            com.whatsapp.WaImageView r1 = X.AnonymousClass3MW.A0S(r6, r1)
            r6.A04 = r1
            r1 = 2131433254(0x7f0b1726, float:1.8488288E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass3MW.A0U(r6, r1)
            r6.A07 = r1
            r1 = 2131432236(0x7f0b132c, float:1.8486224E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass3MW.A0U(r6, r1)
            r6.A06 = r1
            r1 = 2131429695(0x7f0b093f, float:1.848107E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass3MW.A0U(r6, r1)
            r6.A05 = r1
            r2 = 2131101287(0x7f060667, float:1.781498E38)
            r1 = 2131101286(0x7f060666, float:1.7814977E38)
            r6.A01(r2, r1)
            r1 = 2131169398(0x7f071076, float:1.7953125E38)
            r6.setLimitedTimeOfferIconPadding(r1)
        L_0x038f:
            X.4Q7 r8 = r14.A02
            X.4Nw r1 = r14.A03
            java.lang.String r10 = r1.A01
            java.lang.String r11 = r1.A03
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r2 = r8.A00
            X.4Zw r1 = r2.A09
            X.5XZ r1 = r1.A04
            android.view.View r2 = r2.A01
            if (r1 == 0) goto L_0x04d8
            r1 = 6
            X.4dE r7 = new X.4dE
            r7.<init>(r8, r1)
        L_0x03a7:
            r2.setOnClickListener(r7)
            X.4Q7 r6 = r14.A02
            X.4Nw r1 = r14.A03
            java.lang.String r2 = r1.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r1 = r6.A00
            com.whatsapp.WaTextView r1 = r1.A07
            r1.setText(r2)
            r11 = 2
            java.lang.String r10 = "%s: Limited Time offer not defined for message - %s"
            r9 = 62
            r8 = 57
            r7 = 55
            if (r5 == r7) goto L_0x04bc
            if (r5 == r8) goto L_0x04c2
            if (r5 == r9) goto L_0x04c2
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Class r1 = r14.getClass()
            r2[r4] = r1
            X.C17880vN.A1T(r2, r5, r12)
            java.lang.String.format(r10, r2)
        L_0x03d4:
            X.4Nw r2 = r14.A03
            java.lang.Long r1 = r2.A00
            if (r1 == 0) goto L_0x043f
            boolean r1 = r14.A03()
            if (r1 != 0) goto L_0x043b
            java.lang.Long r1 = r2.A00
            X.C88484Zw.A00(r13, r14, r1)
            X.4Nw r1 = r14.A03
            java.lang.String r7 = r1.A01
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            X.4Q7 r1 = r14.A02
            if (r2 != 0) goto L_0x0439
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r1 = r1.A00
            com.whatsapp.WaTextView r6 = r1.A05
            android.content.Context r5 = r1.getContext()
            r2 = 2131891605(0x7f121595, float:1.9417935E38)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r4] = r7
            X.AnonymousClass3MY.A0y(r5, r6, r1, r2)
            X.4Q7 r1 = r14.A02
        L_0x0405:
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r1 = r1.A00
            com.whatsapp.WaTextView r2 = r1.A05
            int r1 = X.C72453Mb.A07(r3)
            r2.setVisibility(r1)
        L_0x0410:
            X.4Nw r1 = r14.A03
            java.lang.Long r15 = r1.A00
            if (r15 == 0) goto L_0x042d
            long r16 = r15.longValue()
            long r1 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r1
            X.8Ce r12 = new X.8Ce
            r12.<init>(r13, r14, r15, r16)
            r14.A00 = r12
            X.10I r2 = r14.A08
            r1 = 6
            X.C98834rn.A01(r2, r14, r1)
        L_0x042d:
            X.4Zw r1 = r0.A09
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x04e1
            A02(r0)
            return
        L_0x0439:
            r3 = 0
            goto L_0x0405
        L_0x043b:
            X.C88484Zw.A01(r14)
            goto L_0x0410
        L_0x043f:
            X.4Q7 r1 = r14.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r1 = r1.A00
            com.whatsapp.WaTextView r2 = r1.A05
            r1 = 8
            r2.setVisibility(r1)
            if (r5 == r7) goto L_0x049a
            if (r5 == r8) goto L_0x045f
            if (r5 == r9) goto L_0x045f
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Class r1 = r14.getClass()
            r2[r4] = r1
            X.C17880vN.A1T(r2, r5, r12)
            java.lang.String.format(r10, r2)
            goto L_0x042d
        L_0x045f:
            X.4Nw r1 = r14.A03
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x04b2
            X.4Q7 r1 = r14.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r6 = r1.A00
            r5 = 2131169327(0x7f07102f, float:1.795298E38)
            com.whatsapp.WaImageView r1 = r6.A04
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r1 = X.AnonymousClass3Ma.A02(r6, r5)
            r2.width = r1
            int r1 = X.AnonymousClass3Ma.A02(r6, r5)
            r2.height = r1
            com.whatsapp.WaImageView r1 = r6.A04
            r1.setLayoutParams(r2)
            r1 = 2131169397(0x7f071075, float:1.7953123E38)
            r6.setLimitedTimeOfferIconPadding(r1)
            X.4Q7 r5 = r14.A02
            r2 = 2131891616(0x7f1215a0, float:1.9417957E38)
            X.4Nw r1 = r14.A03
            java.lang.String r1 = r1.A03
            r5.A00(r1, r2, r4, r12)
            goto L_0x042d
        L_0x049a:
            X.4Nw r1 = r14.A03
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x04b2
            X.4Q7 r4 = r14.A02
            r2 = 2131891616(0x7f1215a0, float:1.9417957E38)
            X.4Nw r1 = r14.A03
            java.lang.String r1 = r1.A03
        L_0x04ad:
            r4.A00(r1, r2, r12, r12)
            goto L_0x042d
        L_0x04b2:
            X.4Q7 r4 = r14.A02
            r2 = 2131891605(0x7f121595, float:1.9417935E38)
            X.4Nw r1 = r14.A03
            java.lang.String r1 = r1.A01
            goto L_0x04ad
        L_0x04bc:
            X.4Q7 r1 = r14.A02
            r6 = 2131232902(0x7f080886, float:1.8081926E38)
            goto L_0x04c7
        L_0x04c2:
            X.4Q7 r1 = r14.A02
            r6 = 2131232892(0x7f08087c, float:1.8081906E38)
        L_0x04c7:
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r1 = r1.A00
            android.view.View r2 = r1.A01
            android.content.Context r1 = r1.getContext()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass03S.A01(r1, r6)
            r2.setBackground(r1)
            goto L_0x03d4
        L_0x04d8:
            X.206 r9 = r8.A01
            X.AFI r7 = new X.AFI
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x03a7
        L_0x04e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveMessageView.A04(X.3uP, X.206, int):void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0K;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    public FrameLayout getInnerFrameLayout() {
        return (FrameLayout) this.A0T.A00.findViewById(2131431006);
    }

    public void onDetachedFromWindow() {
        CountDownTimer countDownTimer;
        C88484Zw r1 = this.A09;
        if (!(r1 == null || (countDownTimer = r1.A00) == null)) {
            countDownTimer.cancel();
            r1.A00 = null;
        }
        super.onDetachedFromWindow();
    }

    public void setDescriptionMinLines(int i) {
        this.A0P.setMinLines(i);
    }

    public void setLayoutView(int i) {
        TextEmojiLabel textEmojiLabel;
        Context context;
        Context context2;
        int i2;
        int i3;
        if (i == 0) {
            textEmojiLabel = this.A0S;
            context = getContext();
            context2 = getContext();
            i2 = 2130969249;
            i3 = 2131100258;
        } else if (i == 1) {
            textEmojiLabel = this.A0S;
            context = getContext();
            context2 = getContext();
            i2 = 2130969247;
            i3 = 2131100256;
        } else {
            return;
        }
        C72463Mc.A0w(context2, context, textEmojiLabel, i2, i3);
    }

    public InteractiveMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0M) {
            this.A0M = true;
            C27691Xc.A0u((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A0J = AnonymousClass12Q.A00(AnonymousClass174.class);
        this.A01 = null;
        this.A04 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A00 = null;
        this.A0O = null;
        this.A0N = null;
        LayoutInflater.from(context).inflate(2131625722, this, true);
        setOrientation(1);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass1HF.A06(this, 2131431754);
        this.A0R = frameLayout;
        C28931bI A0s = C72453Mb.A0s(this, 2131429602);
        this.A0Q = A0s;
        A0s.A04(8);
        C28931bI A0s2 = C72453Mb.A0s(this, 2131429611);
        this.A0V = A0s2;
        A0s2.A04(8);
        this.A0T = new AnonymousClass4Q8(frameLayout, this.A0L);
        this.A0P = AnonymousClass3MX.A0V(this, 2131429927);
        TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(this, 2131428334);
        this.A0S = A0V2;
        this.A0U = (DynamicMessageView) AnonymousClass1HF.A06(this, 2131430207);
        TextEmojiLabel textEmojiLabel = this.A0P;
        textEmojiLabel.setLongClickable(C72483Me.A1A(textEmojiLabel, this.A0B));
        AnonymousClass3Ma.A1L(this.A0B, A0V2);
    }

    private void setLimitedTimeOfferIconPadding(int i) {
        int A022 = AnonymousClass3Ma.A02(this, i);
        this.A04.setPadding(A022, A022, A022, A022);
    }

    public void A03(View.OnLongClickListener onLongClickListener, AnonymousClass1GP r3, C88484Zw r4) {
        setOnLongClickListener(onLongClickListener);
        this.A0R.setOnLongClickListener(onLongClickListener);
        this.A00 = onLongClickListener;
        this.A09 = r4;
        this.A02 = r3;
    }

    public InteractiveMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0M) {
            this.A0M = true;
            C27691Xc.A0u((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public InteractiveMessageView(Context context) {
        this(context, (AttributeSet) null);
    }
}
