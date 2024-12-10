package com.whatsapp.thunderstorm;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6J2;
import X.AnonymousClass73G;
import X.AnonymousClass7AS;
import X.AnonymousClass7RD;
import X.BZ9;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C111815kT;
import X.C131716lY;
import X.C131726lZ;
import X.C136046tB;
import X.C140096zw;
import X.C1423379b;
import X.C154197qk;
import X.C154207ql;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C19740yt;
import X.C20113A7w;
import X.C21423Ajq;
import X.C24521Kq;
import X.C29431cG;
import X.C30391dr;
import X.C36401np;
import X.C72473Md;
import X.C88584aA;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ThunderstormConnectionsInfoActivity extends AnonymousClass1FY {
    public RecyclerView A00;
    public C24521Kq A01;
    public C111815kT A02;
    public ThunderstormReceiverBottomsheet A03;
    public C36401np A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public Runnable A07;
    public Runnable A08;
    public String A09;
    public List A0A;
    public C18600wl A0B;
    public AnonymousClass1OX A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public String[] A0H;
    public final Handler A0I;
    public final C131716lY A0J;
    public final List A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C131726lZ A0N;

    public final void A4b(C140096zw r5, String str, boolean z) {
        long j;
        AnonymousClass73G A0d = C108965cb.A0d(this);
        if (A0d.A05) {
            A0d.A03();
            A0d.A02();
        }
        A0c(this, str, 0);
        AnonymousClass7RD r3 = new AnonymousClass7RD(r5, this, 11);
        this.A08 = r3;
        if (z) {
            j = C20113A7w.A0L;
        } else {
            j = 4000;
        }
        this.A0I.postDelayed(r3, j);
    }

    private final void A03() {
        C140096zw r2 = new C140096zw((Integer) null, (String) null, (String) null, 1, 988);
        C108955ca.A1C(this, r2.A04, 2131896883);
        this.A0K.add(r2);
    }

    public static final void A0Q(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity, C140096zw r4) {
        List list = thunderstormConnectionsInfoActivity.A0K;
        int indexOf = list.indexOf(r4);
        if (indexOf > 0) {
            list.remove(indexOf);
            list.add(0, r4);
            C111815kT r1 = thunderstormConnectionsInfoActivity.A02;
            if (r1 == null) {
                C18070vi.A11("contactListAdapter");
                throw null;
            } else {
                r1.A0W(C29431cG.A0t(list));
            }
        }
    }

    public static final void A0c(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity, String str, int i) {
        for (C140096zw r1 : thunderstormConnectionsInfoActivity.A0K) {
            if (!C18070vi.A18(r1.A00, str)) {
                AnonymousClass3MX.A1K(r1.A02, i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.6zw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.6zw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: X.6zw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.6zw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0q(com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r15, java.util.List r16) {
        /*
            X.0vl r3 = r15.A0L
            X.73G r0 = X.C108945cZ.A10(r3)
            java.util.HashMap r0 = r0.A0E
            java.util.Collection r0 = X.C108955ca.A17(r0)
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            X.6tB r0 = (X.C136046tB) r0
            java.lang.String r0 = r0.A04
            r4.add(r0)
            goto L_0x0014
        L_0x0026:
            java.util.List r2 = r15.A0K
            X.81U r0 = new X.81U
            r0.<init>(r4)
            X.C29401cD.A0N(r2, r0)
            java.util.Iterator r8 = r16.iterator()
        L_0x0034:
            boolean r0 = r8.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x0096
            java.lang.String r12 = X.C17880vN.A0v(r8)
            X.73G r0 = X.C108945cZ.A10(r3)
            java.util.HashMap r0 = r0.A0E
            java.lang.Object r4 = r0.get(r12)
            X.6tB r4 = (X.C136046tB) r4
            if (r4 == 0) goto L_0x008c
            java.util.Iterator r6 = r2.iterator()
        L_0x0051:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.6zw r0 = (X.C140096zw) r0
            java.lang.String r1 = r0.A08
            java.lang.String r0 = r4.A04
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0051
            r7 = r5
        L_0x0069:
            X.6zw r7 = (X.C140096zw) r7
            if (r7 == 0) goto L_0x0070
            r7.A00 = r12
            goto L_0x0034
        L_0x0070:
            java.lang.String r11 = r4.A04
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r14 = 980(0x3d4, float:1.373E-42)
            r13 = 0
            X.6zw r9 = new X.6zw
            r9.<init>(r10, r11, r12, r13, r14)
            X.1DT r1 = r9.A04
            java.lang.String r0 = r4.A03
            r1.A0E(r0)
            r2.add(r9)
            goto L_0x0034
        L_0x008c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "thunderstorm_logs: ThunderstormConnectionsInfoActivity/ onDiscoveredEndpointIdsChanged: no endpoint found for id: "
            X.C17900vP.A0g(r0, r12, r1)
            goto L_0x0034
        L_0x0096:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x009f
            r15.A03()
        L_0x009f:
            X.5kT r1 = r15.A02
            if (r1 != 0) goto L_0x00aa
            java.lang.String r0 = "contactListAdapter"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00aa:
            java.util.List r0 = X.C29431cG.A0t(r2)
            r1.A0W(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity.A0q(com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity, java.util.List):void");
    }

    public static final void A0r(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity, boolean z) {
        if (thunderstormConnectionsInfoActivity.A0G != z) {
            thunderstormConnectionsInfoActivity.A0G = z;
            Window window = thunderstormConnectionsInfoActivity.getWindow();
            if (z) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    private final boolean A0s(Intent intent) {
        List parcelableArrayListExtra;
        if (intent.hasExtra("android.intent.extra.STREAM")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class);
            } else {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = C18460wS.A00;
            }
            this.A0A = parcelableArrayListExtra;
            parcelableArrayListExtra.size();
        } else {
            this.A0A = C18460wS.A00;
        }
        if (AnonymousClass000.A1a(this.A0A)) {
            AnonymousClass1OX r2 = this.A0C;
            if (r2 != null) {
                AnonymousClass3MX.A1Q(new ThunderstormConnectionsInfoActivity$setMediaUris$1(this, (C30391dr) null), r2);
            } else {
                C18070vi.A11("applicationScope");
                throw null;
            }
        }
        return AnonymousClass000.A1a(this.A0A);
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0c(A0A2, r1, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A0C = (AnonymousClass1OX) A0A2.A9C.get();
            this.A0B = AnonymousClass3MZ.A1B(A0A2);
            this.A04 = AnonymousClass3MY.A0e(r1);
            this.A05 = C000200d.A00(r1.AI3);
            this.A01 = (C24521Kq) A0A2.ABc.get();
            this.A06 = AnonymousClass3MW.A0s(A0A2);
        }
    }

    public void finish() {
        if (!this.A0D || !this.A0E) {
            super.finish();
            return;
        }
        this.A0M.getValue();
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(getPackageName(), "com.whatsapp.Main");
        A0A2.addFlags(335577088);
        startActivity(A0A2);
        finishAffinity();
    }

    public ThunderstormConnectionsInfoActivity(int i) {
        this.A0F = false;
        C1423379b.A00(this, 7);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.6ta, java.lang.Object] */
    public static final void A0V(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity, String str) {
        AnonymousClass73G A0d = C108965cb.A0d(thunderstormConnectionsInfoActivity);
        AnonymousClass6J2 r2 = A0d.A0B;
        r2.A00 = 0;
        r2.A02 = 0;
        r2.A03 = 0;
        r2.A01 = 0;
        r2.A04.clear();
        r2.A05.clear();
        r2.A00 = 0;
        r2.A01.clear();
        A0d.A0C.A01();
        A0d.A00 = 0;
        C136046tB r0 = (C136046tB) A0d.A0E.get(str);
        if (r0 != null) {
            r0.A00 = 0;
        }
        ? obj = new Object();
        obj.A00 = 0.0d;
        obj.A05 = null;
        obj.A02 = null;
        obj.A04 = null;
        obj.A01 = null;
        obj.A03 = null;
        A0d.A02 = obj;
        if (!thunderstormConnectionsInfoActivity.A0D || !AnonymousClass000.A1a(thunderstormConnectionsInfoActivity.A0A)) {
            thunderstormConnectionsInfoActivity.A0A = C18460wS.A00;
            return;
        }
        AnonymousClass1OX r1 = thunderstormConnectionsInfoActivity.A0C;
        if (r1 != null) {
            AnonymousClass3MX.A1Q(new ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1(thunderstormConnectionsInfoActivity, (C30391dr) null), r1);
        } else {
            C18070vi.A11("applicationScope");
            throw null;
        }
    }

    public static final void A0d(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity, String str, long j, long j2, boolean z) {
        Object obj;
        int i = 2131896887;
        if (z) {
            i = 2131896886;
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = thunderstormConnectionsInfoActivity.A00.A0M().format(((double) ((int) ((((double) j) * 100.0d) / ((double) j2)))) / 100.0d);
        String A10 = AnonymousClass3Ma.A10(thunderstormConnectionsInfoActivity, C88584aA.A02(thunderstormConnectionsInfoActivity.A00, j2), A1b, 1, i);
        Iterator it = thunderstormConnectionsInfoActivity.A0K.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C140096zw.A00(obj, str)) {
                break;
            }
        }
        C140096zw r1 = (C140096zw) obj;
        if (r1 != null) {
            r1.A03.A0E(A10);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        super.onActivityResult(i, i2, intent);
        if (i == 22 && i2 == -1 && intent != null && A0s(intent)) {
            String str = this.A09;
            if (str != null) {
                Iterator it = this.A0K.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C140096zw.A00(obj, str)) {
                        break;
                    }
                }
                C140096zw r2 = (C140096zw) obj;
                if (r2 != null) {
                    C108955ca.A1C(this, r2.A03, 2131896885);
                    AnonymousClass3MX.A1K(r2.A02, 2);
                }
                if (r2 != null) {
                    AnonymousClass3MX.A1K(r2.A06, 1);
                }
                A0c(this, str, 1);
                AnonymousClass1OX r1 = this.A0C;
                if (r1 != null) {
                    AnonymousClass3MX.A1Q(new ThunderstormConnectionsInfoActivity$onActivityResult$1$1$1(this, str, (C30391dr) null), r1);
                } else {
                    C18070vi.A11("applicationScope");
                    throw null;
                }
            }
            this.A09 = null;
        }
    }

    public void onCreate(Bundle bundle) {
        String string;
        AnonymousClass1DT r1;
        int valueOf;
        super.onCreate(bundle);
        C18100vl r5 = this.A0L;
        r5.getValue();
        this.A0H = AnonymousClass73G.A01();
        int A1S = C72473Md.A1S(this);
        setContentView(2131627195);
        C131716lY r2 = this.A0J;
        C36401np r12 = this.A04;
        if (r12 != null) {
            this.A02 = new C111815kT(this, r2, r12);
            ViewStub viewStub = (ViewStub) findViewById(2131436143);
            if (viewStub != null && viewStub.findViewById(2131436144) == null) {
                View inflate = viewStub.inflate();
                C18070vi.A0z(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView = (RecyclerView) inflate;
                this.A00 = recyclerView;
                if (recyclerView != null) {
                    C111815kT r0 = this.A02;
                    if (r0 != null) {
                        recyclerView.setAdapter(r0);
                        RecyclerView recyclerView2 = this.A00;
                        if (recyclerView2 != null) {
                            recyclerView2.setLayoutManager(new ThunderstormConnectionsInfoActivity$initContactListView$1(recyclerView2.getContext()));
                            RecyclerView recyclerView3 = this.A00;
                            if (recyclerView3 != null) {
                                recyclerView3.setVisibility(0);
                            }
                        }
                    }
                    C18070vi.A11("contactListAdapter");
                }
                C18070vi.A11("contactListView");
            }
            List A10 = AnonymousClass3MW.A10(C108945cZ.A10(r5).A06);
            if (A10 != null) {
                A0q(this, A10);
            } else {
                A03();
            }
            C111815kT r13 = this.A02;
            if (r13 != null) {
                List<C140096zw> list = this.A0K;
                r13.A0W(C29431cG.A0t(list));
                Collection A17 = C108955ca.A17(C108945cZ.A10(r5).A0E);
                if (!A17.isEmpty()) {
                    Iterator it = A17.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((C136046tB) it.next()).A00 != 0) {
                            for (C140096zw r6 : list) {
                                C136046tB r14 = (C136046tB) C108945cZ.A10(r5).A0E.get(r6.A00);
                                if (r14 != null) {
                                    int i = 2;
                                    if (C108945cZ.A10(r5).A00 == A1S) {
                                        i = 3;
                                    }
                                    int i2 = r14.A00;
                                    if (i2 != 0) {
                                        AnonymousClass3MX.A1K(r6.A02, i);
                                        if (i2 != A1S) {
                                            r1 = r6.A06;
                                            valueOf = 2;
                                        } else {
                                            AnonymousClass3MX.A1K(r6.A06, A1S);
                                            r1 = r6.A03;
                                            valueOf = getString(2131896888);
                                        }
                                    } else {
                                        r1 = r6.A02;
                                        valueOf = Integer.valueOf(A1S);
                                    }
                                    r1.A0E(valueOf);
                                }
                            }
                        }
                    }
                }
                Intent intent = getIntent();
                C18070vi.A0X(intent);
                boolean A0s = A0s(intent);
                this.A0D = A0s;
                if (A0s) {
                    Resources resources = getResources();
                    int size = this.A0A.size();
                    Object[] objArr = new Object[A1S];
                    AnonymousClass000.A1L(objArr, this.A0A.size());
                    string = resources.getQuantityString(2131755457, size, objArr);
                } else {
                    string = getString(2131896918);
                }
                setTitle(string);
                AnonymousClass7AS.A00(this, C108945cZ.A10(r5).A06, C108945cZ.A1K(this, 32), 25);
                C108945cZ.A10(r5).A01 = this.A0N;
                return;
            }
            C18070vi.A11("contactListAdapter");
        } else {
            C18070vi.A11("linkifier");
        }
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0I.removeCallbacks(this.A08);
    }

    public void onStart() {
        super.onStart();
        C18100vl r4 = this.A0L;
        r4.getValue();
        String[] strArr = this.A0H;
        if (strArr == null) {
            C18070vi.A11("requiredPermissions");
            throw null;
        }
        for (String A012 : strArr) {
            if (C19740yt.A01(this, A012) != 0) {
                this.A0M.getValue();
                Context baseContext = getBaseContext();
                C18070vi.A0X(baseContext);
                Intent A0A2 = C17880vN.A0A();
                A0A2.setClassName(baseContext.getPackageName(), "com.whatsapp.thunderstorm.ThunderstormPermissionsActivity");
                startActivity(A0A2);
                return;
            }
        }
        A0r(this, true);
        AnonymousClass73G A10 = C108945cZ.A10(r4);
        A10.A05 = true;
        if (A10.A00 == 0) {
            A10.A02();
            A10.A03();
        }
    }

    public void onStop() {
        super.onStop();
        C18100vl r5 = this.A0L;
        C108945cZ.A10(r5).A05 = false;
        if (this.A09 == null && C108945cZ.A10(r5).A00 == 0) {
            A0r(this, false);
            AnonymousClass73G A10 = C108945cZ.A10(r5);
            if (A10.A03) {
                BZ9 bz9 = (BZ9) C108965cb.A0F(A10);
                bz9.A00.A01(bz9, "advertising");
                A10.A03 = false;
            }
            C108945cZ.A10(r5).A04();
        }
    }

    public ThunderstormConnectionsInfoActivity() {
        this(0);
        this.A0L = AnonymousClass1DF.A01(new C154197qk(this));
        this.A0M = AnonymousClass1DF.A01(new C154207ql(this));
        this.A0K = AnonymousClass000.A13();
        this.A0A = C18460wS.A00;
        this.A0I = C17890vO.A0D();
        this.A08 = new C21423Ajq(16);
        this.A07 = new C21423Ajq(17);
        this.A0N = new C131726lZ(this);
        this.A0J = new C131716lY(this);
    }
}
