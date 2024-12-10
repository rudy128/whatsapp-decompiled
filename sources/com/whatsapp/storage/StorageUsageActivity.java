package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11Z;
import X.AnonymousClass122;
import X.AnonymousClass18K;
import X.AnonymousClass18O;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1Cd;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1ST;
import X.AnonymousClass1W6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VZ;
import X.AnonymousClass6R0;
import X.AnonymousClass6RN;
import X.AnonymousClass78P;
import X.AnonymousClass7AS;
import X.AnonymousClass7FQ;
import X.AnonymousClass7PZ;
import X.AnonymousClass7QG;
import X.AnonymousClass7RI;
import X.AnonymousClass7RQ;
import X.AnonymousClass81Q;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C109005cf;
import X.C112335lJ;
import X.C124656Ze;
import X.C128736gb;
import X.C133006o1;
import X.C1403671d;
import X.C1406372h;
import X.C1423379b;
import X.C1424779p;
import X.C154087qZ;
import X.C154097qa;
import X.C1598085y;
import X.C1606589k;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C200710s;
import X.C218617r;
import X.C24921Me;
import X.C25321Nt;
import X.C26301Rp;
import X.C27201Vd;
import X.C31141f5;
import X.C32021gV;
import X.C37451pZ;
import X.C37931qQ;
import X.C37961qT;
import X.C37971qU;
import X.C38021qZ;
import X.C41731wy;
import X.C72043Kk;
import X.C72453Mb;
import X.C72473Md;
import X.C83974Hj;
import X.C87824Xf;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class StorageUsageActivity extends AnonymousClass1FY implements C1598085y {
    public static final long A0f = TimeUnit.MINUTES.toMillis(1);
    public int A00;
    public int A01;
    public AnonymousClass7RQ A02;
    public C124656Ze A03;
    public C72043Kk A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public C27201Vd A07;
    public AnonymousClass1CJ A08;
    public AnonymousClass122 A09;
    public C25321Nt A0A;
    public AnonymousClass1ST A0B;
    public AnonymousClass1Cd A0C;
    public C1406372h A0D;
    public AnonymousClass18K A0E;
    public AnonymousClass6RN A0F;
    public AnonymousClass6RN A0G;
    public C112335lJ A0H;
    public C1403671d A0I;
    public C133006o1 A0J;
    public C32021gV A0K;
    public C200710s A0L;
    public C26301Rp A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public ArrayList A0U;
    public List A0V;
    public RecyclerView A0W;
    public C37451pZ A0X;
    public AnonymousClass4VZ A0Y;
    public boolean A0Z;
    public final C18100vl A0a;
    public final C18100vl A0b;
    public final C1606589k A0c;
    public final C41731wy A0d;
    public final Set A0e;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r9 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        if (r2 != null) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A0q(com.whatsapp.storage.StorageUsageActivity r7, java.util.List r8, java.util.List r9, boolean r10) {
        /*
            monitor-enter(r7)
            X.4rF r5 = X.C98494rF.A00()     // Catch:{ all -> 0x00c9 }
            r5.element = r8     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r7.A0S     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0016
            if (r8 == 0) goto L_0x0016
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0016
            if (r9 == 0) goto L_0x0016
            goto L_0x003c
        L_0x0016:
            if (r10 != 0) goto L_0x0039
            java.lang.Integer r6 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x00c9 }
            goto L_0x0064
        L_0x001b:
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x001f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x004c
            int r0 = X.C72453Mb.A0H(r1)     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x00c9 }
            X.7PZ r0 = (X.AnonymousClass7PZ) r0     // Catch:{ all -> 0x00c9 }
            X.1BI r0 = r0.A01()     // Catch:{ all -> 0x00c9 }
            boolean r0 = A0r(r0, r7)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x001f
        L_0x0039:
            java.lang.Integer r6 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x00c9 }
            goto L_0x0064
        L_0x003c:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0016
            boolean r0 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x001b
        L_0x004c:
            java.lang.Integer r6 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x00c9 }
        L_0x004e:
            X.4VZ r0 = r7.A0Y     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "searchToolbarHelper"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x00c9 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x0059:
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x00c9 }
            if (r6 != r0) goto L_0x00bc
            goto L_0x0066
        L_0x0064:
            if (r9 != 0) goto L_0x004e
        L_0x0066:
            if (r8 == 0) goto L_0x00b8
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00b8
            java.lang.String r2 = r7.A0S     // Catch:{ all -> 0x00c9 }
            if (r2 == 0) goto L_0x0078
            int r0 = r2.length()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0080
        L_0x0078:
            X.6RN r1 = r7.A0G     // Catch:{ all -> 0x00c9 }
            X.6RN r0 = X.AnonymousClass6RN.ALL     // Catch:{ all -> 0x00c9 }
            if (r1 == r0) goto L_0x00ba
            if (r2 == 0) goto L_0x00af
        L_0x0080:
            int r0 = r2.length()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00af
            r0 = 1
            X.79w r4 = new X.79w     // Catch:{ all -> 0x00c9 }
            r4.<init>(r7, r0)     // Catch:{ all -> 0x00c9 }
        L_0x008c:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x0094:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00c9 }
            r0 = r1
            X.7PZ r0 = (X.AnonymousClass7PZ) r0     // Catch:{ all -> 0x00c9 }
            X.1BI r0 = r0.A01()     // Catch:{ all -> 0x00c9 }
            boolean r0 = r4.test(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0094
            r3.add(r1)     // Catch:{ all -> 0x00c9 }
            goto L_0x0094
        L_0x00af:
            r0 = 0
            X.79w r4 = new X.79w     // Catch:{ all -> 0x00c9 }
            r4.<init>(r7, r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x008c
        L_0x00b6:
            r8 = r3
            goto L_0x00ba
        L_0x00b8:
            X.0wS r8 = X.C18460wS.A00     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            r5.element = r8     // Catch:{ all -> 0x00c9 }
        L_0x00bc:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x00c9 }
            if (r6 == r0) goto L_0x00c7
            X.1KB r1 = r7.A05     // Catch:{ all -> 0x00c9 }
            r0 = 12
            X.AnonymousClass7RO.A01(r1, r5, r7, r9, r0)     // Catch:{ all -> 0x00c9 }
        L_0x00c7:
            monitor-exit(r7)
            return
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.storage.StorageUsageActivity.A0q(com.whatsapp.storage.StorageUsageActivity, java.util.List, java.util.List, boolean):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = this.A0U;
        if (!arrayList.isEmpty()) {
            bundle.putLong("SAVED_AT_TIMESTAMP", System.currentTimeMillis());
            bundle.putParcelableArrayList("LIST_OF_CONTACTS", C17880vN.A10(arrayList.subList(0, Math.min(arrayList.size(), 200))));
            if (arrayList.size() > 200) {
                bundle.putBoolean("LIST_IS_NOT_FULL", true);
            }
        }
    }

    public final class WrappedLinearLayoutManager extends LinearLayoutManager {
        public void A1D(C37931qQ r3, C38021qZ r4) {
            C18070vi.A0h(r3, r4);
            try {
                super.A1D(r3, r4);
            } catch (IndexOutOfBoundsException e) {
                Log.e("WrappedLinearLayoutManager", e);
            }
        }
    }

    private final void A03() {
        AnonymousClass7RQ r0 = this.A02;
        if (r0 != null) {
            ((AtomicBoolean) r0.A01).set(true);
        }
        AnonymousClass7RI.A01(this.A05, this, 31);
        A0Q(AnonymousClass6R0.CHAT_LIST);
    }

    private final void A0Q(AnonymousClass6R0 r5) {
        this.A0e.add(r5);
        C112335lJ r0 = this.A0H;
        if (r0 == null) {
            C18070vi.A11("storageUsageAdapter");
            throw null;
        }
        AnonymousClass1KB r3 = r0.A0B;
        Runnable runnable = r0.A0E;
        r3.A0I(runnable);
        r3.A0K(runnable, 1000);
    }

    public static final void A0V(AnonymousClass6R0 r3, StorageUsageActivity storageUsageActivity) {
        Set set = storageUsageActivity.A0e;
        set.remove(r3);
        C112335lJ r4 = storageUsageActivity.A0H;
        if (r4 == null) {
            C18070vi.A11("storageUsageAdapter");
            throw null;
        }
        boolean A1O = AnonymousClass000.A1O(set.size());
        AnonymousClass1KB r32 = r4.A0B;
        Runnable runnable = r4.A0E;
        r32.A0I(runnable);
        if (A1O) {
            r32.A0K(runnable, 1000);
        } else {
            C112335lJ.A04(r4, 2, false);
        }
    }

    public static final void A0c(StorageUsageActivity storageUsageActivity) {
        Log.i("storage-usage-activity/fetch media size");
        C218617r r1 = storageUsageActivity.A04;
        C1403671d r0 = storageUsageActivity.A0I;
        if (r0 == null) {
            C18070vi.A11("storageUsageCacheManager");
            throw null;
        }
        AnonymousClass7RQ.A00(storageUsageActivity.A05, storageUsageActivity, new AnonymousClass7RQ(storageUsageActivity, new C128736gb(C31141f5.A00(r1, r0), C108975cc.A07(storageUsageActivity.A0C), ((AnonymousClass11Z) storageUsageActivity.A0C.get()).A03()), 43), 45);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.1yT] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.1yT] */
    public static final void A0d(StorageUsageActivity storageUsageActivity) {
        Log.i("storage-usage-activity/fetch forwarded files");
        C133006o1 r3 = storageUsageActivity.A0J;
        if (r3 != null) {
            AnonymousClass7RQ.A00(storageUsageActivity.A05, storageUsageActivity, new AnonymousClass7RQ(storageUsageActivity, r3.A00(new Object(), storageUsageActivity.A00, 1), 44), 45);
            Log.i("storage-usage-activity/fetch large files");
            C133006o1 r32 = storageUsageActivity.A0J;
            if (r32 != null) {
                AnonymousClass7RQ.A00(storageUsageActivity.A05, storageUsageActivity, new AnonymousClass7RQ(storageUsageActivity, r32.A00(new Object(), storageUsageActivity.A00, 2), 46), 45);
                return;
            }
        }
        C18070vi.A11("storageUsageDbFetcher");
        throw null;
    }

    public static final boolean A0r(AnonymousClass1BI r2, StorageUsageActivity storageUsageActivity) {
        String str;
        AnonymousClass1M9 r0 = storageUsageActivity.A05;
        if (r0 != null) {
            AnonymousClass1E7 A0E2 = r0.A0E(r2);
            if (A0E2 != null) {
                C24921Me r1 = storageUsageActivity.A06;
                if (r1 == null) {
                    str = "waContactNames";
                } else if (!r1.A0l(A0E2, storageUsageActivity.A0V)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
        str = "contactManager";
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0Z) {
            this.A0Z = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A08 = AnonymousClass3Ma.A0d(A0A2);
            this.A05 = AnonymousClass10E.A4z(A0A2);
            this.A07 = AnonymousClass3MZ.A0i(A0A2);
            this.A09 = AnonymousClass3MZ.A0n(A0A2);
            this.A0N = AnonymousClass3MX.A12(A0A2);
            this.A0M = (C26301Rp) A0A2.AWy.get();
            this.A0A = (C25321Nt) A0A2.AXy.get();
            this.A0B = (AnonymousClass1ST) A0A2.A6C.get();
            this.A0C = (AnonymousClass1Cd) A0A2.A6i.get();
            this.A0K = C108955ca.A0b(A0A2);
            this.A0O = C000200d.A00(A0A2.A7C);
            this.A0P = C000200d.A00(A0K2.A5o);
            this.A03 = (C124656Ze) A0K2.A5u.get();
            this.A0D = (C1406372h) r2.A4t.get();
            this.A04 = AnonymousClass3MZ.A0T(r2);
            this.A06 = AnonymousClass3MZ.A0g(A0A2);
            this.A0Q = AnonymousClass3MW.A0s(A0A2);
            this.A0E = AnonymousClass3Ma.A0g(A0A2);
        }
    }

    public void onBackPressed() {
        AnonymousClass4VZ r0 = this.A0Y;
        if (r0 == null) {
            C18070vi.A11("searchToolbarHelper");
            throw null;
        } else if (r0.A0C()) {
            this.A0S = null;
            this.A0V = null;
            AnonymousClass4VZ r1 = this.A0Y;
            if (r1 == null) {
                C18070vi.A11("searchToolbarHelper");
                throw null;
            }
            r1.A05(true);
            C112335lJ r8 = this.A0H;
            if (r8 == null) {
                C18070vi.A11("storageUsageAdapter");
                throw null;
            }
            r8.A08 = false;
            int A012 = C112335lJ.A01(r8);
            C112335lJ.A04(r8, 1, true);
            C112335lJ.A03(r8);
            C112335lJ.A04(r8, 4, true);
            if (r8.A0F) {
                C112335lJ.A04(r8, 10, true);
            }
            C112335lJ.A04(r8, 8, true);
            r8.A0J(r8.A0Q() - A012, A012);
            RecyclerView recyclerView = this.A0W;
            if (recyclerView == null) {
                C18070vi.A11("list");
                throw null;
            }
            recyclerView.A0f(0);
            if (C72453Mb.A1a(this.A0b)) {
                this.A05.CGN(AnonymousClass7RI.A00(this, 32));
                C112335lJ r02 = this.A0H;
                if (r02 == null) {
                    C18070vi.A11("storageUsageAdapter");
                    throw null;
                }
                r02.A0C.A0U(this.A0F);
            }
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        C37971qU r3;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        Log.i("storage-usage-activity/create");
        this.A0L = new C200710s(this.A05, false);
        AnonymousClass11P r32 = this.A05;
        C26301Rp r2 = this.A0M;
        if (r2 != null) {
            this.A0I = new C1403671d(r32, r2);
            setTitle(2131891846);
            setContentView(2131624113);
            Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
            setSupportActionBar(A0G2);
            this.A0S = null;
            this.A0V = null;
            this.A0Y = new AnonymousClass4VZ(this, findViewById(2131434898), new C1424779p(this, 4), A0G2, this.A00);
            boolean A1S = C72473Md.A1S(this);
            C41731wy r15 = this.A0d;
            AnonymousClass7AS.A00(this, r15, new AnonymousClass81Q(this), 23);
            C27201Vd r33 = this.A07;
            if (r33 != null) {
                this.A0X = r33.A06(this, "storage-usage-activity");
                String stringExtra = getIntent().getStringExtra("session_id");
                if (stringExtra == null) {
                    AnonymousClass18K r22 = this.A0E;
                    if (r22 != null) {
                        stringExtra = C83974Hj.A00(r22, A1S ? 1 : 0);
                    } else {
                        C18070vi.A11("wamRuntime");
                        throw null;
                    }
                }
                this.A0T = stringExtra;
                this.A01 = getIntent().getIntExtra("entry_point", -1);
                this.A0W = (RecyclerView) AnonymousClass3MY.A0H(this, 2131429576);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, A1S, false);
                this.A0R = getIntent().getStringExtra("search_result_key");
                AnonymousClass1KB r39 = this.A05;
                AnonymousClass190 r21 = this.A03;
                AnonymousClass00H r23 = this.A0Q;
                if (r23 != null) {
                    AnonymousClass1LU A0h = C108945cZ.A0h(r23);
                    AnonymousClass18K r12 = this.A0E;
                    if (r12 != null) {
                        AnonymousClass18O r20 = this.A06;
                        AnonymousClass1M9 r10 = this.A05;
                        if (r10 != null) {
                            C24921Me r9 = this.A06;
                            if (r9 != null) {
                                C18000vb r19 = this.A00;
                                C124656Ze r8 = this.A03;
                                if (r8 != null) {
                                    C72043Kk r5 = this.A04;
                                    if (r5 != null) {
                                        C37451pZ r4 = this.A0X;
                                        if (r4 == null) {
                                            C18070vi.A11("contactPhotoLoader");
                                            throw null;
                                        }
                                        int i = this.A01;
                                        String str = this.A0T;
                                        if (str == null) {
                                            C18070vi.A11("storageManagementEventSessionId");
                                            throw null;
                                        }
                                        String str2 = this.A0R;
                                        AnonymousClass00H r24 = this.A0O;
                                        if (r24 != null) {
                                            int i2 = i;
                                            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                                            AnonymousClass190 r192 = r21;
                                            C124656Ze r202 = r8;
                                            AnonymousClass1KB r212 = r39;
                                            this.A0H = new C112335lJ(linearLayoutManager2, r192, r202, r212, r20, r5, r10, r9, r4, r19, this.A0E, r12, A0h, this, r15, str, str2, i2, C18020vd.A05(C18040vf.A02, AnonymousClass3MY.A0W(r24), 8141), C72453Mb.A1a(this.A0b), C72453Mb.A1a(this.A0a));
                                            RecyclerView recyclerView = this.A0W;
                                            if (recyclerView == null) {
                                                C18070vi.A11("list");
                                                throw null;
                                            }
                                            recyclerView.setLayoutManager(linearLayoutManager);
                                            RecyclerView recyclerView2 = this.A0W;
                                            if (recyclerView2 == null) {
                                                C18070vi.A11("list");
                                                throw null;
                                            }
                                            C37961qT r34 = recyclerView2.A0C;
                                            if ((r34 instanceof C37971qU) && (r3 = (C37971qU) r34) != null) {
                                                r3.A00 = false;
                                            }
                                            C112335lJ r25 = this.A0H;
                                            if (r25 == null) {
                                                C18070vi.A11("storageUsageAdapter");
                                                throw null;
                                            }
                                            recyclerView2.setAdapter(r25);
                                            int dimensionPixelSize = getResources().getDimensionPixelSize(2131168945);
                                            this.A00 = (int) Math.max(1.0d, (double) ((((int) Math.max((double) C72453Mb.A09(this), (double) C108965cb.A08(this).heightPixels)) + (dimensionPixelSize / 2)) / dimensionPixelSize));
                                            AnonymousClass1CJ r102 = this.A08;
                                            if (r102 != null) {
                                                AnonymousClass00H r26 = this.A0N;
                                                if (r26 != null) {
                                                    AnonymousClass1W6 A0c2 = C17880vN.A0c(r26);
                                                    AnonymousClass1ST r92 = this.A0B;
                                                    if (r92 != null) {
                                                        C32021gV r82 = this.A0K;
                                                        if (r82 != null) {
                                                            AnonymousClass1Cd r52 = this.A0C;
                                                            if (r52 != null) {
                                                                C25321Nt r42 = this.A0A;
                                                                if (r42 != null) {
                                                                    C1403671d r35 = this.A0I;
                                                                    if (r35 == null) {
                                                                        C18070vi.A11("storageUsageCacheManager");
                                                                        throw null;
                                                                    }
                                                                    this.A0J = new C133006o1(r102, r42, r92, r52, r35, A0c2, r82);
                                                                    AnonymousClass7RI A002 = AnonymousClass7RI.A00(this, 34);
                                                                    C200710s r27 = this.A0L;
                                                                    if (r27 != null) {
                                                                        r27.execute(A002);
                                                                    }
                                                                    A0Q(AnonymousClass6R0.MEDIA_SIZE);
                                                                    A0Q(AnonymousClass6R0.FORWARDED_FILES);
                                                                    A0Q(AnonymousClass6R0.LARGE_FILES);
                                                                    if (bundle == null || (parcelableArrayList = bundle2.getParcelableArrayList("LIST_OF_CONTACTS")) == null) {
                                                                        A03();
                                                                    } else {
                                                                        if (System.currentTimeMillis() - bundle2.getLong("SAVED_AT_TIMESTAMP") < A0f) {
                                                                            this.A0U = parcelableArrayList;
                                                                            C112335lJ r53 = this.A0H;
                                                                            if (r53 == null) {
                                                                                C18070vi.A11("storageUsageAdapter");
                                                                                throw null;
                                                                            }
                                                                            String str3 = this.A0S;
                                                                            List list = this.A0V;
                                                                            AnonymousClass6RN r28 = this.A0G;
                                                                            r53.A05 = parcelableArrayList;
                                                                            r53.A04 = str3;
                                                                            r53.A06 = list;
                                                                            r53.A00 = r28;
                                                                            r53.A07 = true;
                                                                            r53.notifyDataSetChanged();
                                                                            if (bundle2.getBoolean("LIST_IS_NOT_FULL", false)) {
                                                                                A03();
                                                                            }
                                                                        } else {
                                                                            A03();
                                                                        }
                                                                    }
                                                                    C1406372h r29 = this.A0D;
                                                                    if (r29 != null) {
                                                                        r29.A07.add(this.A0c);
                                                                        String str4 = this.A0T;
                                                                        if (str4 == null) {
                                                                            C18070vi.A11("storageManagementEventSessionId");
                                                                            throw null;
                                                                        }
                                                                        int i3 = this.A01;
                                                                        AnonymousClass11P r54 = this.A05;
                                                                        C18070vi.A0W(r54);
                                                                        AnonymousClass10I r210 = this.A05;
                                                                        C18070vi.A0W(r210);
                                                                        C218617r r43 = this.A04;
                                                                        C18070vi.A0W(r43);
                                                                        AnonymousClass18K r7 = this.A0E;
                                                                        if (r7 != null) {
                                                                            C26301Rp r6 = this.A0M;
                                                                            if (r6 != null) {
                                                                                r210.CGF(new AnonymousClass7QG(r43, r54, r6, r7, str4, i3, 3));
                                                                                AnonymousClass00H r211 = this.A0P;
                                                                                if (r211 != null) {
                                                                                    View view = this.A00;
                                                                                    C18070vi.A0X(view);
                                                                                    if (((C87824Xf) r211.get()).A02(view, "manage_storage", this.A0R)) {
                                                                                        this.A0R = null;
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                C18070vi.A11("settingsSearchUtil");
                                                                                throw null;
                                                                            }
                                                                            C18070vi.A11("keyValueStore");
                                                                            throw null;
                                                                        }
                                                                        C18070vi.A11("wamRuntime");
                                                                        throw null;
                                                                    }
                                                                    C18070vi.A11("storageUsageManager");
                                                                    throw null;
                                                                }
                                                                C18070vi.A11("mediaCoreMessageStore");
                                                                throw null;
                                                            }
                                                            C18070vi.A11("messageStoreManager");
                                                            throw null;
                                                        }
                                                        C18070vi.A11("messageThumbCache");
                                                        throw null;
                                                    }
                                                    C18070vi.A11("mediaMessageStore");
                                                    throw null;
                                                }
                                                C18070vi.A11("fMessageDatabase");
                                                throw null;
                                            }
                                            C18070vi.A11("chatsCache");
                                            throw null;
                                        }
                                        C18070vi.A11("newsletterConfig");
                                        throw null;
                                    }
                                    C18070vi.A11("textEmojiLabelViewControllerFactory");
                                    throw null;
                                }
                                C18070vi.A11("storageChatPillsAdapterFactory");
                                throw null;
                            }
                            C18070vi.A11("waContactNames");
                            throw null;
                        }
                        C18070vi.A11("contactManager");
                        throw null;
                    }
                    C18070vi.A11("wamRuntime");
                    throw null;
                }
                AnonymousClass3MW.A1F();
                throw null;
            }
            C18070vi.A11("contactPhotos");
            throw null;
        }
        C18070vi.A11("keyValueStore");
        throw null;
    }

    public boolean onSearchRequested() {
        AnonymousClass4VZ r1 = this.A0Y;
        if (r1 != null) {
            r1.A06(false);
            C112335lJ r7 = this.A0H;
            if (r7 == null) {
                C18070vi.A11("storageUsageAdapter");
                throw null;
            }
            r7.A08 = true;
            int A012 = C112335lJ.A01(r7);
            C112335lJ.A04(r7, 1, false);
            C112335lJ.A04(r7, 3, false);
            C112335lJ.A04(r7, 4, false);
            if (r7.A0F) {
                C112335lJ.A04(r7, 10, false);
            }
            C112335lJ.A04(r7, 8, false);
            r7.A0J(r7.A0Q() - 1, A012 + 1);
            AnonymousClass4VZ r0 = this.A0Y;
            if (r0 != null) {
                AnonymousClass78P.A00(r0.A03.findViewById(2131434851), this, 35);
                if (!C72453Mb.A1a(this.A0b)) {
                    return false;
                }
                this.A05.CGN(AnonymousClass7RI.A00(this, 35));
                return false;
            }
        }
        C18070vi.A11("searchToolbarHelper");
        throw null;
    }

    public StorageUsageActivity(int i) {
        this.A0Z = false;
        C1423379b.A00(this, 1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && intent != null && i2 == 1) {
            AnonymousClass1BI A0Q2 = C108965cb.A0Q(intent, AnonymousClass1BI.A00, "jid");
            int intExtra = intent.getIntExtra("gallery_type", -1);
            long longExtra = intent.getLongExtra("memory_size", -1);
            long longExtra2 = intent.getLongExtra("deleted_size", -1);
            if (longExtra >= 0) {
                if (longExtra2 > 0) {
                    AnonymousClass7RI A002 = AnonymousClass7RI.A00(this, 33);
                    C200710s r0 = this.A0L;
                    if (r0 != null) {
                        r0.execute(A002);
                    }
                }
                if (intExtra == 0 && A0Q2 != null) {
                    C112335lJ r5 = this.A0H;
                    if (r5 == null) {
                        C18070vi.A11("storageUsageAdapter");
                        throw null;
                    }
                    for (AnonymousClass7PZ r3 : r5.A05) {
                        if (r3.A01().equals(A0Q2)) {
                            r3.A00.A0I = longExtra;
                            Collections.sort(r5.A05);
                            r5.notifyDataSetChanged();
                            return;
                        }
                    }
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C200710s r0 = this.A0L;
        if (r0 != null) {
            r0.A03();
        }
        this.A0L = null;
        C37451pZ r02 = this.A0X;
        if (r02 == null) {
            C18070vi.A11("contactPhotoLoader");
            throw null;
        }
        r02.A02();
        C1406372h r03 = this.A0D;
        if (r03 != null) {
            r03.A07.remove(this.A0c);
            this.A0e.clear();
            AnonymousClass7RQ r04 = this.A02;
            if (r04 != null) {
                ((AtomicBoolean) r04.A01).set(true);
            }
            C112335lJ r2 = this.A0H;
            if (r2 == null) {
                C18070vi.A11("storageUsageAdapter");
                throw null;
            }
            r2.A0B.A0I(r2.A0E);
            C112335lJ.A04(r2, 2, false);
            return;
        }
        C18070vi.A11("storageUsageManager");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 2131432620) {
            onSearchRequested();
            return true;
        } else if (menuItem.getItemId() != 100) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Object systemService = getSystemService("activity");
            C18070vi.A0z(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return ((ActivityManager) systemService).clearApplicationUserData();
        }
    }

    public StorageUsageActivity() {
        this(0);
        this.A0d = AnonymousClass3MW.A0o();
        this.A0e = C17880vN.A12();
        AnonymousClass6RN r1 = AnonymousClass6RN.ALL;
        this.A0G = r1;
        this.A0U = AnonymousClass000.A13();
        this.A0F = r1;
        this.A0c = new AnonymousClass7FQ(this, 0);
        this.A0b = AnonymousClass1DF.A01(new C154097qa(this));
        this.A0a = AnonymousClass1DF.A01(new C154087qZ(this));
    }
}
