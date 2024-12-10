package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.location.DragBottomSheetIndicator;
import com.whatsapp.location.LocationSharingService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7By  reason: invalid class name and case insensitive filesystem */
public abstract class C143087By implements C26181Rd, LocationListener {
    public float A00;
    public float A01;
    public int A02;
    public long A03 = C20113A7w.A0L;
    public long A04;
    public Activity A05;
    public Drawable A06;
    public Location A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public RecyclerView A0D;
    public RecyclerView A0E;
    public BottomSheetBehavior A0F;
    public BottomSheetBehavior A0G;
    public C37451pZ A0H;
    public AnonymousClass1BI A0I;
    public DragBottomSheetIndicator A0J;
    public C112055kr A0K;
    public C127346eC A0L;
    public C129066hC A0M;
    public C139086yC A0N;
    public C60072nL A0O;
    public C60072nL A0P;
    public C60072nL A0Q;
    public boolean A0R = false;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U = false;
    public boolean A0V = false;
    public boolean A0W = false;
    public float A0X;
    public float A0Y;
    public float A0Z = 0.0f;
    public float A0a;
    public float A0b = 0.0f;
    public float A0c;
    public float A0d;
    public int A0e;
    public int A0f;
    public BroadcastReceiver A0g = new C109305dA(this, 5);
    public Bitmap A0h;
    public Bitmap A0i;
    public View A0j;
    public View A0k;
    public View A0l;
    public View A0m;
    public View A0n;
    public View A0o;
    public TextView A0p;
    public TextEmojiLabel A0q;
    public UserJid A0r;
    public ContactLiveLocationThumbnail A0s;
    public ContactLiveLocationThumbnail A0t;
    public C112055kr A0u;
    public final Handler A0v = C17890vO.A0D();
    public final AnonymousClass1RB A0w;
    public final AnonymousClass1KB A0x;
    public final AnonymousClass11S A0y;
    public final AnonymousClass1M9 A0z;
    public final C24921Me A10;
    public final AnonymousClass11P A11;
    public final C18000vb A12;
    public final C18030ve A13;
    public final C27131Uv A14;
    public final AnonymousClass689 A15;
    public final C27101Us A16;
    public final AnonymousClass10I A17;
    public final Runnable A18 = new AnonymousClass7RA(this, 5);
    public final Runnable A19 = new AnonymousClass7RA(this, 1);
    public final List A1A = AnonymousClass000.A13();
    public final List A1B = AnonymousClass000.A13();
    public final List A1C = AnonymousClass000.A13();
    public final Map A1D = C17880vN.A11();
    public final Set A1E = C17880vN.A14();
    public final AnonymousClass1L9 A1F;
    public final AnonymousClass195 A1G;
    public final C23651Hc A1H;
    public final AnonymousClass1VW A1I;
    public final C23581Gv A1J = new AnonymousClass7E0(this, 6);
    public final C24671Lf A1K;
    public final C27201Vd A1L;
    public final C27191Vc A1M;
    public final C29831cw A1N;
    public final C219217x A1O;
    public final C28741ap A1P = new AnonymousClass7FF(this, 2);
    public final AnonymousClass1Q1 A1Q;
    public final AnonymousClass1WR A1R = new AnonymousClass7FH(this, 1);
    public final C24681Lg A1S;
    public final C25221Nj A1T = new AnonymousClass7ID(this, 2);
    public final C25191Ng A1U;
    public final AnonymousClass1LU A1V;
    public final C72273Lh A1W = new C144687Ih(this, 0);
    public final C72393Lt A1X = new C144697Ii(this);
    public final Runnable A1Y = new AnonymousClass7RA(this, 0);
    public volatile boolean A1Z;

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C143087By r3, X.C60072nL r4) {
        /*
            r0 = 0
            r3.A0Q = r0
            A05(r3)
            if (r4 == 0) goto L_0x002f
            java.util.List r0 = r3.A1B
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            X.6yC r1 = (X.C139086yC) r1
            X.2nL r0 = r1.A02
            if (r0 != r4) goto L_0x000e
        L_0x001e:
            r3.A0E(r1)
            r3.A0Q = r4
            r3.A0Z(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A0F
            if (r1 == 0) goto L_0x002e
            r0 = 4
            r1.A0W(r0)
        L_0x002e:
            return
        L_0x002f:
            r1 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143087By.A0A(X.7By, X.2nL):void");
    }

    public C010105w A0H(int i) {
        if (i == 0) {
            C73203Rj A002 = AnonymousClass4a6.A00(this.A05);
            A002.A0D(2131891789);
            A002.A0T(true);
            A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
            AnonymousClass757.A01(A002, this, 46, 2131891787);
            C010105w create = A002.create();
            create.A05();
            return create;
        } else if (i != 2) {
            return null;
        } else {
            AnonymousClass757 A003 = AnonymousClass757.A00(this, 47);
            C73203Rj A004 = AnonymousClass4a6.A00(this.A05);
            A004.A0E(2131890839);
            A004.A0D(2131890838);
            A004.A0T(true);
            A004.A0Z(A003, 2131899286);
            return A004.create();
        }
    }

    public abstract C6N A0L();

    public void A0N() {
        this.A0Q = null;
        this.A0L = null;
        A0E((C139086yC) null);
        A05(this);
        this.A0K.notifyDataSetChanged();
    }

    public void A0Q() {
        AnonymousClass1RB r6 = this.A0w;
        this.A0S = r6.A07();
        C219217x r2 = this.A1O;
        this.A0T = r2.A06();
        Context applicationContext = this.A05.getApplicationContext();
        AnonymousClass195 r0 = this.A1G;
        C27131Uv r5 = this.A14;
        LocationSharingService.A03(applicationContext, r0, r2, r5);
        if (this.A0O == null) {
            r5.A0W.add(this.A1W);
            r5.A0X.add(this.A1X);
            A03();
        }
        A06(this);
        this.A05.invalidateOptionsMenu();
        this.A1N.A01(this.A05, this.A0g, new IntentFilter("android.location.PROVIDERS_CHANGED"), true);
        if (r5.A0d(this.A0I)) {
            r6.A06(this, "group-chat-live-location-ui-onresume", 0.0f, 3, 5000, 1000);
        }
        this.A1H.registerObserver(this);
    }

    public abstract void A0R();

    public abstract void A0S();

    public abstract void A0T(float f, boolean z);

    public abstract void A0W(C139086yC r1);

    public abstract void A0Z(C60072nL r1);

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    private void A02() {
        C18000vb r8 = this.A12;
        List list = this.A1C;
        long size = (long) list.size();
        Object[] objArr = new Object[1];
        boolean A1b = C72453Mb.A1b(objArr, list.size());
        this.A0p.setText(r8.A0K(objArr, 2131755219, size));
        this.A0u.notifyDataSetChanged();
        if (this.A0o != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.A05.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int min = Math.min((int) (Math.min(4.5d, (double) list.size()) * ((double) this.A0c)), displayMetrics.heightPixels / 2);
            this.A0F.A0d(true);
            this.A0F.A0W(5);
            int i = this.A0G.A0J;
            RecyclerView recyclerView = this.A0E;
            if (i != 3) {
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, min));
                this.A0G.A0W(3);
            } else if (min != recyclerView.getHeight()) {
                this.A0E.clearAnimation();
                C110045eq r2 = new C110045eq(this.A0E, this, min);
                r2.setDuration((long) ((int) (((float) min) / C72463Mc.A00(this.A05))));
                A08(this, (float) this.A0F.A0R(), A1b);
                this.A0E.startAnimation(r2);
            }
        } else if (this.A09.getTranslationY() != 0.0f) {
            this.A09.clearAnimation();
            View view = this.A09;
            view.setTranslationY(C108945cZ.A04(view));
            AnonymousClass1HF.A0B(this.A09).A07(0.0f);
        }
    }

    private void A03() {
        AnonymousClass68F r4 = new AnonymousClass68F(this.A14.A0K(this.A0I), this);
        Handler handler = this.A0v;
        Runnable runnable = this.A18;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.A03);
        this.A16.A02(r4);
    }

    public static void A05(C143087By r4) {
        r4.A1C.clear();
        r4.A0u.notifyDataSetChanged();
        r4.A0E((C139086yC) null);
        if (r4.A0o != null) {
            r4.A0E.clearAnimation();
            BottomSheetBehavior bottomSheetBehavior = r4.A0F;
            if (bottomSheetBehavior.A0J != 4) {
                bottomSheetBehavior.A0W(4);
                A0D(r4, true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = r4.A0G;
            if (bottomSheetBehavior2.A0J != 5) {
                bottomSheetBehavior2.A0W(5);
            } else {
                A09(r4, 0.0f, true);
            }
        } else {
            r4.A09.clearAnimation();
            AnonymousClass1HF.A0B(r4.A09).A07(C108945cZ.A04(r4.A09));
        }
        r4.A0S();
    }

    public static void A06(C143087By r3) {
        r3.A0x.A0J(new AnonymousClass7RA(r3, 4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C143087By r9) {
        /*
            long r3 = r9.A04
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 0
            r1.setOnClickListener(r0)
            X.1Uv r1 = r9.A14
            X.1BI r0 = r9.A0I
            boolean r0 = r1.A0d(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = r9.A0T
            if (r0 != 0) goto L_0x0067
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 2131891772(0x7f12163c, float:1.9418273E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 47
        L_0x002a:
            X.C825148g.A00(r1, r9, r0)
        L_0x002d:
            android.view.View r0 = r9.A0B
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 == 0) goto L_0x0049
            android.view.View r0 = r9.A0B
            r0.setVisibility(r3)
            android.view.View r2 = r9.A0B
            android.app.Activity r1 = r9.A05
            r0 = 2130771984(0x7f010010, float:1.7147074E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r2.startAnimation(r0)
        L_0x0049:
            java.util.List r0 = r9.A1A
            int r1 = r0.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0053
            r3 = 1
        L_0x0053:
            com.whatsapp.location.DragBottomSheetIndicator r2 = r9.A0J
            if (r2 == 0) goto L_0x0066
            r1 = 8
            r0 = 8
            if (r3 == 0) goto L_0x005e
            r0 = 4
        L_0x005e:
            r2.setVisibility(r0)
            android.view.View r0 = r9.A08
            r0.setVisibility(r1)
        L_0x0066:
            return
        L_0x0067:
            X.1BI r0 = r9.A0I
            boolean r0 = r1.A0d(r0)
            if (r0 == 0) goto L_0x0080
            boolean r0 = r9.A0S
            if (r0 != 0) goto L_0x0080
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 2131891772(0x7f12163c, float:1.9418273E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 48
            goto L_0x002a
        L_0x0080:
            java.util.Set r1 = r9.A1E
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00e2
            monitor-enter(r1)
            java.util.ArrayList r0 = X.C17880vN.A10(r1)     // Catch:{ all -> 0x0132 }
            r1.clear()     // Catch:{ all -> 0x0132 }
            monitor-exit(r1)     // Catch:{ all -> 0x0132 }
            int r8 = r0.size()
            r6 = 0
            r7 = 1
            if (r8 != r7) goto L_0x00cd
            X.1M9 r1 = r9.A0z
            java.lang.Object r0 = r0.get(r6)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1E7 r1 = r1.A0E(r0)
            if (r1 == 0) goto L_0x00cd
            X.1Me r0 = r9.A10
            java.lang.String r3 = r0.A0O(r1)
            com.whatsapp.TextEmojiLabel r2 = r9.A0q
            android.app.Activity r1 = r9.A05
            r0 = 2131891790(0x7f12164e, float:1.941831E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r3, r7, r6, r0)
            r2.A0R(r0)
        L_0x00bb:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 3000(0xbb8, double:1.482E-320)
            long r0 = r0 + r2
            r9.A04 = r0
            android.os.Handler r1 = r9.A0v
            java.lang.Runnable r0 = r9.A1Y
            r1.postDelayed(r0, r2)
            goto L_0x002d
        L_0x00cd:
            com.whatsapp.TextEmojiLabel r5 = r9.A0q
            X.0vb r4 = r9.A12
            r3 = 2131755220(0x7f1000d4, float:1.9141313E38)
            long r1 = (long) r8
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.C17880vN.A1T(r0, r8, r6)
            java.lang.String r0 = r4.A0K(r0, r3, r1)
            r5.setText(r0)
            goto L_0x00bb
        L_0x00e2:
            java.util.List r2 = r9.A1A
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00f4
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 2131891776(0x7f121640, float:1.9418282E38)
            r1.setText(r0)
            goto L_0x002d
        L_0x00f4:
            android.view.View r0 = r9.A0B
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 != 0) goto L_0x0114
            android.view.View r0 = r9.A0B
            r0.setVisibility(r3)
            android.app.Activity r1 = r9.A05
            r0 = 2130771981(0x7f01000d, float:1.7147068E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r0 = 6
            X.C114545r0.A00(r1, r9, r0)
            android.view.View r0 = r9.A0B
            r0.startAnimation(r1)
        L_0x0114:
            int r1 = r2.size()
            r0 = 2
            boolean r2 = X.C108975cc.A1D(r1, r0)
            com.whatsapp.location.DragBottomSheetIndicator r1 = r9.A0J
            if (r1 == 0) goto L_0x0066
            int r0 = X.C72453Mb.A0J(r2)
            r1.setVisibility(r0)
            android.view.View r0 = r9.A08
            if (r2 != 0) goto L_0x012e
            r3 = 8
        L_0x012e:
            r0.setVisibility(r3)
            return
        L_0x0132:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0132 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143087By.A07(X.7By):void");
    }

    public static void A08(C143087By r4, float f, boolean z) {
        r4.A0Z = f;
        if (r4.A0J.getVisibility() != 8) {
            r4.A0Z -= C72463Mc.A00(r4.A05) * 20.0f;
        }
        float f2 = r4.A0Z;
        float max = Math.max(f2, r4.A0b);
        r4.A0m.setTranslationY(-f2);
        r4.A0T(max, z);
    }

    public static void A09(C143087By r1, float f, boolean z) {
        r1.A0b = f;
        r1.A0T(Math.max(r1.A0Z, f), z);
    }

    public static void A0B(C143087By r2, C60072nL r3) {
        Map map = r2.A1D;
        synchronized (map) {
            map.put(r3.A06, r3);
        }
        r2.A0v.postDelayed(r2.A19, 3000);
    }

    public static void A0C(C143087By r17, String str) {
        ArrayList A132;
        C60072nL r0;
        C143087By r11 = r17;
        if (r11.A0O != null) {
            List list = r11.A1A;
            list.clear();
            list.add(r11.A0O);
        } else {
            List list2 = r11.A1A;
            list2.clear();
            C27131Uv r8 = r11.A14;
            AnonymousClass1BI r1 = r11.A0I;
            synchronized (r8.A0T) {
                Map map = (Map) C27131Uv.A05(r8).get(r1);
                long A012 = AnonymousClass11P.A01(r8.A0D);
                A132 = AnonymousClass000.A13();
                if (map != null) {
                    Iterator A0l2 = C17890vO.A0l(map);
                    while (A0l2.hasNext()) {
                        C54392e4 r5 = (C54392e4) A0l2.next();
                        if (C27131Uv.A0G(r5.A00, A012) && (r0 = (C60072nL) r8.A0c.get(r5.A01)) != null) {
                            A132.add(r0);
                        }
                    }
                }
            }
            list2.addAll(A132);
            if (r8.A0d(r11.A0I)) {
                if (r11.A0P == null) {
                    AnonymousClass11S r02 = r11.A0y;
                    r02.A0I();
                    AnonymousClass1E8 r03 = r02.A0D;
                    C17960vV.A07(r03);
                    UserJid userJid = (UserJid) r03.A0J;
                    C17960vV.A07(userJid);
                    r11.A0P = new C60072nL(userJid);
                    AnonymousClass1RB r10 = r11.A0w;
                    String str2 = str;
                    Location A022 = r10.A02(str2);
                    if (A022 != null) {
                        A04(A022, r11, r11.A0P);
                    }
                    r10.A06(r11, str2, 0.0f, 3, 5000, 1000);
                }
                list2.add(0, r11.A0P);
                return;
            }
        }
        r11.A0P = null;
        r11.A07 = null;
        r11.A0w.A05(r11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r14.A0e <= 2) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r0 == 4) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.C143087By r14, boolean r15) {
        /*
            java.util.List r8 = r14.A1A
            int r2 = r8.size()
            android.view.View r0 = r14.A0k
            if (r0 == 0) goto L_0x0010
            if (r15 != 0) goto L_0x0011
            int r0 = r14.A0e
            if (r2 != r0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            r5 = 2
            float r6 = (float) r2
            if (r2 <= r5) goto L_0x0017
            r6 = 1069547520(0x3fc00000, float:1.5)
        L_0x0017:
            r13 = 1
            r4 = 0
            boolean r12 = X.C108975cc.A1D(r2, r5)
            float r3 = r14.A0Y
            r9 = 0
            if (r12 == 0) goto L_0x00f2
            float r1 = r14.A0X
        L_0x0024:
            float r1 = r1 + r3
            X.2nL r0 = r14.A0P
            if (r0 != 0) goto L_0x00ef
            X.2nL r0 = r14.A0O
            if (r0 != 0) goto L_0x00ef
            float r0 = r14.A0d
            float r0 = r0 + r3
        L_0x0030:
            float r1 = r1 + r0
            int r7 = (int) r1
            float r0 = r14.A0a
            float r6 = r6 * r0
            float r0 = (float) r7
            float r6 = r6 + r0
            int r6 = (int) r6
            r11 = 0
            if (r2 == 0) goto L_0x00eb
            r11 = 1
            if (r2 <= r5) goto L_0x00eb
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.app.Activity r0 = r14.A05
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r3 = r1.heightPixels
            android.app.Activity r0 = r14.A05
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167674(0x7f0709ba, float:1.7949628E38)
            float r1 = r1.getDimension(r0)
            int r3 = r3 / r5
            float r0 = (float) r3
            float r3 = java.lang.Math.min(r1, r0)
            float r1 = r14.A0a
            int r0 = r8.size()
            float r0 = (float) r0
            float r1 = r1 * r0
            float r0 = (float) r7
            float r1 = r1 + r0
            float r0 = java.lang.Math.min(r1, r3)
            int r3 = (int) r0
            r10 = 0
            int r0 = r14.A0e
            if (r0 > r5) goto L_0x00ed
        L_0x0079:
            int r0 = r3 - r6
            float r7 = (float) r0
            android.view.View r0 = r14.A0B
            int r0 = r0.getVisibility()
            r5 = 4
            r8 = 8
            com.whatsapp.location.DragBottomSheetIndicator r1 = r14.A0J
            if (r0 != 0) goto L_0x00da
            r0 = 8
            if (r12 == 0) goto L_0x008e
            r0 = 4
        L_0x008e:
            r1.setVisibility(r0)
            android.view.View r0 = r14.A08
            r0.setVisibility(r8)
        L_0x0096:
            android.view.View r0 = r14.A0k
            if (r11 == 0) goto L_0x00ce
            r0.setVisibility(r4)
            android.view.View r0 = r14.A0l
            r0.setVisibility(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0F
            r0.A0V(r6)
            if (r13 == 0) goto L_0x00ba
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0F
            r0.A0W(r5)
        L_0x00ae:
            float r0 = (float) r6
        L_0x00af:
            A08(r14, r0, r4)
        L_0x00b2:
            android.view.View r0 = r14.A0k
            X.AnonymousClass3MX.A1F(r0, r3)
        L_0x00b7:
            r14.A0e = r2
            return
        L_0x00ba:
            r1 = 3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0F
            if (r10 == 0) goto L_0x00c5
            r0.A0W(r1)
            float r0 = (float) r6
            float r0 = r0 + r7
            goto L_0x00af
        L_0x00c5:
            int r0 = r0.A0J
            if (r0 != r1) goto L_0x00cb
            float r0 = (float) r3
            goto L_0x00af
        L_0x00cb:
            if (r0 != r5) goto L_0x00b2
            goto L_0x00ae
        L_0x00ce:
            r0.setVisibility(r8)
            android.view.View r0 = r14.A0l
            r0.setVisibility(r8)
            A08(r14, r9, r4)
            goto L_0x00b7
        L_0x00da:
            int r0 = X.C72453Mb.A0J(r12)
            r1.setVisibility(r0)
            android.view.View r1 = r14.A08
            int r0 = X.C72453Mb.A0J(r12)
            r1.setVisibility(r0)
            goto L_0x0096
        L_0x00eb:
            r3 = r6
            r10 = 1
        L_0x00ed:
            r13 = 0
            goto L_0x0079
        L_0x00ef:
            r0 = 0
            goto L_0x0030
        L_0x00f2:
            r1 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143087By.A0D(X.7By, boolean):void");
    }

    public static boolean A0F(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.A01;
        double d = latLng.A00;
        LatLng latLng2 = latLngBounds.A00;
        if (d - latLng2.A00 > 80.0d) {
            return false;
        }
        double d2 = latLng2.A01 - latLng.A01;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        if (d2 <= 90.0d) {
            return true;
        }
        return false;
    }

    public LatLng A0I() {
        double latitude;
        double longitude;
        if (this.A0r != null) {
            Iterator it = this.A1A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C60072nL r5 = (C60072nL) it.next();
                if (r5 != null && r5.A05 > 0 && r5.A06.equals(this.A0r)) {
                    latitude = r5.A00;
                    longitude = r5.A01;
                    break;
                }
            }
        }
        Location A022 = this.A0w.A02("group-chat-live-location-ui");
        if (A022 == null) {
            return null;
        }
        latitude = A022.getLatitude();
        longitude = A022.getLongitude();
        return new LatLng(latitude, longitude);
    }

    public C139086yC A0K(C60072nL r6) {
        if (r6 == null) {
            return null;
        }
        for (C139086yC r3 : this.A1B) {
            List list = r3.A04;
            if (list.size() > 1 && list.contains(r6)) {
                return r3;
            }
        }
        return null;
    }

    public String A0M(C139086yC r10) {
        List<C60072nL> list = r10.A04;
        if (list.size() == 1 && this.A0y.A0O(((C60072nL) list.get(0)).A06)) {
            return this.A05.getString(2131898601);
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (C60072nL r0 : list) {
            A132.add(r0.A06);
        }
        C18000vb r6 = this.A12;
        long size = (long) A132.size();
        return r6.A0K(new Object[]{r6.A0F(this.A10.A0Z(A132, 3))}, 2131755218, size);
    }

    public void A0O() {
        this.A0H.A02();
        this.A1Q.unregisterObserver(this.A1P);
        this.A1K.unregisterObserver(this.A1J);
        this.A1S.unregisterObserver(this.A1R);
        this.A1U.unregisterObserver(this.A1T);
    }

    public void A0P() {
        this.A1H.unregisterObserver(this);
        this.A04 = 0;
        Handler handler = this.A0v;
        handler.removeCallbacks(this.A18);
        C27101Us r6 = this.A16;
        C27131Uv r3 = this.A14;
        AnonymousClass1BI A0K2 = r3.A0K(this.A0I);
        AnonymousClass7RV r5 = new AnonymousClass7RV(A0K2);
        AnonymousClass00H r7 = r6.A02;
        String A0T2 = C17890vO.A0T(r7);
        C17900vP.A0f("LocationSubscriptionSendMethods/unsubscribe; iqId=", A0T2, AnonymousClass000.A10());
        AnonymousClass1OZ A0U2 = C17880vN.A0U(r7);
        C29621ca r72 = new C29621ca("unsubscribe", (AnonymousClass1MD[]) null);
        ArrayList A0z2 = C17880vN.A0z(5);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T2, A0z2);
        C17890vO.A11("xmlns", "location", A0z2);
        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A0z2);
        A0z2.add(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        A0z2.add(new AnonymousClass1MD((Jid) A0K2, "target"));
        A0U2.A0I(new AnonymousClass7LL(r6, r5, r5, 0), new C29621ca(r72, "iq", (AnonymousClass1MD[]) A0z2.toArray(C27101Us.A05)), A0T2, 83, 32000);
        handler.removeCallbacks(this.A1Y);
        handler.removeCallbacks(this.A19);
        this.A0w.A05(this);
        this.A07 = null;
        this.A1N.A02(this.A0g, this.A05);
        r3.A0X.remove(this.A1X);
        r3.A0W.remove(this.A1W);
    }

    public void A0U(Activity activity, Bundle bundle) {
        Activity activity2 = activity;
        this.A05 = activity2;
        this.A0a = activity2.getResources().getDimension(2131166950);
        this.A0c = activity2.getResources().getDimension(2131167311);
        this.A0X = activity2.getResources().getDimension(2131167304);
        this.A0d = activity2.getResources().getDimension(2131168994);
        this.A0Y = activity2.getResources().getDimension(2131167308);
        this.A00 = activity2.getResources().getDimension(2131167306);
        this.A01 = activity2.getResources().getDimension(2131167307);
        this.A0H = this.A1L.A06(activity2, "group-chat-live-locations-ui");
        String A0u2 = C72453Mb.A0u(activity2);
        C22931Dv r5 = AnonymousClass1BI.A00;
        AnonymousClass1BI A022 = r5.A02(A0u2);
        C17960vV.A07(A022);
        this.A0I = A022;
        String stringExtra = activity2.getIntent().getStringExtra("target");
        C22941Dw r2 = UserJid.Companion;
        this.A0r = r2.A04(stringExtra);
        UserJid A042 = r2.A04(activity2.getIntent().getStringExtra("final_location_jid"));
        long longExtra = activity2.getIntent().getLongExtra("final_location_timestamp", 0);
        if (A042 != null && longExtra > 0) {
            C60072nL r8 = new C60072nL(A042);
            this.A0O = r8;
            r8.A05 = longExtra;
            r8.A00 = activity2.getIntent().getDoubleExtra("final_location_latitude", 0.0d);
            this.A0O.A01 = activity2.getIntent().getDoubleExtra("final_location_longitude", 0.0d);
        }
        this.A0S = this.A0w.A07();
        A0C(this, "group-chat-live-location-ui-oncreate");
        this.A0D = (RecyclerView) activity2.findViewById(2131436616);
        this.A0k = activity2.findViewById(2131432085);
        this.A0J = (DragBottomSheetIndicator) activity2.findViewById(2131430176);
        this.A0m = activity2.findViewById(2131432266);
        this.A0l = activity2.findViewById(2131432086);
        View view = this.A0k;
        int i = 8;
        if (view != null) {
            view.setVisibility(8);
            this.A0l.setVisibility(8);
            this.A0J.setVisibility(8);
            this.A0F = new C114345qY(this);
            BottomSheetBehavior bottomSheetBehavior = this.A0F;
            ((C37891qK) this.A0k.getLayoutParams()).A00(bottomSheetBehavior);
            bottomSheetBehavior.A0d(false);
            C114315qV.A00(this.A0F, this, 9);
            this.A08 = activity2.findViewById(2131430177);
            C825148g r1 = new C825148g(this, 49);
            this.A0J.setOnClickListener(r1);
            this.A08.setOnClickListener(r1);
        }
        this.A0A = activity2.findViewById(2131435118);
        this.A0p = (TextView) activity2.findViewById(2131435117);
        this.A0E = (RecyclerView) activity2.findViewById(2131435112);
        AnonymousClass3Ma.A1D(activity2.findViewById(2131435100), this, 0);
        this.A0o = activity2.findViewById(2131435115);
        View findViewById = activity2.findViewById(2131431933);
        this.A09 = findViewById;
        View view2 = this.A0o;
        if (view2 != null) {
            BottomSheetBehavior A023 = BottomSheetBehavior.A02(view2);
            this.A0G = A023;
            C114315qV.A00(A023, this, 10);
            BottomSheetBehavior bottomSheetBehavior2 = this.A0G;
            bottomSheetBehavior2.A0h = true;
            bottomSheetBehavior2.A0W(5);
        } else {
            AnonymousClass79A.A00(findViewById.getViewTreeObserver(), this, 0);
        }
        this.A06 = C24261Jm.A00(activity2, 2131231565);
        C112645lo r11 = new C112645lo(this, 0);
        List<C60072nL> list = this.A1A;
        this.A0K = new C112055kr(this, list, false);
        AnonymousClass3Ma.A15(activity2, this.A0D);
        this.A0D.setAdapter(this.A0K);
        RecyclerView recyclerView = this.A0D;
        recyclerView.A0R = true;
        recyclerView.A0r(r11);
        List list2 = this.A1C;
        this.A0u = new C112055kr(this, list2, true);
        AnonymousClass3Ma.A15(activity2, this.A0E);
        this.A0E.setAdapter(this.A0u);
        RecyclerView recyclerView2 = this.A0E;
        recyclerView2.A0R = true;
        recyclerView2.A0r(r11);
        this.A0q = (TextEmojiLabel) activity2.findViewById(2131435610);
        this.A0B = activity2.findViewById(2131435663);
        A0D(this, true);
        this.A1Q.registerObserver(this.A1P);
        this.A1S.registerObserver(this.A1R);
        this.A1K.registerObserver(this.A1J);
        this.A1U.registerObserver(this.A1T);
        View inflate = View.inflate(this.A05, 2131624668, (ViewGroup) null);
        this.A0j = inflate;
        ContactLiveLocationThumbnail contactLiveLocationThumbnail = (ContactLiveLocationThumbnail) inflate.findViewById(2131429433);
        this.A0s = contactLiveLocationThumbnail;
        AnonymousClass1VW r112 = this.A1I;
        Context context = contactLiveLocationThumbnail.getContext();
        int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(2131168739);
        C18070vi.A0d(context, 0);
        this.A0h = r112.A04(context, (AnonymousClass1VX) null, 0.0f, 2131231047, dimensionPixelSize);
        Context context2 = this.A0s.getContext();
        int dimensionPixelSize2 = activity2.getResources().getDimensionPixelSize(2131167310);
        C18070vi.A0d(context2, 0);
        this.A0i = r112.A04(context2, (AnonymousClass1VX) null, 0.0f, 2131231047, dimensionPixelSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A0j.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0j.layout(0, 0, this.A0j.getMeasuredWidth(), this.A0j.getMeasuredHeight());
        View inflate2 = View.inflate(this.A05, 2131624669, (ViewGroup) null);
        this.A0n = inflate2;
        this.A0t = (ContactLiveLocationThumbnail) inflate2.findViewById(2131429433);
        this.A0n.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0f = this.A0n.getMeasuredWidth();
        int measuredHeight = this.A0n.getMeasuredHeight();
        this.A02 = measuredHeight;
        this.A0n.layout(0, 0, this.A0f, measuredHeight);
        Bundle bundle2 = bundle;
        if (bundle != null) {
            this.A0U = bundle2.getBoolean("map_follow_user", false);
            this.A0W = bundle2.getBoolean("map_touched", false);
            AnonymousClass1BI A024 = r5.A02(bundle2.getString("selected_user_jid"));
            if (A024 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C60072nL r3 = (C60072nL) it.next();
                    if (r3.A06.equals(A024)) {
                        this.A0Q = r3;
                        break;
                    }
                }
            }
            HashSet A122 = C17880vN.A12();
            C22971Dz.A0G(UserJid.class, bundle2.getStringArrayList("selected_user_jids"), A122);
            if (!A122.isEmpty()) {
                for (C60072nL r32 : list) {
                    if (A122.contains(r32.A06)) {
                        list2.add(r32);
                    }
                }
                Collections.sort(list2, new C146947Rf(this.A0y, this.A0z, this.A10));
                this.A0u.notifyDataSetChanged();
                A02();
            }
        }
        View findViewById2 = activity2.findViewById(2131437107);
        this.A0C = findViewById2;
        AnonymousClass3Ma.A1D(findViewById2, this, 1);
        View view3 = this.A0C;
        if (this.A0W && this.A0O == null) {
            i = 0;
        }
        view3.setVisibility(i);
        this.A0M = new C129066hC(this.A15, new C146947Rf(this.A0y, this.A0z, this.A10), (float) this.A0f, (float) this.A02);
        LocationSharingService.A03(activity2.getApplicationContext(), this.A1G, this.A1O, this.A14);
    }

    public void A0V(Bundle bundle) {
        bundle.putBoolean("map_follow_user", this.A0U);
        bundle.putBoolean("map_touched", this.A0W);
        C60072nL r0 = this.A0Q;
        if (r0 != null) {
            bundle.putString("selected_user_jid", r0.A06.getRawString());
        }
        List<C60072nL> list = this.A1C;
        if (!list.isEmpty()) {
            ArrayList A142 = AnonymousClass000.A14(list);
            for (C60072nL r02 : list) {
                A142.add(r02.A06.getRawString());
            }
            bundle.putStringArrayList("selected_user_jids", A142);
        }
    }

    public void A0Y(C6N c6n) {
        List<C60072nL> list;
        C139086yC r1;
        C129066hC r5 = this.A0M;
        C60072nL r0 = this.A0O;
        if (r0 != null) {
            list = Collections.singletonList(r0);
        } else {
            long A012 = AnonymousClass11P.A01(this.A11);
            ArrayList A132 = AnonymousClass000.A13();
            for (C60072nL r4 : this.A1A) {
                if (r4 != null && (r4.A05 + 86400000 > A012 || this.A0y.A0O(r4.A06))) {
                    A132.add(r4);
                }
            }
            list = A132;
        }
        C60072nL r42 = this.A0Q;
        List list2 = this.A1C;
        ArrayList A133 = AnonymousClass000.A13();
        for (C60072nL r7 : list) {
            AnonymousClass3Ma.A1P(r7, c6n.A00(new LatLng(r7.A00, r7.A01)), A133);
        }
        C147027Rn.A01(18, A133);
        ArrayList A134 = AnonymousClass000.A13();
        Iterator it = A133.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            C19760yx r3 = (C19760yx) it.next();
            if (r3.A00 != r42) {
                float f = ((float) i) + r5.A00;
                int i2 = ((Point) r3.A01).x;
                if (f < ((float) i2)) {
                    A134.add(C108965cb.A0s(r3));
                    i = i2;
                } else {
                    ((List) A134.get(AnonymousClass000.A0Q(A134))).add(r3);
                }
            }
        }
        ArrayList A135 = AnonymousClass000.A13();
        Iterator it2 = A134.iterator();
        while (it2.hasNext()) {
            List<C19760yx> list3 = (List) it2.next();
            C147027Rn.A01(19, list3);
            int i3 = Integer.MIN_VALUE;
            for (C19760yx r12 : list3) {
                Object obj = r12.A00;
                if (obj != r42) {
                    float f2 = ((float) i3) + r5.A01;
                    int i4 = ((Point) r12.A01).y;
                    if (f2 < ((float) i4)) {
                        A135.add(C108965cb.A0s(obj));
                        i3 = i4;
                    } else {
                        ((List) A135.get(AnonymousClass000.A0Q(A135))).add(obj);
                    }
                }
            }
        }
        if (r42 != null) {
            A135.add(C108965cb.A0s(r42));
        }
        ArrayList A136 = AnonymousClass000.A13();
        Iterator it3 = A135.iterator();
        while (it3.hasNext()) {
            List list4 = (List) it3.next();
            Collections.sort(list4, r5.A03);
            A136.add(new C139086yC(r5.A02, list4, 0));
        }
        List<C139086yC> list5 = this.A1B;
        synchronized (list5) {
            list5.clear();
            list5.addAll(A136);
            int i5 = 0;
            int i6 = 1;
            if (this.A0O != null) {
                list5.clear();
                C60072nL r13 = this.A0O;
                if (this.A0Q != null) {
                    i5 = 1;
                }
                list5.add(new C139086yC(r13, i5));
            } else if (!list2.isEmpty()) {
                C139086yC r32 = null;
                for (C139086yC r2 : list5) {
                    List list6 = r2.A04;
                    ArrayList A102 = C17880vN.A10(list2);
                    A102.retainAll(list6);
                    if (A102.size() > i6) {
                        i6 = A102.size();
                        r32 = r2;
                    }
                }
                if (r32 != null) {
                    A0X(r32, false);
                } else {
                    A0N();
                }
            } else {
                C60072nL r33 = this.A0Q;
                if (r33 != null) {
                    Iterator it4 = list5.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            r1 = null;
                            break;
                        }
                        r1 = (C139086yC) it4.next();
                        if (r1.A02 == r33) {
                            break;
                        }
                    }
                    A0E(r1);
                }
            }
        }
    }

    public void A0a(Float f) {
        C127346eC r5 = this.A0L;
        if (r5 == null) {
            return;
        }
        if (f == null || ((double) C108945cZ.A00(r5.A00, f.floatValue())) <= 0.05d) {
            String A012 = A01(r5.A01);
            this.A0L = null;
            for (C139086yC r1 : this.A1B) {
                if (A012.equals(A01(r1.A04))) {
                    A0X(r1, false);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1LU, java.lang.Object] */
    public boolean A0b(int i, int i2) {
        Activity activity = this.A05;
        if (activity != null) {
            LocationSharingService.A03(activity.getApplicationContext(), this.A1G, this.A1O, this.A14);
        }
        if (i == 34) {
            if (i2 != -1) {
                return false;
            }
            this.A15.A07(this.A05, this.A0I);
        } else if (i != 100) {
            return false;
        } else {
            if (i2 == 1000) {
                AnonymousClass1L9 r3 = this.A1F;
                Activity activity2 = this.A05;
                r3.A09(activity2, AnonymousClass3MY.A06(activity2, new Object(), this.A0I));
                this.A05.finish();
                return true;
            }
        }
        return true;
    }

    public void onLocationChanged(Location location) {
        if (C27091Ur.A01(location, this.A07)) {
            this.A07 = location;
            C60072nL r0 = this.A0P;
            if (r0 != null) {
                A04(location, this, r0);
                this.A0K.notifyDataSetChanged();
                if (this.A0R) {
                    this.A0R = false;
                } else {
                    A0B(this, this.A0P);
                    return;
                }
            } else if (!this.A14.A0d(this.A0I)) {
                return;
            }
            A06(this);
        }
    }

    public C143087By(AnonymousClass1L9 r5, AnonymousClass195 r6, AnonymousClass1RB r7, AnonymousClass1KB r8, AnonymousClass11S r9, C23651Hc r10, AnonymousClass1VW r11, AnonymousClass1M9 r12, C24671Lf r13, C24921Me r14, C27201Vd r15, C27191Vc r16, C29831cw r17, AnonymousClass11P r18, C219217x r19, C18000vb r20, AnonymousClass1Q1 r21, C24681Lg r22, C18030ve r23, C25191Ng r24, AnonymousClass1LU r25, C27131Uv r26, AnonymousClass689 r27, C27101Us r28, AnonymousClass10I r29) {
        this.A11 = r18;
        this.A13 = r23;
        this.A0x = r8;
        this.A0y = r9;
        this.A1V = r25;
        this.A17 = r29;
        this.A1F = r5;
        this.A1L = r15;
        this.A15 = r27;
        this.A1I = r11;
        this.A0z = r12;
        this.A10 = r14;
        this.A12 = r20;
        this.A1K = r13;
        this.A1S = r22;
        this.A1H = r10;
        this.A1Q = r21;
        this.A0w = r7;
        C219217x r1 = r19;
        this.A1O = r1;
        this.A1N = r17;
        this.A14 = r26;
        this.A1G = r6;
        this.A0T = r1.A06();
        this.A1M = r16;
        this.A1U = r24;
        this.A16 = r28;
    }

    public static String A01(List list) {
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A132.add(((C60072nL) it.next()).A06.getRawString());
        }
        Collections.sort(A132);
        return TextUtils.join("|", A132);
    }

    public static void A04(Location location, C143087By r4, C60072nL r5) {
        r5.A00 = location.getLatitude();
        r4.A0P.A01 = location.getLongitude();
        r4.A0P.A05 = location.getTime();
        r4.A0P.A02 = location.getSpeed();
        r4.A0P.A03 = (int) location.getAccuracy();
        r4.A0P.A04 = (int) location.getBearing();
    }

    private void A0E(C139086yC r10) {
        ArrayList A132 = AnonymousClass000.A13();
        List<C139086yC> list = this.A1B;
        synchronized (list) {
            if (r10 == null) {
                this.A0N = null;
                for (C139086yC r0 : list) {
                    A132.add(new C139086yC(this.A15, r0.A04, 0));
                }
            } else {
                for (C139086yC r4 : list) {
                    if (r4 == r10) {
                        A132.add(new C139086yC(this.A15, r4.A04, 1));
                        this.A0N = r4;
                    } else {
                        A132.add(new C139086yC(this.A15, r4.A04, 2));
                    }
                }
            }
            list.clear();
            list.addAll(A132);
            this.A0V = false;
        }
    }

    public Bitmap A0G(C139086yC r23) {
        ContactLiveLocationThumbnail contactLiveLocationThumbnail;
        View view;
        List list;
        boolean z;
        boolean z2;
        Bitmap A022;
        Activity activity;
        int i;
        ArrayList A132 = AnonymousClass000.A13();
        C139086yC r8 = r23;
        int i2 = r8.A00;
        float f = 1.0f;
        if (i2 == 1) {
            contactLiveLocationThumbnail = this.A0t;
            view = this.A0n;
            list = r8.A04;
            if (list.size() == 1) {
                AnonymousClass1E7 A0H2 = this.A0z.A0H(((C60072nL) list.get(0)).A06);
                C27191Vc r13 = this.A1M;
                Activity activity2 = this.A05;
                AnonymousClass1E7 r15 = A0H2;
                Activity activity3 = activity2;
                Bitmap A042 = r13.A04(activity3, r15, "GroupChatLiveLocationsUi.generateMarkerBitmap_A", this.A05.getResources().getDimension(2131167309), activity2.getResources().getDimensionPixelSize(2131167310), true);
                if (A042 == null) {
                    A042 = this.A1I.A06(contactLiveLocationThumbnail.getContext(), A0H2);
                    z2 = true;
                } else {
                    z2 = false;
                }
                A132.add(A042);
            } else {
                for (int i3 = 0; i3 < Math.min(list.size(), 4); i3++) {
                    AnonymousClass1E7 A0H3 = this.A0z.A0H(((C60072nL) list.get(i3)).A06);
                    C27191Vc r14 = this.A1M;
                    Activity activity4 = this.A05;
                    Bitmap A043 = r14.A04(activity4, A0H3, "GroupChatLiveLocationsUi.generateMarkerBitmap_B", 0.0f, activity4.getResources().getDimensionPixelSize(2131167310), true);
                    if (A043 == null) {
                        A043 = this.A0i;
                    }
                    A132.add(A043);
                }
                z2 = false;
            }
        } else {
            contactLiveLocationThumbnail = this.A0s;
            view = this.A0j;
            list = r8.A04;
            if (list.size() == 1) {
                AnonymousClass1E7 A0H4 = this.A0z.A0H(((C60072nL) list.get(0)).A06);
                C27191Vc r152 = this.A1M;
                Activity activity5 = this.A05;
                Activity activity6 = activity5;
                AnonymousClass1E7 r17 = A0H4;
                Bitmap A044 = r152.A04(activity6, r17, "GroupChatLiveLocationsUi.generateMarkerBitmap_C", this.A05.getResources().getDimension(2131168737), activity5.getResources().getDimensionPixelSize(2131168739), true);
                if (A044 == null) {
                    A044 = this.A1I.A06(contactLiveLocationThumbnail.getContext(), A0H4);
                    z = true;
                } else {
                    z = false;
                }
                A132.add(A044);
            } else {
                for (int i4 = 0; i4 < Math.min(list.size(), 4); i4++) {
                    AnonymousClass1E7 A0H5 = this.A0z.A0H(((C60072nL) list.get(i4)).A06);
                    Activity activity7 = this.A05;
                    Bitmap A045 = this.A1M.A04(activity7, A0H5, "GroupChatLiveLocationsUi.generateMarkerBitmap_D", 0.0f, activity7.getResources().getDimensionPixelSize(2131168739), true);
                    if (A045 == null) {
                        A045 = this.A0h;
                    }
                    A132.add(A045);
                }
                z = false;
            }
            if (i2 == 2) {
                f = 0.3f;
            }
        }
        contactLiveLocationThumbnail.setAlpha(f);
        if (A132.size() == 1) {
            A022 = (Bitmap) A132.get(0);
        } else {
            A022 = C27201Vd.A02(A132, 0.0f);
        }
        contactLiveLocationThumbnail.setImageBitmap(A022);
        int i5 = r8.A01;
        if (i5 == 0) {
            activity = this.A05;
            i = AnonymousClass1YL.A00(activity, 2130970363, 2131101338);
            contactLiveLocationThumbnail.A00 = C19740yt.A00(activity, i);
        } else if (i5 != 1) {
            contactLiveLocationThumbnail.A00 = 0;
        } else {
            activity = this.A05;
            i = 2131101341;
            contactLiveLocationThumbnail.A00 = C19740yt.A00(activity, i);
        }
        contactLiveLocationThumbnail.A02 = z2;
        contactLiveLocationThumbnail.A01 = list.size();
        Bitmap A0H6 = C108995ce.A0H(view);
        view.draw(C108945cZ.A0I(A0H6));
        return A0H6;
    }

    public C139086yC A0J(LatLng latLng) {
        C6N A0L2 = A0L();
        if (A0L2 != null) {
            Point A002 = A0L2.A00(latLng);
            Point point = new Point(A002.x - (this.A0f / 2), A002.y - (this.A02 / 2));
            Point point2 = new Point(A002.x + (this.A0f / 2), A002.y + (this.A02 / 2));
            C25123CYw cYw = new C25123CYw();
            cYw.A01(A0L2.A01(point));
            cYw.A01(A0L2.A01(point2));
            LatLngBounds A003 = cYw.A00();
            for (C139086yC r1 : this.A1B) {
                if (A003.A00(r1.A00())) {
                    return r1;
                }
            }
        }
        return null;
    }

    public void A0X(C139086yC r6, boolean z) {
        A0E(r6);
        List list = r6.A04;
        if (list.size() == 1) {
            A0A(this, (C60072nL) C108955ca.A0p(list));
            return;
        }
        this.A0Q = null;
        List list2 = this.A1C;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new C146947Rf(this.A0y, this.A0z, this.A10));
        this.A0u.notifyDataSetChanged();
        A02();
        if (z) {
            A06(this);
        }
    }

    public void BvR() {
        A03();
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return Math.max(Math.min(Math.log((sin + 1.0d) / (1.0d - sin)) / 2.0d, 3.141592653589793d), -3.141592653589793d) / 2.0d;
    }
}
