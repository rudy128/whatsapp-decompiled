package com.whatsapp.contact.contactform;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11E;
import X.AnonymousClass12E;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1K3;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1LA;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1OZ;
import X.AnonymousClass1UN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass70L;
import X.AnonymousClass733;
import X.AnonymousClass743;
import X.AnonymousClass74O;
import X.AnonymousClass757;
import X.AnonymousClass75E;
import X.AnonymousClass783;
import X.AnonymousClass78V;
import X.AnonymousClass78W;
import X.AnonymousClass79O;
import X.AnonymousClass7EL;
import X.C108955ca;
import X.C108975cc;
import X.C109005cf;
import X.C116505xr;
import X.C127086dm;
import X.C131286kq;
import X.C132296mY;
import X.C133246oP;
import X.C133496or;
import X.C133956pm;
import X.C133996pq;
import X.C136756uL;
import X.C139486yv;
import X.C139626zB;
import X.C1404471l;
import X.C1411974r;
import X.C1412774z;
import X.C1599386l;
import X.C1599486m;
import X.C1599586n;
import X.C160908Am;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C219217x;
import X.C26781Tl;
import X.C28931bI;
import X.C30191dX;
import X.C37301pI;
import X.C37311pJ;
import X.C37551pj;
import X.C37721q1;
import X.C39171sd;
import X.C678831f;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;

public final class ContactFormBottomSheetFragment extends Hilt_ContactFormBottomSheetFragment implements C160908Am, C1599386l, C1599486m, C1599586n {
    public AnonymousClass1LA A00;
    public AnonymousClass190 A01;
    public C131286kq A02;
    public AnonymousClass1KB A03;
    public AnonymousClass11E A04;
    public AnonymousClass1M9 A05;
    public C26781Tl A06;
    public C127086dm A07;
    public C133996pq A08;
    public C133246oP A09;
    public C1404471l A0A;
    public C116505xr A0B;
    public AnonymousClass70L A0C;
    public C132296mY A0D;
    public C136756uL A0E;
    public AnonymousClass733 A0F;
    public C37311pJ A0G;
    public C678831f A0H;
    public AnonymousClass12E A0I;
    public AnonymousClass11C A0J;
    public C219217x A0K;
    public C19830z4 A0L;
    public C18000vb A0M;
    public AnonymousClass1KW A0N;
    public AnonymousClass1UN A0O;
    public C18030ve A0P;
    public AnonymousClass1LU A0Q;
    public AnonymousClass1K3 A0R;
    public C37301pI A0S;
    public AnonymousClass10I A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public View A0a;
    public C133496or A0b;
    public C139626zB A0c;
    public C28931bI A0d;
    public C28931bI A0e;
    public C28931bI A0f;
    public C28931bI A0g;
    public C28931bI A0h;
    public C28931bI A0i;
    public C28931bI A0j;
    public C28931bI A0k;
    public boolean A0l;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624642, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        String str3;
        String string;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        this.A0g = C28931bI.A00(view2, 2131434788);
        this.A0h = C28931bI.A00(view2, 2131434797);
        this.A0k = C28931bI.A00(view2, 2131435980);
        this.A0j = C28931bI.A00(view2, 2131435975);
        this.A0i = C28931bI.A00(view2, 2131435979);
        this.A0e = C28931bI.A00(view2, 2131428026);
        this.A0d = C28931bI.A00(view2, 2131428031);
        this.A0f = C28931bI.A00(view2, 2131429498);
        ((C39171sd) C18070vi.A05(view2, 2131428092)).setReferencedIds(new int[]{2131428091, 2131429497, 2131435980});
        AnonymousClass1FL A1D = A1D();
        C28931bI r1 = this.A0g;
        if (r1 == null) {
            str2 = "saveButtonViewStubHolder";
        } else {
            this.A0b = new C133496or(A1D, view2, r1);
            AnonymousClass1FL A1D2 = A1D();
            C133496or r12 = this.A0b;
            if (r12 != null) {
                this.A0D = new C132296mY(A1D2, view2, r12);
                C18030ve r6 = this.A0P;
                if (r6 != null) {
                    AnonymousClass1FL A1D3 = A1D();
                    AnonymousClass1KW r2 = this.A0N;
                    if (r2 != null) {
                        C132296mY r13 = this.A0D;
                        str2 = "contactFormScrollController";
                        String str4 = str2;
                        if (r13 != null) {
                            this.A0A = new C1404471l(A1D3, view2, r13, r2, r6);
                            AnonymousClass1FL A1D4 = A1D();
                            AnonymousClass733 r14 = this.A0F;
                            if (r14 != null) {
                                this.A08 = new C133996pq(A1D4, view2, r14);
                                C127086dm r7 = this.A07;
                                if (r7 != null) {
                                    C28931bI r62 = this.A0j;
                                    if (r62 == null) {
                                        str2 = "syncToPhoneSwitchViewStubHolder";
                                    } else {
                                        C219217x r22 = this.A0K;
                                        if (r22 != null) {
                                            AnonymousClass00H r0 = this.A0W;
                                            if (r0 != null) {
                                                C30191dX r15 = (C30191dX) C18070vi.A0E(r0);
                                                C18070vi.A0d(r15, 3);
                                                this.A0E = new C136756uL(r15, r7, r22, r62);
                                                AnonymousClass1FL A1D5 = A1D();
                                                AnonymousClass10I r10 = this.A0T;
                                                if (r10 != null) {
                                                    AnonymousClass00H r02 = this.A0X;
                                                    if (r02 != null) {
                                                        AnonymousClass1OZ r9 = (AnonymousClass1OZ) C18070vi.A0E(r02);
                                                        AnonymousClass1M9 r8 = this.A05;
                                                        if (r8 != null) {
                                                            AnonymousClass00H r03 = this.A0V;
                                                            if (r03 != null) {
                                                                C37551pj r72 = (C37551pj) C18070vi.A0E(r03);
                                                                C678831f r63 = this.A0H;
                                                                if (r63 != null) {
                                                                    AnonymousClass11E r23 = this.A04;
                                                                    if (r23 != null) {
                                                                        C133996pq r16 = this.A08;
                                                                        if (r16 != null) {
                                                                            C37311pJ r04 = this.A0G;
                                                                            if (r04 != null) {
                                                                                AnonymousClass7EL r36 = new AnonymousClass7EL(A1D5, r72, r23, r8, r16, r04, r63, r9, r10);
                                                                                AnonymousClass1FL A1D6 = A1D();
                                                                                AnonymousClass1KB r11 = this.A03;
                                                                                if (r11 != null) {
                                                                                    AnonymousClass10I r102 = this.A0T;
                                                                                    if (r102 != null) {
                                                                                        AnonymousClass1K3 r92 = this.A0R;
                                                                                        if (r92 != null) {
                                                                                            Bundle bundle2 = this.A06;
                                                                                            String str5 = "";
                                                                                            if (!(bundle2 == null || (string = bundle2.getString("contact_data_phone")) == null)) {
                                                                                                str5 = string;
                                                                                            }
                                                                                            AnonymousClass11C r82 = this.A0J;
                                                                                            if (r82 != null) {
                                                                                                C18000vb r73 = this.A0M;
                                                                                                if (r73 != null) {
                                                                                                    AnonymousClass1LA r64 = this.A00;
                                                                                                    if (r64 != null) {
                                                                                                        C132296mY r24 = this.A0D;
                                                                                                        if (r24 != null) {
                                                                                                            C133996pq r17 = this.A08;
                                                                                                            if (r17 != null) {
                                                                                                                this.A0B = new C116505xr(A1D6, view2, r64, r11, this, r36, r17, r24, r82, r73, r92, r102, str5);
                                                                                                                AnonymousClass1FL A1D7 = A1D();
                                                                                                                C18030ve r122 = this.A0P;
                                                                                                                if (r122 != null) {
                                                                                                                    AnonymousClass1KB r112 = this.A03;
                                                                                                                    if (r112 != null) {
                                                                                                                        AnonymousClass10I r103 = this.A0T;
                                                                                                                        if (r103 != null) {
                                                                                                                            AnonymousClass00H r05 = this.A0W;
                                                                                                                            if (r05 != null) {
                                                                                                                                C30191dX r93 = (C30191dX) r05.get();
                                                                                                                                C219217x r83 = this.A0K;
                                                                                                                                if (r83 != null) {
                                                                                                                                    C28931bI r74 = this.A0h;
                                                                                                                                    if (r74 == null) {
                                                                                                                                        str3 = "saveToIconViewStubHolder";
                                                                                                                                    } else {
                                                                                                                                        C28931bI r65 = this.A0f;
                                                                                                                                        if (r65 == null) {
                                                                                                                                            str3 = "contactsStorageOptionsSelectorViewStubHolder";
                                                                                                                                        } else {
                                                                                                                                            C37311pJ r25 = this.A0G;
                                                                                                                                            if (r25 != null) {
                                                                                                                                                AnonymousClass1UN A2K = A2K();
                                                                                                                                                C19830z4 r18 = this.A0L;
                                                                                                                                                if (r18 != null) {
                                                                                                                                                    C136756uL r06 = this.A0E;
                                                                                                                                                    str2 = "contactFormSyncToDeviceController";
                                                                                                                                                    if (r06 != null) {
                                                                                                                                                        this.A09 = new C133246oP(A1D7, r112, r93, this, r25, r83, r18, A2K, r122, r74, r65, r103, r06.A03());
                                                                                                                                                        A00(view2, false);
                                                                                                                                                        C136756uL r07 = this.A0E;
                                                                                                                                                        if (r07 != null) {
                                                                                                                                                            AnonymousClass79O r26 = new AnonymousClass79O(this, 1);
                                                                                                                                                            C28931bI r19 = r07.A00;
                                                                                                                                                            if (r19.A01() == 0) {
                                                                                                                                                                ((CompoundButton) r19.A02()).setOnCheckedChangeListener(r26);
                                                                                                                                                            }
                                                                                                                                                            C131286kq r75 = this.A02;
                                                                                                                                                            if (r75 != null) {
                                                                                                                                                                C1404471l r66 = this.A0A;
                                                                                                                                                                String str6 = "contactFormNameController";
                                                                                                                                                                if (r66 != null) {
                                                                                                                                                                    C136756uL r27 = this.A0E;
                                                                                                                                                                    if (r27 != null) {
                                                                                                                                                                        C133996pq r110 = this.A08;
                                                                                                                                                                        if (r110 != null) {
                                                                                                                                                                            C116505xr r08 = this.A0B;
                                                                                                                                                                            if (r08 != null) {
                                                                                                                                                                                this.A0c = r75.A00(r110, r66, r08, this, r27);
                                                                                                                                                                                C18030ve r09 = this.A0P;
                                                                                                                                                                                C18030ve r232 = r09;
                                                                                                                                                                                if (r09 != null) {
                                                                                                                                                                                    AnonymousClass1KB r010 = this.A03;
                                                                                                                                                                                    AnonymousClass1KB r222 = r010;
                                                                                                                                                                                    if (r010 != null) {
                                                                                                                                                                                        AnonymousClass190 r011 = this.A01;
                                                                                                                                                                                        AnonymousClass190 r21 = r011;
                                                                                                                                                                                        if (r011 != null) {
                                                                                                                                                                                            AnonymousClass10I r012 = this.A0T;
                                                                                                                                                                                            AnonymousClass10I r20 = r012;
                                                                                                                                                                                            if (r012 != null) {
                                                                                                                                                                                                AnonymousClass00H r013 = this.A0U;
                                                                                                                                                                                                if (r013 != null) {
                                                                                                                                                                                                    C37721q1 r113 = (C37721q1) r013.get();
                                                                                                                                                                                                    AnonymousClass00H r014 = this.A0W;
                                                                                                                                                                                                    if (r014 != null) {
                                                                                                                                                                                                        C30191dX r104 = (C30191dX) r014.get();
                                                                                                                                                                                                        C219217x r015 = this.A0K;
                                                                                                                                                                                                        C219217x r192 = r015;
                                                                                                                                                                                                        if (r015 != null) {
                                                                                                                                                                                                            AnonymousClass00H r016 = this.A0Y;
                                                                                                                                                                                                            if (r016 != null) {
                                                                                                                                                                                                                C139486yv r94 = (C139486yv) r016.get();
                                                                                                                                                                                                                C1404471l r017 = this.A0A;
                                                                                                                                                                                                                C1404471l r182 = r017;
                                                                                                                                                                                                                if (r017 != null) {
                                                                                                                                                                                                                    C116505xr r018 = this.A0B;
                                                                                                                                                                                                                    C116505xr r172 = r018;
                                                                                                                                                                                                                    if (r018 != null) {
                                                                                                                                                                                                                        C133496or r019 = this.A0b;
                                                                                                                                                                                                                        C133496or r162 = r019;
                                                                                                                                                                                                                        if (r019 != null) {
                                                                                                                                                                                                                            C136756uL r152 = this.A0E;
                                                                                                                                                                                                                            if (r152 != null) {
                                                                                                                                                                                                                                C133246oP r142 = this.A09;
                                                                                                                                                                                                                                if (r142 == null) {
                                                                                                                                                                                                                                    str2 = "contactFormContactStorageController";
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    C139626zB r132 = this.A0c;
                                                                                                                                                                                                                                    if (r132 == null) {
                                                                                                                                                                                                                                        str2 = "contactFormSaveNativeContactController";
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        C133996pq r84 = this.A08;
                                                                                                                                                                                                                                        if (r84 != null) {
                                                                                                                                                                                                                                            AnonymousClass1M9 r76 = this.A05;
                                                                                                                                                                                                                                            if (r76 != null) {
                                                                                                                                                                                                                                                C19830z4 r67 = this.A0L;
                                                                                                                                                                                                                                                if (r67 != null) {
                                                                                                                                                                                                                                                    AnonymousClass1UN A2K2 = A2K();
                                                                                                                                                                                                                                                    C26781Tl r28 = this.A06;
                                                                                                                                                                                                                                                    if (r28 != null) {
                                                                                                                                                                                                                                                        AnonymousClass11E r111 = this.A04;
                                                                                                                                                                                                                                                        if (r111 != null) {
                                                                                                                                                                                                                                                            this.A0C = new AnonymousClass70L(r21, r222, r111, r104, r76, r28, r94, r36, r84, r142, r182, r172, r162, this, r132, r152, r192, r67, A2K2, r232, (AnonymousClass1BI) null, r113, r20, (Long) null, (Long) null, (Long) null, (String) null);
                                                                                                                                                                                                                                                            Dialog dialog = this.A03;
                                                                                                                                                                                                                                                            if (dialog != null) {
                                                                                                                                                                                                                                                                dialog.setOnShowListener(new AnonymousClass75E(this, dialog, 1));
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            C28931bI.A00(view2, 2131429403).A04(0);
                                                                                                                                                                                                                                                            AnonymousClass3Ma.A1B(AnonymousClass1HF.A06(view2, 2131429138), this, 20);
                                                                                                                                                                                                                                                            C133496or r114 = this.A0b;
                                                                                                                                                                                                                                                            if (r114 == null) {
                                                                                                                                                                                                                                                                C18070vi.A11("contactFormSaveButtonController");
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            r114.A00.setVisibility(8);
                                                                                                                                                                                                                                                            r114.A01.A04(0);
                                                                                                                                                                                                                                                            C133496or r115 = this.A0b;
                                                                                                                                                                                                                                                            if (r115 == null) {
                                                                                                                                                                                                                                                                C18070vi.A11("contactFormSaveButtonController");
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            AnonymousClass783 r29 = new AnonymousClass783(this, 19);
                                                                                                                                                                                                                                                            r115.A00.setOnClickListener(r29);
                                                                                                                                                                                                                                                            C28931bI r116 = r115.A01;
                                                                                                                                                                                                                                                            if (r116.A00 != null && r116.A01() == 0) {
                                                                                                                                                                                                                                                                r116.A02().setOnClickListener(r29);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            AnonymousClass3MY.A1A(view2, 2131436270, 8);
                                                                                                                                                                                                                                                            C116505xr r4 = this.A0B;
                                                                                                                                                                                                                                                            if (r4 == null) {
                                                                                                                                                                                                                                                                C18070vi.A11("contactFormPhoneController");
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            r4.A03.setOnFocusChangeListener(new AnonymousClass78V(r4, 2));
                                                                                                                                                                                                                                                            C1404471l r42 = this.A0A;
                                                                                                                                                                                                                                                            if (r42 == null) {
                                                                                                                                                                                                                                                                C18070vi.A11(str6);
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            EditText editText = r42.A04;
                                                                                                                                                                                                                                                            editText.setOnFocusChangeListener(new AnonymousClass78W(editText, r42, 0));
                                                                                                                                                                                                                                                            EditText editText2 = r42.A05;
                                                                                                                                                                                                                                                            editText2.setOnFocusChangeListener(new AnonymousClass78W(editText2, r42, 0));
                                                                                                                                                                                                                                                            Bundle bundle3 = this.A06;
                                                                                                                                                                                                                                                            if (bundle3 == null) {
                                                                                                                                                                                                                                                                C132296mY r020 = this.A0D;
                                                                                                                                                                                                                                                                if (r020 != null) {
                                                                                                                                                                                                                                                                    r020.A00();
                                                                                                                                                                                                                                                                    C1404471l r021 = this.A0A;
                                                                                                                                                                                                                                                                    if (r021 != null) {
                                                                                                                                                                                                                                                                        r021.A04.requestFocus();
                                                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                C18070vi.A11(str4);
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            String string2 = bundle3.getString("contact_data_first_name");
                                                                                                                                                                                                                                                            if (string2 == null || string2.length() == 0) {
                                                                                                                                                                                                                                                                C132296mY r022 = this.A0D;
                                                                                                                                                                                                                                                                if (r022 != null) {
                                                                                                                                                                                                                                                                    r022.A00();
                                                                                                                                                                                                                                                                    C1404471l r023 = this.A0A;
                                                                                                                                                                                                                                                                    if (r023 != null) {
                                                                                                                                                                                                                                                                        r023.A04.requestFocus();
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                C18070vi.A11(str4);
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            C1404471l r117 = this.A0A;
                                                                                                                                                                                                                                                            if (r117 != null) {
                                                                                                                                                                                                                                                                C116505xr r024 = this.A0B;
                                                                                                                                                                                                                                                                if (r024 == null) {
                                                                                                                                                                                                                                                                    str6 = "contactFormPhoneController";
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    AnonymousClass743.A06(bundle3, r117, r024);
                                                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            C18070vi.A11(str6);
                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                            str4 = str6;
                                                                                                                                                                                                                                                            C18070vi.A11(str4);
                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        str = "contactsCreatedWithinWaManager";
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                str = "nativeContactDbHelper";
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    str = "addContactLogUtil";
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            str = "crashLogs";
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            C18070vi.A11("contactFormPhoneController");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C18070vi.A11(str6);
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            str = "contactFormSaveNativeContactControllerFactory";
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                str = "waSharedPreferences";
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    C18070vi.A11(str3);
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        str = "countryPhoneInfo";
                                                                                                    }
                                                                                                } else {
                                                                                                    str = "whatsAppLocale";
                                                                                                }
                                                                                            } else {
                                                                                                str = "systemServices";
                                                                                            }
                                                                                        } else {
                                                                                            str = "countryUtils";
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str = "globalUI";
                                                                            }
                                                                            str = "nativeContactsLauncher";
                                                                        }
                                                                        C18070vi.A11("contactFormContactOnWhatsAppController");
                                                                        throw null;
                                                                    }
                                                                    str = "connectivityStateProvider";
                                                                } else {
                                                                    str = "contactQuerySync";
                                                                }
                                                            } else {
                                                                str = "blockListManager";
                                                            }
                                                        }
                                                        str = "contactManager";
                                                    } else {
                                                        str = "messageClient";
                                                    }
                                                }
                                                str = "waWorkers";
                                            }
                                            str = "contactAccessHelper";
                                        }
                                        str = "waPermissionsHelper";
                                    }
                                } else {
                                    str = "contactsSharedPreferences";
                                }
                            } else {
                                str = "inviteContactUtils";
                            }
                        }
                    } else {
                        str = "emojiLoader";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                str = "abProps";
                C18070vi.A11(str);
                throw null;
            }
            C18070vi.A11("contactFormSaveButtonController");
            throw null;
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void BqP(String str) {
        if (this.A0Q != null) {
            startActivityForResult(AnonymousClass1LU.A1S(A1D(), str, (String) null), 0);
        } else {
            AnonymousClass3MW.A1F();
            throw null;
        }
    }

    public void CMn(AnonymousClass1E7 r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass743.A02(A1B, new C1411974r(12), new C1412774z(A1B, this, r5, 0));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        String str;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C132296mY r0 = this.A0D;
        if (r0 == null) {
            str = "contactFormScrollController";
        } else if (r0.A01.getLayoutParams().height == -1) {
            C133496or r02 = this.A0b;
            if (r02 == null) {
                str = "contactFormSaveButtonController";
            } else {
                r02.A00(configuration);
                return;
            }
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("is_contact_saved", this.A0l);
        A1F().A0w("request_bottom_sheet_fragment", A0D2);
    }

    private final void A00(View view, boolean z) {
        String str;
        if (A2K().A05()) {
            C19830z4 r0 = this.A0L;
            if (r0 != null) {
                boolean A2J = r0.A2J();
                View view2 = view;
                this.A0a = view2;
                C133496or r02 = this.A0b;
                C133496or r21 = r02;
                if (r02 == null) {
                    str = "contactFormSaveButtonController";
                } else {
                    AnonymousClass1FL A1B = A1B();
                    C19830z4 r03 = this.A0L;
                    C19830z4 r20 = r03;
                    if (r03 != null) {
                        C219217x r04 = this.A0K;
                        C219217x r19 = r04;
                        if (r04 != null) {
                            AnonymousClass00H r05 = this.A0W;
                            if (r05 != null) {
                                C30191dX r11 = (C30191dX) C18070vi.A0E(r05);
                                AnonymousClass00H r06 = this.A0Y;
                                if (r06 != null) {
                                    C139486yv r10 = (C139486yv) C18070vi.A0E(r06);
                                    AnonymousClass1M9 r07 = this.A05;
                                    AnonymousClass1M9 r18 = r07;
                                    if (r07 != null) {
                                        AnonymousClass12E r08 = this.A0I;
                                        AnonymousClass12E r17 = r08;
                                        if (r08 != null) {
                                            AnonymousClass10I r15 = this.A0T;
                                            if (r15 != null) {
                                                C136756uL r14 = this.A0E;
                                                if (r14 != null) {
                                                    AnonymousClass00H r09 = this.A0Z;
                                                    if (r09 != null) {
                                                        C133956pm r9 = (C133956pm) C18070vi.A0E(r09);
                                                        AnonymousClass1KB r13 = this.A03;
                                                        if (r13 != null) {
                                                            C28931bI r8 = this.A0h;
                                                            if (r8 == null) {
                                                                str = "saveToIconViewStubHolder";
                                                            } else {
                                                                C28931bI r7 = this.A0k;
                                                                if (r7 == null) {
                                                                    str = "syncToPhoneTextViewStubHolder";
                                                                } else {
                                                                    C28931bI r6 = this.A0j;
                                                                    if (r6 == null) {
                                                                        str = "syncToPhoneSwitchViewStubHolder";
                                                                    } else {
                                                                        C28931bI r5 = this.A0i;
                                                                        if (r5 == null) {
                                                                            str = "syncToPhoneIconViewStubHolder";
                                                                        } else {
                                                                            C28931bI r4 = this.A0e;
                                                                            if (r4 == null) {
                                                                                str = "backupContactsTextViewStubHolder";
                                                                            } else {
                                                                                C28931bI r3 = this.A0d;
                                                                                if (r3 == null) {
                                                                                    str = "backupContactsActionViewStubHolder";
                                                                                } else {
                                                                                    C28931bI r2 = this.A0f;
                                                                                    if (r2 == null) {
                                                                                        str = "contactsStorageOptionsSelectorViewStubHolder";
                                                                                    } else {
                                                                                        Resources A092 = AnonymousClass3MZ.A09(this);
                                                                                        C18070vi.A0X(A092);
                                                                                        C37301pI r1 = this.A0S;
                                                                                        if (r1 != null) {
                                                                                            AnonymousClass1KB r26 = r13;
                                                                                            C30191dX r27 = r11;
                                                                                            AnonymousClass1M9 r28 = r18;
                                                                                            C139486yv r29 = r10;
                                                                                            C133496or r30 = r21;
                                                                                            C136756uL r31 = r14;
                                                                                            AnonymousClass12E r32 = r17;
                                                                                            C219217x r33 = r19;
                                                                                            C19830z4 r34 = r20;
                                                                                            C133956pm r35 = r9;
                                                                                            AnonymousClass743.A05(A1B, A092, view2, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r1, r8, r7, r6, r5, r4, r3, r2, r15, false, A2J, A2K().A09());
                                                                                            C136756uL r36 = this.A0E;
                                                                                            if (r36 != null) {
                                                                                                r36.A01((Long) null, false, A2J, z);
                                                                                                return;
                                                                                            }
                                                                                        } else {
                                                                                            str = "nativeContactsLogUtil";
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str = "globalUI";
                                                        }
                                                    } else {
                                                        str = "settingsContactsUtil";
                                                    }
                                                }
                                                C18070vi.A11("contactFormSyncToDeviceController");
                                                throw null;
                                            }
                                            str = "waWorkers";
                                        } else {
                                            str = "contactSyncMethods";
                                        }
                                    } else {
                                        str = "contactManager";
                                    }
                                } else {
                                    str = "nativeContactDbHelper";
                                }
                            } else {
                                str = "contactAccessHelper";
                            }
                        } else {
                            str = "waPermissionsHelper";
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            str = "waSharedPreferences";
            C18070vi.A11(str);
            throw null;
        }
    }

    public final AnonymousClass1UN A2K() {
        AnonymousClass1UN r0 = this.A0O;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("nativeContactGateKeeper");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0.A00 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C4L(android.content.Intent r7) {
        /*
            r6 = this;
            X.5xr r1 = r6.A0B
            java.lang.String r5 = "contactFormPhoneController"
            if (r1 == 0) goto L_0x0087
            java.lang.String r0 = r1.A03()
            boolean r0 = r1.A0D(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0021
            X.6pq r0 = r6.A08
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "contactFormContactOnWhatsAppController"
        L_0x0017:
            X.C18070vi.A11(r0)
        L_0x001a:
            r0 = 0
            throw r0
        L_0x001c:
            X.1E7 r0 = r0.A00
            r3 = 0
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r3 = 1
        L_0x0022:
            X.1UN r0 = r6.A2K()
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0042
            X.12E r1 = r6.A0I
            if (r1 == 0) goto L_0x003c
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            r1.A0D(r0)
            X.6uL r0 = r6.A0E
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "contactFormSyncToDeviceController"
            goto L_0x0017
        L_0x003c:
            java.lang.String r0 = "contactSyncMethods"
            goto L_0x0017
        L_0x003f:
            r0.A00()
        L_0x0042:
            X.1UN r0 = r6.A2K()
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0075
            X.0ve r2 = r6.A0P
            if (r2 == 0) goto L_0x0084
            r1 = 9984(0x2700, float:1.399E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0075
            X.00H r0 = r6.A0U
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1q1 r1 = (X.C37721q1) r1
            X.5xr r0 = r6.A0B
            if (r0 == 0) goto L_0x0087
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0B()
            r1.A05(r0, r3)
        L_0x006f:
            r6.A0l = r4
            r6.A29()
            return
        L_0x0075:
            X.70L r1 = r6.A0C
            if (r1 != 0) goto L_0x007c
            java.lang.String r0 = "contactFormSaveContactController"
            goto L_0x0017
        L_0x007c:
            r0 = 0
            r1.A05(r0, r4, r3)
            goto L_0x006f
        L_0x0081:
            java.lang.String r0 = "addContactLogUtil"
            goto L_0x0017
        L_0x0084:
            java.lang.String r0 = "abProps"
            goto L_0x0017
        L_0x0087:
            X.C18070vi.A11(r5)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.ContactFormBottomSheetFragment.C4L(android.content.Intent):void");
    }

    public void A1u() {
        String str;
        super.A1u();
        View view = this.A0a;
        if (view != null) {
            A00(view, true);
        }
        C133246oP r1 = this.A09;
        if (r1 == null) {
            str = "contactFormContactStorageController";
        } else {
            C136756uL r0 = this.A0E;
            if (r0 == null) {
                str = "contactFormSyncToDeviceController";
            } else {
                r1.A00(r0.A03());
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1w(int i, int i2, Intent intent) {
        String str;
        super.A1w(i, i2, intent);
        if (i == 0) {
            C116505xr r0 = this.A0B;
            if (r0 == null) {
                str = "contactFormPhoneController";
            } else {
                r0.A0C(i2, intent);
                return;
            }
        } else if (i == 150) {
            AnonymousClass70L r02 = this.A0C;
            if (r02 == null) {
                str = "contactFormSaveContactController";
            } else {
                r02.A01();
                return;
            }
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean BeF() {
        return !A1b();
    }

    public void Bl1() {
        if (A1b()) {
            A29();
        }
    }

    public void C4H(int i, Integer num) {
        String str;
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isFinishing() && !this.A0j) {
            C18030ve r2 = this.A0P;
            if (r2 != null) {
                if (C18020vd.A05(C18040vf.A02, r2, 9984) || A2K().A04()) {
                    AnonymousClass70L r1 = this.A0C;
                    if (r1 != null) {
                        C133996pq r0 = this.A08;
                        if (r0 == null) {
                            str = "contactFormContactOnWhatsAppController";
                        } else {
                            r1.A05(num, i, AnonymousClass000.A1W(r0.A00));
                        }
                    }
                    C18070vi.A11("contactFormSaveContactController");
                    throw null;
                }
                if (A2K().A05()) {
                    AnonymousClass70L r02 = this.A0C;
                    if (r02 != null) {
                        r02.A04(i);
                        return;
                    }
                    C18070vi.A11("contactFormSaveContactController");
                    throw null;
                }
                AnonymousClass757 A002 = AnonymousClass757.A00(this, 25);
                AnonymousClass757 A003 = AnonymousClass757.A00(this, 26);
                C73203Rj A004 = AnonymousClass4a6.A00(A1B);
                C108955ca.A1D(A1B, A004, 2131888767);
                C108975cc.A0n(A1B, A002, A004, 2131898766);
                C109005cf.A0J(A1B, A003, A004, 2131897145);
                return;
            }
            str = "abProps";
            C18070vi.A11(str);
            throw null;
        }
    }

    public void C4I() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isFinishing() && !this.A0j) {
            AnonymousClass757 A002 = AnonymousClass757.A00(this, 21);
            AnonymousClass757 A003 = AnonymousClass757.A00(this, 22);
            C73203Rj A004 = AnonymousClass4a6.A00(A1B);
            C108955ca.A1D(A1B, A004, 2131888767);
            C108975cc.A0n(A1B, A002, A004, 2131898766);
            C109005cf.A0J(A1B, A003, A004, 2131897145);
        }
    }

    public void CMh() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isFinishing() && !this.A0j) {
            AnonymousClass757 A002 = AnonymousClass757.A00(this, 23);
            AnonymousClass757 A003 = AnonymousClass757.A00(this, 24);
            C73203Rj A004 = AnonymousClass4a6.A00(A1B);
            C108955ca.A1D(A1B, A004, 2131888767);
            C108975cc.A0n(A1B, A002, A004, 2131898766);
            C109005cf.A0J(A1B, A003, A004, 2131897145);
        }
    }

    public void CMo() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            C1411974r r2 = new C1411974r(9);
            C73203Rj A002 = AnonymousClass4a6.A00(A1B);
            A002.A0k(A1B.getString(2131893395));
            C108955ca.A1D(A1B, A002, 2131893387);
            C109005cf.A0J(A1B, r2, A002, 2131893386);
        }
    }

    public /* bridge */ /* synthetic */ void CMp(Boolean bool) {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass743.A03(A1B, new C1411974r(11), AnonymousClass757.A00(this, 20));
        }
    }

    public void CMq() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass743.A01(A1B);
        }
    }

    public /* bridge */ /* synthetic */ void CMr(Boolean bool) {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass743.A04(A1B, new C1411974r(10), AnonymousClass757.A00(this, 19));
        }
    }

    public void requestPermission() {
        if (A1n() != null) {
            startActivityForResult(AnonymousClass74O.A02(A14(), 2131894324, 2131894328, false), 150);
        }
    }
}
