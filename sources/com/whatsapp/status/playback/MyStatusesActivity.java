package com.whatsapp.status.playback;

import X.A34;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02B;
import X.AnonymousClass02H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11N;
import X.AnonymousClass178;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1NM;
import X.AnonymousClass1TG;
import X.AnonymousClass1WR;
import X.AnonymousClass1WX;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Yv;
import X.AnonymousClass4Z9;
import X.AnonymousClass4a6;
import X.AnonymousClass4aU;
import X.AnonymousClass72B;
import X.AnonymousClass74O;
import X.AnonymousClass758;
import X.AnonymousClass7AE;
import X.AnonymousClass7AS;
import X.AnonymousClass7FH;
import X.AnonymousClass7NF;
import X.AnonymousClass7PK;
import X.AnonymousClass7RH;
import X.AnonymousClass81F;
import X.AnonymousClass86D;
import X.C000200d;
import X.C010105w;
import X.C03610Iy;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C109005cf;
import X.C110235f9;
import X.C121716Lf;
import X.C121876Lv;
import X.C122646Re;
import X.C124636Zc;
import X.C124646Zd;
import X.C126446ck;
import X.C126466cm;
import X.C126476cn;
import X.C127846f1;
import X.C132476ms;
import X.C132886no;
import X.C137106uv;
import X.C139586z5;
import X.C1411674o;
import X.C1423279a;
import X.C143707Em;
import X.C146377Ow;
import X.C153697pw;
import X.C1604188j;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18180vt;
import X.C19620yd;
import X.C19880zA;
import X.C19890zB;
import X.C217517g;
import X.C219217x;
import X.C222219b;
import X.C22971Dz;
import X.C23291Fl;
import X.C23391Fw;
import X.C23401Fx;
import X.C23501Gn;
import X.C24641Lc;
import X.C24661Le;
import X.C24681Lg;
import X.C24921Me;
import X.C25161Nd;
import X.C25931Qe;
import X.C27251Vi;
import X.C28281Zt;
import X.C29351c6;
import X.C30361do;
import X.C32011gU;
import X.C32021gV;
import X.C32741hg;
import X.C33251iW;
import X.C34531kd;
import X.C36401np;
import X.C41701wv;
import X.C41731wy;
import X.C56092gt;
import X.C56622hl;
import X.C57032iQ;
import X.C58572ku;
import X.C692236j;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C74803cp;
import X.C83954Hh;
import X.C90594eK;
import X.CY4;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class MyStatusesActivity extends C74803cp implements C23291Fl {
    public AnonymousClass02B A00;
    public C03610Iy A01;
    public C19880zA A02;
    public C19880zA A03;
    public C19880zA A04;
    public C19880zA A05;
    public C124636Zc A06;
    public C124646Zd A07;
    public C56622hl A08;
    public C34531kd A09;
    public C33251iW A0A;
    public AnonymousClass1M9 A0B;
    public C24921Me A0C;
    public AnonymousClass1NM A0D;
    public AnonymousClass11N A0E;
    public C219217x A0F;
    public C24681Lg A0G;
    public AnonymousClass1WX A0H;
    public AnonymousClass1TG A0I;
    public C24661Le A0J;
    public AnonymousClass18K A0K;
    public C25931Qe A0L;
    public AnonymousClass1LU A0M;
    public C32011gU A0N;
    public C18010vc A0O;
    public AnonymousClass206 A0P;
    public C90594eK A0Q;
    public C24641Lc A0R;
    public AnonymousClass7AE A0S;
    public C139586z5 A0T;
    public C32741hg A0U;
    public C126446ck A0V;
    public C110235f9 A0W;
    public C36401np A0X;
    public C32021gV A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public boolean A0s;
    public AnonymousClass02H A0t;
    public C121716Lf A0u;
    public AnonymousClass7NF A0v;
    public boolean A0w;
    public final Handler A0x;
    public final Runnable A0y;
    public final HashMap A0z;
    public final HashMap A10;
    public final List A11;
    public final Map A12;
    public final Set A13;
    public final C18100vl A14;
    public final C23501Gn A15;
    public final AnonymousClass1WR A16;
    public final AnonymousClass86D A17;
    public final C1604188j A18;
    public final AnonymousClass00H A19;
    public final Runnable A1A;

    public static final void A0y(AnonymousClass206 r10, MyStatusesActivity myStatusesActivity, boolean z) {
        String str;
        MyStatusesActivity myStatusesActivity2 = myStatusesActivity;
        HashMap hashMap = myStatusesActivity.A10;
        AnonymousClass206 r11 = r10;
        AnonymousClass205 r4 = r10.A0v;
        A34 a34 = (A34) hashMap.remove(r4);
        if (a34 != null) {
            if (z) {
                a34.A0B(true);
            } else {
                return;
            }
        }
        if (!myStatusesActivity2.isFinishing() && ((C23391Fw) myStatusesActivity2.getLifecycle()).A02 != C23401Fx.DESTROYED) {
            AnonymousClass1WX r8 = myStatusesActivity2.A0H;
            if (r8 != null) {
                C25931Qe r102 = myStatusesActivity2.A0L;
                if (r102 != null) {
                    C18030ve r9 = myStatusesActivity2.A0E;
                    C18070vi.A0W(r9);
                    C121876Lv r6 = new C121876Lv(myStatusesActivity2, r8, r9, r102, r11, new C127846f1(r11, myStatusesActivity2));
                    C18070vi.A0W(r4);
                    hashMap.put(r4, r6);
                    C17890vO.A0u(r6, myStatusesActivity2.A05);
                    return;
                }
                str = "lazyManager";
            } else {
                str = "receiptManager";
            }
            C18070vi.A11(str);
            throw null;
        } else if (a34 != null) {
            a34.A0B(true);
        }
    }

    public static final void A11(MyStatusesActivity myStatusesActivity) {
        String str;
        MyStatusesActivity myStatusesActivity2 = myStatusesActivity;
        C18030ve r1 = myStatusesActivity.A0E;
        C18040vf r4 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r4, r1, 9977);
        int i = 3;
        if (A052) {
            i = 15;
        }
        AnonymousClass00H r0 = myStatusesActivity.A0l;
        if (r0 != null) {
            if (C108985cd.A1Z(r0)) {
                myStatusesActivity.A4c().A06(i);
            }
            AnonymousClass00H r02 = myStatusesActivity.A0b;
            if (r02 != null) {
                C27251Vi r5 = (C27251Vi) r02.get();
                C23501Gn r3 = myStatusesActivity.A15;
                C18070vi.A0d(r3, 3);
                if (AnonymousClass74O.A0J(myStatusesActivity, r5.A00, 33) && C27251Vi.A00(myStatusesActivity, myStatusesActivity, r5, r3, 3659)) {
                    C24641Lc r03 = myStatusesActivity.A0R;
                    if (r03 == null) {
                        str = "statusConfig";
                    } else if (C18020vd.A05(r4, r03.A01, 11868)) {
                        int i2 = 4;
                        if (A052) {
                            i2 = 20;
                        }
                        AnonymousClass00H r04 = myStatusesActivity.A0k;
                        if (r04 != null) {
                            ((C132476ms) r04.get()).A00(myStatusesActivity2, i2, 24, i, 21);
                            return;
                        }
                        str = "statusGalleryFirstActions";
                    } else {
                        int i3 = 5;
                        int i4 = 4;
                        if (C18020vd.A05(r4, myStatusesActivity.A0E, 9977)) {
                            i3 = 21;
                            i4 = 20;
                        }
                        AnonymousClass00H r05 = myStatusesActivity.A0j;
                        if (r05 != null) {
                            myStatusesActivity2.A01.A0A(myStatusesActivity2, ((C58572ku) r05.get()).A01(myStatusesActivity2, i4, i3, 24, 9));
                            return;
                        }
                        str = "statusComposerActions";
                    }
                } else {
                    return;
                }
            } else {
                str = "cameraPermissionsHelperLazy";
            }
        } else {
            str = "statusLoggingConfig";
        }
        C18070vi.A11(str);
        throw null;
    }

    public int A31() {
        return 78318969;
    }

    public boolean A4X() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r4 == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A4d(android.view.View r7, X.AnonymousClass206 r8) {
        /*
            r6 = this;
            r1 = 0
            X.C18070vi.A0d(r8, r1)
            java.util.Map r5 = r6.A12
            X.205 r3 = r8.A0v
            boolean r0 = r5.containsKey(r3)
            if (r0 == 0) goto L_0x0069
            r5.remove(r3)
            r7.setBackgroundResource(r1)
        L_0x0014:
            boolean r0 = r5.isEmpty()
            X.02B r4 = r6.A00
            if (r0 == 0) goto L_0x0039
            if (r4 == 0) goto L_0x0021
            r4.A05()
        L_0x0021:
            java.util.Set r0 = r6.A13
            X.C18070vi.A0W(r3)
            r0.add(r3)
            android.os.Handler r3 = r6.A0x
            java.lang.Runnable r2 = r6.A0y
            r3.removeCallbacks(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            A0z(r6)
            return
        L_0x0039:
            if (r4 != 0) goto L_0x0046
            X.02H r0 = r6.A0t
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "actionModeCallback"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0046:
            X.0vb r0 = r6.A00
            java.text.NumberFormat r2 = r0.A0L()
            int r0 = r5.size()
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            r4.A0B(r0)
            goto L_0x0061
        L_0x0059:
            X.02B r4 = r6.COJ(r0)
            r6.A00 = r4
            if (r4 != 0) goto L_0x0046
        L_0x0061:
            X.02B r0 = r6.A00
            if (r0 == 0) goto L_0x0021
            r0.A06()
            goto L_0x0021
        L_0x0069:
            X.C18070vi.A0W(r3)
            r5.put(r3, r8)
            android.content.Context r2 = r7.getContext()
            r1 = 2130970064(0x7f0405d0, float:1.7548828E38)
            r0 = 2131101205(0x7f060615, float:1.7814813E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r7.setBackgroundResource(r0)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MyStatusesActivity.A4d(android.view.View, X.206):void");
    }

    public final void A4e(Integer num, Integer num2, Integer num3, List list) {
        int i;
        boolean A032;
        C56092gt r0;
        this.A0s = AnonymousClass000.A1Z(num3, AnonymousClass00R.A00);
        int intValue = num3.intValue();
        if (intValue == 0) {
            C132886no r5 = (C132886no) this.A14.getValue();
            int A002 = AnonymousClass72B.A00(r5.A03);
            if (A002 == 1 || A002 == 2) {
                if (list.size() > 15) {
                    i = 27;
                } else {
                    AnonymousClass00H r4 = r5.A05;
                    C57032iQ r3 = (C57032iQ) C108945cZ.A12(r4).A08.get();
                    ArrayList A0D2 = C29351c6.A0D(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C108995ce.A1Q(A0D2, it);
                    }
                    Iterator it2 = A0D2.iterator();
                    while (it2.hasNext()) {
                        if (!r3.A00(C17890vO.A07(it2))) {
                            i = 26;
                        }
                    }
                    r5.A01.A00.A12.clear();
                    C108945cZ.A12(r4).A02(this, num, "my_status_activity", list);
                    return;
                }
                AnonymousClass4Yv.A01(this, i);
                return;
            } else if (A002 == 3) {
                r5.A00(this, C122646Re.FACEBOOK, num2, list);
                return;
            } else if (A002 == 0) {
                MyStatusesActivity myStatusesActivity = r5.A01.A00;
                AnonymousClass00H r02 = myStatusesActivity.A0n;
                if (r02 != null) {
                    A032 = ((C41701wv) r02.get()).A03(myStatusesActivity, (Fragment) null, "my_status_activity", list);
                }
                C18070vi.A11("statusSharingManager");
                throw null;
            } else {
                throw AnonymousClass3MW.A14();
            }
        } else if (intValue != 1) {
            AnonymousClass00H r03 = this.A0n;
            if (r03 != null) {
                A032 = ((C41701wv) r03.get()).A03(this, (Fragment) null, "my_status_activity", list);
            }
            C18070vi.A11("statusSharingManager");
            throw null;
        } else {
            C132886no r2 = (C132886no) this.A14.getValue();
            int A003 = AnonymousClass72B.A00(r2.A03);
            if (A003 == 2 || A003 == 3) {
                r2.A00(this, C122646Re.INSTAGRAM, num2, list);
                return;
            }
            return;
        }
        if (!A032) {
            AnonymousClass00H r04 = this.A0n;
            if (r04 != null) {
                if (!((C41701wv) r04.get()).A02.A0G() && (r0 = A4c().A00) != null) {
                    r0.A01 = 4;
                    return;
                }
                return;
            }
            C18070vi.A11("statusSharingManager");
            throw null;
        }
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0t2 = C108965cb.A0t(view);
        A0t2.add(findViewById(2131430767));
        A0t2.add(findViewById(2131430769));
        AnonymousClass11C r5 = this.A08;
        C18070vi.A0W(r5);
        C90594eK r2 = new C90594eK(view, (AnonymousClass1F9) this, r5, (List) A0t2, i, i2, z);
        r2.A07(new AnonymousClass7RH((Object) this, 23));
        this.A0Q = r2;
        return r2;
    }

    public void C81(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C81(r2);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
    }

    public void C82(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C82(r2);
        C72473Md.A0o(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6685)) {
            getMenuInflater().inflate(2131820583, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A0E, 6685) || menuItem.getItemId() != 2131432509) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass1L9 r1 = this.A01;
        if (this.A0M != null) {
            r1.A0A(this, AnonymousClass1LU.A06(this));
            return true;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r3 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRestoreInstanceState(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            super.onRestoreInstanceState(r6)
            java.util.ArrayList r0 = X.AnonymousClass4aU.A04(r6)
            if (r0 == 0) goto L_0x0050
            java.util.Map r4 = r5.A12
            r4.clear()
            java.util.Iterator r2 = r0.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            X.205 r1 = (X.AnonymousClass205) r1
            X.C18070vi.A0b(r1)
            X.00H r0 = r5.A0g
            if (r0 == 0) goto L_0x0076
            X.206 r0 = X.AnonymousClass1W2.A01(r1, r0)
            if (r0 == 0) goto L_0x0016
            r4.put(r1, r0)
            goto L_0x0016
        L_0x0033:
            X.02B r3 = r5.A00
            if (r3 != 0) goto L_0x0063
            X.02H r0 = r5.A0t
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "actionModeCallback"
            goto L_0x0078
        L_0x003e:
            X.02B r3 = r5.COJ(r0)
            r5.A00 = r3
            if (r3 != 0) goto L_0x0063
        L_0x0046:
            X.02B r0 = r5.A00
            if (r0 == 0) goto L_0x004d
            r0.A06()
        L_0x004d:
            A0z(r5)
        L_0x0050:
            java.lang.String r0 = ""
            X.205 r1 = X.AnonymousClass4aU.A03(r6, r0)
            if (r1 == 0) goto L_0x0062
            X.00H r0 = r5.A0g
            if (r0 == 0) goto L_0x0076
            X.206 r0 = X.AnonymousClass1W2.A01(r1, r0)
            r5.A0P = r0
        L_0x0062:
            return
        L_0x0063:
            X.0vb r0 = r5.A00
            java.text.NumberFormat r2 = r0.A0L()
            int r0 = r4.size()
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            r3.A0B(r0)
            goto L_0x0046
        L_0x0076:
            java.lang.String r0 = "fMessageDatabase"
        L_0x0078:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MyStatusesActivity.onRestoreInstanceState(android.os.Bundle):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        Map map = this.A12;
        if (!map.isEmpty()) {
            ArrayList A132 = AnonymousClass000.A13();
            Iterator A0l2 = C17890vO.A0l(map);
            while (A0l2.hasNext()) {
                A132.add(AnonymousClass3MZ.A10(A0l2));
            }
            AnonymousClass4aU.A0C(bundle, A132);
        }
        AnonymousClass206 r0 = this.A0P;
        if (r0 != null) {
            AnonymousClass4aU.A0A(bundle, r0.A0v);
        }
    }

    public static final void A0z(MyStatusesActivity myStatusesActivity) {
        C110235f9 r0 = myStatusesActivity.A0W;
        if (r0 == null) {
            C18070vi.A11("myStatusesAdapter");
            throw null;
        } else {
            r0.notifyDataSetChanged();
        }
    }

    public static final void A10(MyStatusesActivity myStatusesActivity) {
        String str;
        C17890vO.A0t(myStatusesActivity.A0u);
        AnonymousClass1TG r3 = myStatusesActivity.A0I;
        if (r3 != null) {
            AnonymousClass00H r0 = myStatusesActivity.A0a;
            if (r0 != null) {
                C121716Lf r1 = new C121716Lf(myStatusesActivity, r3, (CY4) C18070vi.A0E(r0), new C126476cn(myStatusesActivity));
                myStatusesActivity.A0u = r1;
                C17890vO.A0u(r1, myStatusesActivity.A05);
                return;
            }
            str = "audioDataMessageStore";
        } else {
            str = "statusMessageStore";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A12(MyStatusesActivity myStatusesActivity) {
        long j;
        AnonymousClass1KB r0 = myStatusesActivity.A05;
        Runnable runnable = myStatusesActivity.A1A;
        r0.A0I(runnable);
        C110235f9 r02 = myStatusesActivity.A0W;
        if (r02 != null) {
            if (!r02.isEmpty()) {
                C110235f9 r1 = myStatusesActivity.A0W;
                if (r1 != null) {
                    if (r1.A00.isEmpty()) {
                        j = 0;
                    } else {
                        j = ((AnonymousClass206) C108955ca.A0p(r1.A00)).A0I;
                    }
                    C108995ce.A1B(myStatusesActivity.A05, runnable, j);
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("myStatusesAdapter");
        throw null;
    }

    public void A2y() {
        if (!this.A0w) {
            this.A0w = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            C137106uv.A00(A0K2, this);
            this.A0Z = C000200d.A00(r2.A03);
            this.A0a = C000200d.A00(A0A2.ADW);
            this.A0b = C000200d.A00(r2.A0q);
            this.A0B = AnonymousClass10E.A4z(A0A2);
            this.A0c = C000200d.A00(A0A2.AJE);
            this.A0d = C000200d.A00(A0A2.AJF);
            this.A0e = C000200d.A00(r2.A1F);
            this.A0f = C000200d.A00(A0A2.A34);
            this.A08 = (C56622hl) r2.AAM.get();
            C19890zB r3 = C19890zB.A00;
            this.A02 = r3;
            this.A0g = AnonymousClass3MX.A12(A0A2);
            this.A0L = (C25931Qe) A0A2.A3z.get();
            this.A0X = AnonymousClass3MY.A0e(r2);
            this.A0N = AnonymousClass3MY.A0d(A0A2);
            this.A0D = (AnonymousClass1NM) A0A2.A6D.get();
            this.A0G = AnonymousClass3MZ.A0o(A0A2);
            this.A0Y = C108955ca.A0b(A0A2);
            this.A06 = (C124636Zc) A0K2.A3X.get();
            this.A07 = (C124646Zd) A0K2.A3Y.get();
            this.A0h = C000200d.A00(A0K2.A4x);
            this.A0i = AnonymousClass3MX.A11(A0A2);
            this.A0H = (AnonymousClass1WX) A0A2.A9N.get();
            this.A09 = AnonymousClass3MZ.A0R(A0A2);
            this.A0O = AnonymousClass3Ma.A0r(A0A2);
            this.A03 = r3;
            this.A04 = r3;
            this.A05 = r3;
            this.A0j = C000200d.A00(r2.A4f);
            this.A0R = C108965cb.A0X(A0A2);
            this.A0k = C000200d.A00(r2.A4j);
            this.A0l = C000200d.A00(A0A2.AAD);
            this.A0I = (AnonymousClass1TG) A0A2.AAF.get();
            this.A0m = C000200d.A00(A0A2.AAH);
            this.A0n = C000200d.A00(A0A2.AAI);
            this.A0J = C108955ca.A0M(A0A2);
            this.A0U = C108965cb.A0Z(A0A2);
            this.A0E = (AnonymousClass11N) A0A2.A96.get();
            this.A0A = AnonymousClass3MZ.A0U(A0A2);
            this.A0C = AnonymousClass3MZ.A0g(A0A2);
            this.A0M = AnonymousClass3MY.A0Z(A0A2);
            this.A0F = AnonymousClass3Ma.A0b(A0A2);
            this.A0K = AnonymousClass3Ma.A0g(A0A2);
            this.A0o = C000200d.A00(A0A2.Ane);
            this.A0p = C000200d.A00(r2.A5I);
            this.A0q = C000200d.A00(A0A2.AC9);
            this.A0r = C000200d.A00(A0A2.Ans);
        }
    }

    public final C32741hg A4c() {
        C32741hg r0 = this.A0U;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusesStatsManager");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x021c, code lost:
        if (r1 == 2) goto L_0x021e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            java.lang.String r0 = "myStatusesActivity/onCreate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r28
            android.view.Window r1 = r7.getWindow()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)
            r8 = r29
            super.onCreate(r8)
            X.0ve r1 = r7.A0E
            X.0vf r9 = X.C18040vf.A01
            r0 = 1875(0x753, float:2.627E-42)
            boolean r27 = X.C18020vd.A05(r9, r1, r0)
            r0 = 2131892379(0x7f12189b, float:1.9419505E38)
            r7.setTitle(r0)
            r7.A3f()
            X.01n r0 = X.AnonymousClass3MY.A0J(r7)
            r2 = 1
            r0.A0W(r2)
            r0 = 2131626139(0x7f0e089b, float:1.8879506E38)
            r7.setContentView((int) r0)
            r0 = 2131434744(0x7f0b1cf8, float:1.849131E38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 != 0) goto L_0x0043
            r7.finish()
        L_0x0042:
            return
        L_0x0043:
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
            android.view.ViewGroup r0 = r7.A01
            if (r0 == 0) goto L_0x004f
            r0.setFitsSystemWindows(r2)
        L_0x004f:
            X.1KB r4 = r7.A05
            X.C18070vi.A0W(r4)
            X.10I r3 = r7.A05
            X.C18070vi.A0W(r3)
            X.1Le r2 = r7.A0J
            if (r2 == 0) goto L_0x031d
            X.1TG r1 = r7.A0I
            if (r1 == 0) goto L_0x0319
            X.7AE r0 = new X.7AE
            r14 = r2
            r15 = r3
            r10 = r0
            r11 = r7
            r12 = r4
            r13 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            r7.A0S = r0
            X.2hl r1 = r7.A08
            if (r1 == 0) goto L_0x0315
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r6 = 0
            X.6z5 r0 = r1.A00(r0, r6)
            r7.A0T = r0
            X.0ve r10 = r7.A0E
            X.1KW r4 = r7.A0D
            X.0vb r3 = r7.A00
            X.6Zd r0 = r7.A07
            if (r0 == 0) goto L_0x0311
            X.1K2 r0 = r0.A00
            X.1K1 r2 = r0.A00
            X.00S r0 = r2.A2M
            java.lang.Object r1 = r0.get()
            X.2hW r1 = (X.C56472hW) r1
            X.00S r0 = r2.A4x
            java.lang.Object r0 = r0.get()
            X.3vp r0 = (X.C79663vp) r0
            X.3vT r2 = new X.3vT
            r2.<init>(r1, r7, r0)
            X.4lk r12 = new X.4lk
            r12.<init>()
            X.00H r0 = r7.A0h
            if (r0 == 0) goto L_0x030d
            java.lang.Object r1 = r0.get()
            X.3vp r1 = (X.C79663vp) r1
            r5 = 6
            X.3vg r0 = new X.3vg
            r11 = r0
            r13 = r3
            r14 = r4
            r15 = r10
            r16 = r7
            r17 = r2
            r18 = r1
            r11.<init>((X.C95134lk) r12, (X.C18000vb) r13, (X.AnonymousClass1KW) r14, (X.C18030ve) r15, (com.whatsapp.status.playback.MyStatusesActivity) r16, (X.C79463vT) r17, (X.C79663vp) r18)
            r7.A0t = r0
            X.6ck r0 = new X.6ck
            r0.<init>(r7)
            r7.A0V = r0
            X.7NF r0 = new X.7NF
            r0.<init>(r7)
            r7.A0v = r0
            X.0ve r0 = r7.A0E
            r17 = r0
            X.C18070vi.A0W(r17)
            java.util.Map r0 = r7.A12
            r16 = r0
            X.0vl r0 = r7.A14
            java.lang.Object r14 = r0.getValue()
            X.6no r14 = (X.C132886no) r14
            X.1KW r0 = r7.A0D
            r18 = r0
            X.C18070vi.A0W(r18)
            X.7NF r13 = r7.A0v
            if (r13 != 0) goto L_0x00f2
            java.lang.String r0 = "statusThumbViewer"
        L_0x00ed:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00f2:
            X.0z4 r15 = r7.A0A
            X.C18070vi.A0W(r15)
            X.11P r12 = r7.A05
            X.C18070vi.A0W(r12)
            X.11C r11 = r7.A08
            X.C18070vi.A0W(r11)
            X.1gV r10 = r7.A0Y
            if (r10 == 0) goto L_0x0309
            X.1gU r4 = r7.A0N
            if (r4 == 0) goto L_0x0305
            X.0vb r3 = r7.A00
            X.C18070vi.A0W(r3)
            X.0vc r2 = r7.A0O
            if (r2 == 0) goto L_0x0301
            X.6cl r1 = new X.6cl
            r1.<init>(r7)
            X.5f9 r0 = new X.5f9
            r19 = r17
            r20 = r4
            r21 = r2
            r22 = r14
            r23 = r1
            r24 = r13
            r25 = r10
            r26 = r16
            r16 = r15
            r17 = r3
            r13 = r7
            r14 = r11
            r15 = r12
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7.A0W = r0
            android.widget.ListView r3 = r7.getListView()
            X.C18070vi.A0X(r3)
            r3.setFastScrollEnabled(r6)
            X.0ve r1 = r7.A0E
            r0 = 7724(0x1e2c, float:1.0824E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r2, r1, r0)
            android.view.LayoutInflater r1 = r7.getLayoutInflater()
            r0 = 2131625153(0x7f0e04c1, float:1.8877506E38)
            if (r4 == 0) goto L_0x0156
            r0 = 2131625154(0x7f0e04c2, float:1.8877508E38)
        L_0x0156:
            android.view.View r4 = X.C108955ca.A0G(r1, r3, r0, r6)
            r1 = 0
            r3.addFooterView(r4, r1, r6)
            r0 = 2131430237(0x7f0b0b5d, float:1.848217E38)
            com.whatsapp.WaTextView r10 = X.AnonymousClass3Ma.A0N(r4, r0)
            X.1np r13 = r7.A0X
            if (r13 == 0) goto L_0x0321
            r12 = 2131896338(0x7f122812, float:1.9427534E38)
            java.lang.Object[] r11 = X.AnonymousClass3MW.A1b()
            java.lang.String r4 = "%s"
            r11[r6] = r4
            r0 = 24
            X.AnonymousClass000.A1M(r11, r0)
            java.lang.String r16 = r7.getString(r12, r11)
            r11 = 2130968627(0x7f040033, float:1.7545913E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r18 = X.AnonymousClass1YL.A00(r7, r11, r0)
            r11 = 22
            X.7RH r0 = new X.7RH
            r0.<init>((java.lang.Object) r7, (int) r11)
            r14 = r7
            r15 = r0
            r17 = r4
            android.text.SpannableStringBuilder r0 = r13.A06(r14, r15, r16, r17, r18)
            r10.setText(r0)
            X.11C r0 = r7.A08
            X.AnonymousClass3Ma.A1K(r10, r0)
            X.0ve r0 = r7.A0E
            X.AnonymousClass3Ma.A1I(r10, r0)
            X.5f9 r0 = r7.A0W
            if (r0 != 0) goto L_0x01ad
            java.lang.String r0 = "myStatusesAdapter"
            X.C18070vi.A11(r0)
            throw r1
        L_0x01ad:
            r3.setAdapter(r0)
            X.11P r1 = r7.A05
            r11 = 1
            X.6L7 r0 = new X.6L7
            r0.<init>((X.AnonymousClass11P) r1, (com.whatsapp.status.playback.MyStatusesActivity) r7)
            r3.setOnItemClickListener(r0)
            r1 = 3
            X.79M r0 = new X.79M
            r0.<init>(r7, r1)
            r3.setOnItemLongClickListener(r0)
            r0 = 16908292(0x1020004, float:2.387724E-38)
            android.widget.TextView r10 = X.AnonymousClass3MX.A0L(r7, r0)
            if (r10 == 0) goto L_0x01ec
            android.content.Context r1 = r10.getContext()
            r0 = 2131232140(0x7f08058c, float:1.808038E38)
            android.graphics.drawable.Drawable r3 = X.C24261Jm.A00(r1, r0)
            if (r3 == 0) goto L_0x0042
            r0 = 2131898527(0x7f12309f, float:1.9431974E38)
            java.lang.String r1 = r7.getString(r0)
            android.text.TextPaint r0 = r10.getPaint()
            android.text.SpannableStringBuilder r0 = X.C72813Np.A02(r0, r3, r1, r4)
            r10.setText(r0)
        L_0x01ec:
            r0 = 2131430767(0x7f0b0d6f, float:1.8483244E38)
            android.widget.ImageView r3 = X.AnonymousClass3MX.A0I(r7, r0)
            if (r3 == 0) goto L_0x0240
            r0 = 2131430769(0x7f0b0d71, float:1.8483248E38)
            android.widget.ImageView r13 = X.AnonymousClass3MX.A0I(r7, r0)
            if (r13 == 0) goto L_0x0240
            r0 = 5
            X.AnonymousClass6LG.A00(r3, r7, r0)
            X.1Lc r0 = r7.A0R
            if (r0 == 0) goto L_0x02fd
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x021e
            X.1Lc r0 = r7.A0R
            if (r0 == 0) goto L_0x02fd
            X.0ve r1 = r0.A01
            r0 = 12557(0x310d, float:1.7596E-41)
            int r1 = X.C18020vd.A00(r2, r1, r0)
            r0 = 2
            r2 = 2131232195(0x7f0805c3, float:1.8080492E38)
            if (r1 != r0) goto L_0x0221
        L_0x021e:
            r2 = 2131233295(0x7f080a0f, float:1.8082723E38)
        L_0x0221:
            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A03(r7, r1, r0, r2)
            X.C18070vi.A0X(r0)
            r3.setImageDrawable(r0)
            X.1Lc r0 = r7.A0R
            if (r0 == 0) goto L_0x02fd
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x02b5
            r0 = 8
            r13.setVisibility(r0)
        L_0x0240:
            r0 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.View r0 = X.C110885hR.A0A(r7, r0)
            r0.setVisibility(r6)
            A10(r7)
            X.1Lg r1 = r7.A0G
            if (r1 == 0) goto L_0x02f5
            X.1WR r0 = r7.A16
            r1.registerObserver(r0)
            X.00H r0 = r7.A0o
            if (r0 == 0) goto L_0x02f1
            X.10T r1 = X.C17880vN.A0V(r0)
            X.88j r0 = r7.A18
            r1.registerObserver(r0)
            X.00H r0 = r7.A0d
            if (r0 == 0) goto L_0x02ed
            X.10T r1 = X.C17880vN.A0V(r0)
            X.86D r0 = r7.A17
            r1.registerObserver(r0)
            X.00H r0 = r7.A19
            java.lang.Object r0 = r0.get()
            X.178 r0 = (X.AnonymousClass178) r0
            r0.A01(r7)
            X.00H r0 = r7.A0l
            if (r0 == 0) goto L_0x02e9
            boolean r0 = X.C108985cd.A1Z(r0)
            if (r0 == 0) goto L_0x0292
            if (r29 == 0) goto L_0x0292
            X.1hg r1 = r7.A4c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.A0E(r0)
        L_0x0292:
            android.view.View r1 = r7.A00
            X.1KB r0 = r7.A05
            r7.A39(r1, r0)
            X.00H r0 = r7.A0m
            if (r0 == 0) goto L_0x02e5
            java.lang.Object r1 = r0.get()
            X.COe r1 = (X.C24886COe) r1
            X.11P r0 = r7.A05
            long r2 = X.AnonymousClass11P.A01(r0)
            X.0vl r0 = r1.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "mystatus_visit_last_timestamp"
            X.C17880vN.A1D(r1, r0, r2)
            return
        L_0x02b5:
            X.AnonymousClass6LG.A00(r13, r7, r5)
            X.0ve r1 = r7.A0E
            r0 = 1874(0x752, float:2.626E-42)
            boolean r0 = X.C18020vd.A05(r9, r1, r0)
            if (r0 == 0) goto L_0x0240
            X.1KB r3 = r7.A05
            X.C18070vi.A0W(r3)
            X.10I r2 = r7.A05
            X.C18070vi.A0W(r2)
            X.11N r1 = r7.A0E
            if (r1 == 0) goto L_0x02f9
            X.0z4 r0 = r7.A0A
            X.C18070vi.A0W(r0)
            X.1u7 r12 = new X.1u7
            r17 = r2
            r14 = r3
            r15 = r1
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r12.A00()
            goto L_0x0240
        L_0x02e5:
            java.lang.String r0 = "statusSharedPreferences"
            goto L_0x00ed
        L_0x02e9:
            java.lang.String r0 = "statusLoggingConfig"
            goto L_0x00ed
        L_0x02ed:
            java.lang.String r0 = "crosspostEventObservers"
            goto L_0x00ed
        L_0x02f1:
            java.lang.String r0 = "xFamilyCrosspostEventObservers"
            goto L_0x00ed
        L_0x02f5:
            java.lang.String r0 = "messageObservers"
            goto L_0x00ed
        L_0x02f9:
            java.lang.String r0 = "systemTime"
            goto L_0x00ed
        L_0x02fd:
            java.lang.String r0 = "statusConfig"
            goto L_0x00ed
        L_0x0301:
            java.lang.String r0 = "sharedPreferencesFactory"
            goto L_0x00ed
        L_0x0305:
            java.lang.String r0 = "linkifyWeb"
            goto L_0x00ed
        L_0x0309:
            java.lang.String r0 = "messageThumbCache"
            goto L_0x00ed
        L_0x030d:
            java.lang.String r0 = "myStatusMessageSelectionActionRepository"
            goto L_0x00ed
        L_0x0311:
            java.lang.String r0 = "myStatusMessageSelectionActionExecutorFactory"
            goto L_0x00ed
        L_0x0315:
            java.lang.String r0 = "crosspostingViewModelFactory"
            goto L_0x00ed
        L_0x0319:
            java.lang.String r0 = "statusMessageStore"
            goto L_0x00ed
        L_0x031d:
            java.lang.String r0 = "statusStore"
            goto L_0x00ed
        L_0x0321:
            java.lang.String r0 = "linkifier"
            X.C18070vi.A11(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MyStatusesActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        C010105w create;
        if (i != 13) {
            if (i == 26) {
                this.A14.getValue();
                C73203Rj A002 = AnonymousClass4a6.A00(this);
                A002.A0T(true);
                A002.A0D(2131889131);
                A002.setPositiveButton(2131899286, new AnonymousClass758(this, 19));
                A002.A0G(new C1411674o(this, 9));
                create = A002.create();
            } else if (i == 27) {
                this.A14.getValue();
                C73203Rj A003 = AnonymousClass4a6.A00(this);
                A003.A0T(true);
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                AnonymousClass3MX.A1S(objArr, 0, 15);
                A003.A0S(resources.getString(2131898363, objArr));
                A003.setPositiveButton(2131899286, new AnonymousClass758(this, 20));
                A003.A0G(new C1411674o(this, 10));
                create = A003.create();
            }
            C18070vi.A0X(create);
            return create;
        }
        Map map = this.A12;
        if (map.isEmpty()) {
            Log.e("mediagallery/dialog/delete no messages");
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("mediagallery/dialog/delete/");
            C17900vP.A0o(A102, map.size());
            HashSet hashSet = new HashSet(map.values());
            AnonymousClass1KB r8 = this.A05;
            C18070vi.A0W(r8);
            AnonymousClass1KW r10 = this.A0D;
            C18070vi.A0W(r10);
            C33251iW r9 = this.A0A;
            if (r9 != null) {
                return C83954Hh.A00(this, r8, r9, r10, new C126466cm(this), hashSet);
            }
            C18070vi.A11("userActions");
            throw null;
        }
        return super.onCreateDialog(i);
    }

    public void onDestroy() {
        String str;
        Log.i("myStatusesActivity/onDestroy");
        super.onDestroy();
        C24681Lg r1 = this.A0G;
        if (r1 != null) {
            r1.unregisterObserver(this.A16);
            AnonymousClass00H r0 = this.A0o;
            if (r0 != null) {
                C17880vN.A0V(r0).unregisterObserver(this.A18);
                AnonymousClass00H r02 = this.A0d;
                if (r02 != null) {
                    C17880vN.A0V(r02).unregisterObserver(this.A17);
                    ((AnonymousClass178) this.A19.get()).A02(this);
                    boolean A1G = C108975cc.A1G(this.A0u);
                    HashMap hashMap = this.A10;
                    for (A34 A0B2 : C108955ca.A17(hashMap)) {
                        A0B2.A0B(A1G);
                    }
                    List list = this.A11;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        revokeUriPermission(C108945cZ.A0M(it), A1G ? 1 : 0);
                    }
                    list.clear();
                    hashMap.clear();
                    this.A05.A0I(this.A1A);
                    return;
                }
                str = "crosspostEventObservers";
            } else {
                str = "xFamilyCrosspostEventObservers";
            }
        } else {
            str = "messageObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onPause() {
        Log.i("myStatusesActivity/onPause");
        AnonymousClass00H r0 = this.A0n;
        if (r0 != null) {
            ((C41701wv) r0.get()).A03.A09(this);
            super.onPause();
            return;
        }
        C18070vi.A11("statusSharingManager");
        throw null;
    }

    public void onResume() {
        String str;
        Log.i("myStatusesActivity/onResume");
        super.onResume();
        AnonymousClass00H r0 = this.A0n;
        if (r0 != null) {
            C41731wy r2 = ((C41701wv) r0.get()).A03;
            if (r2.A00 <= 0) {
                AnonymousClass7AS.A00(this, r2, new AnonymousClass81F(this), 17);
            }
            AnonymousClass00H r02 = this.A0i;
            if (r02 != null) {
                C18100vl r03 = C30361do.A0C;
                ((C30361do) C18070vi.A0E(r02)).A02((AnonymousClass1BI) null, 83);
                return;
            }
            str = "navigationTimeSpentManager";
        } else {
            str = "statusSharingManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onStart() {
        Log.i("myStatusesActivity/onStart");
        super.onStart();
        A12(this);
    }

    public void onStop() {
        Log.i("myStatusesActivity/onStop");
        super.onStop();
    }

    public MyStatusesActivity(int i) {
        this.A0w = false;
        C1423279a.A00(this, 45);
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public C23401Fx BPx() {
        return ((C23391Fw) getLifecycle()).A02;
    }

    public String BSb() {
        return "my_status_activity";
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        AnonymousClass02B r0;
        Integer num;
        C56092gt r02;
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i != 33) {
                if (i == 35) {
                    if (i2 == -1 && (r0 = this.A00) != null) {
                        r0.A05();
                    }
                    if (this.A0s) {
                        AnonymousClass00H r03 = this.A0n;
                        if (r03 != null) {
                            ((C41701wv) r03.get()).A01(intent);
                            return;
                        }
                        str = "statusSharingManager";
                    } else {
                        return;
                    }
                } else if (i != 151) {
                    return;
                } else {
                    if (i2 == -1) {
                        Map map = this.A12;
                        if (!map.isEmpty()) {
                            ArrayList A102 = C17880vN.A10(map.values());
                            map.clear();
                            if (this.A0s) {
                                num = AnonymousClass00R.A00;
                            } else {
                                num = AnonymousClass00R.A0C;
                            }
                            A4e((Integer) null, (Integer) null, num, A102);
                            return;
                        }
                        return;
                    } else if (i2 == 0 && (r02 = A4c().A00) != null) {
                        r02.A01 = 4;
                        return;
                    } else {
                        return;
                    }
                }
            } else if (i2 == -1) {
                A11(this);
                return;
            } else {
                return;
            }
        } else if (i2 == -1 && intent != null) {
            ArrayList A132 = AnonymousClass000.A13();
            Map map2 = this.A12;
            if (!map2.isEmpty()) {
                A132.addAll(map2.values());
            } else {
                AnonymousClass206 r04 = this.A0P;
                if (r04 != null) {
                    A132.add(r04);
                }
            }
            if (!A132.isEmpty()) {
                ArrayList A0r2 = C72463Mc.A0r(intent, AnonymousClass1BI.class);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                String stringExtra = intent.getStringExtra("appended_message");
                C33251iW r3 = this.A0A;
                if (r3 != null) {
                    C34531kd r4 = this.A09;
                    if (r4 != null) {
                        r3.A0N(r4, (C692236j) null, stringExtra, C25161Nd.A00(A132), A0r2, booleanExtra);
                        if (A0r2.size() != 1 || C22971Dz.A0a((Jid) A0r2.get(0))) {
                            CPW(A0r2, 1);
                        } else {
                            AnonymousClass1L9 r1 = this.A01;
                            AnonymousClass1LU r05 = this.A0M;
                            if (r05 != null) {
                                C72473Md.A0q(this, r1, r05, A0r2);
                            } else {
                                AnonymousClass3MW.A1F();
                                throw null;
                            }
                        }
                    } else {
                        str = "sendMedia";
                    }
                } else {
                    str = "userActions";
                }
            } else {
                Log.w("mystatuses/forward/failed");
                this.A05.A08(2131892058, 0);
            }
            AnonymousClass02B r06 = this.A00;
            if (r06 != null) {
                r06.A05();
                return;
            }
            return;
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public MyStatusesActivity() {
        this(0);
        this.A12 = C17880vN.A13();
        this.A13 = C17880vN.A12();
        this.A0y = new AnonymousClass7RH((Object) this, 20);
        this.A0x = C17890vO.A0D();
        this.A0z = C17880vN.A11();
        this.A10 = C17880vN.A11();
        this.A19 = C217517g.A00(16503);
        this.A14 = AnonymousClass1DF.A01(new C153697pw(this));
        this.A16 = new AnonymousClass7FH(this, 11);
        this.A18 = new AnonymousClass7PK(this, 0);
        this.A17 = new C146377Ow(this, 0);
        this.A1A = new AnonymousClass7RH((Object) this, 21);
        this.A11 = AnonymousClass000.A13();
        this.A15 = new C143707Em(this, 7);
    }
}
