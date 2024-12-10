package com.whatsapp.support.faq;

import X.AnonymousClass00H;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass62I;
import X.AnonymousClass770;
import X.AnonymousClass7RD;
import X.AnonymousClass88C;
import X.C108945cZ;
import X.C108975cc;
import X.C109005cf;
import X.C114985t5;
import X.C129316hb;
import X.C132216mP;
import X.C133186oJ;
import X.C1403871f;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C197289wS;
import X.C22821Di;
import X.C29431cG;
import X.C30361do;
import X.C72453Mb;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SearchFAQActivity extends C114985t5 implements AnonymousClass88C {
    public int A00;
    public C132216mP A01;
    public AnonymousClass18K A02;
    public AnonymousClass1MB A03;
    public AnonymousClass1LU A04;
    public C133186oJ A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public String A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C;
    public HashMap A0D;
    public HashSet A0E;
    public List A0F;
    public C1403871f A0G;

    public static final Intent A0y(Bundle bundle, SearchFAQActivity searchFAQActivity) {
        String str;
        Intent A002;
        SearchFAQActivity searchFAQActivity2 = searchFAQActivity;
        String str2 = "";
        Bundle bundle2 = bundle;
        if (C197289wS.A00(searchFAQActivity.A09)) {
            C132216mP r3 = searchFAQActivity.A01;
            if (r3 != null) {
                String str3 = searchFAQActivity.A09;
                if (str3 != null) {
                    str2 = str3;
                }
                A002 = r3.A00(searchFAQActivity2, bundle, (Integer) null, str2, (ArrayList) null, (ArrayList) null);
            }
            str = "sendFeedback";
            C18070vi.A11(str);
            throw null;
        }
        C132216mP r1 = searchFAQActivity.A01;
        if (r1 != null) {
            AnonymousClass1MB r0 = searchFAQActivity.A03;
            if (r0 != null) {
                boolean A003 = r0.A00();
                String str4 = searchFAQActivity2.A09;
                if (str4 == null) {
                    str4 = str2;
                }
                A002 = r1.A00.A00(bundle2, (AnonymousClass770) null, (Integer) null, str4, (String) null, (ArrayList) null, (ArrayList) null, A003);
            } else {
                str = "supportGatingUtils";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "sendFeedback";
        C18070vi.A11(str);
        throw null;
        C18070vi.A0b(A002);
        return A002;
    }

    public void C3G(boolean z) {
        A0z(3);
        if (z) {
            C72453Mb.A14(this);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Long l;
        Long l2;
        Set entrySet;
        Number A1D;
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            long j = 0;
            if (intent != null) {
                l = Long.valueOf(intent.getLongExtra("total_time_spent", 0));
                l2 = Long.valueOf(C108975cc.A05(intent, "article_id"));
            } else {
                l = null;
                l2 = null;
            }
            HashMap hashMap = this.A0D;
            if (hashMap != null && hashMap.containsKey(l2)) {
                HashMap hashMap2 = this.A0D;
                if (hashMap2 == null || (A1D = C108945cZ.A1D(l2, hashMap2)) == null) {
                    l = null;
                } else {
                    l = C17880vN.A0o(A1D.longValue(), C17900vP.A01(l));
                }
            }
            HashMap hashMap3 = this.A0D;
            if (!(hashMap3 == null || l2 == null)) {
                Long valueOf = Long.valueOf(l2.longValue());
                if (l != null) {
                    j = l.longValue();
                }
                C17880vN.A1N(valueOf, hashMap3, j);
            }
            HashMap hashMap4 = this.A0D;
            if (!(hashMap4 == null || (entrySet = hashMap4.entrySet()) == null)) {
                C29431cG.A0g(", ", "", "", entrySet, (C22821Di) null);
            }
            HashMap hashMap5 = this.A0D;
            if (hashMap5 != null) {
                Iterator A0j = C17890vO.A0j(hashMap5);
                while (A0j.hasNext()) {
                    C18070vi.A0b(A0j.next());
                }
            }
        }
    }

    public void onBackPressed() {
        A0z(2);
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C1403871f r0 = this.A0G;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        String[] strArr;
        C18070vi.A0d(bundle, 0);
        HashSet hashSet = this.A0E;
        if (hashSet != null && hashSet.size() > 0) {
            HashSet hashSet2 = this.A0E;
            if (hashSet2 != null) {
                strArr = (String[]) hashSet2.toArray(new String[0]);
            } else {
                strArr = null;
            }
            bundle.putStringArray("FaqItemsReadTitles", strArr);
        }
        HashMap hashMap = this.A0D;
        if (hashMap != null && hashMap.size() > 0) {
            bundle.putSerializable("timeSpentPerArticle", hashMap);
        }
        super.onSaveInstanceState(bundle);
    }

    private final void A0z(int i) {
        AnonymousClass62I r2 = new AnonymousClass62I();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = this.A00.A05();
        AnonymousClass7RD.A00(this.A05, this, r2, 5);
    }

    public static final void A10(C129316hb r5, SearchFAQActivity searchFAQActivity) {
        HashSet hashSet = searchFAQActivity.A0E;
        if (hashSet != null) {
            hashSet.add(r5.A03);
        }
        if (searchFAQActivity.A04 != null) {
            String str = r5.A02;
            String str2 = r5.A01;
            String str3 = r5.A03;
            long j = r5.A00;
            Intent A082 = C109005cf.A08(searchFAQActivity, str, str2, str3);
            A082.putExtra("article_id", j);
            searchFAQActivity.startActivityForResult(A082, 1);
            searchFAQActivity.overridePendingTransition(2130772058, 2130772061);
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void A3K() {
        if ("payments:settings".equals(this.A09)) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 7019)) {
                AnonymousClass00H r0 = this.A07;
                if (r0 != null) {
                    C18100vl r02 = C30361do.A0C;
                    ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 79);
                    return;
                }
                C18070vi.A11("navigationTimeSpentManager");
                throw null;
            }
        }
        AnonymousClass00H r03 = this.A07;
        if (r03 != null) {
            AnonymousClass3MX.A0u(r03).A01();
            return;
        }
        C18070vi.A11("navigationTimeSpentManager");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r5 = r18
            r7 = r19
            super.onCreate(r7)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow"
            r4 = 0
            boolean r12 = r1.getBooleanExtra(r0, r4)
            r0 = 2131895488(0x7f1224c0, float:1.942581E38)
            r5.setTitle(r0)
            boolean r11 = X.C72473Md.A1S(r5)
            r0 = 2131626783(0x7f0e0b1f, float:1.8880812E38)
            r5.setContentView((int) r0)
            java.util.HashSet r0 = X.C17880vN.A12()
            r5.A0E = r0
            r10 = 0
            if (r19 == 0) goto L_0x0058
            java.lang.String r0 = "FaqItemsReadTitles"
            java.lang.String[] r6 = r7.getStringArray(r0)
            java.util.HashSet r3 = r5.A0E
            if (r3 == 0) goto L_0x0043
            if (r6 == 0) goto L_0x0043
            int r2 = r6.length
            r1 = 0
        L_0x0039:
            if (r1 >= r2) goto L_0x0043
            r0 = r6[r1]
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x0039
        L_0x0043:
            java.lang.String r1 = "timeSpentPerArticle"
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x0058
            java.io.Serializable r0 = r7.getSerializable(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r5.A0D = r0
            if (r0 == 0) goto L_0x0058
            r0.size()
        L_0x0058:
            android.content.Intent r9 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.from"
            java.lang.String r0 = r9.getStringExtra(r0)
            r5.A09 = r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.HashMap r0 = r5.A0D
            if (r0 != 0) goto L_0x0072
            java.util.HashMap r0 = X.C17880vN.A11()
            r5.A0D = r0
        L_0x0072:
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.count"
            int r8 = r9.getIntExtra(r0, r4)
            r5.A00 = r8
            if (r12 == 0) goto L_0x00c2
            java.lang.String r0 = "payments_support_faqs"
            java.util.ArrayList r1 = r9.getParcelableArrayListExtra(r0)
            java.lang.String r0 = "payments_support_topics"
            java.util.ArrayList r7 = r9.getParcelableArrayListExtra(r0)
            java.lang.String r0 = "describe_problem_bundle"
            android.os.Bundle r8 = r9.getBundleExtra(r0)
            if (r1 == 0) goto L_0x00b9
            java.util.Iterator r6 = r1.iterator()
        L_0x0094:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r6.next()
            X.77D r0 = (X.AnonymousClass77D) r0
            java.lang.String r15 = r0.A02
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r0.A01
            long r13 = java.lang.Long.parseLong(r0)
            X.6hb r12 = new X.6hb
            r16 = r2
            r17 = r1
            r12.<init>(r13, r15, r16, r17)
            r3.add(r12)
            goto L_0x0094
        L_0x00b9:
            r0 = 14
            X.7RO r6 = new X.7RO
            r6.<init>(r7, r5, r8, r0)
            goto L_0x01af
        L_0x00c2:
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.problem"
            java.lang.String r0 = r9.getStringExtra(r0)
            r5.A0A = r0
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.status"
            java.lang.String r0 = r9.getStringExtra(r0)
            r5.A0B = r0
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r9.getParcelableArrayListExtra(r0)
            r5.A0C = r0
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.additionalDetails"
            java.lang.String[] r13 = r9.getStringArrayExtra(r0)
            if (r13 == 0) goto L_0x0123
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            int r7 = r13.length
            r6 = 0
        L_0x00e8:
            if (r6 >= r7) goto L_0x0121
            r1 = r13[r6]
            java.lang.String r0 = ":"
            java.util.List r2 = X.C108965cb.A0v(r1, r0, r4)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x011e
            java.util.ListIterator r1 = X.C108955ca.A18(r2)
        L_0x00fc:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x011e
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x00fc
            java.util.List r0 = X.C108985cd.A0t(r2, r1)
        L_0x010c:
            java.lang.String[] r2 = X.C108955ca.A1b(r0)
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L_0x011b
            r1 = r2[r4]
            r0 = r2[r11]
            X.C108965cb.A1Q(r1, r0, r12)
        L_0x011b:
            int r6 = r6 + 1
            goto L_0x00e8
        L_0x011e:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x010c
        L_0x0121:
            r5.A0F = r12
        L_0x0123:
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.titles"
            java.util.ArrayList r7 = r9.getStringArrayListExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.descriptions"
            java.util.ArrayList r6 = r9.getStringArrayListExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.urls"
            java.util.ArrayList r2 = r9.getStringArrayListExtra(r0)
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.ids"
            java.util.ArrayList r1 = r9.getStringArrayListExtra(r0)
            if (r7 == 0) goto L_0x01a9
            if (r6 == 0) goto L_0x01a9
            if (r2 == 0) goto L_0x01a9
            if (r1 == 0) goto L_0x01a9
            int r0 = r7.size()
            if (r0 >= r8) goto L_0x014d
            int r8 = r7.size()
        L_0x014d:
            int r0 = r6.size()
            if (r0 >= r8) goto L_0x0157
            int r8 = r6.size()
        L_0x0157:
            int r0 = r2.size()
            if (r0 >= r8) goto L_0x0161
            int r8 = r2.size()
        L_0x0161:
            int r0 = r1.size()
            if (r0 >= r8) goto L_0x016b
            int r8 = r1.size()
        L_0x016b:
            r0 = 0
        L_0x016c:
            if (r0 >= r8) goto L_0x01a9
            java.lang.String r12 = X.C108945cZ.A1H(r1, r0)
            if (r12 == 0) goto L_0x01a7
            java.lang.Long r13 = X.C108965cb.A0m(r12)
        L_0x0178:
            java.lang.String r17 = ""
            r7.get(r0)
            r2.get(r0)
            java.lang.String r15 = X.C108945cZ.A1H(r7, r0)
            if (r15 != 0) goto L_0x0188
            r15 = r17
        L_0x0188:
            java.lang.String r16 = X.C108945cZ.A1H(r6, r0)
            if (r16 != 0) goto L_0x0190
            r16 = r17
        L_0x0190:
            java.lang.String r12 = X.C108945cZ.A1H(r2, r0)
            if (r12 == 0) goto L_0x0198
            r17 = r12
        L_0x0198:
            long r13 = X.C17900vP.A01(r13)
            X.6hb r12 = new X.6hb
            r12.<init>(r13, r15, r16, r17)
            r3.add(r12)
            int r0 = r0 + 1
            goto L_0x016c
        L_0x01a7:
            r13 = r10
            goto L_0x0178
        L_0x01a9:
            r0 = 4
            X.7RD r6 = new X.7RD
            r6.<init>(r5, r9, r0)
        L_0x01af:
            X.5f5 r7 = new X.5f5
            r7.<init>(r5, r5, r3)
            android.widget.ListView r2 = r5.getListView()
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r1 = X.AnonymousClass11C.A02(r5, r0)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            r0 = 2131626784(0x7f0e0b20, float:1.8880814E38)
            android.view.View r0 = r1.inflate(r0, r10)
            r2.addHeaderView(r0, r10, r4)
            r5.A4b(r7)
            r5.registerForContextMenu(r2)
            int r0 = r3.size()
            if (r0 != r11) goto L_0x01eb
            java.lang.Object r0 = r3.get(r4)
            X.C18070vi.A0X(r0)
            X.6hb r0 = (X.C129316hb) r0
            A10(r0, r5)
        L_0x01eb:
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r3 = r5.findViewById(r0)
            r0 = 2131889540(0x7f120d84, float:1.9413746E38)
            java.lang.String r7 = X.C18070vi.A0F(r5, r0)
            X.71f r0 = X.C1403871f.A00(r5, r2, r3)
            r5.A0G = r0
            r0.A02()
            X.71f r0 = r5.A0G
            if (r0 == 0) goto L_0x0219
            r0 = 2131430118(0x7f0b0ae6, float:1.8481928E38)
            android.widget.TextView r2 = X.AnonymousClass3MX.A0L(r5, r0)
            r0 = 5
            X.5dr r1 = new X.5dr
            r1.<init>(r6, r0)
            r0 = 2132083281(0x7f150251, float:1.98067E38)
            X.C1403871f.A01(r5, r1, r2, r7, r0)
        L_0x0219:
            X.71f r0 = r5.A0G
            if (r0 == 0) goto L_0x0224
            android.view.View r1 = r0.A01
            r0 = 43
            X.AnonymousClass78P.A00(r1, r6, r0)
        L_0x0224:
            java.lang.String r0 = r5.A09
            boolean r0 = X.C197289wS.A00(r0)
            if (r0 == 0) goto L_0x0238
            X.18O r1 = r5.A06
            X.18R r0 = X.AnonymousClass18O.A0S
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0238
            r4 = 8
        L_0x0238:
            r3.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.support.faq.SearchFAQActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            A0z(2);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
