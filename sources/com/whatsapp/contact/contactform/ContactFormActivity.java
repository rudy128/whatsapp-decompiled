package com.whatsapp.contact.contactform;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass12E;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1K3;
import X.AnonymousClass1KB;
import X.AnonymousClass1LA;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1UN;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass70L;
import X.AnonymousClass733;
import X.AnonymousClass743;
import X.AnonymousClass74O;
import X.AnonymousClass757;
import X.AnonymousClass79Z;
import X.AnonymousClass7EL;
import X.C000200d;
import X.C108955ca;
import X.C108975cc;
import X.C109005cf;
import X.C116505xr;
import X.C127086dm;
import X.C130016ik;
import X.C131286kq;
import X.C132606n8;
import X.C133226oN;
import X.C133246oP;
import X.C133496or;
import X.C133956pm;
import X.C133996pq;
import X.C136756uL;
import X.C137526vb;
import X.C139486yv;
import X.C1411974r;
import X.C1412174t;
import X.C1412374v;
import X.C1595084u;
import X.C1599386l;
import X.C1599486m;
import X.C1599586n;
import X.C160908Am;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C19880zA;
import X.C219217x;
import X.C26781Tl;
import X.C26811To;
import X.C28931bI;
import X.C30191dX;
import X.C37301pI;
import X.C37311pJ;
import X.C37721q1;
import X.C678831f;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public final class ContactFormActivity extends AnonymousClass1FY implements C160908Am, C1599386l, C1599486m, C1599586n, C1595084u {
    public long A00;
    public C19880zA A01;
    public AnonymousClass1LA A02;
    public C131286kq A03;
    public C26811To A04;
    public AnonymousClass1M9 A05;
    public C26781Tl A06;
    public C127086dm A07;
    public C133996pq A08;
    public C133246oP A09;
    public C133226oN A0A;
    public AnonymousClass70L A0B;
    public AnonymousClass733 A0C;
    public C37311pJ A0D;
    public C678831f A0E;
    public AnonymousClass12E A0F;
    public C219217x A0G;
    public AnonymousClass1K3 A0H;
    public C37301pI A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public Long A0Q;
    public View A0R;
    public C132606n8 A0S;
    public AnonymousClass7EL A0T;
    public C130016ik A0U;
    public C116505xr A0V;
    public C133496or A0W;
    public C136756uL A0X;
    public C28931bI A0Y;
    public C28931bI A0Z;
    public C28931bI A0a;
    public C28931bI A0b;
    public C28931bI A0c;
    public C28931bI A0d;
    public C28931bI A0e;
    public C28931bI A0f;
    public Boolean A0g;
    public String A0h;
    public boolean A0i;

    public void BqP(String str) {
        startActivityForResult(AnonymousClass1LU.A1S(this, str, (String) null), 0);
    }

    public void CMn(AnonymousClass1E7 r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass743.A02(this, new C1411974r(7), new C1412374v(r4, this, 1));
    }

    public void CMo() {
        C1411974r r2 = new C1411974r(4);
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0k(getString(2131893395));
        C108955ca.A1D(this, A002, 2131893387);
        C109005cf.A0J(this, r2, A002, 2131893386);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C133496or r0 = this.A0W;
        if (r0 == null) {
            C18070vi.A11("contactFormSaveButtonController");
            throw null;
        } else {
            r0.A00(configuration);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        boolean A1W = AnonymousClass000.A1W(this.A0Q);
        Boolean A0i2 = AnonymousClass000.A0i();
        if (A1W && C18070vi.A18(A03(), A0i2)) {
            getMenuInflater().inflate(2131820556, menu);
            menu.findItem(2131429886).setTitle(getString(2131899153));
            menu.findItem(2131427591).setVisible(false);
            C137526vb.A00(menu);
        } else if (this.A0Q == null && C18070vi.A18(A03(), A0i2)) {
            getMenuInflater().inflate(2131820556, menu);
            menu.findItem(2131429886).setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    private final Boolean A03() {
        Boolean bool = this.A0g;
        if (bool != null) {
            return bool;
        }
        AnonymousClass00H r0 = this.A0O;
        if (r0 != null) {
            Boolean valueOf = Boolean.valueOf(((AnonymousClass1UN) r0.get()).A05());
            this.A0g = valueOf;
            return valueOf;
        }
        C18070vi.A11("nativeContactGateKeeperLazy");
        throw null;
    }

    private final void A0Q(View view, C133496or r47, boolean z) {
        String str;
        if (C72463Mc.A1Y(A03())) {
            boolean A2J = this.A0A.A2J();
            View view2 = view;
            this.A0R = view2;
            boolean A1W = AnonymousClass000.A1W(this.A0Q);
            C19830z4 r30 = this.A0A;
            C18070vi.A0W(r30);
            C219217x r0 = this.A0G;
            C219217x r17 = r0;
            if (r0 != null) {
                AnonymousClass00H r02 = this.A0L;
                if (r02 != null) {
                    C30191dX r11 = (C30191dX) C18070vi.A0E(r02);
                    AnonymousClass00H r03 = this.A0N;
                    if (r03 != null) {
                        C139486yv r10 = (C139486yv) C18070vi.A0E(r03);
                        AnonymousClass1M9 r15 = this.A05;
                        if (r15 != null) {
                            AnonymousClass12E r14 = this.A0F;
                            if (r14 != null) {
                                AnonymousClass10I r21 = this.A05;
                                C18070vi.A0W(r21);
                                C136756uL r9 = this.A0X;
                                if (r9 != null) {
                                    AnonymousClass00H r04 = this.A0P;
                                    if (r04 != null) {
                                        C133956pm r8 = (C133956pm) C18070vi.A0E(r04);
                                        AnonymousClass1KB r19 = this.A05;
                                        C18070vi.A0W(r19);
                                        C28931bI r7 = this.A0c;
                                        if (r7 == null) {
                                            str = "saveToIconViewStubHolder";
                                        } else {
                                            C28931bI r6 = this.A0f;
                                            if (r6 == null) {
                                                str = "syncToPhoneTextViewStubHolder";
                                            } else {
                                                C28931bI r5 = this.A0e;
                                                if (r5 == null) {
                                                    str = "syncToPhoneSwitchViewStubHolder";
                                                } else {
                                                    C28931bI r4 = this.A0d;
                                                    if (r4 == null) {
                                                        str = "syncToPhoneIconViewStubHolder";
                                                    } else {
                                                        C28931bI r3 = this.A0Z;
                                                        if (r3 == null) {
                                                            str = "backupContactsTextViewStubHolder";
                                                        } else {
                                                            C28931bI r2 = this.A0Y;
                                                            if (r2 == null) {
                                                                str = "backupContactsActionViewStubHolder";
                                                            } else {
                                                                C28931bI r1 = this.A0a;
                                                                if (r1 == null) {
                                                                    str = "contactsStorageOptionsSelectorViewStubHolder";
                                                                } else {
                                                                    Resources A0D2 = C108955ca.A0D(this);
                                                                    C37301pI r05 = this.A0I;
                                                                    if (r05 != null) {
                                                                        AnonymousClass00H r13 = this.A0O;
                                                                        if (r13 != null) {
                                                                            AnonymousClass1KB r22 = r19;
                                                                            C30191dX r23 = r11;
                                                                            AnonymousClass1M9 r24 = r15;
                                                                            C139486yv r25 = r10;
                                                                            C136756uL r27 = r9;
                                                                            AnonymousClass12E r28 = r14;
                                                                            C219217x r29 = r17;
                                                                            View view3 = view2;
                                                                            AnonymousClass743.A05(this, A0D2, view3, r22, r23, r24, r25, r47, r27, r28, r29, r30, r8, r05, r7, r6, r5, r4, r3, r2, r1, r21, A1W, A2J, ((AnonymousClass1UN) r13.get()).A09());
                                                                            C136756uL r32 = this.A0X;
                                                                            if (r32 != null) {
                                                                                r32.A01(Long.valueOf(this.A00), AnonymousClass000.A1W(this.A0Q), A2J, z);
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            str = "nativeContactGateKeeperLazy";
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
                                        str = "settingsContactsUtil";
                                    }
                                }
                                C18070vi.A11("contactFormSyncToDeviceController");
                                throw null;
                            }
                            str = "contactSyncMethods";
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
            C18070vi.A11(str);
            throw null;
        }
    }

    public void A2y() {
        if (!this.A0i) {
            this.A0i = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r3 = A0A2.A00;
            C109005cf.A0d(A0A2, r3, this);
            C109005cf.A0e(A0A2, r3, this, r3.A5A);
            this.A0J = C000200d.A00(A0A2.A0F);
            this.A0K = C000200d.A00(A0A2.A0x);
            this.A0L = C000200d.A00(A0A2.A2b);
            this.A03 = (C131286kq) A0K2.A0i.get();
            this.A05 = AnonymousClass10E.A4z(A0A2);
            this.A0E = (C678831f) r3.A10.get();
            this.A0F = (AnonymousClass12E) A0A2.A2k.get();
            this.A06 = A0A2.A55();
            this.A07 = (C127086dm) r3.A8G.get();
            this.A02 = C72453Mb.A0b(A0A2);
            this.A0H = AnonymousClass3Ma.A0v(A0A2);
            this.A0C = (AnonymousClass733) r3.A2s.get();
            this.A0M = C000200d.A00(A0A2.A6N);
            this.A0N = C000200d.A00(A0A2.AaO);
            this.A0O = C000200d.A00(A0A2.A72);
            this.A0D = (C37311pJ) A0K2.A4y.get();
            this.A0I = (C37301pI) r3.A3I.get();
            this.A0P = C000200d.A00(A0K2.A5n);
            this.A01 = (C19880zA) A0A2.A7g.get();
            this.A04 = (C26811To) A0A2.AAf.get();
            this.A0G = AnonymousClass3Ma.A0b(A0A2);
        }
    }

    public void Bl1() {
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            ((C37721q1) r0.get()).A03(5);
        } else {
            C18070vi.A11("addContactLogUtil");
            throw null;
        }
    }

    public void CMh() {
        AnonymousClass757 A002 = AnonymousClass757.A00(this, 16);
        AnonymousClass757 A003 = AnonymousClass757.A00(this, 17);
        C73203Rj A004 = AnonymousClass4a6.A00(this);
        C108955ca.A1D(this, A004, 2131888767);
        C108975cc.A0n(this, A002, A004, 2131898766);
        C109005cf.A0J(this, A003, A004, 2131897145);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 0) {
            C116505xr r0 = this.A0V;
            if (r0 == null) {
                str = "contactFormPhoneController";
            } else {
                r0.A0C(i2, intent);
                return;
            }
        } else if (i == 1) {
            C130016ik r02 = this.A0U;
            if (r02 == null) {
                str = "contactFormAddInformationController";
            } else {
                C72453Mb.A14(r02.A00);
                return;
            }
        } else if (i != 150) {
            super.onActivityResult(i, i2, intent);
            return;
        } else {
            AnonymousClass70L r03 = this.A0B;
            if (r03 == null) {
                str = "contactFormSaveContactController";
            } else {
                r03.A01();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onBackPressed() {
        C132606n8 r0 = this.A0S;
        if (r0 == null) {
            C18070vi.A11("contactFormNavigationManager");
            throw null;
        } else if (!r0.A00()) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0481, code lost:
        if (r0 == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x027d, code lost:
        if (r1.longValue() != 0) goto L_0x027f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r50) {
        /*
            r49 = this;
            r5 = r49
            r0 = r50
            super.onCreate(r0)
            r0 = 2131624642(0x7f0e02c2, float:1.887647E38)
            r5.setContentView((int) r0)
            r0 = 2131434788(0x7f0b1d24, float:1.84914E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0b = r0
            r0 = 2131434797(0x7f0b1d2d, float:1.8491418E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0c = r0
            r0 = 2131435980(0x7f0b21cc, float:1.8493817E38)
            r6 = 2131435980(0x7f0b21cc, float:1.8493817E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0f = r0
            r0 = 2131435975(0x7f0b21c7, float:1.8493807E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0e = r0
            r0 = 2131435979(0x7f0b21cb, float:1.8493815E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0d = r0
            r0 = 2131428026(0x7f0b02ba, float:1.8477685E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0Z = r0
            r0 = 2131428031(0x7f0b02bf, float:1.8477695E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0Y = r0
            r0 = 2131429498(0x7f0b087a, float:1.848067E38)
            X.1bI r0 = X.C72453Mb.A0r(r5, r0)
            r5.A0a = r0
            r0 = 2131428092(0x7f0b02fc, float:1.8477819E38)
            android.view.View r4 = X.AnonymousClass3MY.A0C(r5, r0)
            X.1sd r4 = (X.C39171sd) r4
            r0 = 3
            int[] r3 = new int[r0]
            r0 = 2131428091(0x7f0b02fb, float:1.8477817E38)
            r2 = 0
            r3[r2] = r0
            r1 = 2131429497(0x7f0b0879, float:1.8480668E38)
            r0 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r3[r0] = r1
            r0 = 2
            r3[r0] = r6
            r4.setReferencedIds(r3)
            android.content.Intent r4 = r5.getIntent()
            r0 = 0
            java.lang.String r7 = "raw_contact_id"
            if (r4 == 0) goto L_0x0489
            boolean r3 = r4.hasExtra(r7)
            if (r3 == 0) goto L_0x0489
            long r0 = r4.getLongExtra(r7, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0092:
            r5.A0Q = r0
            if (r4 == 0) goto L_0x0485
            java.lang.String r1 = "wa_contact_table_column_id"
            boolean r0 = r4.hasExtra(r1)
            if (r0 == 0) goto L_0x0485
            long r0 = X.C108975cc.A05(r4, r1)
            java.lang.Long r46 = java.lang.Long.valueOf(r0)
        L_0x00a6:
            r0 = 2131888741(0x7f120a65, float:1.9412126E38)
            r5.setTitle(r0)
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r5, r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            X.01n r6 = X.C72463Mc.A0S(r5, r1)
            X.C18070vi.A0X(r6)
            java.lang.Boolean r0 = r5.A03()
            r3 = 1
            boolean r0 = X.C18070vi.A18(r0, r9)
            if (r0 == 0) goto L_0x00ce
            X.4fI r0 = new X.4fI
            r0.<init>(r5, r2)
            r1.A0C = r0
        L_0x00ce:
            android.content.Intent r1 = r5.getIntent()
            if (r1 == 0) goto L_0x00e6
            java.lang.Boolean r0 = r5.A03()
            boolean r0 = X.C18070vi.A18(r0, r9)
            if (r0 == 0) goto L_0x0478
            java.lang.String r0 = "entry_point_qr_code"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x0478
        L_0x00e6:
            r1 = 2131892002(0x7f121722, float:1.941874E38)
        L_0x00e9:
            r6.A0M(r1)
            r6.A0W(r3)
            java.lang.String r8 = "native_contact_sync_to_device"
            if (r4 == 0) goto L_0x010e
            android.os.Bundle r3 = r4.getExtras()
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0104
            java.lang.String r0 = "contact_data_phone"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x0104
            r1 = r0
        L_0x0104:
            r5.A0h = r1
            r0 = 1
            long r0 = r4.getLongExtra(r8, r0)
            r5.A00 = r0
        L_0x010e:
            android.view.View r12 = r5.A00
            X.C18070vi.A0X(r12)
            X.1bI r1 = r5.A0b
            if (r1 != 0) goto L_0x011e
            java.lang.String r0 = "saveButtonViewStubHolder"
        L_0x0119:
            X.C18070vi.A11(r0)
        L_0x011c:
            r0 = 0
            throw r0
        L_0x011e:
            X.6or r0 = new X.6or
            r0.<init>(r5, r12, r1)
            r5.A0W = r0
            java.lang.String r21 = "contactFormSaveButtonController"
            X.6mY r14 = new X.6mY
            r14.<init>(r5, r12, r0)
            X.0ve r1 = r5.A0E
            X.C18070vi.A0W(r1)
            X.1KW r0 = r5.A0D
            X.C18070vi.A0W(r0)
            X.71l r20 = new X.71l
            r22 = r20
            r23 = r5
            r24 = r12
            r25 = r14
            r26 = r0
            r27 = r1
            r22.<init>(r23, r24, r25, r26, r27)
            X.733 r1 = r5.A0C
            if (r1 == 0) goto L_0x0474
            X.6pq r0 = new X.6pq
            r0.<init>(r5, r12, r1)
            r5.A08 = r0
            X.6dm r10 = r5.A07
            if (r10 == 0) goto L_0x0470
            X.1bI r6 = r5.A0e
            if (r6 != 0) goto L_0x015d
            java.lang.String r0 = "syncToPhoneSwitchViewStubHolder"
            goto L_0x0119
        L_0x015d:
            X.17x r3 = r5.A0G
            if (r3 == 0) goto L_0x046c
            X.00H r0 = r5.A0L
            if (r0 == 0) goto L_0x0468
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1dX r1 = (X.C30191dX) r1
            r0 = 3
            X.C18070vi.A0d(r1, r0)
            X.6uL r0 = new X.6uL
            r0.<init>(r1, r10, r3, r6)
            r5.A0X = r0
            java.lang.Boolean r0 = r5.A03()
            boolean r0 = X.C18070vi.A18(r0, r9)
            java.lang.String r19 = "contactFormSyncToDeviceController"
            if (r0 == 0) goto L_0x01a4
            X.6or r0 = r5.A0W
            if (r0 == 0) goto L_0x0463
            r5.A0Q(r12, r0, r2)
            X.6uL r0 = r5.A0X
            if (r0 == 0) goto L_0x045e
            r1 = 0
            X.79O r2 = new X.79O
            r2.<init>(r5, r1)
            X.1bI r1 = r0.A00
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x01a4
            android.view.View r0 = r1.A02()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setOnCheckedChangeListener(r2)
        L_0x01a4:
            X.10I r15 = r5.A05
            X.C18070vi.A0W(r15)
            X.00H r0 = r5.A0M
            if (r0 == 0) goto L_0x045a
            java.lang.Object r11 = X.C18070vi.A0E(r0)
            X.1OZ r11 = (X.AnonymousClass1OZ) r11
            X.1M9 r10 = r5.A05
            if (r10 == 0) goto L_0x0456
            X.00H r0 = r5.A0K
            if (r0 == 0) goto L_0x0452
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.1pj r6 = (X.C37551pj) r6
            X.31f r3 = r5.A0E
            if (r3 == 0) goto L_0x044e
            X.11E r2 = r5.A07
            X.C18070vi.A0W(r2)
            X.6pq r1 = r5.A08
            java.lang.String r18 = "contactFormContactOnWhatsAppController"
            if (r1 == 0) goto L_0x0449
            X.1pJ r0 = r5.A0D
            if (r0 == 0) goto L_0x0445
            X.7EL r13 = new X.7EL
            r22 = r13
            r24 = r6
            r25 = r2
            r26 = r10
            r27 = r1
            r28 = r0
            r29 = r3
            r30 = r11
            r31 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r5.A0T = r13
            X.1KB r0 = r5.A05
            r16 = r0
            X.10I r15 = r5.A05
            X.1K3 r11 = r5.A0H
            if (r11 == 0) goto L_0x0441
            java.lang.String r10 = r5.A0h
            X.11C r6 = r5.A08
            X.0vb r3 = r5.A00
            X.1LA r2 = r5.A02
            if (r2 == 0) goto L_0x043d
            java.lang.String r17 = "contactFormTaskManager"
            X.6pq r1 = r5.A08
            if (r1 == 0) goto L_0x0449
            X.5xr r0 = new X.5xr
            r27 = r5
            r24 = r12
            r25 = r2
            r26 = r16
            r28 = r13
            r29 = r1
            r30 = r14
            r31 = r6
            r32 = r3
            r33 = r11
            r34 = r15
            r35 = r10
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r5.A0V = r0
            java.lang.String r16 = "contactFormPhoneController"
            com.whatsapp.jid.PhoneUserJid r42 = r0.A0B()
            java.lang.Long r0 = r5.A0Q
            if (r0 == 0) goto L_0x02b4
            java.lang.Boolean r0 = r5.A03()
            boolean r0 = X.C18070vi.A18(r0, r9)
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = "contact_chat_jid"
            java.lang.String r1 = r4.getStringExtra(r0)
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ 11T -> 0x048c }
            X.1BI r42 = X.C22931Dv.A01(r1)     // Catch:{ 11T -> 0x048c }
            boolean r0 = r4.hasExtra(r8)
            if (r0 == 0) goto L_0x02e8
            long r0 = X.C108975cc.A06(r4, r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0256:
            X.10I r9 = r5.A05
            X.C18070vi.A0W(r9)
            X.1To r8 = r5.A04
            if (r8 == 0) goto L_0x0439
            X.1M9 r6 = r5.A05
            if (r6 == 0) goto L_0x0456
            X.00H r0 = r5.A0J
            if (r0 == 0) goto L_0x0435
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.1q1 r3 = (X.C37721q1) r3
            X.12E r2 = r5.A0F
            if (r2 == 0) goto L_0x0431
            if (r1 == 0) goto L_0x027f
            long r13 = r1.longValue()
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            r34 = 1
            if (r0 == 0) goto L_0x0281
        L_0x027f:
            r34 = 0
        L_0x0281:
            java.lang.Long r1 = r5.A0Q
            X.5xr r0 = r5.A0V
            if (r0 == 0) goto L_0x042c
            X.1KB r13 = r5.A05
            X.C18070vi.A0W(r13)
            X.0z4 r11 = r5.A0A
            X.C18070vi.A0W(r11)
            r10 = 3
            X.C18070vi.A0d(r3, r10)
            X.6oN r10 = new X.6oN
            r26 = r5
            r27 = r0
            r28 = r2
            r29 = r11
            r30 = r42
            r31 = r3
            r32 = r9
            r33 = r1
            r22 = r10
            r23 = r13
            r24 = r8
            r25 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r5.A0A = r10
        L_0x02b4:
            X.5xr r2 = r5.A0V
            if (r2 == 0) goto L_0x042c
            X.1KB r1 = r5.A05
            X.C18070vi.A0W(r1)
            r13 = r5
            X.6ik r0 = new X.6ik
            r9 = r0
            r10 = r5
            r11 = r12
            r12 = r1
            r14 = r20
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r5.A0U = r0
            X.0ve r13 = r5.A0E
            X.1KB r12 = r5.A05
            X.10I r11 = r5.A05
            X.00H r0 = r5.A0L
            if (r0 == 0) goto L_0x0468
            java.lang.Object r10 = r0.get()
            X.1dX r10 = (X.C30191dX) r10
            X.17x r9 = r5.A0G
            if (r9 == 0) goto L_0x046c
            X.1bI r8 = r5.A0c
            if (r8 != 0) goto L_0x02eb
            java.lang.String r0 = "saveToIconViewStubHolder"
            goto L_0x0119
        L_0x02e8:
            r1 = 0
            goto L_0x0256
        L_0x02eb:
            X.1bI r6 = r5.A0a
            if (r6 != 0) goto L_0x02f3
            java.lang.String r0 = "contactsStorageOptionsSelectorViewStubHolder"
            goto L_0x0119
        L_0x02f3:
            X.1pJ r3 = r5.A0D
            if (r3 == 0) goto L_0x0445
            X.00H r0 = r5.A0O
            if (r0 == 0) goto L_0x0428
            java.lang.Object r2 = r0.get()
            X.1UN r2 = (X.AnonymousClass1UN) r2
            X.0z4 r1 = r5.A0A
            X.6uL r0 = r5.A0X
            if (r0 == 0) goto L_0x045e
            boolean r35 = r0.A03()
            X.6oP r0 = new X.6oP
            r26 = r5
            r23 = r5
            r24 = r12
            r25 = r10
            r27 = r3
            r28 = r9
            r29 = r1
            r30 = r2
            r31 = r13
            r32 = r8
            r33 = r6
            r34 = r11
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r5.A09 = r0
            java.lang.String r0 = "extra_contact_phone_number"
            java.lang.String r48 = r4.getStringExtra(r0)
            X.6kq r8 = r5.A03
            if (r8 == 0) goto L_0x0424
            X.6uL r1 = r5.A0X
            if (r1 == 0) goto L_0x045e
            X.6pq r9 = r5.A08
            if (r9 == 0) goto L_0x0449
            X.5xr r0 = r5.A0V
            if (r0 == 0) goto L_0x042c
            r10 = r14
            r11 = r0
            r12 = r5
            r13 = r1
            X.6zB r36 = r8.A00(r9, r10, r11, r12, r13)
            X.0ve r0 = r5.A0E
            r25 = r0
            X.1KB r0 = r5.A05
            r24 = r0
            X.190 r0 = r5.A03
            r23 = r0
            X.10I r0 = r5.A05
            r22 = r0
            boolean r0 = r4.hasExtra(r7)
            if (r0 == 0) goto L_0x039e
            long r0 = X.C108975cc.A06(r4, r7)
            java.lang.Long r45 = java.lang.Long.valueOf(r0)
        L_0x0368:
            X.00H r0 = r5.A0J
            if (r0 == 0) goto L_0x0435
            java.lang.Object r9 = r0.get()
            X.1q1 r9 = (X.C37721q1) r9
            X.00H r0 = r5.A0L
            if (r0 == 0) goto L_0x0468
            java.lang.Object r8 = r0.get()
            X.1dX r8 = (X.C30191dX) r8
            X.17x r15 = r5.A0G
            if (r15 == 0) goto L_0x046c
            X.00H r0 = r5.A0N
            if (r0 == 0) goto L_0x0420
            java.lang.Object r7 = r0.get()
            X.6yv r7 = (X.C139486yv) r7
            X.5xr r14 = r5.A0V
            if (r14 == 0) goto L_0x042c
            X.6or r13 = r5.A0W
            if (r13 == 0) goto L_0x0463
            X.6uL r12 = r5.A0X
            if (r12 == 0) goto L_0x045e
            X.6oP r11 = r5.A09
            if (r11 != 0) goto L_0x03a1
            java.lang.String r0 = "contactFormContactStorageController"
            goto L_0x0119
        L_0x039e:
            r45 = 0
            goto L_0x0368
        L_0x03a1:
            X.6pq r10 = r5.A08
            if (r10 == 0) goto L_0x0449
            long r0 = r5.A00
            java.lang.Long r47 = java.lang.Long.valueOf(r0)
            X.7EL r6 = r5.A0T
            if (r6 != 0) goto L_0x03b4
            X.C18070vi.A11(r17)
            goto L_0x011c
        L_0x03b4:
            X.1M9 r3 = r5.A05
            if (r3 == 0) goto L_0x0456
            X.0z4 r0 = r5.A0A
            r18 = r0
            X.00H r0 = r5.A0O
            if (r0 == 0) goto L_0x0428
            java.lang.Object r2 = r0.get()
            X.1UN r2 = (X.AnonymousClass1UN) r2
            X.1Tl r1 = r5.A06
            if (r1 == 0) goto L_0x041c
            X.11E r0 = r5.A07
            r17 = r0
            X.70L r0 = new X.70L
            r26 = r3
            r27 = r1
            r28 = r7
            r29 = r6
            r30 = r10
            r31 = r11
            r32 = r20
            r33 = r14
            r34 = r13
            r35 = r5
            r37 = r12
            r38 = r15
            r39 = r18
            r40 = r2
            r41 = r25
            r43 = r9
            r44 = r22
            r21 = r0
            r22 = r23
            r23 = r24
            r24 = r17
            r25 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r5.A0B = r0
            X.5xr r3 = r5.A0V
            if (r3 == 0) goto L_0x042c
            X.6n8 r2 = new X.6n8
            r1 = r20
            r2.<init>(r5, r1, r3, r0)
            r5.A0S = r2
            android.os.Bundle r2 = r4.getExtras()
            X.5xr r1 = r5.A0V
            if (r1 == 0) goto L_0x042c
            r0 = r20
            X.AnonymousClass743.A06(r2, r0, r1)
            return
        L_0x041c:
            java.lang.String r0 = "contactsCreatedWithinWaManager"
            goto L_0x0119
        L_0x0420:
            java.lang.String r0 = "nativeContactDbHelper"
            goto L_0x0119
        L_0x0424:
            java.lang.String r0 = "contactFormSaveNativeContactControllerFactory"
            goto L_0x0119
        L_0x0428:
            java.lang.String r0 = "nativeContactGateKeeperLazy"
            goto L_0x0119
        L_0x042c:
            X.C18070vi.A11(r16)
            goto L_0x011c
        L_0x0431:
            java.lang.String r0 = "contactSyncMethods"
            goto L_0x0119
        L_0x0435:
            java.lang.String r0 = "addContactLogUtil"
            goto L_0x0119
        L_0x0439:
            java.lang.String r0 = "syncManager"
            goto L_0x0119
        L_0x043d:
            java.lang.String r0 = "countryPhoneInfo"
            goto L_0x0119
        L_0x0441:
            java.lang.String r0 = "countryUtils"
            goto L_0x0119
        L_0x0445:
            java.lang.String r0 = "nativeContactsLauncher"
            goto L_0x0119
        L_0x0449:
            X.C18070vi.A11(r18)
            goto L_0x011c
        L_0x044e:
            java.lang.String r0 = "contactQuerySync"
            goto L_0x0119
        L_0x0452:
            java.lang.String r0 = "blockListManager"
            goto L_0x0119
        L_0x0456:
            java.lang.String r0 = "contactManager"
            goto L_0x0119
        L_0x045a:
            java.lang.String r0 = "messageClient"
            goto L_0x0119
        L_0x045e:
            X.C18070vi.A11(r19)
            goto L_0x011c
        L_0x0463:
            X.C18070vi.A11(r21)
            goto L_0x011c
        L_0x0468:
            java.lang.String r0 = "contactAccessHelper"
            goto L_0x0119
        L_0x046c:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x0119
        L_0x0470:
            java.lang.String r0 = "contactsSharedPreferences"
            goto L_0x0119
        L_0x0474:
            java.lang.String r0 = "inviteContactUtils"
            goto L_0x0119
        L_0x0478:
            java.lang.String r0 = "contact_data_phone"
            boolean r0 = r1.hasExtra(r0)
            r1 = 2131888758(0x7f120a76, float:1.941216E38)
            if (r0 != 0) goto L_0x00e9
            goto L_0x00e6
        L_0x0485:
            r46 = 0
            goto L_0x00a6
        L_0x0489:
            r0 = 0
            goto L_0x0092
        L_0x048c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.ContactFormActivity.onCreate(android.os.Bundle):void");
    }

    public ContactFormActivity(int i) {
        this.A0i = false;
        AnonymousClass79Z.A00(this, 35);
    }

    public boolean BeF() {
        return isFinishing();
    }

    public void C4H(int i, Integer num) {
        if (!isFinishing()) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 9984) || C18070vi.A19(A03(), true)) {
                boolean A1W = AnonymousClass000.A1W(this.A0Q);
                AnonymousClass70L r2 = this.A0B;
                if (A1W) {
                    if (r2 != null) {
                        r2.A06(num, Long.valueOf(this.A00), i);
                    }
                    C18070vi.A11("contactFormSaveContactController");
                    throw null;
                }
                if (r2 != null) {
                    C133996pq r0 = this.A08;
                    if (r0 == null) {
                        C18070vi.A11("contactFormContactOnWhatsAppController");
                        throw null;
                    }
                    r2.A05(num, i, AnonymousClass000.A1W(r0.A00));
                }
                C18070vi.A11("contactFormSaveContactController");
                throw null;
            }
            if (C18070vi.A19(A03(), true)) {
                AnonymousClass70L r02 = this.A0B;
                if (r02 != null) {
                    r02.A04(i);
                    return;
                }
                C18070vi.A11("contactFormSaveContactController");
                throw null;
            }
            AnonymousClass757 A002 = AnonymousClass757.A00(this, 14);
            AnonymousClass757 A003 = AnonymousClass757.A00(this, 15);
            C73203Rj A004 = AnonymousClass4a6.A00(this);
            C108955ca.A1D(this, A004, 2131888767);
            C108975cc.A0n(this, A002, A004, 2131898766);
            C109005cf.A0J(this, A003, A004, 2131897145);
        }
    }

    public void C4I() {
        CMh();
    }

    public void C4L(Intent intent) {
        String str;
        boolean z = true;
        if (C18070vi.A18(A03(), true)) {
            AnonymousClass12E r1 = this.A0F;
            if (r1 != null) {
                r1.A0D(AnonymousClass00R.A0j);
                if (this.A0Q == null) {
                    C136756uL r0 = this.A0X;
                    if (r0 == null) {
                        str = "contactFormSyncToDeviceController";
                    } else {
                        r0.A00();
                    }
                }
            } else {
                str = "contactSyncMethods";
            }
            C18070vi.A11(str);
            throw null;
        }
        boolean z2 = false;
        if (!C18070vi.A18(A03(), true)) {
            if (!C18020vd.A05(C18040vf.A02, this.A0E, 9984)) {
                AnonymousClass00H r02 = this.A0J;
                if (r02 != null) {
                    C37721q1 r12 = (C37721q1) C18070vi.A0E(r02);
                    C133996pq r03 = this.A08;
                    if (r03 != null) {
                        if (r03.A00 == null) {
                            z = false;
                        }
                        C116505xr r04 = this.A0V;
                        if (r04 == null) {
                            str = "contactFormPhoneController";
                        } else {
                            r12.A05(r04.A0B(), z);
                            C72453Mb.A16(this, intent);
                            return;
                        }
                    }
                    C18070vi.A11("contactFormContactOnWhatsAppController");
                    throw null;
                }
                str = "addContactLogUtil";
                C18070vi.A11(str);
                throw null;
            }
        }
        boolean A1W = AnonymousClass000.A1W(this.A0Q);
        str = "contactFormSaveContactController";
        AnonymousClass70L r3 = this.A0B;
        if (A1W) {
            if (r3 != null) {
                r3.A06((Integer) null, Long.valueOf(this.A00), 1);
                C72453Mb.A16(this, intent);
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
        if (r3 != null) {
            C133996pq r05 = this.A08;
            if (r05 != null) {
                if (r05.A00 != null) {
                    z2 = true;
                }
                r3.A05((Integer) null, 1, z2);
                C72453Mb.A16(this, intent);
                return;
            }
            C18070vi.A11("contactFormContactOnWhatsAppController");
            throw null;
        }
        C18070vi.A11(str);
        throw null;
    }

    public /* bridge */ /* synthetic */ void CMp(Boolean bool) {
        AnonymousClass743.A03(this, new C1411974r(5), new C1412174t(0, this, bool.booleanValue()));
    }

    public void CMq() {
        AnonymousClass743.A01(this);
    }

    public /* bridge */ /* synthetic */ void CMr(Boolean bool) {
        AnonymousClass743.A04(this, new C1411974r(6), new C1412174t(1, this, bool.booleanValue()));
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass7EL r0 = this.A0T;
        if (r0 == null) {
            C18070vi.A11("contactFormTaskManager");
            throw null;
        } else {
            r0.A00();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            C132606n8 r0 = this.A0S;
            if (r0 == null) {
                C18070vi.A11("contactFormNavigationManager");
                throw null;
            } else if (r0.A00()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        String str;
        super.onResume();
        View view = this.A0R;
        if (view != null) {
            C133496or r1 = this.A0W;
            if (r1 == null) {
                str = "contactFormSaveButtonController";
                C18070vi.A11(str);
                throw null;
            }
            A0Q(view, r1, true);
        }
        C133246oP r12 = this.A09;
        if (r12 == null) {
            str = "contactFormContactStorageController";
        } else {
            C136756uL r0 = this.A0X;
            if (r0 == null) {
                str = "contactFormSyncToDeviceController";
            } else {
                r12.A00(r0.A03());
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void requestPermission() {
        AnonymousClass74O.A0A(this, 2131894324, 2131894328, 150, false);
    }

    public ContactFormActivity() {
        this(0);
        this.A0h = "";
        this.A00 = 1;
    }
}
