package com.whatsapp.notification;

import X.A3P;
import X.AFC;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass12L;
import X.AnonymousClass16Q;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DM;
import X.AnonymousClass1E7;
import X.AnonymousClass1EG;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass1K1;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1LD;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1MZ;
import X.AnonymousClass1Nb;
import X.AnonymousClass1PM;
import X.AnonymousClass1R2;
import X.AnonymousClass1R3;
import X.AnonymousClass1VW;
import X.AnonymousClass1WR;
import X.AnonymousClass1YL;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass291;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3V4;
import X.AnonymousClass4GQ;
import X.AnonymousClass4JZ;
import X.AnonymousClass4SK;
import X.AnonymousClass4UI;
import X.AnonymousClass4VN;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass70H;
import X.AnonymousClass74M;
import X.AnonymousClass758;
import X.AnonymousClass79Y;
import X.AnonymousClass7E0;
import X.AnonymousClass7EQ;
import X.AnonymousClass7FF;
import X.AnonymousClass7FH;
import X.AnonymousClass7G6;
import X.AnonymousClass7GD;
import X.AnonymousClass7ID;
import X.AnonymousClass7OB;
import X.AnonymousClass889;
import X.C000200d;
import X.C107845ai;
import X.C108355bZ;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C110885hR;
import X.C113795nl;
import X.C116315wx;
import X.C1193267r;
import X.C121196Ih;
import X.C126176cJ;
import X.C134196qC;
import X.C1404271j;
import X.C1418377d;
import X.C1418777h;
import X.C1422678u;
import X.C1423279a;
import X.C142707Am;
import X.C142987Bo;
import X.C143887Fe;
import X.C145777Mo;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C181789Rv;
import X.C19740yt;
import X.C19830z4;
import X.C21425Ajs;
import X.C217617h;
import X.C22931Dv;
import X.C23581Gv;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C25161Nd;
import X.C25181Nf;
import X.C25221Nj;
import X.C25491Ok;
import X.C26241Rj;
import X.C26302CxJ;
import X.C26631Sw;
import X.C27131Uv;
import X.C27191Vc;
import X.C27201Vd;
import X.C27231Vg;
import X.C28741ap;
import X.C28931bI;
import X.C31131f4;
import X.C32021gV;
import X.C32091gc;
import X.C32191gn;
import X.C32291gx;
import X.C32791hl;
import X.C33251iW;
import X.C34171k3;
import X.C37451pZ;
import X.C40501uo;
import X.C40751vD;
import X.C42141xh;
import X.C42201xn;
import X.C441322g;
import X.C59842my;
import X.C62332rE;
import X.C63932tv;
import X.C692236j;
import X.C72033Kj;
import X.C72043Kk;
import X.C72453Mb;
import X.C73203Rj;
import X.C74743cP;
import X.C74873d3;
import X.C77523qH;
import X.C77923ro;
import X.C87414Vm;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.InputFilter;
import android.text.method.TextKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversation.ConversationEntryActionButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PopupNotification extends AnonymousClass1FU {
    public float A00;
    public Sensor A01;
    public SensorEventListener A02;
    public SensorManager A03;
    public PowerManager.WakeLock A04;
    public View.OnClickListener A05;
    public View A06;
    public View A07;
    public TextView A08;
    public AnonymousClass1L9 A09;
    public C42201xn A0A;
    public AnonymousClass4JZ A0B;
    public C1404271j A0C;
    public AnonymousClass1DM A0D;
    public C32191gn A0E;
    public C72043Kk A0F;
    public C40751vD A0G;
    public C33251iW A0H;
    public C108355bZ A0I;
    public AnonymousClass291 A0J;
    public AnonymousClass1VW A0K;
    public AnonymousClass1M9 A0L;
    public C24671Lf A0M;
    public AnonymousClass1PM A0N;
    public C24921Me A0O;
    public C25491Ok A0P;
    public C37451pZ A0Q;
    public C27201Vd A0R;
    public C27191Vc A0S;
    public AnonymousClass4VN A0T;
    public C32791hl A0U;
    public C77923ro A0V;
    public C25161Nd A0W;
    public C134196qC A0X;
    public C31131f4 A0Y;
    public AnonymousClass3V4 A0Z;
    public AnonymousClass11P A0a;
    public AnonymousClass118 A0b;
    public C18000vb A0c;
    public AnonymousClass1CJ A0d;
    public C25181Nf A0e;
    public AnonymousClass1MZ A0f;
    public AnonymousClass1R3 A0g;
    public C24681Lg A0h;
    public AnonymousClass1E7 A0i;
    public C1193267r A0j;
    public AnonymousClass4UI A0k;
    public AnonymousClass12L A0l;
    public AnonymousClass1MB A0m;
    public AnonymousClass1LU A0n;
    public AnonymousClass1BI A0o;
    public C27131Uv A0p;
    public C32091gc A0q;
    public C32291gx A0r;
    public PopupNotificationViewPager A0s;
    public AnonymousClass1R2 A0t;
    public C18010vc A0u;
    public C62332rE A0v;
    public C26241Rj A0w;
    public AnonymousClass206 A0x;
    public AnonymousClass1LD A0y;
    public AnonymousClass1Nb A0z;
    public C26631Sw A10;
    public C27231Vg A11;
    public AnonymousClass1L4 A12;
    public C32021gV A13;
    public C28931bI A14;
    public AnonymousClass74M A15;
    public AnonymousClass4SK A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public AnonymousClass00H A1A;
    public AnonymousClass00H A1B;
    public AnonymousClass00H A1C;
    public AnonymousClass00H A1D;
    public AnonymousClass00H A1E;
    public AnonymousClass00H A1F;
    public AnonymousClass00H A1G;
    public AnonymousClass00H A1H;
    public AnonymousClass00H A1I;
    public AnonymousClass00H A1J;
    public Integer A1K;
    public List A1L;
    public boolean A1M;
    public boolean A1N;
    public int A1O;
    public View A1P;
    public Button A1Q;
    public TextView A1R;
    public TextView A1S;
    public C42141xh A1T;
    public boolean A1U;
    public final Handler A1V;
    public final Handler A1W;
    public final C107845ai A1X;
    public final Runnable A1Y;
    public final Runnable A1Z;
    public final HashSet A1a;
    public final HashSet A1b;
    public final C34171k3 A1c;
    public final C23581Gv A1d;
    public final C28741ap A1e;
    public final AnonymousClass1WR A1f;
    public final C25221Nj A1g;
    public final C126176cJ A1h;
    public final HashSet A1i;

    public static void A0r(PopupNotification popupNotification) {
        PopupNotification popupNotification2 = popupNotification;
        AnonymousClass1E7 r5 = popupNotification.A0i;
        if (r5 != null) {
            Bitmap A042 = popupNotification.A0S.A04(popupNotification2, r5, "PopupNotification.updatePhoto", popupNotification.getResources().getDimension(2131168737), popupNotification.getResources().getDimensionPixelSize(2131168739), true);
            ImageView imageView = (ImageView) C110885hR.A0A(popupNotification2, 2131433986);
            if (A042 == null) {
                A042 = popupNotification2.A0K.A06(imageView.getContext(), popupNotification2.A0i);
            }
            imageView.setImageBitmap(A042);
        }
    }

    public boolean Bed() {
        return false;
    }

    public void CEx() {
    }

    public void CMk(DialogFragment dialogFragment, String str) {
    }

    public void CMl(DialogFragment dialogFragment) {
    }

    public void CNB(int i, int i2) {
    }

    public void CRG(String str) {
    }

    public void onCreate(Bundle bundle) {
        Integer num;
        requestWindowFeature(1);
        AnonymousClass3MZ.A0F(this).setLayoutDirection(3);
        getWindow().setStatusBarColor(C19740yt.A00(this, 17170445));
        super.onCreate(bundle);
        int i = 2130970796;
        int i2 = 2131102217;
        if (this.A0y.A01()) {
            i = 2130968798;
            i2 = 2131099872;
        }
        AnonymousClass3Ma.A1H(getWindow(), C19740yt.A00(this, AnonymousClass1YL.A00(this, i, i2)));
        SensorManager A0A2 = this.A08.A0A();
        C17960vV.A07(A0A2);
        this.A03 = A0A2;
        this.A01 = A0A2.getDefaultSensor(8);
        PowerManager A0G2 = this.A08.A0G();
        if (A0G2 == null) {
            Log.w("popupnotification/create pm=null");
        } else {
            this.A04 = C181789Rv.A00(A0G2, "popupnotification", 268435466);
        }
        setContentView(getLayoutInflater().inflate(2131626505, (ViewGroup) null, false));
        this.A0s = (PopupNotificationViewPager) findViewById(2131432691);
        C77923ro r4 = (C77923ro) findViewById(2131430490);
        this.A0V = r4;
        r4.setFilters(new InputFilter[]{new C1418777h(this, 1)});
        this.A1Q = (Button) findViewById(2131433969);
        this.A1T = this.A0F.BGE(this, (TextEmojiLabel) findViewById(2131433987));
        this.A08 = AnonymousClass3MX.A0L(this, 2131429560);
        this.A1R = AnonymousClass3MX.A0L(this, 2131433971);
        ImageView A0I2 = AnonymousClass3MX.A0I(this, 2131433119);
        C74743cP.A03(C40501uo.A00(getTheme(), getResources(), 2131232938), A0I2, this.A0c);
        this.A06 = findViewById(2131433120);
        ImageView A0I3 = AnonymousClass3MX.A0I(this, 2131434039);
        C74743cP.A03(C40501uo.A00(getTheme(), getResources(), 2131232939), A0I3, this.A0c);
        this.A07 = findViewById(2131434040);
        this.A1S = AnonymousClass3MX.A0L(this, 2131434377);
        this.A1P = findViewById(2131430331);
        ConversationEntryActionButton conversationEntryActionButton = (ConversationEntryActionButton) findViewById(2131429565);
        AnonymousClass4JZ r10 = this.A0B;
        C18030ve r7 = this.A0E;
        AnonymousClass1E7 r0 = this.A0i;
        if (r0 == null || this.A0m.A01(AnonymousClass1E7.A00(r0))) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        this.A0Z = AnonymousClass4GQ.A00(this, r10, C87414Vm.A00(r7, num), (AnonymousClass1BI) null, false, false, false);
        this.A14 = C72453Mb.A0r(this, 2131434239);
        conversationEntryActionButton.A02(this, new AnonymousClass7EQ(this, 0), this.A0Z);
        AnonymousClass291 r1 = new AnonymousClass291(new C113795nl(this));
        this.A0J = r1;
        this.A0s.setAdapter(r1);
        C1422678u.A00(this.A0s, this, 20);
        this.A0s.A0K(new C142707Am(this, 0));
        AnonymousClass3Ma.A19(findViewById(2131433982), this, 28);
        AFC afc = new AFC(this, 29);
        this.A05 = afc;
        this.A1Q.setOnClickListener(afc);
        AFC afc2 = new AFC(this, 30);
        A0I2.setOnClickListener(afc2);
        this.A06.setOnClickListener(afc2);
        AFC afc3 = new AFC(this, 31);
        A0I3.setOnClickListener(afc3);
        this.A07.setOnClickListener(afc3);
        View findViewById = findViewById(2131431653);
        findViewById.setBackgroundResource(2131231611);
        findViewById.setPadding(0, 0, 0, 0);
        View A0A3 = C110885hR.A0A(this, 2131436064);
        int max = Math.max(A0A3.getPaddingLeft(), A0A3.getPaddingRight());
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A0A3);
        if (AnonymousClass3MY.A1b(this.A0c)) {
            A0B2.rightMargin = max;
        } else {
            A0B2.leftMargin = max;
        }
        A0A3.setLayoutParams(A0B2);
        AnonymousClass3Ma.A19(this.A0V, this, 32);
        getLayoutInflater().inflate(2131627463, (ViewGroup) findViewById(2131436905), true);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(2131434741);
        this.A15 = this.A16.A01(this, keyboardPopupLayout, this.A0Z, new AnonymousClass7OB(this, 0));
        this.A0Z.A0X(AnonymousClass1EG.A0H(this.A0V.getText()));
        this.A0V.addTextChangedListener(new C121196Ih(this, 6));
        this.A0V.setOnEditorActionListener(new AnonymousClass79Y(this, 4));
        View findViewById2 = findViewById(2131430328);
        C18030ve r19 = this.A0E;
        AnonymousClass1L4 r18 = this.A12;
        AnonymousClass190 r17 = this.A03;
        AnonymousClass1KW r15 = this.A0D;
        C1193267r r14 = this.A0j;
        AnonymousClass11C r13 = this.A08;
        C18000vb r12 = this.A0c;
        C19830z4 r5 = this.A0A;
        C18010vc r42 = this.A0u;
        C77923ro r3 = this.A0V;
        String stringExtra = getIntent().getStringExtra("popup_notification_extra_quick_reply_jid");
        C22931Dv r16 = AnonymousClass1BI.A00;
        C18000vb r22 = r12;
        AnonymousClass1L4 r29 = r18;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        C77923ro r192 = r3;
        AnonymousClass11C r20 = r13;
        C19830z4 r21 = r5;
        C74873d3 r142 = new C74873d3(this, findViewById2, r17, keyboardPopupLayout2, r192, r20, r21, r22, C108945cZ.A0e(this.A1B), r14, r15, (EmojiSearchProvider) this.A1A.get(), r19, r42, r29, 21, A3P.A00(r16.A02(stringExtra)));
        r142.A0J(this.A1X);
        r142.A09 = new AnonymousClass7G6(this, 1);
        AnonymousClass4UI r43 = new AnonymousClass4UI(this, r142, (EmojiSearchContainer) findViewById(2131433983));
        this.A0k = r43;
        r43.A00 = new AnonymousClass7GD(this, 3);
        if (getIntent().getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A0r.A0E(false);
            C62332rE.A00(this.A0v, true);
        }
        AnonymousClass1BI A022 = r16.A02(C108955ca.A0r(this, "popup_notification_extra_quick_reply_jid"));
        C17900vP.A0Y(A022, "popupnotification/set-quick-reply-jid:", AnonymousClass000.A10());
        this.A0o = A022;
        A48();
        C17880vN.A0V(this.A18).registerObserver(this.A1e);
        this.A0h.registerObserver(this.A1f);
        this.A0M.registerObserver(this.A1d);
        C17880vN.A0V(this.A19).registerObserver(this.A1c);
        C17880vN.A0V(this.A1C).registerObserver(this.A1g);
        if (this.A0D.A00() > 0) {
            AnonymousClass4Yv.A01(this, 115);
        }
        if (this.A0o != null) {
            getWindow().setSoftInputMode(4);
        }
        C126176cJ r02 = this.A1h;
        C18070vi.A0d(r02, 0);
        ((AnonymousClass16Q) this.A1F.get()).A00 = r02;
        this.A05.CGF(new C21425Ajs(this, 14));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.whatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.components.button.ThumbnailButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.BqL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.3qH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.3qH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.3qH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.whatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.BqO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.whatsapp.WaFrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: X.BqU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: X.BqU} */
    /* JADX WARNING: type inference failed for: r12v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0663  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View A03(com.whatsapp.notification.PopupNotification r16, X.AnonymousClass206 r17) {
        /*
            r5 = r17
            int r1 = r5.A0u
            r4 = 0
            r3 = 1
            r7 = 2
            r6 = r16
            if (r1 == 0) goto L_0x05ef
            if (r1 == r3) goto L_0x05cd
            if (r1 == r7) goto L_0x05a2
            r0 = 3
            if (r1 == r0) goto L_0x054c
            r0 = 4
            if (r1 == r0) goto L_0x04bd
            r0 = 5
            if (r1 == r0) goto L_0x03d0
            r0 = 7
            if (r1 == r0) goto L_0x05ef
            r0 = 9
            if (r1 == r0) goto L_0x0321
            r0 = 20
            if (r1 == r0) goto L_0x0303
            r0 = 37
            if (r1 == r0) goto L_0x05cd
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x02bc
            r0 = 23
            if (r1 == r0) goto L_0x05cd
            r0 = 24
            if (r1 == r0) goto L_0x0287
            switch(r1) {
                case 13: goto L_0x0231;
                case 14: goto L_0x01dd;
                case 15: goto L_0x00d8;
                case 16: goto L_0x011a;
                default: goto L_0x0036;
            }
        L_0x0036:
            switch(r1) {
                case 42: goto L_0x00cc;
                case 43: goto L_0x00cc;
                case 44: goto L_0x004b;
                default: goto L_0x0039;
            }
        L_0x0039:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r6)
        L_0x003e:
            boolean r14 = X.AnonymousClass25A.A0w(r5)
            if (r14 != 0) goto L_0x0663
            X.206 r0 = r5.A0K()
            if (r0 != 0) goto L_0x0663
            return r2
        L_0x004b:
            r10 = r5
            X.22U r10 = (X.AnonymousClass22U) r10
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624879(0x7f0e03af, float:1.887695E38)
            r12 = 0
            android.view.View r2 = r1.inflate(r0, r4, r12)
            com.whatsapp.WaFrameLayout r2 = (com.whatsapp.WaFrameLayout) r2
            X.5bZ r1 = r6.A0I
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            android.graphics.drawable.Drawable r0 = r1.BS0(r0, r7, r12)
            r2.setForeground(r0)
            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
            android.widget.ImageView r9 = X.AnonymousClass3MW.A0H(r2, r0)
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            android.widget.TextView r11 = X.C17880vN.A0E(r2, r0)
            r0 = 2131433331(0x7f0b1773, float:1.8488445E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r2, r0)
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
            android.widget.TextView r13 = X.C17880vN.A0E(r2, r0)
            X.0vb r0 = r6.A0c
            java.lang.String r0 = X.C63752td.A02(r0, r10)
            r1.setText(r0)
            X.0vb r0 = r6.A0c
            java.lang.String r8 = X.C63752td.A01(r6, r0, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 8
            if (r0 == 0) goto L_0x00c5
            r13.setVisibility(r1)
        L_0x009d:
            java.lang.String r0 = r10.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c1
            r11.setVisibility(r12)
            java.lang.String r0 = r10.A07
            r11.setText(r0)
        L_0x00ad:
            X.1gV r8 = r6.A13
            r1 = 2131232044(0x7f08052c, float:1.8080186E38)
            X.7NH r0 = new X.7NH
            r0.<init>(r9, r8, r1)
            r8.A0D(r9, r10, r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003e
        L_0x00c1:
            r11.setVisibility(r1)
            goto L_0x00ad
        L_0x00c5:
            r13.setText(r8)
            r13.setVisibility(r12)
            goto L_0x009d
        L_0x00cc:
            r1 = r5
            X.21V r1 = (X.AnonymousClass21V) r1
            android.view.View$OnClickListener r0 = r6.A05
            X.BqO r2 = new X.BqO
            r2.<init>(r6, r0, r1)
            goto L_0x003e
        L_0x00d8:
            com.whatsapp.TextEmojiLabel r2 = new com.whatsapp.TextEmojiLabel
            r2.<init>(r6)
            r0 = 2131433977(0x7f0b19f9, float:1.8489755E38)
            r2.setId(r0)
            r0 = 2131895351(0x7f122437, float:1.9425533E38)
            java.lang.String r9 = r6.getString(r0)
            X.4VN r0 = r6.A0T
            X.C108995ce.A0k(r6, r2, r0)
            r0 = 17
            r2.setGravity(r0)
            r1 = 2130970831(0x7f0408cf, float:1.7550383E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            X.C72463Mc.A0y(r6, r2, r1, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165753(0x7f070239, float:1.7945732E38)
            int r8 = r1.getDimensionPixelSize(r0)
            int r1 = X.AnonymousClass3MZ.A01(r6, r0)
            r0 = 0
            r2.setPadding(r8, r0, r1, r0)
            r2.A0S(r9, r4, r0, r3)
            X.0ve r0 = r6.A0E
            X.AnonymousClass3Ma.A1L(r0, r2)
            goto L_0x003e
        L_0x011a:
            r9 = r5
            X.219 r9 = (X.AnonymousClass219) r9
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624857(0x7f0e0399, float:1.8876906E38)
            android.view.View r10 = r1.inflate(r0, r2, r3)
            r0 = 2131432129(0x7f0b12c1, float:1.8486007E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            java.lang.String r0 = r9.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r14 = 8
            if (r0 != 0) goto L_0x01d8
            java.lang.String r0 = r9.A03
            r1.setText(r0)
        L_0x0148:
            r0 = 2131432133(0x7f0b12c5, float:1.8486015E38)
            android.view.View r15 = r10.findViewById(r0)
            r0 = 2131432134(0x7f0b12c6, float:1.8486017E38)
            android.view.View r13 = r10.findViewById(r0)
            r0 = 2131432135(0x7f0b12c7, float:1.8486019E38)
            android.view.View r12 = r10.findViewById(r0)
            r0 = 2131432138(0x7f0b12ca, float:1.8486025E38)
            android.widget.TextView r11 = X.C17880vN.A0E(r10, r0)
            X.11P r0 = r6.A0a
            long r16 = X.AnonymousClass11P.A01(r0)
            X.1Uv r0 = r6.A0p
            long r0 = r0.A0I(r9)
            int r8 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x01b7
            r14 = 0
            r15.setVisibility(r14)
            r13.setVisibility(r14)
            r12.setVisibility(r14)
            android.content.res.Resources r13 = r6.getResources()
            r12 = 2130969247(0x7f04029f, float:1.754717E38)
            r8 = 2131100256(0x7f060260, float:1.7812888E38)
            int r8 = X.AnonymousClass3Ma.A01(r6, r13, r12, r8)
            r11.setTextColor(r8)
            r13 = 2131891774(0x7f12163e, float:1.9418278E38)
            java.lang.Object[] r12 = new java.lang.Object[r3]
            X.0vb r8 = r6.A0c
            java.lang.String r0 = X.A8I.A00(r8, r0)
            r12[r14] = r0
            X.AnonymousClass3MY.A0y(r6, r11, r12, r13)
        L_0x019f:
            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
            android.view.View r8 = r10.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r8 = (com.whatsapp.components.button.ThumbnailButton) r8
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167018(0x7f07072a, float:1.7948298E38)
            X.AnonymousClass3MY.A14(r1, r8, r0)
            X.AnonymousClass7NH.A00(r8, r6, r9)
            goto L_0x003e
        L_0x01b7:
            r15.setVisibility(r14)
            r13.setVisibility(r14)
            r12.setVisibility(r14)
            android.content.res.Resources r8 = r6.getResources()
            r1 = 2130970360(0x7f0406f8, float:1.7549428E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            int r0 = X.AnonymousClass3Ma.A01(r6, r8, r1, r0)
            r11.setTextColor(r0)
            r0 = 2131891786(0x7f12164a, float:1.9418302E38)
            r11.setText(r0)
            goto L_0x019f
        L_0x01d8:
            r1.setVisibility(r14)
            goto L_0x0148
        L_0x01dd:
            r1 = r5
            X.22n r1 = (X.C442022n) r1
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r6)
            X.118 r0 = r6.A0b
            java.lang.String r0 = X.C124306Xv.A00(r0, r1)
            r9.setText(r0)
            X.4VN r0 = r6.A0T
            X.C108995ce.A0k(r6, r9, r0)
            r8 = 17
            r9.setGravity(r8)
            r1 = 2130970831(0x7f0408cf, float:1.7550383E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            X.C72463Mc.A0y(r6, r9, r1, r0)
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2131231831(0x7f080457, float:1.8079754E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r2, r0)
            r9.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167018(0x7f07072a, float:1.7948298E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.setCompoundDrawablePadding(r0)
            r9.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r2.setGravity(r8)
            r2.addView(r9)
            goto L_0x003e
        L_0x0231:
            r9 = r5
            X.21V r9 = (X.AnonymousClass21V) r9
            X.3qH r2 = new X.3qH
            r2.<init>(r6)
            r0 = 2131433974(0x7f0b19f6, float:1.8489749E38)
            r2.setId(r0)
            r6.A0Q(r2)
            android.content.res.Resources r8 = r6.getResources()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2131232594(0x7f080752, float:1.8081302E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r8, r0)
            r2.A04 = r0
            X.1gV r8 = r6.A13
            r11 = 0
            r1 = 2131232619(0x7f08076b, float:1.8081352E38)
            X.7NH r0 = new X.7NH
            r0.<init>(r2, r8, r1)
            r8.A0E(r2, r9, r0)
            int r0 = r9.A0D     // Catch:{ IllegalArgumentException -> 0x0280 }
            if (r0 == 0) goto L_0x0271
            X.0vb r8 = r6.A0c     // Catch:{ IllegalArgumentException -> 0x0280 }
            int r0 = r9.A0D     // Catch:{ IllegalArgumentException -> 0x0280 }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x0280 }
            java.lang.String r11 = X.C64052u8.A0D(r8, r4, r0)     // Catch:{ IllegalArgumentException -> 0x0280 }
        L_0x026e:
            r2.A05 = r11     // Catch:{ IllegalArgumentException -> 0x0280 }
            goto L_0x0280
        L_0x0271:
            long r0 = r9.A01     // Catch:{ IllegalArgumentException -> 0x0280 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x026e
            X.0vb r8 = r6.A0c     // Catch:{ IllegalArgumentException -> 0x0280 }
            java.lang.String r11 = X.C88584aA.A02(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0280 }
            goto L_0x026e
        L_0x0280:
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003e
        L_0x0287:
            r10 = r5
            X.23S r10 = (X.AnonymousClass23S) r10
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624834(0x7f0e0382, float:1.8876859E38)
            android.view.View r2 = X.AnonymousClass3MX.A09(r1, r4, r0)
            r0 = 2131431270(0x7f0b0f66, float:1.8484264E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r2, r0)
            r0 = 2131427946(0x7f0b026a, float:1.8477523E38)
            android.widget.ImageView r9 = X.AnonymousClass3MW.A0H(r2, r0)
            java.lang.String r0 = r10.A05
            r1.setText(r0)
            X.1gV r8 = r6.A13
            r1 = 2131231053(0x7f08014d, float:1.8078176E38)
            X.7NH r0 = new X.7NH
            r0.<init>(r9, r8, r1)
            r8.A0D(r9, r10, r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003e
        L_0x02bc:
            r9 = r5
            X.21V r9 = (X.AnonymousClass21V) r9
            X.3qH r2 = new X.3qH
            r2.<init>(r6)
            r0 = 2131433978(0x7f0b19fa, float:1.8489757E38)
            r2.setId(r0)
            r6.A0Q(r2)
            android.content.res.Resources r8 = r6.getResources()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2131232595(0x7f080753, float:1.8081304E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r8, r0)
            r2.A04 = r0
            X.1gV r8 = r6.A13
            r11 = 0
            r1 = 2131233051(0x7f08091b, float:1.8082229E38)
            X.7NH r0 = new X.7NH
            r0.<init>(r2, r8, r1)
            r8.A0E(r2, r9, r0)
            long r0 = r9.A01
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x02fa
            X.0vb r8 = r6.A0c
            java.lang.String r11 = X.C88584aA.A02(r8, r0)
        L_0x02fa:
            r2.A05 = r11
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003e
        L_0x0303:
            r8 = r5
            X.22g r8 = (X.C441322g) r8
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624930(0x7f0e03e2, float:1.8877054E38)
            android.view.View r2 = X.AnonymousClass3MX.A09(r1, r4, r0)
            r0 = 2131433984(0x7f0b1a00, float:1.848977E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x003e
            A0t(r6, r8, r0)
            goto L_0x003e
        L_0x0321:
            r10 = r5
            X.21i r10 = (X.C438921i) r10
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r0 = 2131433973(0x7f0b19f5, float:1.8489747E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624815(0x7f0e036f, float:1.887682E38)
            android.view.View r8 = r1.inflate(r0, r2, r3)
            r0 = 2131431496(0x7f0b1048, float:1.8484723E38)
            android.widget.ImageView r14 = X.AnonymousClass3MW.A0H(r8, r0)
            android.widget.TextView r12 = X.C108975cc.A0C(r8)
            r0 = 2131431625(0x7f0b10c9, float:1.8484984E38)
            android.widget.TextView r9 = X.C17880vN.A0E(r8, r0)
            r0 = 2131428482(0x7f0b0482, float:1.847861E38)
            android.view.View r11 = r8.findViewById(r0)
            r0 = 2131430843(0x7f0b0dbb, float:1.8483398E38)
            android.widget.TextView r13 = X.C17880vN.A0E(r8, r0)
            r0 = 2131428480(0x7f0b0480, float:1.8478606E38)
            android.view.View r1 = r8.findViewById(r0)
            r0 = 2131430844(0x7f0b0dbc, float:1.84834E38)
            android.widget.TextView r8 = X.C17880vN.A0E(r8, r0)
            android.graphics.drawable.Drawable r0 = X.C137486vX.A00(r6, r10)
            r14.setImageDrawable(r0)
            java.lang.String r0 = r10.A18()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03c8
            r0 = 2131897363(0x7f122c13, float:1.9429613E38)
            r12.setText(r0)
        L_0x0384:
            r12 = 0
            r13.setVisibility(r12)
            r1.setVisibility(r12)
            X.0vb r14 = r6.A0c
            long r0 = r10.A01
            java.lang.String r0 = X.C88584aA.A02(r14, r0)
            r13.setText(r0)
            int r0 = r10.A00
            if (r0 == 0) goto L_0x03bf
            r9.setVisibility(r12)
            r11.setVisibility(r12)
            X.0vb r1 = r6.A0c
            X.747 r0 = X.C62272r8.A04
            java.lang.String r0 = r0.A09(r1, r10)
            r9.setText(r0)
        L_0x03ab:
            java.lang.String r0 = r10.A06
            java.lang.String r0 = X.C25291Nq.A03(r0)
            java.lang.String r0 = X.C108955ca.A0y(r0)
            r8.setText(r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003e
        L_0x03bf:
            r0 = 8
            r9.setVisibility(r0)
            r11.setVisibility(r0)
            goto L_0x03ab
        L_0x03c8:
            java.lang.String r0 = r10.A18()
            r12.setText(r0)
            goto L_0x0384
        L_0x03d0:
            r14 = r5
            X.21B r14 = (X.AnonymousClass21B) r14
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r0 = 2131433976(0x7f0b19f8, float:1.8489753E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624864(0x7f0e03a0, float:1.887692E38)
            android.view.View r13 = r1.inflate(r0, r2, r3)
            r0 = 2131433872(0x7f0b1990, float:1.8489542E38)
            android.widget.TextView r12 = X.C17880vN.A0E(r13, r0)
            r0 = 2131433871(0x7f0b198f, float:1.848954E38)
            android.widget.TextView r11 = X.C17880vN.A0E(r13, r0)
            java.lang.String r0 = r14.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r10 = 8
            if (r0 == 0) goto L_0x0424
            r12.setVisibility(r10)
            r11.setVisibility(r10)
        L_0x040c:
            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
            android.view.View r8 = r13.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r8 = (com.whatsapp.components.button.ThumbnailButton) r8
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167018(0x7f07072a, float:1.7948298E38)
            X.AnonymousClass3MY.A14(r1, r8, r0)
            X.AnonymousClass7NH.A00(r8, r6, r14)
            goto L_0x003e
        L_0x0424:
            r9 = 0
            r12.setVisibility(r9)
            java.lang.String r0 = r14.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x04ba
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://maps.google.com/maps?q="
            r8.append(r0)
            java.lang.String r15 = r14.A1A()
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r15.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r8.append(r0)
            java.lang.String r0 = "&sll="
            r8.append(r0)
            double r0 = r14.A00
            r8.append(r0)
            java.lang.String r0 = ","
            r8.append(r0)
            double r0 = r14.A01
            r8.append(r0)
            java.lang.String r8 = r8.toString()
        L_0x0464:
            r12.setAutoLinkMask(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "<a href=\""
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "\">"
            r1.append(r0)
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()
            java.lang.String r0 = r14.A01
            r15.append(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r15)
            java.lang.String r0 = android.text.Html.escapeHtml(r0)
            r1.append(r0)
            java.lang.String r0 = "</a>"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.AnonymousClass3MY.A1X(r0, r12)
            java.lang.String r0 = r14.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04b6
            r11.setVisibility(r9)
            java.lang.String r0 = r14.A00
            r11.setText(r0)
        L_0x04a7:
            r1 = 14
            X.AFV r0 = new X.AFV
            r0.<init>(r1, r8, r6)
            r12.setOnClickListener(r0)
            r11.setOnClickListener(r0)
            goto L_0x040c
        L_0x04b6:
            r11.setVisibility(r10)
            goto L_0x04a7
        L_0x04ba:
            java.lang.String r8 = r14.A02
            goto L_0x0464
        L_0x04bd:
            r11 = r5
            X.22p r11 = (X.C442222p) r11
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r6)
            java.lang.String r1 = r11.A00
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r1, r0)
            r9.setText(r0)
            X.4VN r0 = r6.A0T
            X.C108995ce.A0k(r6, r9, r0)
            r8 = 17
            r9.setGravity(r8)
            r1 = 2130970831(0x7f0408cf, float:1.7550383E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            X.C72463Mc.A0y(r6, r9, r1, r0)
            X.118 r10 = r6.A0b
            X.1M9 r2 = r6.A0L
            X.11C r1 = r6.A08
            X.0vb r0 = r6.A0c
            X.2dU r0 = X.AnonymousClass73Y.A03(r2, r1, r10, r0, r11)
            if (r0 == 0) goto L_0x054a
            X.73C r0 = r0.A01
            byte[] r2 = r0.A0B
            if (r2 == 0) goto L_0x054a
            int r1 = r2.length
            r0 = 0
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
        L_0x04fd:
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2131231831(0x7f080457, float:1.8079754E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r2, r0)
            if (r10 == 0) goto L_0x0546
            int r2 = r0.getIntrinsicWidth()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131169019(0x7f070efb, float:1.7952356E38)
            float r0 = r1.getDimension(r0)
            android.graphics.Bitmap r0 = X.C26511Sk.A06(r10, r0, r2)
            android.graphics.drawable.BitmapDrawable r0 = X.C108975cc.A08(r6, r0)
            r9.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
        L_0x0528:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167018(0x7f07072a, float:1.7948298E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.setCompoundDrawablePadding(r0)
            r9.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r2.setGravity(r8)
            r2.addView(r9)
            goto L_0x003e
        L_0x0546:
            r9.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            goto L_0x0528
        L_0x054a:
            r10 = r4
            goto L_0x04fd
        L_0x054c:
            r9 = r5
            X.21V r9 = (X.AnonymousClass21V) r9
            X.3qH r2 = new X.3qH
            r2.<init>(r6)
            r0 = 2131433979(0x7f0b19fb, float:1.8489759E38)
            r2.setId(r0)
            r6.A0Q(r2)
            android.content.res.Resources r8 = r6.getResources()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2131232596(0x7f080754, float:1.8081306E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r8, r0)
            r2.A04 = r0
            X.1gV r8 = r6.A13
            r11 = 0
            r1 = 2131232619(0x7f08076b, float:1.8081352E38)
            X.7NH r0 = new X.7NH
            r0.<init>(r2, r8, r1)
            r8.A0E(r2, r9, r0)
            int r0 = r9.A0D     // Catch:{ IllegalArgumentException -> 0x059b }
            if (r0 == 0) goto L_0x058c
            X.0vb r8 = r6.A0c     // Catch:{ IllegalArgumentException -> 0x059b }
            int r0 = r9.A0D     // Catch:{ IllegalArgumentException -> 0x059b }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x059b }
            java.lang.String r11 = X.C64052u8.A0D(r8, r4, r0)     // Catch:{ IllegalArgumentException -> 0x059b }
        L_0x0589:
            r2.A05 = r11     // Catch:{ IllegalArgumentException -> 0x059b }
            goto L_0x059b
        L_0x058c:
            long r0 = r9.A01     // Catch:{ IllegalArgumentException -> 0x059b }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0589
            X.0vb r8 = r6.A0c     // Catch:{ IllegalArgumentException -> 0x059b }
            java.lang.String r11 = X.C88584aA.A02(r8, r0)     // Catch:{ IllegalArgumentException -> 0x059b }
            goto L_0x0589
        L_0x059b:
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003e
        L_0x05a2:
            r8 = r5
            X.22l r8 = (X.C441822l) r8
            int r0 = r8.A09
            if (r0 != r3) goto L_0x05c6
            X.1pZ r1 = r6.A0Q
            if (r1 != 0) goto L_0x05b7
            X.1Vd r1 = r6.A0R
            java.lang.String r0 = "popup-notification"
            X.1pZ r1 = r1.A06(r6, r0)
            r6.A0Q = r1
        L_0x05b7:
            X.1f4 r0 = r6.A0Y
            X.BqU r2 = new X.BqU
            r9 = r6
            r10 = r1
            r11 = r0
            r12 = r6
            r13 = r8
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x003e
        L_0x05c6:
            X.BqL r2 = new X.BqL
            r2.<init>(r6, r6, r8)
            goto L_0x003e
        L_0x05cd:
            com.whatsapp.components.button.ThumbnailButton r2 = new com.whatsapp.components.button.ThumbnailButton
            r2.<init>(r6)
            r0 = 2131433975(0x7f0b19f7, float:1.848975E38)
            r2.setId(r0)
            r6.A0Q(r2)
            X.1gV r8 = r6.A13
            r1 = 2131232614(0x7f080766, float:1.8081342E38)
            X.7NH r0 = new X.7NH
            r0.<init>(r2, r8, r1)
            r8.A0E(r2, r5, r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003e
        L_0x05ef:
            com.whatsapp.TextEmojiLabel r2 = new com.whatsapp.TextEmojiLabel
            r2.<init>(r6)
            r0 = 2131433980(0x7f0b19fc, float:1.848976E38)
            r2.setId(r0)
            X.AW0 r0 = X.AnonymousClass25B.A00(r5)
            r8 = 0
            if (r0 == 0) goto L_0x0650
            X.1R2 r0 = r6.A0t
            java.lang.String r9 = r0.A0d(r5)
        L_0x0607:
            boolean r0 = r5.A0s()
            if (r0 == 0) goto L_0x0621
            android.text.SpannableStringBuilder r9 = X.AnonymousClass3MW.A09(r9)
            X.1gc r10 = r6.A0q
            X.205 r0 = r5.A0v
            X.1BI r1 = r0.A00
            java.util.List r0 = r5.A0h
            r11 = r6
            r12 = r9
            r13 = r1
            r14 = r0
            r15 = r3
            r10.A06(r11, r12, r13, r14, r15)
        L_0x0621:
            X.4VN r0 = r6.A0T
            X.C108995ce.A0k(r6, r2, r0)
            r0 = 17
            r2.setGravity(r0)
            r1 = 2130970831(0x7f0408cf, float:1.7550383E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            X.C72463Mc.A0y(r6, r2, r1, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165753(0x7f070239, float:1.7945732E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.AnonymousClass3MZ.A01(r6, r0)
            r2.setPadding(r1, r8, r0, r8)
            r2.A0S(r9, r4, r8, r3)
            X.0ve r0 = r6.A0E
            X.AnonymousClass3Ma.A1L(r0, r2)
            goto L_0x003e
        L_0x0650:
            boolean r0 = r5 instanceof X.C436420i
            if (r0 == 0) goto L_0x065e
            X.1gn r1 = r6.A0E
            r0 = r5
            X.20i r0 = (X.C436420i) r0
            java.lang.String r9 = r1.A0S(r0, r8)
            goto L_0x0607
        L_0x065e:
            java.lang.String r9 = r5.A0P()
            goto L_0x0607
        L_0x0663:
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131626666(0x7f0e0aaa, float:1.8880575E38)
            r8 = 0
            android.view.View r9 = r1.inflate(r0, r4, r8)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0 = 2131434295(0x7f0b1b37, float:1.84904E38)
            android.view.View r11 = r9.findViewById(r0)
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            X.206 r0 = r5.A0K()
            if (r0 == 0) goto L_0x078e
            r11.setVisibility(r8)
            X.5bZ r1 = r6.A0I
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            android.graphics.drawable.Drawable r0 = r1.BS0(r0, r7, r8)
            r11.setForeground(r0)
            r0 = 2131434307(0x7f0b1b43, float:1.8490424E38)
            android.widget.TextView r13 = X.C17880vN.A0E(r11, r0)
            r0 = 2131434293(0x7f0b1b35, float:1.8490396E38)
            android.widget.TextView r12 = X.C17880vN.A0E(r11, r0)
            r0 = 2131434304(0x7f0b1b40, float:1.8490418E38)
            android.widget.TextView r10 = X.C17880vN.A0E(r11, r0)
            X.4VN r4 = r6.A0T
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Resources$Theme r0 = r6.getTheme()
            float r0 = r4.A00(r0, r1)
            r13.setTextSize(r0)
            r12.setTextSize(r0)
            r10.setTextSize(r0)
            X.C43421zm.A04(r13)
            X.C43421zm.A04(r12)
            X.C43421zm.A04(r10)
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            X.6sH r10 = new X.6sH
            r10.<init>(r0, r8, r8)
            X.206 r4 = r5.A0K()
            X.00H r0 = r6.A1G
            java.lang.Object r1 = r0.get()
            X.6z1 r1 = (X.C139546z1) r1
            X.00H r0 = r6.A1D
            java.lang.Object r0 = r0.get()
            X.724 r0 = (X.AnonymousClass724) r0
            r1.A01(r11, r0, r4, r10)
        L_0x06e3:
            if (r14 == 0) goto L_0x0786
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166343(0x7f070487, float:1.7946929E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166342(0x7f070486, float:1.7946927E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166344(0x7f070488, float:1.794693E38)
            int r11 = r1.getDimensionPixelSize(r0)
            r0 = -1
            r10 = -2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r0, r10)
            r0 = 3
            r5.gravity = r0
            android.content.Context r0 = r6.getApplicationContext()
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r1.setOrientation(r8)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()
            java.lang.String r4 = X.C19620yd.A08
            r14.append(r4)
            r0 = 2131890529(0x7f121161, float:1.9415752E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r14)
            com.whatsapp.TextEmojiLabel r4 = new com.whatsapp.TextEmojiLabel
            r4.<init>(r6)
            r4.setText(r0)
            android.content.res.Resources r15 = r6.getResources()
            r14 = 2130971964(0x7f040d3c, float:1.7552681E38)
            r0 = 2131103119(0x7f060d8f, float:1.7818695E38)
            int r0 = X.AnonymousClass3Ma.A01(r6, r15, r14, r0)
            r4.setTextColor(r0)
            android.graphics.Typeface r0 = r4.getTypeface()
            r4.setTypeface(r0, r7)
            r4.setSingleLine()
            r4.setLines(r3)
            X.4VN r7 = r6.A0T
            android.content.res.Resources r3 = r6.getResources()
            android.content.res.Resources$Theme r0 = r6.getTheme()
            float r0 = r7.A00(r0, r3)
            r4.setTextSize(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r0)
            r4.setCompoundDrawablePadding(r12)
            r1.setPadding(r13, r11, r13, r8)
            r1.addView(r4, r10, r10)
            r9.addView(r1, r8, r5)
            X.0vb r0 = r6.A0c
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            r0 = 2131231929(0x7f0804b9, float:1.8079953E38)
            if (r1 == 0) goto L_0x078a
            r4.setCompoundDrawablesWithIntrinsicBounds(r8, r8, r0, r8)
        L_0x0786:
            r9.addView(r2)
            return r9
        L_0x078a:
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r8, r8, r8)
            goto L_0x0786
        L_0x078e:
            r0 = 8
            r11.setVisibility(r0)
            goto L_0x06e3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A03(com.whatsapp.notification.PopupNotification, X.206):android.view.View");
    }

    public static void A0V(PopupNotification popupNotification) {
        if (!popupNotification.A1L.isEmpty()) {
            A0s(popupNotification, popupNotification.A0s.getCurrentItem());
        }
    }

    public static void A0c(PopupNotification popupNotification) {
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        popupNotification.A0U.A00((AnonymousClass1BI) popupNotification.A0i.A06(cls), 2, 3, true, true, false);
        InputMethodManager A0N2 = popupNotification.A08.A0N();
        if (A0N2 != null && A0N2.isFullscreenMode()) {
            A0N2.hideSoftInputFromWindow(popupNotification.A0V.getWindowToken(), 0);
        }
        int currentItem = popupNotification.A0s.getCurrentItem();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("popupnotification/moveToNextMessageOrExit/ message_pos:");
        A102.append(currentItem);
        A102.append(" messages.size:");
        C17900vP.A0o(A102, popupNotification.A1L.size());
        popupNotification.A1i.add(AnonymousClass3MW.A0k(popupNotification.A1L, currentItem).A0v);
        if (popupNotification.A1L.size() == 1 || (popupNotification.A0o != null && popupNotification.A1O == 1)) {
            A0d(popupNotification);
            popupNotification.finish();
            return;
        }
        int i = currentItem + 1;
        if (currentItem == AnonymousClass3MX.A02(popupNotification.A1L, 1)) {
            i = currentItem - 1;
        }
        popupNotification.A1K = Integer.valueOf(currentItem);
        popupNotification.A0s.A0J(i, true);
        if (popupNotification.A1L.size() == 1) {
            A0W(popupNotification);
        }
        AnonymousClass206 r0 = popupNotification.A0x;
        if (r0 != null) {
            popupNotification.A1b.add(r0.A0v);
        }
        AnonymousClass1E7 r02 = popupNotification.A0i;
        if (r02 != null) {
            popupNotification.A1a.add(r02.A06(cls));
        }
    }

    public static void A0q(PopupNotification popupNotification) {
        if (popupNotification.A0i == null) {
            return;
        }
        if (AnonymousClass3MW.A0V(popupNotification.A17).A0P(AnonymousClass3MZ.A0x(popupNotification.A0i))) {
            AnonymousClass4Yv.A01(popupNotification, 106);
            return;
        }
        String A0h2 = C108985cd.A0h(popupNotification.A0V);
        if (A0h2.length() > 0) {
            if (C26302CxJ.A0V(popupNotification.A08, popupNotification.A0u, A0h2)) {
                popupNotification.A0H.A0O((C143887Fe) null, (AnonymousClass206) null, (C692236j) null, A0h2, Collections.singletonList(AnonymousClass3MW.A0g(popupNotification.A0i)), (List) null, false, false);
                TextKeyListener.clear(popupNotification.A0V.getText());
            } else {
                popupNotification.A05.A08(2131887925, 1);
            }
            A0c(popupNotification);
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("popupnotification/sendentry/empty text ");
        C17900vP.A0o(A102, popupNotification.A1L.size());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0s(com.whatsapp.notification.PopupNotification r10, int r11) {
        /*
        L_0x0000:
            java.util.List r0 = r10.A1L
            int r0 = r0.size()
            if (r11 >= 0) goto L_0x000a
            int r11 = r11 + r0
            goto L_0x0000
        L_0x000a:
            int r11 = r11 % r0
            java.util.List r0 = r10.A1L
            X.206 r0 = X.AnonymousClass3MW.A0k(r0, r11)
            r10.A0x = r0
            X.205 r0 = r0.A0v
            X.1BI r4 = r0.A00
            X.74M r2 = r10.A15
            X.72K r0 = r2.A0J
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Do not update the ptt receiver once the recording has started"
            X.C17960vV.A0H(r1, r0)
            r2.A0C = r4
        L_0x002a:
            X.1Nf r0 = r10.A0e
            X.1E7 r0 = r0.A01(r4)
            r10.A0i = r0
            boolean r0 = r0.A0F()
            r3 = 1
            r2 = 8
            r1 = 0
            if (r0 == 0) goto L_0x0158
            X.1MZ r0 = r10.A0f
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            boolean r0 = r0.A0J(r4)
            if (r0 != 0) goto L_0x011e
            android.view.View r0 = r10.A1P
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A1S
            r0.setVisibility(r1)
            android.widget.TextView r5 = r10.A1S
            X.1E7 r0 = r10.A0i
            boolean r4 = r0.A0j
            r0 = 2131887926(0x7f120736, float:1.9410473E38)
            if (r4 == 0) goto L_0x005e
            r0 = 2131887924(0x7f120734, float:1.9410469E38)
        L_0x005e:
            r5.setText(r0)
        L_0x0061:
            X.00H r0 = r10.A1E
            java.lang.Object r0 = r0.get()
            X.1ef r0 = (X.C30881ef) r0
            int r0 = r0.A00
            r5 = 3
            if (r0 == r5) goto L_0x0085
            X.1E7 r0 = r10.A0i
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0085
            X.1E7 r0 = r10.A0i
            com.whatsapp.jid.Jid r4 = X.AnonymousClass1E7.A01(r0)
            X.1BI r4 = (X.AnonymousClass1BI) r4
            if (r4 == 0) goto L_0x0085
            X.1Rj r0 = r10.A0w
            r0.A0B(r4)
        L_0x0085:
            java.util.List r0 = r10.A1L
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0091
            boolean r0 = r10.A1N
            if (r0 == 0) goto L_0x00a7
        L_0x0091:
            java.util.HashSet r4 = r10.A1b
            X.206 r0 = r10.A0x
            X.205 r0 = r0.A0v
            r4.add(r0)
            java.util.HashSet r4 = r10.A1a
            X.1E7 r0 = r10.A0i
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0g(r0)
            r4.add(r0)
            r10.A1N = r1
        L_0x00a7:
            A0r(r10)
            r4 = 2131897860(0x7f122e04, float:1.9430621E38)
            X.206 r0 = r10.A0x
            int r0 = r0.A0u
            if (r0 != r5) goto L_0x00b6
            r4 = 2131898480(0x7f123070, float:1.9431879E38)
        L_0x00b6:
            android.widget.Button r0 = r10.A1Q
            r0.setText(r4)
            X.1xh r5 = r10.A1T
            X.1E7 r4 = r10.A0i
            r0 = -1
            r5.A08(r4, r0)
            X.1E7 r0 = r10.A0i
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x00ff
            X.206 r0 = r10.A0x
            X.1BI r5 = r0.A0H()
            if (r5 == 0) goto L_0x0118
            X.C17960vV.A07(r5)
            android.widget.TextView r4 = r10.A08
            X.1Me r2 = r10.A0O
            X.1M9 r0 = r10.A0L
            java.lang.String r0 = X.AnonymousClass3MY.A0p(r0, r2, r5)
            r4.setText(r0)
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r1)
        L_0x00e8:
            android.widget.TextView r5 = r10.A1R
            r4 = 2131891944(0x7f1216e8, float:1.9418622E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            int r0 = r11 + 1
            X.C17880vN.A1T(r2, r0, r1)
            java.util.List r0 = r10.A1L
            X.C108985cd.A1S(r0, r2, r3)
            X.AnonymousClass3MY.A0y(r10, r5, r2, r4)
            return
        L_0x00ff:
            X.1xn r4 = r10.A0A
            X.1E7 r0 = r10.A0i
            java.lang.String r4 = r4.A02(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0118
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A08
            r0.setText(r4)
            goto L_0x00e8
        L_0x0118:
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r2)
            goto L_0x00e8
        L_0x011e:
            X.1MZ r0 = r10.A0f
            boolean r0 = r0.A0J(r4)
            if (r0 == 0) goto L_0x0158
            X.1E7 r0 = r10.A0i
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0158
            X.1MZ r0 = r10.A0f
            boolean r0 = r0.A0K(r4)
            if (r0 != 0) goto L_0x0158
            android.view.View r0 = r10.A1P
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A1S
            r0.setVisibility(r1)
            android.widget.TextView r6 = r10.A1S
            r5 = 2131890889(0x7f1212c9, float:1.9416483E38)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = "000000"
            java.lang.String r0 = X.C17880vN.A0q(r10, r0, r4, r1, r5)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
            goto L_0x0061
        L_0x0158:
            X.00H r0 = r10.A1I
            java.lang.Object r4 = r0.get()
            X.1xo r4 = (X.C42211xo) r4
            X.1E7 r0 = r10.A0i
            boolean r0 = r4.A02(r0)
            if (r0 != 0) goto L_0x01a4
            X.0ve r6 = r10.A0E
            X.1PM r5 = r10.A0N
            X.1E7 r0 = r10.A0i
            X.1BI r0 = r0.A0J
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r0)
            X.12L r0 = r10.A0l
            boolean r0 = X.C87454Vq.A01(r5, r6, r0, r4)
            if (r0 != 0) goto L_0x01a4
            X.0ve r6 = r10.A0E
            X.12L r7 = r10.A0l
            X.1Ok r5 = r10.A0P
            X.00H r0 = r10.A1J
            java.lang.Object r9 = r0.get()
            X.7Mz r9 = (X.C145887Mz) r9
            X.1PM r4 = r10.A0N
            X.1E7 r0 = r10.A0i
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass3MZ.A0w(r0)
            boolean r0 = X.C88424Zq.A00(r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x01a4
            android.view.View r0 = r10.A1P
            r0.setVisibility(r1)
        L_0x019d:
            android.widget.TextView r0 = r10.A1S
            r0.setVisibility(r2)
            goto L_0x0061
        L_0x01a4:
            android.view.View r0 = r10.A1P
            r0.setVisibility(r2)
            goto L_0x019d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A0s(com.whatsapp.notification.PopupNotification, int):void");
    }

    public static void A0t(PopupNotification popupNotification, C441322g r10, StickerView stickerView) {
        C1418377d A012 = ((AnonymousClass70H) popupNotification.A1H.get()).A01(r10);
        StickerView stickerView2 = stickerView;
        if (A012.A0B == null) {
            stickerView.setImageResource(2131233044);
        }
        int dimensionPixelSize = AnonymousClass000.A0Y(stickerView).getDimensionPixelSize(2131168277);
        popupNotification.A10.A06(new C59842my(stickerView2, A012, (AnonymousClass889) null, dimensionPixelSize, dimensionPixelSize, 1, 0, false, false, false));
    }

    public static boolean A0u(PopupNotification popupNotification) {
        if (AnonymousClass3Ma.A12(popupNotification.A0V).length() > 0 || popupNotification.A15.A0J != null) {
            return true;
        }
        return false;
    }

    public void A2y() {
        if (!this.A1U) {
            this.A1U = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r3 = A0A2.A00;
            C109005cf.A0d(A0A2, r3, this);
            C63932tv.A08(this, C000200d.A00(r3.A5A));
            this.A0b = AnonymousClass3MZ.A0l(A0A2);
            this.A0a = AnonymousClass10E.A6O(A0A2);
            this.A0G = (C40751vD) A0A2.AB7.get();
            this.A12 = C108975cc.A0P(r3);
            this.A0q = (C32091gc) A0A2.A6G.get();
            this.A0n = AnonymousClass3MY.A0Z(A0A2);
            this.A0d = AnonymousClass3Ma.A0d(A0A2);
            this.A0H = AnonymousClass3MZ.A0U(A0A2);
            this.A0l = (AnonymousClass12L) A0A2.A90.get();
            this.A0j = C108985cd.A0T(A0A2);
            this.A09 = AnonymousClass3MZ.A0N(A0A2);
            this.A0R = AnonymousClass3MZ.A0i(A0A2);
            this.A0t = (AnonymousClass1R2) A0A2.A8L.get();
            this.A0K = AnonymousClass3MZ.A0e(A0A2);
            this.A0L = AnonymousClass10E.A4z(A0A2);
            this.A0A = (C42201xn) r3.A12.get();
            this.A1G = C000200d.A00(r3.AGC);
            this.A1H = C000200d.A00(A0A2.AAN);
            this.A0c = AnonymousClass10E.A6Q(A0A2);
            this.A0O = AnonymousClass3MZ.A0g(A0A2);
            this.A1E = C000200d.A00(A0A2.A71);
            this.A0w = (C26241Rj) A0A2.A8b.get();
            this.A11 = (C27231Vg) A0A2.A0N.get();
            this.A17 = C000200d.A00(A0A2.A0x);
            this.A0T = (AnonymousClass4VN) A0A2.AIy.get();
            this.A1I = C000200d.A00(A0A2.AAd);
            this.A0g = (AnonymousClass1R3) A0A2.A5f.get();
            this.A0P = (C25491Ok) A0A2.A1F.get();
            this.A0z = AnonymousClass3MZ.A11(A0A2);
            this.A13 = C108955ca.A0b(A0A2);
            this.A0I = AnonymousClass3MZ.A0V(A0K2);
            this.A0v = (C62332rE) A0A2.A70.get();
            this.A1D = C000200d.A00(A0K2.A4j);
            this.A0m = (AnonymousClass1MB) A0A2.AAb.get();
            this.A18 = C000200d.A00(A0A2.A2A);
            this.A19 = C000200d.A00(A0A2.A2F);
            this.A0C = (C1404271j) r3.AHQ.get();
            this.A1A = C108965cb.A0i(r3);
            this.A0r = (C32291gx) A0A2.A6X.get();
            this.A1J = C000200d.A00(A0A2.AAx);
            this.A0N = AnonymousClass3MZ.A0f(A0A2);
            this.A0W = (C25161Nd) A0A2.A2v.get();
            this.A0p = (C27131Uv) A0A2.A5p.get();
            this.A10 = C108965cb.A0a(A0A2);
            this.A0U = (C32791hl) A0A2.A2t.get();
            this.A0y = (AnonymousClass1LD) A0A2.A9j.get();
            this.A0f = AnonymousClass3MY.A0V(A0A2);
            this.A0u = AnonymousClass3Ma.A0r(A0A2);
            this.A0D = (AnonymousClass1DM) A0A2.AA2.get();
            this.A0E = (C32191gn) A0A2.AAo.get();
            this.A0S = AnonymousClass3MZ.A0j(A0A2);
            this.A0X = (C134196qC) r3.A38.get();
            this.A0Y = (C31131f4) A0A2.A6M.get();
            this.A0e = AnonymousClass3MZ.A0m(A0A2);
            this.A1C = C000200d.A00(A0A2.A4u);
            this.A1B = C108965cb.A0j(r3);
            this.A16 = AnonymousClass1K1.A24(A0K2);
            this.A0F = AnonymousClass3MZ.A0T(r3);
            this.A0B = (AnonymousClass4JZ) A0K2.A2k.get();
            this.A0h = AnonymousClass3MZ.A0o(A0A2);
            this.A0M = AnonymousClass3Ma.A0S(A0A2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (A0u(r9) != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A48() {
        /*
            r9 = this;
            java.lang.String r0 = "popupnotification/initpopup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            r9.A1N = r3
            r0 = 0
            r9.A1K = r0
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A0s
            int r0 = r0.getCurrentItem()
            r2 = 1
            if (r0 != 0) goto L_0x001b
            boolean r0 = A0u(r9)
            r8 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r9.A1O = r3
            X.1Nd r0 = r9.A0W
            java.util.ArrayList r0 = r0.A06()
            java.util.Iterator r7 = r0.iterator()
        L_0x002c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0088
            X.1BI r6 = X.C17880vN.A0Q(r7)
            X.1CJ r0 = r9.A0d
            int r5 = r0.A03(r6)
            if (r5 <= 0) goto L_0x002c
            X.1Nb r0 = r9.A0z
            X.1yM r1 = r0.A0a(r6)
            X.1BI r0 = r9.A0o
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x005f
        L_0x004e:
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = r1.A06()
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 != 0) goto L_0x005f
            goto L_0x002c
        L_0x005f:
            X.1R3 r0 = r9.A0g
            java.util.ArrayList r0 = r0.A07(r6, r5)
            java.util.Iterator r6 = r0.iterator()
        L_0x0069:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0081
            X.206 r5 = X.C17880vN.A0Y(r6)
            java.util.HashSet r1 = r9.A1i
            X.205 r0 = r5.A0v
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0069
            r4.add(r5)
            goto L_0x0069
        L_0x0081:
            int r0 = r9.A1O
            int r0 = r0 + 1
            r9.A1O = r0
            goto L_0x002c
        L_0x0088:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "popupnotification/count:"
            r1.append(r0)
            int r0 = r4.size()
            X.C17900vP.A0o(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00a2
            r9.finish()
        L_0x00a1:
            return
        L_0x00a2:
            int r0 = r4.size()
            if (r0 != r2) goto L_0x01a4
            A0W(r9)
        L_0x00ab:
            r0 = 30
            X.C147027Rn.A01(r0, r4)
            r9.A1L = r4
            X.291 r0 = r9.A0J
            r0.A04()
            com.whatsapp.notification.PopupNotificationViewPager r1 = r9.A0s
            X.291 r0 = r9.A0J
            r1.setAdapter(r0)
            X.206 r0 = r9.A0x
            if (r0 == 0) goto L_0x019a
            if (r8 == 0) goto L_0x0169
            boolean r0 = r9.A1M
            if (r0 == 0) goto L_0x019a
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A0s
            r0.A0O(r2, r3, r2)
            A0s(r9, r2)
            java.util.List r0 = r9.A1L
            int r0 = r0.size()
            if (r2 < r0) goto L_0x0166
            java.util.List r0 = r9.A1L
            int r0 = r0.size()
            int r0 = -r0
        L_0x00df:
            com.whatsapp.notification.PopupNotificationViewPager r4 = r9.A0s
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r4.A01 = r1
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x00f7
            if (r1 == 0) goto L_0x00f7
            int r0 = r1.intValue()
            r4.A0J(r0, r2)
            r0 = 0
            r4.A01 = r0
        L_0x00f7:
            r0 = 2130772029(0x7f01003d, float:1.7147165E38)
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r9, r0)
            r4 = 2
            r0 = 2
            if (r8 == 0) goto L_0x0103
            r0 = 1
        L_0x0103:
            int r0 = r0 * 200
            long r0 = (long) r0
            r5.setDuration(r0)
            r5.setFillAfter(r2)
            android.widget.TextView r0 = r9.A1R
            r0.startAnimation(r5)
            java.util.List r0 = r9.A1L
            X.206 r0 = X.AnonymousClass3MW.A0k(r0, r3)
            X.1Nb r1 = r9.A0z
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            X.C17960vV.A07(r0)
            X.1yM r0 = r1.A0a(r0)
            java.lang.String r0 = r0.A06()
            int r1 = java.lang.Integer.parseInt(r0)
            if (r1 == r4) goto L_0x0131
            r0 = 3
            if (r1 != r0) goto L_0x00a1
        L_0x0131:
            android.view.Window r1 = r9.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            java.lang.String r0 = "popupnotification/wakeupifneeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r9.A00 = r0
            android.os.Handler r4 = r9.A1W
            java.lang.Runnable r2 = r9.A1Z
            r4.removeCallbacks(r2)
            r0 = 600(0x258, double:2.964E-321)
            r4.postDelayed(r2, r0)
            android.hardware.SensorEventListener r0 = r9.A02
            if (r0 != 0) goto L_0x00a1
            android.hardware.Sensor r2 = r9.A01
            if (r2 == 0) goto L_0x00a1
            r0 = 9
            X.CyG r1 = new X.CyG
            r1.<init>(r9, r0)
            r9.A02 = r1
            android.hardware.SensorManager r0 = r9.A03
            r0.registerListener(r1, r2, r3)
            return
        L_0x0166:
            r0 = 0
            goto L_0x00df
        L_0x0169:
            java.util.List r0 = r9.A1L
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L_0x0170:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0187
            X.205 r1 = X.AnonymousClass3MZ.A10(r5)
            X.206 r0 = r9.A0x
            X.205 r0 = r0.A0v
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0187
            int r4 = r4 + 1
            goto L_0x0170
        L_0x0187:
            java.util.List r0 = r9.A1L
            int r0 = r0.size()
            if (r4 != r0) goto L_0x0190
            r4 = 0
        L_0x0190:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A0s
            r0.A0J(r4, r3)
            A0s(r9, r4)
            goto L_0x00f7
        L_0x019a:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A0s
            r0.A0J(r3, r3)
            A0s(r9, r3)
            goto L_0x00f7
        L_0x01a4:
            r0 = 2131432931(0x7f0b15e3, float:1.8487633E38)
            X.AnonymousClass3MX.A1H(r9, r0, r3)
            r0 = 2131432929(0x7f0b15e1, float:1.848763E38)
            X.AnonymousClass3MX.A1H(r9, r0, r3)
            android.view.View r0 = r9.A06
            r0.setVisibility(r3)
            android.view.View r0 = r9.A07
            r0.setVisibility(r3)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A48():void");
    }

    public void BhQ(int i) {
        this.A05.A08(i, 0);
    }

    public void BhR(String str) {
        this.A05.A0G(str, 0);
    }

    public void BhU(Object[] objArr, int i, int i2) {
        this.A05.A0G(getString(i2, objArr), 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C145777Mo r0 = this.A0Y.A00;
        if ((r0 == null || !r0.A0O) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public Dialog onCreateDialog(int i) {
        if (i == 106) {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0S(C108975cc.A0b(this, this.A0O.A0I(this.A0i), AnonymousClass3MW.A1a(), 2131887927));
            AnonymousClass758.A01(A002, this, 7, 2131897273);
            AnonymousClass758.A00(A002, this, 8, 2131898766);
            return A002.create();
        } else if (i != 115) {
            return super.onCreateDialog(i);
        } else {
            Log.i("popupnotification/dialog-software-about-to-expire");
            return this.A0C.A01(this, this.A0G);
        }
    }

    public void onNewIntent(Intent intent) {
        Log.i("popupnotification/new-intent");
        super.onNewIntent(intent);
        setIntent(intent);
        AnonymousClass1BI A0l2 = AnonymousClass3MX.A0l(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid"));
        C17900vP.A0Y(A0l2, "popupnotification/set-quick-reply-jid:", AnonymousClass000.A10());
        this.A0o = A0l2;
        if (intent.getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A0r.A0E(false);
            C62332rE.A00(this.A0v, true);
        }
        A48();
    }

    public PopupNotification(int i) {
        this.A1U = false;
        C1423279a.A00(this, 21);
    }

    private void A0Q(ThumbnailButton thumbnailButton) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168275);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setAdjustViewBounds(true);
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        AnonymousClass3MY.A14(getResources(), thumbnailButton, 2131167018);
        thumbnailButton.A01 = getResources().getDimension(2131169019);
        if (thumbnailButton instanceof C77523qH) {
            C77523qH r4 = (C77523qH) thumbnailButton;
            r4.A00 = ((float) dimensionPixelSize) / 7.0f;
            r4.A03 = 5;
        }
    }

    public static void A0W(PopupNotification popupNotification) {
        popupNotification.findViewById(2131432931).setVisibility(8);
        AnonymousClass3MX.A1H(popupNotification, 2131432929, 8);
        popupNotification.A06.setVisibility(8);
        popupNotification.A07.setVisibility(8);
    }

    public static void A0d(PopupNotification popupNotification) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("popupnotification/clearnotifications:");
        HashSet hashSet = popupNotification.A1a;
        C17900vP.A0o(A102, hashSet.size());
        C62332rE.A00(popupNotification.A0v, true);
        popupNotification.A0o = null;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q2 = C17880vN.A0Q(it);
            ArrayList A132 = AnonymousClass000.A13();
            int A032 = popupNotification.A0d.A03(A0Q2);
            HashSet hashSet2 = popupNotification.A1b;
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                AnonymousClass205 r1 = (AnonymousClass205) it2.next();
                AnonymousClass1BI r0 = r1.A00;
                if (r0 != null && r0.equals(A0Q2)) {
                    A132.add(r1);
                }
            }
            StringBuilder A103 = AnonymousClass000.A10();
            C17890vO.A14("popupnotification/msg:", A103, A132);
            C17900vP.A0j("/", A103, A032);
            if (A132.size() == A032) {
                popupNotification.A0U.A00(A0Q2, 2, 3, true, true, C108975cc.A1D(hashSet.size(), 1));
                hashSet2.removeAll(A132);
            }
        }
        ((AnonymousClass16Q) popupNotification.A1F.get()).A00 = null;
        popupNotification.A0r.A08();
    }

    public void onBackPressed() {
        A0d(this);
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        C26631Sw r0 = this.A10;
        if (r0 != null) {
            r0.A04();
        }
        C37451pZ r02 = this.A0Q;
        if (r02 != null) {
            r02.A02();
            this.A0Q = null;
        }
        AnonymousClass74M r03 = this.A15;
        if (r03 != null) {
            r03.A0M();
        }
        this.A0o = null;
        this.A1V.removeCallbacks(this.A1Y);
        this.A1W.removeCallbacks(this.A1Z);
        PowerManager.WakeLock wakeLock = this.A04;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.A04.release();
        }
        SensorEventListener sensorEventListener = this.A02;
        if (sensorEventListener != null) {
            this.A03.unregisterListener(sensorEventListener);
        }
        this.A0Y.A06();
        C17880vN.A0V(this.A18).unregisterObserver(this.A1e);
        this.A0h.unregisterObserver(this.A1f);
        this.A0M.unregisterObserver(this.A1d);
        C17880vN.A0V(this.A19).unregisterObserver(this.A1c);
        C17880vN.A0V(this.A1C).unregisterObserver(this.A1g);
        ((AnonymousClass16Q) this.A1F.get()).A00 = null;
    }

    public void onPause() {
        super.onPause();
        this.A15.A0Z(false, false);
        this.A0v.A02();
    }

    public void onStart() {
        super.onStart();
        this.A1M = true;
    }

    public void onStop() {
        super.onStop();
        this.A1M = false;
        this.A15.A0Z(false, false);
    }

    public void A3t(C72033Kj r1, int i, int i2, int i3) {
        C108965cb.A18(this, i, i2);
    }

    public void A3v(C72033Kj r1, int i, int i2, int i3, int i4) {
        C108965cb.A18(this, i, i2);
    }

    public void BhT(C72033Kj r1, Object[] objArr, int i, int i2, int i3) {
        BhU(objArr, i, i2);
    }

    public PopupNotification() {
        this(0);
        this.A1L = AnonymousClass000.A13();
        this.A1b = C17880vN.A12();
        this.A1i = C17880vN.A12();
        this.A1a = C17880vN.A12();
        this.A1F = new C217617h(32823);
        this.A1h = new C126176cJ(this);
        this.A1f = new AnonymousClass7FH(this, 3);
        this.A1d = new AnonymousClass7E0(this, 8);
        this.A1c = new C116315wx(this, 0);
        this.A1e = new AnonymousClass7FF(this, 3);
        this.A1g = new AnonymousClass7ID(this, 3);
        this.A1X = new C142987Bo(this, 5);
        this.A00 = 5.0f;
        this.A1V = C17890vO.A0D();
        this.A1Y = new C21425Ajs(this, 13);
        this.A1W = C17890vO.A0D();
        this.A1Z = new C21425Ajs(this, 15);
    }
}
