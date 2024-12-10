package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass126;
import X.AnonymousClass129;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1PS;
import X.AnonymousClass1VU;
import X.AnonymousClass1YL;
import X.AnonymousClass25I;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4G8;
import X.C000200d;
import X.C107965au;
import X.C110885hR;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C221618v;
import X.C24791Lr;
import X.C24921Me;
import X.C25111Mx;
import X.C25181Nf;
import X.C25231Nk;
import X.C27201Vd;
import X.C28401aA;
import X.C28931bI;
import X.C36331ni;
import X.C36401np;
import X.C37101oy;
import X.C40371ub;
import X.C42941yz;
import X.C43421zm;
import X.C53792d6;
import X.C57672jS;
import X.C65482wZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C77063pI;
import X.C77593qe;
import X.C82884Cn;
import X.C89894dC;
import X.C90004dN;
import X.C91004ez;
import X.C92054gg;
import X.C95444mF;
import X.C98764rg;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class NewCommunityActivity extends C77063pI implements C107965au {
    public static final int[] A0V = {127979, 127969, 129716, 127800, 127912, 128218, 127916, 128054, 128049, 127918, 128663, 128247, 128241, 127958, 9917, 127936, 127955, 127944, 128512, 127828, 127922, 9992, 10084};
    public ImageView A00;
    public AnonymousClass1M9 A01;
    public C77593qe A02;
    public C25111Mx A03;
    public C24921Me A04;
    public C27201Vd A05;
    public AnonymousClass1CJ A06;
    public C25181Nf A07;
    public AnonymousClass1NN A08;
    public AnonymousClass1MZ A09;
    public AnonymousClass1PS A0A;
    public AnonymousClass126 A0B;
    public AnonymousClass1LU A0C;
    public AnonymousClass1EC A0D;
    public C28401aA A0E;
    public AnonymousClass129 A0F;
    public C36331ni A0G;
    public C36401np A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public int[] A0Q;
    public boolean A0R;
    public final Runnable A0S;
    public final AtomicReference A0T;
    public final C25231Nk A0U;

    public NewCommunityActivity() {
        this(0);
        this.A0T = new AtomicReference();
        this.A0U = new C95444mF(this, 11);
        this.A0S = new C98764rg(this, 5);
        this.A0L = C221618v.A00(C37101oy.class);
        this.A0D = null;
    }

    public static void A0V(NewCommunityActivity newCommunityActivity) {
        NewCommunityActivity newCommunityActivity2 = newCommunityActivity;
        Bitmap A042 = newCommunityActivity.A0A.A04(newCommunityActivity2, newCommunityActivity.A02, "NewCommunityActivity.loadCommunityPhotoIfNecessary", 0.0f, newCommunityActivity.getResources().getDimensionPixelSize(2131168470), false);
        if (A042 != null) {
            newCommunityActivity2.A03.setImageDrawable(newCommunityActivity2.A0B.A01(newCommunityActivity2.getResources(), A042, new C65482wZ(0)));
        } else {
            newCommunityActivity2.A09.A04(newCommunityActivity2.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14.A0E, 5453) == false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(android.net.Uri r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r32 = this;
            r14 = r32
            boolean r0 = X.AnonymousClass3MW.A1Y(r14)
            if (r0 != 0) goto L_0x0013
            X.1ub r0 = X.AnonymousClass3MZ.A0c(r14)
            r0.A07()
            A0c(r14)
            return
        L_0x0013:
            r0 = 2131889108(0x7f120bd4, float:1.941287E38)
            r14.CNA(r0)
            X.11P r0 = r14.A05
            r22 = r0
            X.0ve r0 = r14.A0E
            r24 = r0
            X.1KB r15 = r14.A05
            X.190 r13 = r14.A03
            X.11S r12 = r14.A02
            X.00H r0 = r14.A0N
            X.1OZ r29 = X.C17880vN.A0U(r0)
            X.1M9 r11 = r14.A01
            X.126 r10 = r14.A0B
            X.1Mx r9 = r14.A03
            X.1ni r8 = r14.A0G
            X.1Lr r7 = r14.A09
            X.1Up r6 = r14.A0D
            X.00H r0 = r14.A0P
            java.lang.Object r5 = r0.get()
            X.1tB r5 = (X.C39501tB) r5
            X.00H r0 = r14.A0K
            java.lang.Object r4 = r0.get()
            X.2jS r4 = (X.C57672jS) r4
            X.00H r0 = r14.A0M
            java.lang.Object r3 = r0.get()
            X.4QG r3 = (X.AnonymousClass4QG) r3
            X.1PS r2 = r14.A0A
            X.4L1 r1 = new X.4L1
            r1.<init>(r14)
            X.4X4 r0 = new X.4X4
            r25 = r4
            r26 = r10
            r27 = r5
            r28 = r3
            r30 = r6
            r31 = r8
            r16 = r15
            r17 = r12
            r18 = r1
            r19 = r11
            r20 = r9
            r21 = r7
            r23 = r2
            r15 = r13
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.util.HashSet r10 = X.C17880vN.A12()
            r2 = r36
            if (r36 == 0) goto L_0x00b0
            X.1yz r1 = X.AnonymousClass1EC.A01
            X.1EC r2 = r1.A02(r2)
            if (r2 == 0) goto L_0x0092
            X.1Nf r1 = r14.A07
            X.1E7 r1 = r1.A01(r2)
            r10.add(r1)
        L_0x0092:
            r26 = 0
        L_0x0094:
            java.util.Set r11 = java.util.Collections.emptySet()
            r8 = 0
            r9 = r34
            X.C18070vi.A0f(r9, r8, r11)
            X.0ve r7 = r0.A0A
            r2 = 5543(0x15a7, float:7.767E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r7, r2)
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = "Community creation disabled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x00b0:
            X.0ve r3 = r14.A0E
            r2 = 5453(0x154d, float:7.641E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            r26 = 1
            if (r1 != 0) goto L_0x0094
            goto L_0x0092
        L_0x00bf:
            X.11P r12 = r0.A08
            long r1 = X.AnonymousClass11P.A01(r12)
            r0.A00 = r1
            X.2jS r1 = r0.A0B
            X.1EB r15 = r1.A00()
            X.190 r6 = r0.A03
            X.11S r5 = r0.A04
            X.1OZ r4 = r0.A0F
            X.126 r3 = r0.A0C
            X.1Mx r2 = r0.A06
            X.4ng r1 = new X.4ng
            r13 = r33
            r1.<init>(r13, r0, r10, r11)
            r14 = 0
            java.util.ArrayList r18 = X.AnonymousClass000.A13()
            r20 = 1
            X.9ho r13 = new X.9ho
            r21 = r8
            r23 = r8
            r24 = r20
            r25 = r8
            r27 = r8
            r17 = r35
            r16 = r9
            r19 = r8
            r22 = r20
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.1PS r0 = r0.A09
            X.Acg r14 = new X.Acg
            r15 = r6
            r16 = r5
            r17 = r2
            r18 = r12
            r19 = r0
            r20 = r7
            r21 = r3
            r22 = r1
            r23 = r13
            r24 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r14.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.NewCommunityActivity.A03(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void A0Q(NewCommunityActivity newCommunityActivity) {
        String rawString;
        Editable text = newCommunityActivity.A08.getText();
        if (text == null) {
            text = "";
        }
        String A0q = C72463Mc.A0q(text);
        Editable text2 = newCommunityActivity.A07.getText();
        if (text2 == null) {
            text2 = "";
        }
        String A0q2 = C72463Mc.A0q(text2);
        AnonymousClass1EC r0 = newCommunityActivity.A0D;
        Uri uri = null;
        if (r0 == null) {
            rawString = null;
        } else {
            rawString = r0.getRawString();
        }
        File A002 = newCommunityActivity.A09.A00(newCommunityActivity.A02);
        if (A002 != null) {
            uri = Uri.fromFile(A002);
        }
        C40371ub A0c = AnonymousClass3MZ.A0c(newCommunityActivity);
        char c = 1;
        if (rawString == null) {
            c = 0;
        }
        AnonymousClass00H r02 = A0c.A05;
        String A0o = C72463Mc.A0o(r02);
        Integer A0j = AnonymousClass3MY.A0j(r02);
        if (c > 0) {
            A0c.A0D(A0j, 1L, A0o, (String) null, 6, 4);
        }
        A0c.A0D(A0j, (Long) null, A0o, (String) null, 7, 4);
        AnonymousClass1EC r03 = newCommunityActivity.A0D;
        if (r03 == null) {
            newCommunityActivity.A03(uri, A0q, A0q2, rawString);
            return;
        }
        AnonymousClass4G8.A00(C82884Cn.GROUP_UPGRADE, Collections.singletonList(r03)).A2F(newCommunityActivity.getSupportFragmentManager(), (String) null);
    }

    public void A2y() {
        if (!this.A0R) {
            this.A0R = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r1 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L2, r1, this, r1.A5A);
            this.A09 = (C24791Lr) A0L2.A2h.get();
            this.A0B = AnonymousClass3MZ.A0s(A0L2);
            this.A0D = C72453Mb.A0p(A0L2);
            this.A0F = C000200d.A00(A0L2.A2P);
            this.A0C = AnonymousClass3Ma.A0r(A0L2);
            this.A0A = AnonymousClass3MZ.A0j(A0L2);
            this.A0H = AnonymousClass3MY.A0e(r1);
            this.A0C = AnonymousClass3MY.A0Z(A0L2);
            this.A06 = AnonymousClass3Ma.A0d(A0L2);
            this.A0E = (C28401aA) A0L2.A7b.get();
            this.A05 = AnonymousClass3MZ.A0i(A0L2);
            this.A0N = C000200d.A00(A0L2.A6N);
            this.A0F = AnonymousClass3Ma.A0t(A0L2);
            this.A04 = AnonymousClass3MZ.A0g(A0L2);
            this.A01 = AnonymousClass10E.A4z(A0L2);
            this.A0B = AnonymousClass3MY.A0X(A0L2);
            this.A03 = (C25111Mx) A0L2.A8k.get();
            this.A0G = AnonymousClass10E.AKo(A0L2);
            this.A0I = C000200d.A00(A0L2.A2M);
            this.A0P = C000200d.A00(A0L2.A7s);
            this.A0J = AnonymousClass3MX.A10(A0L2);
            this.A08 = AnonymousClass3Ma.A0e(A0L2);
            this.A09 = AnonymousClass3MY.A0V(A0L2);
            this.A07 = AnonymousClass3MZ.A0m(A0L2);
            this.A0A = (AnonymousClass1PS) A0L2.A3T.get();
            this.A0K = C000200d.A00(A0L2.AUl);
            this.A0O = AnonymousClass3MX.A11(A0L2);
            this.A0M = C000200d.A00(r1.ACr);
        }
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0O).A02((AnonymousClass1BI) null, 11);
    }

    public void onBackPressed() {
        AnonymousClass00H r0 = this.A0E;
        String A0o = C72463Mc.A0o(r0);
        Integer A0j = AnonymousClass3MY.A0j(r0);
        r0.get();
        r0.get();
        C40371ub A0c = AnonymousClass3MZ.A0c(this);
        r0.get();
        A0c.A0E(A0j, A0o, 8, 4);
        super.onBackPressed();
    }

    public static void A0c(NewCommunityActivity newCommunityActivity) {
        newCommunityActivity.A3v(new C92054gg(newCommunityActivity, 0), 0, 2131889077, 2131889078, 2131889076);
    }

    public void Bnj() {
        C40371ub A0c = AnonymousClass3MZ.A0c(this);
        AnonymousClass00H r0 = A0c.A05;
        A0c.A0D(AnonymousClass3MY.A0j(r0), (Long) null, C72463Mc.A0o(r0), (String) null, 14, 9);
    }

    public void Bpb() {
        C40371ub A0c = AnonymousClass3MZ.A0c(this);
        AnonymousClass00H r0 = A0c.A05;
        String str = null;
        A0c.A0D(AnonymousClass3MY.A0j(r0), (Long) null, C72463Mc.A0o(r0), (String) null, 13, 9);
        Editable text = this.A08.getText();
        if (text == null) {
            text = "";
        }
        String A0q = C72463Mc.A0q(text);
        Editable text2 = this.A07.getText();
        if (text2 == null) {
            text2 = "";
        }
        String A0q2 = C72463Mc.A0q(text2);
        AnonymousClass1EC r02 = this.A0D;
        Uri uri = null;
        if (r02 != null) {
            str = r02.getRawString();
        }
        File A002 = this.A09.A00(this.A02);
        if (A002 != null) {
            uri = Uri.fromFile(A002);
        }
        A03(uri, A0q, A0q2, str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i != 64206) {
            if (i == 16436755) {
                this.A0D.A02(this.A02).delete();
                if (i2 != -1) {
                    if (i2 == 0 && intent != null) {
                        this.A0D.A03(intent, this);
                        return;
                    }
                    return;
                }
            } else if (i == 16436756 && i2 == -1) {
                finish();
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    Log.i("newcommunity/resetphoto");
                    File A002 = this.A09.A00(this.A02);
                    C17960vV.A07(A002);
                    A002.delete();
                    File A012 = this.A09.A01(this.A02);
                    C17960vV.A07(A012);
                    A012.delete();
                    ImageView imageView = this.A03;
                    AnonymousClass1VU r3 = this.A0B;
                    C72473Md.A0t(getTheme(), getResources(), imageView, new C65482wZ(0), r3);
                    this.A05.A08(2131890999, 0);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A0D.A02(this.A02).delete();
                }
            }
            Log.i("newcommunity/cropphoto");
            this.A0D.A05(intent2, this, this, this.A02, 16436755);
            return;
        } else {
            return;
        }
        Log.i("newcommunity/photopicked");
        A0V(this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1E7, X.3qe, X.25I] */
    /* JADX WARNING: type inference failed for: r2v13, types: [X.1E7, X.3qe, X.25I] */
    public void onCreate(Bundle bundle) {
        int A0G2;
        String string;
        String string2;
        super.onCreate(bundle);
        if (bundle == null || (string2 = bundle.getString("dummy_community_photo_id", (String) null)) == null) {
            String rawString = ((C57672jS) this.A0K.get()).A00().getRawString();
            AnonymousClass190 r3 = this.A03;
            A0G2 = C72453Mb.A0G(rawString, r3, 1);
            ? r2 = new AnonymousClass25I(rawString);
            C42941yz r0 = AnonymousClass1EC.A01;
            r2.A0I(r3, new C53792d6(C42941yz.A01("1234567@g.us"), A0G2));
            this.A02 = r2;
        } else {
            AnonymousClass190 r32 = this.A03;
            A0G2 = 2;
            C18070vi.A0d(r32, 2);
            ? r22 = new AnonymousClass25I(string2);
            C42941yz r02 = AnonymousClass1EC.A01;
            r22.A0I(r32, new C53792d6(C42941yz.A01("1234567@g.us"), 2));
            this.A02 = r22;
        }
        A0V(this);
        this.A08.registerObserver(this.A0U);
        String stringExtra = getIntent().getStringExtra("NewCommunityActivity_group_to_be_added");
        if (stringExtra != null) {
            this.A0D = AnonymousClass1EC.A01.A02(stringExtra);
        }
        int intExtra = getIntent().getIntExtra("NewCommunityActivity_current_screen", -1);
        if (!this.A0E.A01((Object) null, "community") && intExtra != 3 && !Bed()) {
            AnonymousClass1EC r33 = this.A0D;
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(getPackageName(), "com.whatsapp.community.CommunityNUXActivity");
            if (r33 != null) {
                AnonymousClass3MY.A12(A0A2, r33, "CommunityNUXActivity_group_to_be_added");
            }
            startActivity(A0A2);
            finish();
        }
        C110885hR.A0A(this, 2131428792).setVisibility(8);
        C89894dC.A00(AnonymousClass3MY.A0I(C72453Mb.A0r(this, 2131432953), 0), this, 19);
        TextView A0I2 = AnonymousClass3MW.A0I(this, 2131432952);
        C43421zm.A04(A0I2);
        A0I2.setOnClickListener(this.A01);
        A0I2.setVisibility(0);
        this.A07.setText(2131892458);
        if (this.A0D != null) {
            C28931bI A0r = C72453Mb.A0r(this, 2131432015);
            A0r.A04(0);
            getWindow().setSoftInputMode(A0G2);
            View A0A3 = C110885hR.A0A(this, 2131431320);
            AnonymousClass3MY.A0w(this, A0A3, 2131895092);
            C90004dN.A00(A0A3, this, A0r, 8);
            TextView A0I3 = AnonymousClass3MW.A0I(this, 2131431324);
            C43421zm.A04(A0I3);
            A0I3.setText(this.A06.A0F(this.A0D));
            this.A05.A04(this, this, "new-community").A07((ImageView) C110885hR.A0A(this, 2131431323), this.A01.A0H(this.A0D));
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C110885hR.A0A(this, 2131431326);
            AnonymousClass1MZ r03 = this.A09;
            if (r03.A08.A0C(this.A0D).A0W(this.A02)) {
                string = C24921Me.A04(this.A04, this.A0D, 1, true);
            } else {
                string = getResources().getString(2131888617);
            }
            textEmojiLabel.A0R(string);
        }
        this.A0Q = getResources().getIntArray(2130903059);
        this.A00 = (ImageView) AnonymousClass3MX.A09(LayoutInflater.from(this), (ViewGroup) this.A00, 2131625521);
        C72453Mb.A0r(this, 2131435062).A04(0);
        TextView A0I4 = AnonymousClass3MW.A0I(this, 2131435066);
        String A0q = C17880vN.A0q(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131892462);
        A0I4.setText(this.A0H.A06(A0I4.getContext(), new C98764rg(this, 4), A0q, "learn-more", AnonymousClass1YL.A00(A0I4.getContext(), 2130970299, 2131101293)));
        AnonymousClass3Ma.A1I(A0I4, this.A0E);
        AnonymousClass3MZ.A1Q(A0I4, this.A08);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.unregisterObserver(this.A0U);
        this.A05.CEz(this.A0S);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131432589) {
            return super.onOptionsItemSelected(menuItem);
        }
        C40371ub A0c = AnonymousClass3MZ.A0c(this);
        AnonymousClass00H r0 = A0c.A05;
        A0c.A0D(AnonymousClass3MY.A0j(r0), (Long) null, C72463Mc.A0o(r0), (String) null, 12, 4);
        AnonymousClass3MW.A0a(this.A0J).A01(this, "community-examples-article");
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C77593qe r0 = this.A02;
        if (r0 != null) {
            bundle.putString("dummy_community_photo_id", r0.A00);
        }
    }

    public NewCommunityActivity(int i) {
        this.A0R = false;
        C91004ez.A00(this, 4);
    }
}
