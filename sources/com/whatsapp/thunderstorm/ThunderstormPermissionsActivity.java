package com.whatsapp.thunderstorm;

import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MY;
import X.AnonymousClass6LG;
import X.AnonymousClass73G;
import X.AnonymousClass784;
import X.AnonymousClass7RC;
import X.C110885hR;
import X.C114895sA;
import X.C122466Qm;
import X.C122546Qu;
import X.C154217qm;
import X.C154227qn;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C200410p;
import X.C200610r;
import X.C36401np;
import X.C72473Md;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;

public final class ThunderstormPermissionsActivity extends C114895sA {
    public C36401np A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public EnumMap A03;
    public HashSet A04;
    public String[] A05;
    public WDSTextLayout A06;
    public final EnumMap A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C154217qm(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C154227qn(this));

    public static final void A03(ThunderstormPermissionsActivity thunderstormPermissionsActivity) {
        thunderstormPermissionsActivity.A08.getValue();
        String[] strArr = thunderstormPermissionsActivity.A05;
        if (strArr == null) {
            C18070vi.A11("requiredPermissions");
        } else {
            for (String A012 : strArr) {
                if (C19740yt.A01(thunderstormPermissionsActivity, A012) != 0) {
                    int i = Build.VERSION.SDK_INT;
                    String[] strArr2 = thunderstormPermissionsActivity.A05;
                    if (i < 23) {
                        if (strArr2 != null) {
                            C110885hR.A0B(thunderstormPermissionsActivity, strArr2, 1);
                        }
                        C18070vi.A11("requiredPermissions");
                    } else {
                        if (strArr2 != null) {
                            thunderstormPermissionsActivity.requestPermissions(strArr2, 1);
                        }
                        C18070vi.A11("requiredPermissions");
                    }
                    EnumMap enumMap = thunderstormPermissionsActivity.A03;
                    C122546Qu r5 = C122546Qu.DENIED;
                    if (enumMap.containsValue(r5) && !enumMap.containsValue(C122546Qu.NOT_GRANTED)) {
                        thunderstormPermissionsActivity.A0V();
                        for (C122466Qm r2 : C122466Qm.values()) {
                            if (enumMap.get(r2) == r5) {
                                C18070vi.A0d(r2, 0);
                                thunderstormPermissionsActivity.CMk(new ThunderstormPermissionsDeniedDialog(r2), (String) null);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw null;
    }

    private final void A0Q(boolean z) {
        Intent A0A;
        String packageName;
        String str;
        ArrayList parcelableArrayListExtra;
        if (z) {
            finish();
            int intExtra = getIntent().getIntExtra("extra_launched_from", 0);
            this.A09.getValue();
            WDSTextLayout wDSTextLayout = this.A06;
            if (intExtra == 1) {
                if (wDSTextLayout != null) {
                    Context A042 = AnonymousClass3MY.A04(wDSTextLayout);
                    A0A = C17880vN.A0A();
                    packageName = A042.getPackageName();
                    str = "com.whatsapp.thunderstorm.ThunderstormBleConnectionsInfoActivity";
                }
                C18070vi.A11("layout");
                throw null;
            }
            if (wDSTextLayout != null) {
                Context A043 = AnonymousClass3MY.A04(wDSTextLayout);
                A0A = C17880vN.A0A();
                packageName = A043.getPackageName();
                str = "com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity";
            }
            C18070vi.A11("layout");
            throw null;
            A0A.setClassName(packageName, str);
            if (getIntent().hasExtra("android.intent.extra.STREAM")) {
                int i = Build.VERSION.SDK_INT;
                Intent intent = getIntent();
                if (i >= 33) {
                    parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class);
                } else {
                    parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                }
                A0A.putParcelableArrayListExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
            }
            startActivity(A0A);
        }
    }

    public ThunderstormPermissionsActivity() {
        Class<C122466Qm> cls = C122466Qm.class;
        this.A03 = new EnumMap(cls);
        this.A07 = new EnumMap(cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0048 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0V() {
        /*
            r13 = this;
            X.6Qm[] r9 = X.C122466Qm.values()
            int r8 = r9.length
            r4 = 0
            r7 = 0
        L_0x0007:
            if (r7 >= r8) goto L_0x00c9
            r6 = r9[r7]
            X.0vl r0 = r13.A08
            X.73G r5 = X.C108945cZ.A10(r0)
            int r3 = X.C108955ca.A04(r6, r4)
            r1 = 4
            r12 = 3
            r10 = 2
            r11 = 1
            if (r3 == r11) goto L_0x009d
            if (r3 == r4) goto L_0x008a
            if (r3 != r10) goto L_0x00c4
            java.lang.String[] r2 = new java.lang.String[r10]
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            r2[r4] = r0
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
        L_0x0027:
            r2[r11] = r0
        L_0x0029:
            java.util.HashSet r10 = X.C17880vN.A12()
            int r12 = r2.length
            r11 = 0
        L_0x002f:
            r1 = r2[r11]
            X.118 r0 = r5.A09
            android.content.Context r0 = r0.A00
            int r0 = X.C19740yt.A01(r0, r1)
            if (r0 == 0) goto L_0x003e
            r10.add(r1)
        L_0x003e:
            int r11 = r11 + 1
            if (r11 < r12) goto L_0x002f
            java.util.EnumMap r1 = r13.A07
            java.util.HashSet r0 = r13.A04
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "requiredPermissionsSet"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x004f:
            java.util.Set r0 = X.C29431cG.A13(r0, r10)
            java.util.ArrayList r0 = X.C29431cG.A0m(r0)
            r1.put(r6, r0)
            java.lang.Object r0 = r1.get(r6)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0072
            java.util.EnumMap r1 = r13.A03
            X.6Qu r0 = X.C122546Qu.NOT_GRANTED
        L_0x006c:
            r1.put(r6, r0)
            int r7 = r7 + 1
            goto L_0x0007
        L_0x0072:
            r2 = 8
            r1 = 2131436168(0x7f0b2288, float:1.8494199E38)
            if (r3 == r4) goto L_0x0082
            r0 = 1
            r1 = 2131436169(0x7f0b2289, float:1.84942E38)
            if (r3 == r0) goto L_0x0082
            r1 = 2131436167(0x7f0b2287, float:1.8494197E38)
        L_0x0082:
            X.AnonymousClass3MX.A1H(r13, r1, r2)
            java.util.EnumMap r1 = r13.A03
            X.6Qu r0 = X.C122546Qu.GRANTED
            goto L_0x006c
        L_0x008a:
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            r2[r4] = r0
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            r2[r11] = r0
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            r2[r10] = r0
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            r2[r12] = r0
            goto L_0x0029
        L_0x009d:
            r0 = 8
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            r2[r4] = r0
            java.lang.String r0 = "android.permission.BLUETOOTH_ADVERTISE"
            r2[r11] = r0
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            r2[r10] = r0
            java.lang.String r0 = "android.permission.BLUETOOTH"
            r2[r12] = r0
            java.lang.String r0 = "android.permission.BLUETOOTH_ADMIN"
            r2[r1] = r0
            r1 = 5
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            r2[r1] = r0
            r1 = 6
            java.lang.String r0 = "android.permission.CHANGE_WIFI_STATE"
            r2[r1] = r0
            r11 = 7
            java.lang.String r0 = "android.permission.NEARBY_WIFI_DEVICES"
            goto L_0x0027
        L_0x00c4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00c9:
            X.6Qm[] r9 = X.C122466Qm.values()
            int r8 = r9.length
            r7 = 0
        L_0x00cf:
            if (r7 >= r8) goto L_0x0120
            r6 = r9[r7]
            java.util.EnumMap r5 = r13.A03
            java.lang.Object r1 = r5.get(r6)
            X.6Qu r0 = X.C122546Qu.NOT_GRANTED
            if (r1 != r0) goto L_0x011d
            java.util.EnumMap r1 = r13.A07
            java.lang.Object r0 = r1.get(r6)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0118
            java.util.ArrayList r3 = X.C17880vN.A10(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0112
            java.lang.Object r0 = r1.get(r6)
            X.C18070vi.A0b(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x00fe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.String r1 = X.C17880vN.A0v(r2)
            boolean r0 = X.C110885hR.A0C(r13, r1)
            if (r0 != 0) goto L_0x00fe
            r3.remove(r1)
            goto L_0x00fe
        L_0x0112:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x011d
        L_0x0118:
            X.6Qu r0 = X.C122546Qu.DENIED
            r5.put(r6, r0)
        L_0x011d:
            int r7 = r7 + 1
            goto L_0x00cf
        L_0x0120:
            java.util.EnumMap r1 = r13.A03
            X.6Qu r0 = X.C122546Qu.NOT_GRANTED
            boolean r0 = r1.containsValue(r0)
            if (r0 != 0) goto L_0x0133
            X.6Qu r0 = X.C122546Qu.DENIED
            boolean r0 = r1.containsValue(r0)
            if (r0 != 0) goto L_0x0133
            r4 = 1
        L_0x0133:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.thunderstorm.ThunderstormPermissionsActivity.A0V():boolean");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72473Md.A18(this);
        setContentView(2131627201);
        setTitle(getString(2131896918));
        WDSTextLayout wDSTextLayout = (WDSTextLayout) AnonymousClass3MY.A0H(this, 2131436170);
        this.A06 = wDSTextLayout;
        if (wDSTextLayout != null) {
            wDSTextLayout.setHeadlineText(getString(2131896912));
            WDSTextLayout wDSTextLayout2 = this.A06;
            if (wDSTextLayout2 != null) {
                wDSTextLayout2.setPrimaryButtonText(getString(2131887451));
                WDSTextLayout wDSTextLayout3 = this.A06;
                if (wDSTextLayout3 != null) {
                    wDSTextLayout3.setSecondaryButtonText(getString(2131892995));
                    C18100vl r4 = this.A08;
                    r4.getValue();
                    String[] A012 = AnonymousClass73G.A01();
                    this.A05 = A012;
                    HashSet hashSet = new HashSet(C200610r.A03(A012.length));
                    C200410p.A0T(hashSet, A012);
                    this.A04 = hashSet;
                    WDSTextLayout wDSTextLayout4 = this.A06;
                    if (wDSTextLayout4 != null) {
                        wDSTextLayout4.setSecondaryButtonClickListener(new AnonymousClass784(this, 1));
                        WDSTextLayout wDSTextLayout5 = this.A06;
                        if (wDSTextLayout5 != null) {
                            wDSTextLayout5.setPrimaryButtonClickListener(new AnonymousClass784(this, 2));
                            WDSTextLayout wDSTextLayout6 = this.A06;
                            if (wDSTextLayout6 != null) {
                                TextView A0E = C17880vN.A0E(wDSTextLayout6, 2131436160);
                                C36401np r6 = this.A00;
                                if (r6 != null) {
                                    A0E.setText(r6.A06(A0E.getContext(), AnonymousClass7RC.A00(this, 16), getString(2131896905), "%s", AnonymousClass1YL.A00(A0E.getContext(), 2130968627, 2131099690)));
                                    AnonymousClass6LG.A00(A0E, this, 35);
                                    r4.getValue();
                                    String[] strArr = this.A05;
                                    if (strArr == null) {
                                        C18070vi.A11("requiredPermissions");
                                    } else {
                                        for (String A013 : strArr) {
                                            if (C19740yt.A01(this, A013) != 0) {
                                                A0Q(A0V());
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                } else {
                                    C18070vi.A11("linkifier");
                                }
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        C18070vi.A11("layout");
        throw null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C18070vi.A0j(strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean A0V = A0V();
        EnumMap enumMap = this.A03;
        if (!enumMap.containsValue(C122546Qu.DENIED) && enumMap.containsValue(C122546Qu.NOT_GRANTED)) {
            A0Q(A0V);
            startActivity(getIntent());
            overridePendingTransition(0, 0);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void onResume() {
        super.onResume();
        A0Q(A0V());
    }
}
