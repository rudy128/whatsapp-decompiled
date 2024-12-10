package com.whatsapp.events;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1G1;
import X.AnonymousClass1G3;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3VY;
import X.AnonymousClass4K8;
import X.AnonymousClass4a6;
import X.AnonymousClass5NW;
import X.AnonymousClass5PU;
import X.AnonymousClass689;
import X.AnonymousClass8Dv;
import X.C132346md;
import X.C17880vN;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C218617r;
import X.C219217x;
import X.C27071Up;
import X.C28931bI;
import X.C29691ci;
import X.C30391dr;
import X.C32021gV;
import X.C32981i4;
import X.C73203Rj;
import X.C86784Tb;
import X.C88124Yk;
import X.C88324Zf;
import X.C88774al;
import X.C88784am;
import X.C89934dG;
import X.C91074f6;
import X.C91474fk;
import X.C99064sD;
import X.C99154sM;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.fab.WDSFab;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.io.File;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class EventCreateOrEditFragment extends Hilt_EventCreateOrEditFragment {
    public static final long A0y = TimeUnit.DAYS.toMillis(1825);
    public static final long A0z = TimeUnit.HOURS.toMillis(2);
    public View A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public AnonymousClass4K8 A03;
    public C218617r A04;
    public AnonymousClass1KB A05;
    public WaEditText A06;
    public WaEditText A07;
    public WaEditText A08;
    public WaEditText A09;
    public WaEditText A0A;
    public WaEditText A0B;
    public WaEditText A0C;
    public WaTextView A0D;
    public AnonymousClass11C A0E;
    public AnonymousClass11P A0F;
    public C219217x A0G;
    public C18000vb A0H;
    public AnonymousClass1CJ A0I;
    public C32981i4 A0J;
    public AnonymousClass1L2 A0K;
    public AnonymousClass1KW A0L;
    public AnonymousClass3VY A0M;
    public C18030ve A0N;
    public AnonymousClass689 A0O;
    public C18010vc A0P;
    public C27071Up A0Q;
    public AnonymousClass1L4 A0R;
    public C32021gV A0S;
    public C28931bI A0T;
    public C28931bI A0U;
    public C28931bI A0V;
    public C28931bI A0W;
    public C28931bI A0X;
    public C28931bI A0Y;
    public C28931bI A0Z;
    public C28931bI A0a;
    public WDSFab A0b;
    public WDSSwitch A0c;
    public WDSSwitch A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public C18600wl A0i;
    public C18600wl A0j;
    public WaImageView A0k;
    public C28931bI A0l;
    public boolean A0m;
    public final DatePickerDialog.OnDateSetListener A0n;
    public final TimePickerDialog.OnTimeSetListener A0o;
    public final AnonymousClass02n A0p;
    public final AnonymousClass02n A0q;
    public final C18100vl A0r;
    public final C18100vl A0s = AnonymousClass1DF.A01(new C99064sD(15));
    public final C18100vl A0t = AnonymousClass1DF.A01(new C99064sD(14));
    public final C18100vl A0u;
    public final C18100vl A0v;
    public final DatePickerDialog.OnDateSetListener A0w;
    public final TimePickerDialog.OnTimeSetListener A0x;

    public void A1Q(Bundle bundle) {
        this.A0X = true;
        if (bundle != null) {
            long j = bundle.getLong("STATE_EVENT_START_TIME");
            if (Long.valueOf(j) != null) {
                ((Calendar) AnonymousClass3MX.A14(this.A0t)).setTimeInMillis(j);
                A06(this);
                A07(this);
            }
            if (bundle.containsKey("STATE_EVENT_END_TIME")) {
                A09(this, Long.valueOf(bundle.getLong("STATE_EVENT_END_TIME")));
            }
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625242, false);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putLong("STATE_EVENT_START_TIME", ((Calendar) AnonymousClass3MX.A14(this.A0t)).getTimeInMillis());
        Long A002 = A00(this);
        if (A002 != null) {
            bundle.putLong("STATE_EVENT_END_TIME", A002.longValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r22, android.view.View r23) {
        /*
            r21 = this;
            r0 = 0
            r6 = r23
            X.C18070vi.A0d(r6, r0)
            r0 = 2131430632(0x7f0b0ce8, float:1.848297E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r1 = r21
            r1.A0A = r0
            r0 = 2131430633(0x7f0b0ce9, float:1.8482972E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r1.A0B = r0
            r0 = 2131430558(0x7f0b0c9e, float:1.848282E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = (com.whatsapp.wds.components.toggle.WDSSwitch) r0
            r1.A0d = r0
            r0 = 2131430556(0x7f0b0c9c, float:1.8482816E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r6, r0)
            r1.A0k = r0
            r0 = 2131430608(0x7f0b0cd0, float:1.8482922E38)
            android.widget.LinearLayout r0 = X.AnonymousClass3MX.A0K(r6, r0)
            r1.A02 = r0
            r0 = 2131430609(0x7f0b0cd1, float:1.8482924E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r6, r0)
            r1.A0D = r0
            r0 = 2131430604(0x7f0b0ccc, float:1.8482914E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0Y = r0
            r0 = 2131430607(0x7f0b0ccf, float:1.848292E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0Z = r0
            r0 = 2131430578(0x7f0b0cb2, float:1.848286E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0W = r0
            r0 = 2131430635(0x7f0b0ceb, float:1.8482977E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0a = r0
            r0 = 2131430634(0x7f0b0cea, float:1.8482975E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r1.A0C = r0
            r0 = 2131430570(0x7f0b0caa, float:1.8482845E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r1.A06 = r0
            r0 = 2131430605(0x7f0b0ccd, float:1.8482916E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r1.A09 = r0
            r0 = 2131430606(0x7f0b0cce, float:1.8482918E38)
            android.widget.LinearLayout r0 = X.AnonymousClass3MX.A0K(r6, r0)
            r1.A01 = r0
            r0 = 2131430565(0x7f0b0ca5, float:1.8482835E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.wds.components.fab.WDSFab r0 = (com.whatsapp.wds.components.fab.WDSFab) r0
            r1.A0b = r0
            r0 = 2131430575(0x7f0b0caf, float:1.8482855E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0V = r0
            r0 = 2131430550(0x7f0b0c96, float:1.8482804E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0l = r0
            r0 = 2131430619(0x7f0b0cdb, float:1.8482944E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0X = r0
            r0 = 2131430560(0x7f0b0ca0, float:1.8482824E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0T = r0
            r0 = 2131429697(0x7f0b0941, float:1.8481074E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r1.A0U = r0
            r0 = 2131427592(0x7f0b0108, float:1.8476805E38)
            r7 = 2131427592(0x7f0b0108, float:1.8476805E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            r1.A00 = r0
            X.4K8 r9 = r1.A03
            if (r9 == 0) goto L_0x0378
            X.0vl r0 = r1.A0r
            java.lang.Object r10 = r0.getValue()
            X.0vl r0 = r1.A0v
            long r13 = X.C72453Mb.A0K(r0)
            X.0vl r3 = r1.A0u
            java.lang.Object r11 = r3.getValue()
            r2 = 1
            X.C18070vi.A0d(r10, r2)
            r0 = 0
            X.4g7 r8 = new X.4g7
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            X.1It r5 = new X.1It
            r5.<init>(r8, r1)
            java.lang.Class<X.3VY> r4 = X.AnonymousClass3VY.class
            X.1J2 r4 = r5.A00(r4)
            X.3VY r4 = (X.AnonymousClass3VY) r4
            r1.A0M = r4
            X.1pm r5 = X.AnonymousClass3MZ.A0G(r1)
            r11 = 0
            com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$1 r4 = new com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$1
            r4.<init>(r1, r11)
            X.1OR r9 = X.AnonymousClass1OR.A00
            java.lang.Integer r8 = X.AnonymousClass3MW.A0w(r9, r4, r5)
            X.1pm r5 = X.AnonymousClass3MZ.A0G(r1)
            com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$2 r4 = new com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$2
            r4.<init>(r1, r11)
            X.C30451dy.A02(r8, r9, r4, r5)
            X.1pm r5 = X.AnonymousClass3MZ.A0G(r1)
            com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$3 r4 = new com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$3
            r10 = r22
            r4.<init>(r10, r1, r11)
            X.C30451dy.A02(r8, r9, r4, r5)
            X.1pm r5 = X.AnonymousClass3MZ.A0G(r1)
            com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$4 r4 = new com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$4
            r4.<init>(r1, r11)
            X.C30451dy.A02(r8, r9, r4, r5)
            X.1pm r5 = X.AnonymousClass3MZ.A0G(r1)
            com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$5 r4 = new com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$5
            r4.<init>(r1, r11)
            X.C30451dy.A02(r8, r9, r4, r5)
            X.1pm r5 = X.AnonymousClass3MZ.A0G(r1)
            com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$6 r4 = new com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$6
            r4.<init>(r1, r11)
            X.C30451dy.A02(r8, r9, r4, r5)
            android.view.View r5 = X.AnonymousClass1HF.A06(r6, r7)
            r4 = 35
            X.C89934dG.A00(r5, r1, r4)
            r4 = 2131430557(0x7f0b0c9d, float:1.8482818E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r6, r4)
            r4 = 36
            X.C89934dG.A00(r5, r1, r4)
            java.lang.Object r4 = r3.getValue()
            if (r4 != 0) goto L_0x0181
            com.whatsapp.WaEditText r4 = r1.A0C
            if (r4 == 0) goto L_0x0176
            r4.requestFocus()
        L_0x0176:
            X.1L4 r5 = r1.A0R
            if (r5 == 0) goto L_0x036f
            com.whatsapp.WaEditText r4 = r1.A0C
            if (r4 == 0) goto L_0x01ed
            r5.A02(r4)
        L_0x0181:
            com.whatsapp.WaEditText r5 = r1.A0C
            if (r5 == 0) goto L_0x0189
            r4 = 2
            X.C89554ce.A00(r5, r1, r4)
        L_0x0189:
            com.whatsapp.WaEditText r8 = r1.A0C
            if (r8 == 0) goto L_0x01a5
            android.text.InputFilter$LengthFilter[] r7 = new android.text.InputFilter.LengthFilter[r2]
            X.0ve r6 = r1.A0N
            if (r6 == 0) goto L_0x036b
            r5 = 6207(0x183f, float:8.698E-42)
            X.0vf r4 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r4, r6, r5)
            android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
            r4.<init>(r5)
            r7[r0] = r4
            r8.setFilters(r7)
        L_0x01a5:
            com.whatsapp.WaEditText r10 = r1.A06
            if (r10 == 0) goto L_0x01ed
            android.text.InputFilter$LengthFilter[] r8 = new android.text.InputFilter.LengthFilter[r2]
            X.0ve r4 = r1.A0N
            if (r4 == 0) goto L_0x0367
            r7 = 6208(0x1840, float:8.699E-42)
            X.0vf r6 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r6, r4, r7)
            android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
            r4.<init>(r5)
            r8[r0] = r4
            r10.setFilters(r8)
            X.0ve r5 = r1.A0N
            if (r5 == 0) goto L_0x0363
            X.1KW r15 = r1.A0L
            if (r15 == 0) goto L_0x0360
            X.11C r12 = r1.A0E
            if (r12 == 0) goto L_0x035d
            X.0vb r13 = r1.A0H
            if (r13 == 0) goto L_0x0359
            X.0vc r4 = r1.A0P
            if (r4 == 0) goto L_0x0372
            X.1L2 r14 = r1.A0K
            if (r14 == 0) goto L_0x0356
            int r18 = X.C18020vd.A00(r6, r5, r7)
            X.488 r9 = new X.488
            r19 = r0
            r20 = r2
            r16 = r5
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r10.addTextChangedListener(r9)
        L_0x01ed:
            A06(r1)
            A07(r1)
            X.0ve r6 = r1.A0N
            if (r6 == 0) goto L_0x0352
            r4 = 8380(0x20bc, float:1.1743E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r5, r6, r4)
            r6 = 8
            if (r4 != 0) goto L_0x032c
            android.widget.LinearLayout r4 = r1.A01
            if (r4 == 0) goto L_0x020a
            r4.setVisibility(r6)
        L_0x020a:
            com.whatsapp.WaEditText r7 = r1.A09
            if (r7 == 0) goto L_0x0224
            android.text.InputFilter$LengthFilter[] r6 = new android.text.InputFilter.LengthFilter[r2]
            X.0ve r4 = r1.A0N
            if (r4 == 0) goto L_0x034e
            r2 = 6208(0x1840, float:8.699E-42)
            int r4 = X.C18020vd.A00(r5, r4, r2)
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r2.<init>(r4)
            r6[r0] = r2
            r7.setFilters(r6)
        L_0x0224:
            com.whatsapp.WaEditText r4 = r1.A09
            if (r4 == 0) goto L_0x022c
            r2 = 3
            X.C89554ce.A00(r4, r1, r2)
        L_0x022c:
            X.1bI r6 = r1.A0Z
            if (r6 == 0) goto L_0x023a
            r4 = 46
            X.4dG r2 = new X.4dG
            r2.<init>(r1, r4)
            r6.A05(r2)
        L_0x023a:
            X.1bI r2 = r1.A0Z
            if (r2 == 0) goto L_0x024e
            android.view.View r4 = r2.A02()
            if (r4 == 0) goto L_0x024e
            r2 = 2131890129(0x7f120fd1, float:1.9414941E38)
            java.lang.String r2 = r1.A1H(r2)
            r4.setContentDescription(r2)
        L_0x024e:
            com.whatsapp.wds.components.toggle.WDSSwitch r4 = r1.A0d
            if (r4 == 0) goto L_0x0257
            r2 = 10
            X.C90874em.A00(r4, r1, r2)
        L_0x0257:
            X.1GP r7 = r1.A1E()
            X.1FL r6 = r1.A1D()
            r2 = 15
            X.4fa r4 = new X.4fa
            r4.<init>(r1, r2)
            java.lang.String r2 = "RESULT_KEY"
            r7.A0t(r4, r6, r2)
            com.whatsapp.wds.components.fab.WDSFab r7 = r1.A0b
            if (r7 == 0) goto L_0x027d
            X.0vb r6 = r1.A0H
            if (r6 == 0) goto L_0x034a
            android.content.Context r4 = r1.A14()
            r2 = 2131232506(0x7f0806fa, float:1.8081123E38)
            X.AnonymousClass3NL.A01(r4, r7, r6, r2)
        L_0x027d:
            com.whatsapp.wds.components.fab.WDSFab r4 = r1.A0b
            if (r4 == 0) goto L_0x0285
            r2 = 3
            X.C825148g.A00(r4, r1, r2)
        L_0x0285:
            java.lang.Object r2 = r3.getValue()
            if (r2 == 0) goto L_0x02a7
            X.1bI r2 = r1.A0V
            if (r2 == 0) goto L_0x02a7
            android.view.View r3 = r2.A02()
            if (r3 == 0) goto L_0x02a7
            X.1bI r2 = r1.A0V
            if (r2 == 0) goto L_0x029c
            r2.A04(r0)
        L_0x029c:
            r2 = 2131430563(0x7f0b0ca3, float:1.848283E38)
            android.view.View r3 = X.C18070vi.A05(r3, r2)
            r2 = 4
            X.C825148g.A00(r3, r1, r2)
        L_0x02a7:
            X.00H r2 = r1.A0g
            if (r2 == 0) goto L_0x0344
            java.lang.Object r2 = r2.get()
            X.4Yk r2 = (X.C88124Yk) r2
            X.4S4 r2 = r2.A02
            X.0ve r3 = r2.A00
            r2 = 8508(0x213c, float:1.1922E-41)
            boolean r2 = X.C18020vd.A05(r5, r3, r2)
            if (r2 == 0) goto L_0x02fe
            X.1bI r2 = r1.A0a
            if (r2 == 0) goto L_0x02c4
            r2.A04(r0)
        L_0x02c4:
            X.1bI r2 = r1.A0a
            if (r2 == 0) goto L_0x02d9
            android.view.View r4 = r2.A02()
            android.widget.ViewAnimator r4 = (android.widget.ViewAnimator) r4
            if (r4 == 0) goto L_0x02d9
            android.content.Context r3 = r1.A1n()
            r2 = 17432576(0x10a0000, float:2.5346597E-38)
            r4.setInAnimation(r3, r2)
        L_0x02d9:
            X.1bI r2 = r1.A0a
            if (r2 == 0) goto L_0x02ef
            android.view.View r4 = r2.A02()
            android.widget.ViewAnimator r4 = (android.widget.ViewAnimator) r4
            if (r4 == 0) goto L_0x02ef
            android.content.Context r3 = r1.A1n()
            r2 = 17432577(0x10a0001, float:2.53466E-38)
            r4.setOutAnimation(r3, r2)
        L_0x02ef:
            X.1bI r2 = r1.A0a
            if (r2 == 0) goto L_0x02fe
            android.view.View r3 = r2.A02()
            if (r3 == 0) goto L_0x02fe
            r2 = 43
            X.C89934dG.A00(r3, r1, r2)
        L_0x02fe:
            A04(r1)
            X.00H r2 = r1.A0g
            if (r2 == 0) goto L_0x033e
            java.lang.Object r2 = r2.get()
            X.4Yk r2 = (X.C88124Yk) r2
            X.0ve r3 = r2.A03
            r2 = 9180(0x23dc, float:1.2864E-41)
            boolean r2 = X.C18020vd.A05(r5, r3, r2)
            if (r2 == 0) goto L_0x032b
            X.1bI r2 = r1.A0X
            if (r2 == 0) goto L_0x031c
            r2.A04(r0)
        L_0x031c:
            X.1bI r0 = r1.A0X
            if (r0 == 0) goto L_0x032b
            android.view.View r2 = r0.A02()
            if (r2 == 0) goto L_0x032b
            r0 = 38
            X.C89934dG.A00(r2, r1, r0)
        L_0x032b:
            return
        L_0x032c:
            com.whatsapp.WaEditText r2 = r1.A09
            if (r2 == 0) goto L_0x0333
            r2.setVisibility(r6)
        L_0x0333:
            android.widget.LinearLayout r4 = r1.A02
            if (r4 == 0) goto L_0x022c
            r2 = 45
            X.C89934dG.A00(r4, r1, r2)
            goto L_0x022c
        L_0x033e:
            java.lang.String r0 = "eventUtils"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0344:
            java.lang.String r0 = "eventUtils"
            X.C18070vi.A11(r0)
            throw r11
        L_0x034a:
            X.AnonymousClass3MW.A1M()
            throw r11
        L_0x034e:
            X.AnonymousClass3MW.A1A()
            throw r11
        L_0x0352:
            X.AnonymousClass3MW.A1A()
            throw r11
        L_0x0356:
            java.lang.String r0 = "emojiRichFormatterStaticCaller"
            goto L_0x0374
        L_0x0359:
            X.AnonymousClass3MW.A1M()
            throw r11
        L_0x035d:
            java.lang.String r0 = "systemServices"
            goto L_0x0374
        L_0x0360:
            java.lang.String r0 = "emojiLoader"
            goto L_0x0374
        L_0x0363:
            X.AnonymousClass3MW.A1A()
            throw r11
        L_0x0367:
            X.AnonymousClass3MW.A1A()
            throw r11
        L_0x036b:
            X.AnonymousClass3MW.A1A()
            throw r11
        L_0x036f:
            java.lang.String r0 = "imeUtils"
            goto L_0x0374
        L_0x0372:
            java.lang.String r0 = "sharedPreferencesFactory"
        L_0x0374:
            X.C18070vi.A11(r0)
            throw r11
        L_0x0378:
            java.lang.String r0 = "eventCreateOrEditViewModelFactory"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreateOrEditFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public static final Long A00(EventCreateOrEditFragment eventCreateOrEditFragment) {
        C28931bI r0 = eventCreateOrEditFragment.A0W;
        if (r0 == null || r0.A01() != 0) {
            return null;
        }
        return Long.valueOf(((Calendar) AnonymousClass3MX.A14(eventCreateOrEditFragment.A0s)).getTimeInMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0104, code lost:
        if (r1 != 3) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(long r21) {
        /*
            r20 = this;
            r2 = r20
            X.0vl r6 = r2.A0s
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r0 = (java.util.Calendar) r0
            r3 = r21
            r0.setTimeInMillis(r3)
            X.1bI r0 = r2.A0W
            r12 = 0
            if (r0 == 0) goto L_0x014b
            android.view.View r1 = r0.A02()
            if (r1 == 0) goto L_0x014b
            r0 = 2131430576(0x7f0b0cb0, float:1.8482857E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
        L_0x0023:
            r2.A07 = r0
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            X.C18070vi.A0X(r8)
            android.content.Context r11 = r2.A14()
            android.app.DatePickerDialog$OnDateSetListener r10 = r2.A0n
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 1
            int r14 = r1.get(r0)
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r0 = (java.util.Calendar) r0
            r5 = 2
            int r15 = r0.get(r5)
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 5
            int r16 = r1.get(r0)
            r13 = 0
            X.8Dv r9 = new X.8Dv
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            android.widget.DatePicker r7 = r9.A01
            X.0vl r0 = r2.A0t
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            java.util.Calendar r0 = (java.util.Calendar) r0
            long r0 = r0.getTimeInMillis()
            r7.setMinDate(r0)
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x0142
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0075:
            X.1CJ r4 = r2.A0I
            if (r4 == 0) goto L_0x0162
            X.0vl r3 = r2.A0r
            X.1BI r3 = X.AnonymousClass3MX.A0m(r3)
            X.1ci r4 = r4.A0A(r3)
            if (r4 == 0) goto L_0x009b
            X.1cl r3 = r4.A0e
            int r3 = r3.expiration
            if (r3 <= 0) goto L_0x009b
            long r0 = r8.getTimeInMillis()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            X.1cl r3 = r4.A0e
            int r3 = r3.expiration
            long r3 = (long) r3
            long r3 = r8.toMillis(r3)
            long r0 = r0 + r3
        L_0x009b:
            r7.setMaxDate(r0)
            com.whatsapp.WaEditText r3 = r2.A07
            if (r3 == 0) goto L_0x00ca
            r3.setFocusable(r13)
            r0 = 37
            X.C89934dG.A00(r3, r9, r0)
            r3.setKeyListener(r12)
            X.0vb r0 = r2.A0H
            if (r0 == 0) goto L_0x015e
            java.util.Locale r0 = r0.A0N()
            java.text.DateFormat r1 = java.text.DateFormat.getDateInstance(r5, r0)
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = r1.format(r0)
            r3.setText(r0)
        L_0x00ca:
            android.content.Context r15 = r2.A14()
            android.app.TimePickerDialog$OnTimeSetListener r3 = r2.A0o
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 11
            int r17 = r1.get(r0)
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 12
            int r18 = r1.get(r0)
            X.0vb r0 = r2.A0H
            if (r0 == 0) goto L_0x015a
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r0 = r0.A00
            r4 = 0
            if (r0 != 0) goto L_0x0106
            X.0vb r0 = r2.A0H
            if (r0 == 0) goto L_0x0156
            java.util.Locale r0 = r0.A0N()
            int r1 = X.AnonymousClass1X0.A00(r0)
            if (r1 == 0) goto L_0x0106
            r0 = 3
            if (r1 != r0) goto L_0x0107
        L_0x0106:
            r13 = 1
        L_0x0107:
            android.app.TimePickerDialog r14 = new android.app.TimePickerDialog
            r16 = r3
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)
            com.whatsapp.WaEditText r3 = r2.A08
            if (r3 == 0) goto L_0x0141
            r3.setFocusable(r4)
            r0 = 39
            X.C89934dG.A00(r3, r14, r0)
            r3.setKeyListener(r12)
            X.0vb r1 = r2.A0H
            if (r1 == 0) goto L_0x0152
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.lang.String r0 = X.A8I.A03(r1, r0)
            r3.setText(r0)
            X.0vb r1 = r2.A0H
            if (r1 == 0) goto L_0x014e
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r6)
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.lang.String r0 = X.A8I.A03(r1, r0)
            r3.setText(r0)
        L_0x0141:
            return
        L_0x0142:
            long r0 = r8.getTimeInMillis()
            long r3 = A0y
            long r0 = r0 + r3
            goto L_0x0075
        L_0x014b:
            r0 = r12
            goto L_0x0023
        L_0x014e:
            X.AnonymousClass3MW.A1M()
            throw r12
        L_0x0152:
            X.AnonymousClass3MW.A1M()
            throw r12
        L_0x0156:
            X.AnonymousClass3MW.A1M()
            throw r12
        L_0x015a:
            X.AnonymousClass3MW.A1M()
            throw r12
        L_0x015e:
            X.AnonymousClass3MW.A1M()
            throw r12
        L_0x0162:
            X.AnonymousClass3MW.A1I()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreateOrEditFragment.A01(long):void");
    }

    public static final void A03(EventCreateOrEditFragment eventCreateOrEditFragment) {
        String str;
        if (eventCreateOrEditFragment.A0u.getValue() != null) {
            C18030ve r2 = eventCreateOrEditFragment.A0N;
            if (r2 == null) {
                AnonymousClass3MW.A1A();
                throw null;
            } else if (!C18020vd.A05(C18040vf.A02, r2, 7941)) {
                AnonymousClass1KB r22 = eventCreateOrEditFragment.A05;
                if (r22 != null) {
                    r22.A08(2131890145, 0);
                } else {
                    str = "globalUI";
                    C18070vi.A11(str);
                    throw null;
                }
            }
        }
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("SUCCESS", true);
        AnonymousClass3MY.A16(A0D2, eventCreateOrEditFragment, "RESULT");
        AnonymousClass00H r0 = eventCreateOrEditFragment.A0f;
        if (r0 != null) {
            ((C132346md) r0.get()).A00(eventCreateOrEditFragment.A1D());
            return;
        }
        str = "eventRequestExactAlarmPermissionUtil";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A04(EventCreateOrEditFragment eventCreateOrEditFragment) {
        View A022;
        AnonymousClass00H r0 = eventCreateOrEditFragment.A0g;
        if (r0 != null) {
            if (C18020vd.A05(C18040vf.A02, ((C88124Yk) r0.get()).A03, 7420)) {
                C28931bI r1 = eventCreateOrEditFragment.A0l;
                if (r1 != null) {
                    r1.A04(0);
                }
                C28931bI r02 = eventCreateOrEditFragment.A0l;
                if (r02 != null && (A022 = r02.A02()) != null) {
                    eventCreateOrEditFragment.A0c = (WDSSwitch) AnonymousClass1HF.A06(A022, 2131430553);
                    C89934dG.A00(A022, eventCreateOrEditFragment, 42);
                    return;
                }
                return;
            }
            return;
        }
        C18070vi.A11("eventUtils");
        throw null;
    }

    public static final void A05(EventCreateOrEditFragment eventCreateOrEditFragment) {
        String str;
        String str2;
        if (eventCreateOrEditFragment.A0u.getValue() != null && !eventCreateOrEditFragment.A0m) {
            AnonymousClass3VY r0 = eventCreateOrEditFragment.A0M;
            if (r0 == null) {
                str2 = "eventCreateOrEditViewModel";
            } else {
                C88324Zf A0f2 = AnonymousClass3MX.A0f(r0.A0M);
                if (!(!A0f2.A04 || (str = A0f2.A03) == null || str.length() == 0)) {
                    long j = A0f2.A00;
                    AnonymousClass11P r02 = eventCreateOrEditFragment.A0F;
                    if (r02 == null) {
                        str2 = "time";
                    } else if (j < AnonymousClass11P.A01(r02)) {
                        C73203Rj A032 = AnonymousClass4a6.A03(eventCreateOrEditFragment);
                        A032.A0D(2131890066);
                        A032.A0g(eventCreateOrEditFragment.A1G(), new C91474fk(6), 2131899286);
                        A032.A0C();
                    }
                }
                eventCreateOrEditFragment.A0m = true;
                return;
            }
            C18070vi.A11(str2);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(com.whatsapp.events.EventCreateOrEditFragment r3, X.AnonymousClass4CW r4) {
        /*
            X.1bI r0 = r3.A0T
            if (r0 == 0) goto L_0x0030
            android.view.View r2 = r0.A02()
            if (r2 == 0) goto L_0x0030
            r0 = 2131430561(0x7f0b0ca1, float:1.8482826E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r2, r0)
            X.4CW r0 = X.AnonymousClass4CW.WA_VIDEO_CALL
            if (r4 != r0) goto L_0x0031
            r0 = 2131898969(0x7f123259, float:1.943287E38)
            r1.setText(r0)
            com.whatsapp.WaImageView r1 = r3.A0k
            if (r1 == 0) goto L_0x0025
            r0 = 2131233480(0x7f080ac8, float:1.8083099E38)
        L_0x0022:
            r1.setImageResource(r0)
        L_0x0025:
            boolean r0 = r2.hasOnClickListeners()
            if (r0 != 0) goto L_0x0030
            r0 = 40
            X.C89934dG.A00(r2, r3, r0)
        L_0x0030:
            return
        L_0x0031:
            r0 = 2131898970(0x7f12325a, float:1.9432873E38)
            r1.setText(r0)
            com.whatsapp.WaImageView r1 = r3.A0k
            if (r1 == 0) goto L_0x0025
            r0 = 2131233225(0x7f0809c9, float:1.8082581E38)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreateOrEditFragment.A08(com.whatsapp.events.EventCreateOrEditFragment, X.4CW):void");
    }

    public static final void A09(EventCreateOrEditFragment eventCreateOrEditFragment, Long l) {
        long timeInMillis;
        View A022;
        WaEditText waEditText;
        View A023;
        TextSwitcher textSwitcher;
        C28931bI r0 = eventCreateOrEditFragment.A0a;
        if (!(r0 == null || (textSwitcher = (TextSwitcher) r0.A02()) == null)) {
            textSwitcher.setCurrentText(eventCreateOrEditFragment.A1H(2131890128));
        }
        C28931bI r02 = eventCreateOrEditFragment.A0W;
        boolean z = false;
        if (r02 != null) {
            r02.A04(0);
        }
        boolean z2 = true;
        WaEditText waEditText2 = null;
        if (eventCreateOrEditFragment.A07 == null) {
            C28931bI r1 = eventCreateOrEditFragment.A0W;
            if (r1 == null || (A023 = r1.A02()) == null) {
                waEditText = null;
            } else {
                waEditText = (WaEditText) A023.findViewById(2131430576);
            }
            eventCreateOrEditFragment.A07 = waEditText;
            z = true;
        }
        if (eventCreateOrEditFragment.A08 == null) {
            C28931bI r12 = eventCreateOrEditFragment.A0W;
            if (!(r12 == null || (A022 = r12.A02()) == null)) {
                waEditText2 = (WaEditText) A022.findViewById(2131430577);
            }
            eventCreateOrEditFragment.A08 = waEditText2;
        } else {
            z2 = z;
        }
        if (l != null) {
            timeInMillis = l.longValue();
        } else if (z2) {
            timeInMillis = ((Calendar) AnonymousClass3MX.A14(eventCreateOrEditFragment.A0t)).getTimeInMillis() + A0z;
        } else {
            return;
        }
        eventCreateOrEditFragment.A01(timeInMillis);
    }

    public void A1s() {
        WaEditText waEditText = this.A0B;
        if (waEditText != null) {
            waEditText.setOnClickListener((View.OnClickListener) null);
        }
        WaEditText waEditText2 = this.A0A;
        if (waEditText2 != null) {
            waEditText2.setOnClickListener((View.OnClickListener) null);
        }
        WaEditText waEditText3 = this.A08;
        if (waEditText3 != null) {
            waEditText3.setOnClickListener((View.OnClickListener) null);
        }
        WaEditText waEditText4 = this.A07;
        if (waEditText4 != null) {
            waEditText4.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        WDSSwitch wDSSwitch = this.A0d;
        if (wDSSwitch != null) {
            wDSSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        this.A06 = null;
        this.A09 = null;
        this.A01 = null;
        this.A0B = null;
        this.A0A = null;
        this.A08 = null;
        this.A07 = null;
        this.A0C = null;
        this.A0k = null;
        this.A0Y = null;
        this.A0Z = null;
        this.A0D = null;
        this.A02 = null;
        this.A0b = null;
        this.A0V = null;
        this.A0T = null;
        this.A0d = null;
        this.A0U = null;
        this.A00 = null;
        super.A1s();
    }

    public final boolean A26() {
        Editable editable;
        boolean z;
        AnonymousClass3VY r2 = this.A0M;
        Editable editable2 = null;
        if (r2 == null) {
            C18070vi.A11("eventCreateOrEditViewModel");
            throw null;
        }
        WaEditText waEditText = this.A0C;
        if (waEditText != null) {
            editable = waEditText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        long time = ((Calendar) AnonymousClass3MX.A14(this.A0t)).getTime().getTime();
        Long A002 = A00(this);
        WaEditText waEditText2 = this.A06;
        if (waEditText2 != null) {
            editable2 = waEditText2.getText();
        }
        String valueOf2 = String.valueOf(editable2);
        WDSSwitch wDSSwitch = this.A0c;
        if (wDSSwitch != null) {
            z = wDSSwitch.isChecked();
        } else {
            z = false;
        }
        if (AnonymousClass3VY.A09(r2, A002, valueOf, valueOf2, time, z) || AnonymousClass3VY.A08(r2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.02h] */
    public EventCreateOrEditFragment() {
        Integer num = AnonymousClass00R.A0C;
        this.A0r = AnonymousClass1DF.A00(num, new AnonymousClass5NW(this));
        this.A0v = AnonymousClass1DF.A00(num, new AnonymousClass5PU(this, "extra_quoted_message_row_id"));
        this.A0u = C99154sM.A01(this, 15);
        this.A0w = new C88774al(this, 2);
        this.A0x = new C88784am(this, 1);
        this.A0n = new C88774al(this, 3);
        this.A0o = new C88784am(this, 2);
        this.A0q = CDw(new C91074f6(this, 8), new Object());
        this.A0p = CDw(new C91074f6(this, 9), new Object());
    }

    public static final void A02(EventCreateOrEditFragment eventCreateOrEditFragment) {
        Long A002 = A00(eventCreateOrEditFragment);
        if (A002 != null) {
            long longValue = A002.longValue();
            C18100vl r1 = eventCreateOrEditFragment.A0t;
            if (longValue <= ((Calendar) AnonymousClass3MX.A14(r1)).getTimeInMillis()) {
                longValue = ((Calendar) AnonymousClass3MX.A14(r1)).getTimeInMillis() + A0z;
            }
            eventCreateOrEditFragment.A01(longValue);
        }
    }

    public static final void A06(EventCreateOrEditFragment eventCreateOrEditFragment) {
        Calendar instance = Calendar.getInstance();
        C18070vi.A0X(instance);
        EventCreateOrEditFragment eventCreateOrEditFragment2 = eventCreateOrEditFragment;
        Context A14 = eventCreateOrEditFragment2.A14();
        DatePickerDialog.OnDateSetListener onDateSetListener = eventCreateOrEditFragment2.A0w;
        C18100vl r11 = eventCreateOrEditFragment2.A0t;
        AnonymousClass8Dv r14 = new AnonymousClass8Dv(onDateSetListener, A14, (Calendar) null, 0, ((Calendar) AnonymousClass3MX.A14(r11)).get(1), ((Calendar) AnonymousClass3MX.A14(r11)).get(2), ((Calendar) AnonymousClass3MX.A14(r11)).get(5));
        DatePicker datePicker = r14.A01;
        datePicker.setMinDate(instance.getTimeInMillis());
        long timeInMillis = instance.getTimeInMillis() + A0y;
        AnonymousClass1CJ r1 = eventCreateOrEditFragment2.A0I;
        if (r1 != null) {
            C29691ci A0A2 = r1.A0A(AnonymousClass3MX.A0m(eventCreateOrEditFragment2.A0r));
            if (A0A2 != null && A0A2.A0e.expiration > 0) {
                timeInMillis = instance.getTimeInMillis() + TimeUnit.SECONDS.toMillis((long) A0A2.A0e.expiration);
            }
            AnonymousClass3VY r0 = eventCreateOrEditFragment2.A0M;
            if (r0 == null) {
                C18070vi.A11("eventCreateOrEditViewModel");
                throw null;
            }
            if (AnonymousClass3MX.A0f(r0.A0M).A04) {
                AnonymousClass00H r02 = eventCreateOrEditFragment2.A0g;
                if (r02 != null) {
                    C88124Yk r12 = (C88124Yk) r02.get();
                    timeInMillis = Math.min(AnonymousClass11P.A01(r12.A01) + TimeUnit.DAYS.toMillis((long) C18020vd.A00(C18040vf.A02, r12.A03, 6265)), timeInMillis);
                } else {
                    C18070vi.A11("eventUtils");
                    throw null;
                }
            }
            datePicker.setMaxDate(timeInMillis);
            WaEditText waEditText = eventCreateOrEditFragment2.A0A;
            if (waEditText != null) {
                waEditText.setFocusable(false);
                C89934dG.A00(waEditText, r14, 44);
                waEditText.setKeyListener((KeyListener) null);
                C18000vb r03 = eventCreateOrEditFragment2.A0H;
                if (r03 != null) {
                    waEditText.setText(DateFormat.getDateInstance(2, r03.A0N()).format(((Calendar) AnonymousClass3MX.A14(r11)).getTime()));
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            }
        } else {
            AnonymousClass3MW.A1I();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r1 == 3) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.whatsapp.events.EventCreateOrEditFragment r11) {
        /*
            android.content.Context r6 = r11.A14()
            android.app.TimePickerDialog$OnTimeSetListener r7 = r11.A0x
            X.0vl r3 = r11.A0t
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r3)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 11
            int r8 = r1.get(r0)
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r3)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 12
            int r9 = r1.get(r0)
            X.0vb r0 = r11.A0H
            if (r0 == 0) goto L_0x0070
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r0 = r0.A00
            r4 = 0
            if (r0 != 0) goto L_0x003f
            X.0vb r0 = r11.A0H
            if (r0 == 0) goto L_0x006b
            java.util.Locale r0 = r0.A0N()
            int r1 = X.AnonymousClass1X0.A00(r0)
            if (r1 == 0) goto L_0x003f
            r0 = 3
            r10 = 0
            if (r1 != r0) goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            android.app.TimePickerDialog r5 = new android.app.TimePickerDialog
            r5.<init>(r6, r7, r8, r9, r10)
            com.whatsapp.WaEditText r2 = r11.A0B
            if (r2 == 0) goto L_0x0066
            r2.setFocusable(r4)
            r0 = 41
            X.C89934dG.A00(r2, r5, r0)
            r0 = 0
            r2.setKeyListener(r0)
            X.0vb r1 = r11.A0H
            if (r1 == 0) goto L_0x0067
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r3)
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.lang.String r0 = X.A8I.A03(r1, r0)
            r2.setText(r0)
        L_0x0066:
            return
        L_0x0067:
            X.AnonymousClass3MW.A1M()
            throw r0
        L_0x006b:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        L_0x0070:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreateOrEditFragment.A07(com.whatsapp.events.EventCreateOrEditFragment):void");
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i != 40 || i2 != -1 || intent == null) {
            return;
        }
        if (AnonymousClass3MY.A1a(intent, "is_reset")) {
            AnonymousClass3VY r1 = this.A0M;
            if (r1 == null) {
                C18070vi.A11("eventCreateOrEditViewModel");
                throw null;
            }
            AnonymousClass1G1 r2 = r1.A0N;
            C18070vi.A0z(r2, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<com.whatsapp.events.EventCreateOrEditViewModel.CoverImageState>");
            ((AnonymousClass1G3) r2).CPw(new C86784Tb((File) null, r1.A0D.A00()));
            return;
        }
        AnonymousClass3MX.A1Q(new EventCreateOrEditFragment$onActivityResult$1(intent, this, (C30391dr) null, i2), AnonymousClass3MZ.A0H(this));
    }
}
