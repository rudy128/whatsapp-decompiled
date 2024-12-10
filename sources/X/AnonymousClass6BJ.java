package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$updateUi$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6BJ  reason: invalid class name */
public abstract class AnonymousClass6BJ extends C114805s1 implements AnonymousClass89G, AnonymousClass85Y, AnonymousClass85Z {
    public long A00 = -1;
    public C37911qO A01;
    public C39711tW A02;
    public C19880zA A03;
    public C19880zA A04;
    public C19880zA A05;
    public C84444Jn A06;
    public C24671Lf A07;
    public C36341nj A08;
    public C179619Ir A09;
    public C111285jR A0A;
    public AnonymousClass3VT A0B;
    public AnonymousClass4VZ A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public Runnable A0L;
    public String A0M;
    public final Handler A0N = C17890vO.A0D();
    public final C23581Gv A0O = new AnonymousClass7E1(this, 2);
    public final C18100vl A0P = AnonymousClass1DF.A01(new C152687oJ(this));

    public static final void A0s(Bundle bundle, AnonymousClass6BJ r8) {
        C1418077a r0;
        C29681ch r7;
        ArrayList arrayList;
        C18070vi.A0d(bundle, 2);
        if (bundle.getBoolean("hide", false) && (r0 = (C1418077a) C24141Ja.A00(bundle, C1418077a.class, "wamo_pc_item")) != null && (r7 = r0.A00) != null) {
            C111285jR A4b = r8.A4b();
            C129166hM r5 = (C129166hM) A4b.A08.A06();
            if (r5 != null && A4b.A00 == null) {
                List<AnonymousClass6B5> list = r5.A03;
                ArrayList A0D2 = C29351c6.A0D(list);
                for (AnonymousClass6B5 r02 : list) {
                    A0D2.add(r02.A06);
                }
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : A0D2) {
                    AnonymousClass3MZ.A1V(next, A13, C18070vi.A18(((C46162Dk) next).A0M(), r7) ? 1 : 0);
                }
                List list2 = A4b.A04;
                if (list2 != null) {
                    arrayList = AnonymousClass000.A13();
                    Iterator it = list2.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass000.A0s("getNewsletterJid");
                    }
                } else {
                    arrayList = null;
                }
                List list3 = A4b.A04;
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw AnonymousClass000.A0s("getNewsletterJid");
                    }
                }
                A4b.A04 = arrayList;
                AnonymousClass3MX.A1Q(new NewsletterDirectoryViewModel$updateUi$1(r5, A4b, A13, (C30391dr) null), A4b.A0M);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem add = menu.add(0, 10001, 0, 2131899369);
        add.setActionView(2131626812);
        View actionView = add.getActionView();
        if (actionView != null) {
            actionView.setEnabled(true);
            AnonymousClass3MZ.A1O(actionView, this, add, 39);
        }
        add.setShowAsAction(1);
        if (getIntent().getBooleanExtra("is_in_search_mode", false)) {
            A0r();
        }
        if (C108985cd.A0V(this).A04()) {
            MenuItem add2 = menu.add(0, 10002, 0, 2131895622);
            add2.setIcon(A0V(this));
            View actionView2 = add2.getActionView();
            if (actionView2 != null) {
                actionView2.setEnabled(true);
                AnonymousClass3MZ.A1O(actionView2, this, add2, 39);
            }
            add2.setShowAsAction(1);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public static void A0t(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, C24671Lf r4, AnonymousClass6BJ r5) {
        r5.A07 = r4;
        r5.A0D = C000200d.A00(r2.A6N);
        r5.A0E = C000200d.A00(r2.A74);
        r5.A0F = C000200d.A00(r2.A7C);
        r5.A0G = C000200d.A00(r2.A7D);
        r5.A0A = AnonymousClass1K1.A1L(r1);
        r5.A0H = C000200d.A00(r2.A7K);
        r5.A08 = (C36341nj) r2.A7L.get();
        r5.A06 = (C84444Jn) r1.A5D.get();
        r5.A0I = C000200d.A00(r2.A7M);
        r5.A0J = C000200d.A00(r2.A7R);
        r5.A03 = (C19880zA) r3.A3Y.get();
        r5.A0K = C000200d.A00(r1.A5K);
    }

    public static final void A0u(C46162Dk r1, AnonymousClass6BJ r2, Integer num) {
        AnonymousClass3VT r22 = r2.A0B;
        if (r22 == null) {
            C18070vi.A11("newsletterListViewModel");
            throw null;
        }
        C29681ch A0M2 = r1.A0M();
        C18070vi.A0d(A0M2, 0);
        r22.A03.A0D(A0M2, num);
    }

    public final C111285jR A4b() {
        C111285jR r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterDirectoryViewModel");
        throw null;
    }

    public final AnonymousClass4VZ A4c() {
        AnonymousClass4VZ r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("searchToolbarHelper");
        throw null;
    }

    public final AnonymousClass00H A4d() {
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterConfig");
        throw null;
    }

    public final AnonymousClass00H A4e() {
        AnonymousClass00H r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterLogging");
        throw null;
    }

    public void A4f() {
        if (this instanceof NewsletterDirectoryCategoriesActivity) {
            ((AnonymousClass74D) C18070vi.A0E(A4e())).A0L((Integer) null, (Integer) null, (String) null, (String) null, 2, -1);
        } else if (!C72453Mb.A1a(this.A0P)) {
            ((AnonymousClass74D) C18070vi.A0E(A4e())).A0L((Integer) null, (Integer) null, (String) null, (String) null, 2, -1);
        }
    }

    public void A4g() {
        if (this instanceof NewsletterDirectoryCategoriesActivity) {
            this.A09 = null;
            this.A00 = -1;
            AnonymousClass4VZ A4c = A4c();
            C18070vi.A0z(A4c, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.NewsletterDirectoryToolBarHelper");
            ((AnonymousClass6FL) A4c).A0D();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4h() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity
            if (r0 == 0) goto L_0x0014
            r0 = r3
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r0 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r0
            X.5kw r2 = r0.A07
            if (r2 == 0) goto L_0x0014
            X.6Rt r1 = r0.A08
            java.lang.String r0 = X.C111285jR.A00(r0)
            r2.A0U(r1, r0)
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BJ.A4h():void");
    }

    public void A4j(C29681ch r9, boolean z, boolean z2) {
        AnonymousClass6B5 r1;
        AnonymousClass1E7 r0;
        String str;
        if (this instanceof NewsletterDirectoryCategoriesActivity) {
            C18070vi.A0d(r9, 0);
            C112405lQ r02 = ((NewsletterDirectoryCategoriesActivity) this).A03;
            if (r02 == null) {
                str = "newsletterDirectoryCategoriesAdapter";
            } else {
                r02.A0V(r9, z, z2);
                return;
            }
        } else {
            C18070vi.A0d(r9, 0);
            C112415lR r4 = ((NewsletterDirectoryActivity) this).A06;
            if (r4 == null) {
                str = "newsletterDirectoryAdapter";
            } else {
                Iterator it = C29431cG.A0m(C112415lR.A00(r4)).iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AnonymousClass1ZU.A0B();
                        throw null;
                    }
                    AnonymousClass6TV r12 = (AnonymousClass6TV) next;
                    if ((r12 instanceof AnonymousClass6B5) && (r1 = (AnonymousClass6B5) r12) != null) {
                        if (!C18070vi.A18(r1.A06.A08(), r9)) {
                            i = i2;
                        } else if (z) {
                            r1.A05 = false;
                        } else if (z2 && (r0 = r1.A01) != null && !r0.A0g) {
                            r1.A01 = r4.A03.A0H(r9);
                        }
                    }
                    r4.A02.A0J(new AnonymousClass7RM((Object) r4, i, 25));
                    i = i2;
                }
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02f0, code lost:
        if (X.AnonymousClass000.A1a(r4) != false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015f, code lost:
        if (X.AnonymousClass000.A1a(r2) != false) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4l(X.C129166hM r19) {
        /*
            r18 = this;
            r5 = r18
            boolean r0 = r5 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity
            r6 = r19
            if (r0 == 0) goto L_0x0189
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity r5 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity) r5
            r1 = 0
            X.C18070vi.A0d(r6, r1)
            boolean r0 = com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity.A0Q(r5)
            r5.A4o(r0)
            java.lang.Integer r0 = r6.A01
            int r0 = r0.intValue()
            r7 = 1
            java.lang.String r13 = "newsletterDirectoryCategoriesAdapter"
            r8 = 1
            r4 = 0
            if (r0 == r1) goto L_0x0062
            X.5lQ r3 = r5.A03
            if (r3 == 0) goto L_0x0185
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x002b
            r8 = 0
        L_0x002b:
            X.Amm r1 = r6.A00
            boolean r0 = r1 instanceof X.C175048xu
            if (r0 == 0) goto L_0x0054
            X.6B9 r2 = X.AnonymousClass6B9.A00
        L_0x0033:
            if (r8 == 0) goto L_0x005e
            java.util.List r0 = r3.A02
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x005e
            java.util.List r0 = r3.A02
            java.util.ArrayList r1 = X.C29431cG.A0m(r0)
            java.util.List r0 = r3.A02
            int r0 = X.AnonymousClass3MX.A01(r0)
            r1.remove(r0)
            r1.add(r2)
            r0 = 0
            X.C112405lQ.A00(r3, r1, r0)
            return
        L_0x0054:
            boolean r0 = r1 instanceof X.C175058xv
            if (r0 == 0) goto L_0x005b
            X.6BC r2 = X.AnonymousClass6BC.A00
            goto L_0x0033
        L_0x005b:
            X.6BB r2 = X.AnonymousClass6BB.A00
            goto L_0x0033
        L_0x005e:
            r3.A0W(r2)
            return
        L_0x0062:
            X.4VZ r0 = r5.A4c()
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x0119
            X.1c4 r0 = X.C108985cd.A0V(r5)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0119
            X.5lQ r3 = r5.A03
            if (r3 == 0) goto L_0x0185
            java.util.List r2 = r6.A03
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0131
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            X.6s5 r0 = r3.A00
            if (r0 == 0) goto L_0x00a4
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x00a4
            java.util.Iterator r1 = r0.iterator()
        L_0x0092:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.next()
            X.6s3 r0 = (X.C135346s3) r0
            java.util.List r0 = r0.A02
            r9.addAll(r0)
            goto L_0x0092
        L_0x00a4:
            X.6s5 r0 = r3.A00
            r12 = 0
            if (r0 == 0) goto L_0x00c4
            X.6B2 r0 = r0.A01
            if (r0 == 0) goto L_0x00c4
            java.util.List r10 = r0.A00
            if (r10 == 0) goto L_0x00c4
            X.1c4 r0 = r3.A0D
            X.0ve r8 = r0.A02
            r1 = 9312(0x2460, float:1.3049E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r8, r1)
            java.util.List r0 = X.C29431cG.A0v(r10, r0)
            if (r0 == 0) goto L_0x00c4
            r12 = r0
        L_0x00c4:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r2.iterator()
        L_0x00cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d6
            X.C108985cd.A1O(r8, r1)
            goto L_0x00cc
        L_0x00d6:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r8.iterator()
        L_0x00de:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r8 = r11.next()
            r0 = r8
            X.6B5 r0 = (X.AnonymousClass6B5) r0
            X.2Dk r0 = r0.A06
            X.9Ig r1 = r0.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x00de
            r10.add(r8)
            goto L_0x00de
        L_0x00fb:
            if (r12 == 0) goto L_0x0116
            java.util.Set r0 = X.C29431cG.A12(r12)
        L_0x0101:
            java.util.List r1 = X.C29431cG.A0w(r10, r0)
            java.util.Set r0 = X.C29431cG.A12(r9)
            java.util.List r1 = X.C29431cG.A0w(r1, r0)
            java.util.List r0 = r3.A03
            java.util.ArrayList r0 = X.C29431cG.A0k(r1, r0)
            r3.A03 = r0
            goto L_0x0131
        L_0x0116:
            X.1Om r0 = X.C25511Om.A00
            goto L_0x0101
        L_0x0119:
            X.5lQ r8 = r5.A03
            if (r8 == 0) goto L_0x0185
            java.util.List r2 = r6.A03
            X.5jR r0 = r5.A4b()
            boolean r0 = r0.A06
            r1 = r2
            if (r0 == 0) goto L_0x015b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0147
            r8.A0U()
        L_0x0131:
            X.5jR r0 = r5.A4b()
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x017c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x016a
            r5.A4m(r4, r7)
            return
        L_0x0147:
            java.util.List r0 = r8.A02
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x0151:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0162
            X.C108985cd.A1O(r3, r1)
            goto L_0x0151
        L_0x015b:
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x0131
            goto L_0x0166
        L_0x0162:
            java.util.ArrayList r1 = X.C29431cG.A0k(r2, r3)
        L_0x0166:
            X.C112405lQ.A00(r8, r1, r7)
            goto L_0x0131
        L_0x016a:
            X.11C r1 = r5.A08
            r0 = 2131889456(0x7f120d30, float:1.9413576E38)
            X.C108955ca.A1E(r5, r1, r0)
            X.5lQ r1 = r5.A03
            if (r1 == 0) goto L_0x0185
            X.6BA r0 = X.AnonymousClass6BA.A00
            r1.A0W(r0)
            return
        L_0x017c:
            X.11C r1 = r5.A08
            r0 = 2131889457(0x7f120d31, float:1.9413578E38)
            X.C108955ca.A1E(r5, r1, r0)
            return
        L_0x0185:
            X.C18070vi.A11(r13)
            throw r4
        L_0x0189:
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r5 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r5
            r1 = 0
            X.C18070vi.A0d(r6, r1)
            java.lang.Integer r0 = r6.A01
            int r0 = r0.intValue()
            java.lang.String r10 = "newsletterDirectoryAdapter"
            r3 = 1
            r4 = 1
            r11 = 0
            if (r0 == r1) goto L_0x01f0
            X.5lR r3 = r5.A06
            if (r3 == 0) goto L_0x032c
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x01a5
            r4 = 0
        L_0x01a5:
            X.Amm r1 = r6.A00
            boolean r0 = r1 instanceof X.C175048xu
            if (r0 == 0) goto L_0x01d3
            X.6B9 r2 = X.AnonymousClass6B9.A00
        L_0x01ad:
            if (r4 == 0) goto L_0x01e8
            java.util.List r0 = X.C112415lR.A00(r3)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x01e8
            java.util.List r0 = X.C112415lR.A00(r3)
            java.util.ArrayList r1 = X.C29431cG.A0m(r0)
            java.util.List r0 = X.C112415lR.A00(r3)
            int r0 = X.AnonymousClass3MX.A01(r0)
            r1.remove(r0)
            r1.add(r2)
            X.C112415lR.A01(r3, r1)
            return
        L_0x01d3:
            boolean r0 = r1 instanceof X.C175058xv
            if (r0 == 0) goto L_0x01e5
            X.74D r10 = r3.A06
            r16 = -1
            r15 = 4
            r13 = r11
            r14 = r11
            r12 = r11
            r10.A0L(r11, r12, r13, r14, r15, r16)
            X.6BC r2 = X.AnonymousClass6BC.A00
            goto L_0x01ad
        L_0x01e5:
            X.6BB r2 = X.AnonymousClass6BB.A00
            goto L_0x01ad
        L_0x01e8:
            java.util.List r0 = X.C18070vi.A0M(r2)
            X.C112415lR.A01(r3, r0)
            return
        L_0x01f0:
            X.5jR r0 = r5.A4b()
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x01fd
            java.util.List r0 = r5.A09
            r0.clear()
        L_0x01fd:
            java.util.List r4 = r6.A03
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r4.iterator()
        L_0x0207:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0224
            java.lang.Object r7 = r8.next()
            r0 = r7
            X.6B5 r0 = (X.AnonymousClass6B5) r0
            X.2Dk r0 = r0.A06
            X.9Ig r2 = r0.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r2, r0)
            if (r0 != 0) goto L_0x0207
            r1.add(r7)
            goto L_0x0207
        L_0x0224:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r9 = r4.iterator()
        L_0x022c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0249
            java.lang.Object r8 = r9.next()
            r0 = r8
            X.6B5 r0 = (X.AnonymousClass6B5) r0
            X.2Dk r0 = r0.A06
            X.9Ig r7 = r0.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r7, r0)
            if (r0 == 0) goto L_0x022c
            r2.add(r8)
            goto L_0x022c
        L_0x0249:
            X.0vl r0 = r5.A0P
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x02a4
            java.lang.String r0 = r5.A0M
            if (r0 == 0) goto L_0x0289
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x0289
            java.util.List r0 = r5.A09
            r0.clear()
        L_0x0260:
            X.1c4 r0 = X.C108985cd.A0V(r5)
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x02a6
            java.util.Iterator r2 = r4.iterator()
        L_0x026e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r1 = r2.next()
            X.6B5 r1 = (X.AnonymousClass6B5) r1
            X.6Rt r0 = r5.A08
            java.lang.Integer r0 = r0.A00()
            r1.A02 = r0
            java.lang.String r0 = X.C111285jR.A00(r5)
            r1.A04 = r0
            goto L_0x026e
        L_0x0289:
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x0297
            java.util.List r0 = r5.A09
            r0.addAll(r1)
            java.util.ArrayList r4 = X.C29431cG.A0k(r0, r4)
            goto L_0x0260
        L_0x0297:
            X.0vl r0 = r5.A0B
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0260
            java.util.List r0 = r5.A09
            r0.addAll(r1)
        L_0x02a4:
            r4 = r2
            goto L_0x0260
        L_0x02a6:
            X.5lR r7 = r5.A06
            if (r7 == 0) goto L_0x032c
            X.5jR r0 = r5.A4b()
            boolean r2 = r0.A06
            r1 = r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            if (r2 == 0) goto L_0x02ec
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x02d6
            r7.A0U()
        L_0x02c0:
            X.5jR r0 = r5.A4b()
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0323
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x030d
            r5.A4m(r11, r3)
            return
        L_0x02d6:
            java.util.List r0 = X.C112415lR.A00(r7)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x02e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f3
            X.C108985cd.A1O(r2, r1)
            goto L_0x02e2
        L_0x02ec:
            boolean r0 = X.AnonymousClass000.A1a(r4)
            if (r0 == 0) goto L_0x02c0
            goto L_0x02f7
        L_0x02f3:
            java.util.ArrayList r1 = X.C29431cG.A0k(r4, r2)
        L_0x02f7:
            java.lang.Object r0 = X.C29431cG.A0e(r1)
            boolean r0 = r0 instanceof X.AnonymousClass6B8
            if (r0 != 0) goto L_0x0309
            java.util.ArrayList r1 = X.C29431cG.A0m(r1)
            X.6B8 r0 = X.AnonymousClass6B8.A00
            java.util.ArrayList r1 = X.C29431cG.A0l(r0, r1)
        L_0x0309:
            X.C112415lR.A01(r7, r1)
            goto L_0x02c0
        L_0x030d:
            X.11C r1 = r5.A08
            r0 = 2131889456(0x7f120d30, float:1.9413576E38)
            X.C108955ca.A1E(r5, r1, r0)
            X.5lR r1 = r5.A06
            if (r1 == 0) goto L_0x032c
            X.6BA r0 = X.AnonymousClass6BA.A00
            java.util.List r0 = X.C18070vi.A0M(r0)
            X.C112415lR.A01(r1, r0)
            return
        L_0x0323:
            X.11C r1 = r5.A08
            r0 = 2131889457(0x7f120d31, float:1.9413578E38)
            X.C108955ca.A1E(r5, r1, r0)
            return
        L_0x032c:
            X.C18070vi.A11(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BJ.A4l(X.6hM):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4m(java.lang.Integer r10, boolean r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity
            if (r0 == 0) goto L_0x006a
            r4 = r9
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity r4 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity) r4
            X.5jR r0 = r4.A4b()
            X.1DS r0 = r0.A08
            java.lang.Object r0 = r0.A06()
            X.6hM r0 = (X.C129166hM) r0
            r2 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.String r5 = r0.A02
        L_0x0018:
            X.00H r0 = r4.A0D
            if (r0 == 0) goto L_0x0159
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x003b
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            if (r11 != 0) goto L_0x002b
            r5 = r2
        L_0x002b:
            X.8xu r2 = new X.8xu
            r2.<init>()
            X.0wS r1 = X.C18460wS.A00
            X.6hM r0 = new X.6hM
            r0.<init>(r2, r3, r5, r1)
            r4.A4l(r0)
        L_0x003a:
            return
        L_0x003b:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "recyclerView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0045:
            r0.A0c()
            boolean r0 = com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity.A0Q(r4)
            r4.A4o(r0)
            java.lang.String r0 = "newsletterDirectoryCategoriesAdapter"
            X.5lQ r1 = r4.A03
            if (r11 != 0) goto L_0x0062
            if (r1 != 0) goto L_0x005b
            X.C18070vi.A11(r0)
            throw r2
        L_0x005b:
            X.6B8 r0 = X.AnonymousClass6B8.A00
            r1.A0W(r0)
            goto L_0x013b
        L_0x0062:
            if (r1 != 0) goto L_0x0138
            X.C18070vi.A11(r0)
            throw r2
        L_0x0068:
            r5 = r2
            goto L_0x0018
        L_0x006a:
            r3 = r9
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r3 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r3
            X.00H r0 = r3.A0D
            if (r0 == 0) goto L_0x01dd
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            r1 = 0
            if (r0 != 0) goto L_0x00a3
            X.5jR r0 = r3.A4b()
            X.1DS r0 = r0.A08
            java.lang.Object r0 = r0.A06()
            X.6hM r0 = (X.C129166hM) r0
            if (r0 == 0) goto L_0x00a1
            java.lang.String r5 = r0.A02
        L_0x008c:
            java.lang.Integer r4 = X.AnonymousClass00R.A01
            if (r11 != 0) goto L_0x0091
            r5 = r1
        L_0x0091:
            X.8xu r2 = new X.8xu
            r2.<init>()
            X.0wS r1 = X.C18460wS.A00
            X.6hM r0 = new X.6hM
            r0.<init>(r2, r4, r5, r1)
            r3.A4l(r0)
            return
        L_0x00a1:
            r5 = r1
            goto L_0x008c
        L_0x00a3:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "directoryRecyclerView"
        L_0x00a9:
            X.C18070vi.A11(r0)
            throw r1
        L_0x00ad:
            r0.A0c()
            java.lang.String r0 = "newsletterDirectoryAdapter"
            X.5lR r4 = r3.A06
            if (r11 != 0) goto L_0x00d6
            if (r4 == 0) goto L_0x00a9
            X.6B8 r0 = X.AnonymousClass6B8.A00
            java.util.List r0 = X.C18070vi.A0M(r0)
        L_0x00be:
            X.C112415lR.A01(r4, r0)
        L_0x00c1:
            java.lang.String r0 = r3.A0M
            if (r0 == 0) goto L_0x018f
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x018f
            java.lang.String r6 = r3.A0M
            if (r6 == 0) goto L_0x003a
            X.5jR r5 = r3.A4b()
            X.9Ir r4 = r3.A09
            goto L_0x0119
        L_0x00d6:
            if (r4 == 0) goto L_0x00a9
            java.util.List r0 = X.C112415lR.A00(r4)
            java.lang.Object r1 = X.C29431cG.A0e(r0)
            boolean r0 = r1 instanceof X.AnonymousClass6B9
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r1 instanceof X.AnonymousClass6BC
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r1 instanceof X.AnonymousClass6BB
            if (r0 == 0) goto L_0x00c1
        L_0x00ec:
            java.util.List r0 = X.C112415lR.A00(r4)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x00f8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0102
            X.C108985cd.A1O(r2, r1)
            goto L_0x00f8
        L_0x0102:
            X.6B8 r0 = X.AnonymousClass6B8.A00
            java.util.ArrayList r0 = X.C29431cG.A0l(r0, r2)
            goto L_0x00be
        L_0x0109:
            java.lang.String r6 = r4.A0M
            if (r6 == 0) goto L_0x0123
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0123
            X.5jR r5 = r4.A4b()
            X.9Ir r4 = r4.A09
        L_0x0119:
            r0 = 1
            r5.A05 = r0
            if (r11 == 0) goto L_0x015f
            com.whatsapp.newsletter.iq.BaseNewslettersJob r0 = r5.A00
            if (r0 == 0) goto L_0x015f
            return
        L_0x0123:
            r0 = 0
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity.A03(r4, r0)
            X.1c4 r0 = X.C108985cd.A0V(r4)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x003a
            X.5jR r3 = r4.A4b()
            X.6RR r2 = X.AnonymousClass6RR.FEATURED
            goto L_0x014f
        L_0x0138:
            r1.A0U()
        L_0x013b:
            X.9Ir r0 = r4.A09
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.A0M
            if (r0 == 0) goto L_0x0149
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0109
        L_0x0149:
            X.5jR r3 = r4.A4b()
            X.6RR r2 = X.AnonymousClass6RR.RECOMMENDED
        L_0x014f:
            X.9Ir r1 = r4.A09
            java.lang.String r0 = X.C111285jR.A00(r4)
            r3.A0U(r1, r2, r0, r11)
            return
        L_0x0159:
            java.lang.String r0 = "messageClient"
            X.C18070vi.A11(r0)
            throw r2
        L_0x015f:
            com.whatsapp.newsletter.iq.BaseNewslettersJob r0 = r5.A00
            if (r0 == 0) goto L_0x0166
            r0.cancel()
        L_0x0166:
            r5.A06 = r11
            X.1md r3 = r5.A0F
            r2 = 0
            if (r11 == 0) goto L_0x018d
            X.1DS r0 = r5.A08
            java.lang.Object r0 = r0.A06()
            X.6hM r0 = (X.C129166hM) r0
            if (r0 == 0) goto L_0x018d
            java.lang.String r1 = r0.A02
        L_0x0179:
            X.9Ir r0 = X.C179619Ir.EXPLORE
            if (r4 != r0) goto L_0x017e
            r4 = r2
        L_0x017e:
            X.00H r0 = r5.A0I
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.BCA r0 = (X.BCA) r0
            com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob r0 = r3.A00(r4, r0, r6, r1)
            r5.A00 = r0
            return
        L_0x018d:
            r1 = r2
            goto L_0x0179
        L_0x018f:
            X.5jR r4 = r3.A4b()
            X.6Rt r0 = r3.A08
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x01da
            r0 = 2
            if (r1 == r0) goto L_0x01d7
            r0 = 3
            if (r1 == r0) goto L_0x01d4
            r0 = 4
            if (r1 == r0) goto L_0x01d1
            r0 = 6
            if (r1 == r0) goto L_0x01d1
            X.6RR r2 = X.AnonymousClass6RR.RECOMMENDED
        L_0x01aa:
            X.9Ir r1 = r3.A09
            java.lang.String r0 = X.C111285jR.A00(r3)
            r4.A0U(r1, r2, r0, r11)
            X.00H r0 = r3.A4e()
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.74D r1 = (X.AnonymousClass74D) r1
            X.6Rt r0 = r3.A08
            java.lang.Integer r2 = r0.A00()
            java.lang.String r4 = X.C111285jR.A00(r3)
            r5 = 0
            r7 = -1
            r6 = 12
            r3 = r10
            r1.A0L(r2, r3, r4, r5, r6, r7)
            return
        L_0x01d1:
            X.6RR r2 = X.AnonymousClass6RR.POPULAR
            goto L_0x01aa
        L_0x01d4:
            X.6RR r2 = X.AnonymousClass6RR.NEW
            goto L_0x01aa
        L_0x01d7:
            X.6RR r2 = X.AnonymousClass6RR.FEATURED
            goto L_0x01aa
        L_0x01da:
            X.6RR r2 = X.AnonymousClass6RR.TRENDING
            goto L_0x01aa
        L_0x01dd:
            java.lang.String r0 = "messageClient"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BJ.A4m(java.lang.Integer, boolean):void");
    }

    public void A4n(boolean z) {
        if (this instanceof NewsletterDirectoryActivity) {
            NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this;
            RecyclerView recyclerView = newsletterDirectoryActivity.A01;
            int i = 0;
            if (recyclerView != null) {
                recyclerView.setVisibility(C72453Mb.A07(z ? 1 : 0));
            }
            View findViewById = newsletterDirectoryActivity.findViewById(2131436274);
            C18070vi.A0b(findViewById);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                C22659BIk bIk = (C22659BIk) layoutParams;
                if (z) {
                    i = 21;
                }
                bIk.A00 = i;
                findViewById.setLayoutParams(bIk);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        }
    }

    public void A4o(boolean z) {
        if (this instanceof NewsletterDirectoryCategoriesActivity) {
            NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity = (NewsletterDirectoryCategoriesActivity) this;
            if (C108985cd.A0V(newsletterDirectoryCategoriesActivity).A04()) {
                RecyclerView recyclerView = newsletterDirectoryCategoriesActivity.A00;
                if (z) {
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        C28931bI r0 = newsletterDirectoryCategoriesActivity.A04;
                        if (r0 != null) {
                            AnonymousClass3MX.A0D(r0).setVisibility(0);
                            return;
                        }
                    }
                    C18070vi.A11("recyclerView");
                    throw null;
                }
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                    C28931bI r02 = newsletterDirectoryCategoriesActivity.A04;
                    if (r02 != null) {
                        AnonymousClass3MX.A0D(r02).setVisibility(8);
                        return;
                    }
                }
                C18070vi.A11("recyclerView");
                throw null;
                C18070vi.A11("categorySearchLayout");
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r1 == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A4p() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity
            if (r0 == 0) goto L_0x0020
            X.9Ir r0 = r2.A09
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = r2.A0M
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001e
        L_0x0012:
            r0 = 0
            return r0
        L_0x0014:
            X.4VZ r0 = r2.A4c()
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0012
        L_0x001e:
            r0 = 1
            return r0
        L_0x0020:
            java.lang.String r0 = r2.A0M
            if (r0 == 0) goto L_0x002b
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BJ.A4p():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A4r(int r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity
            if (r0 == 0) goto L_0x0012
            r0 = r3
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity r0 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity) r0
            X.5lQ r1 = r0.A03
            if (r1 != 0) goto L_0x001c
            java.lang.String r0 = "newsletterDirectoryCategoriesAdapter"
        L_0x000d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0012:
            r0 = r3
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r0 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r0
            X.5lR r1 = r0.A06
            if (r1 != 0) goto L_0x002a
            java.lang.String r0 = "newsletterDirectoryAdapter"
            goto L_0x000d
        L_0x001c:
            java.util.List r0 = r1.A02
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x003c
            int r2 = r1.getItemViewType(r4)
            r1 = 3
            goto L_0x0039
        L_0x002a:
            java.util.List r0 = X.C112415lR.A00(r1)
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x003c
            int r2 = r1.getItemViewType(r4)
            r1 = 2
        L_0x0039:
            r0 = 1
            if (r2 == r1) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BJ.A4r(int):boolean");
    }

    public void Brf(AnonymousClass6B5 r8, int i, boolean z) {
        C46162Dk r5 = r8.A06;
        if (z) {
            Integer A0c = A0c(this);
            A4k(r8, i, true);
            if (r5.A0D > 0) {
                A0u(r5, this, A0c);
                return;
            }
            WeakReference A0z = AnonymousClass3MW.A0z(this);
            AnonymousClass3VT r0 = this.A0B;
            if (r0 == null) {
                C18070vi.A11("newsletterListViewModel");
                throw null;
            }
            r0.A03.A03(r5, new AnonymousClass7w5(r5, A0c, A0z));
            return;
        }
        C29681ch A0M2 = r5.A0M();
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(C108975cc.A0b(this, r5.A0T, AnonymousClass3MW.A1a(), 2131897309));
        AnonymousClass7AL.A00(this, A002, 4, 2131898766);
        A002.A0g(this, new AnonymousClass7AI(A0M2, r8, this, i), 2131897305);
        A002.A0d(this, new AnonymousClass7AH(A0M2, this, 8));
        AnonymousClass3MY.A1G(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r0 == false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Brh(X.AnonymousClass6B5 r15, int r16) {
        /*
            r14 = this;
            X.2Dk r2 = r15.A06
            X.1BI r6 = r2.A08()
            boolean r0 = r6 instanceof X.C29681ch
            if (r0 == 0) goto L_0x0065
            X.1ch r6 = (X.C29681ch) r6
            if (r6 == 0) goto L_0x0065
            boolean r3 = r14 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity
            if (r3 == 0) goto L_0x006e
            X.00H r0 = r14.A4d()
            boolean r0 = X.C108985cd.A1b(r0)
            if (r0 == 0) goto L_0x006e
            java.lang.Integer r7 = X.AnonymousClass00R.A0H
        L_0x001e:
            X.1D6 r0 = r14.A0q(r15)
            java.lang.Object r8 = r0.first
            java.lang.String r8 = (java.lang.String) r8
            int r10 = X.C108955ca.A09(r0)
            X.00H r0 = r14.A4e()
            java.lang.Object r4 = r0.get()
            X.74D r4 = (X.AnonymousClass74D) r4
            boolean r13 = r14.A4p()
            X.9Ig r5 = r2.A02
            int r0 = r2.A0A
            long r11 = (long) r0
            r9 = r16
            r4.A0C(r5, r6, r7, r8, r9, r10, r11, r13)
            X.5jR r4 = r14.A4b()
            boolean r1 = r14.A4p()
            X.00H r0 = r4.A0H
            boolean r0 = X.C108985cd.A1b(r0)
            if (r1 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0058
            r1 = 28
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            r1 = 9
        L_0x005a:
            X.00H r0 = r4.A0K
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.749 r0 = (X.AnonymousClass749) r0
            r0.A08(r14, r2, r1)
        L_0x0065:
            return
        L_0x0066:
            if (r3 == 0) goto L_0x006c
            r1 = 27
            if (r0 != 0) goto L_0x005a
        L_0x006c:
            r1 = 6
            goto L_0x005a
        L_0x006e:
            java.lang.Integer r7 = X.AnonymousClass00R.A0Y
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BJ.Brh(X.6B5, int):void");
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.4VZ] */
    /* JADX WARNING: type inference failed for: r1v39, types: [X.5fc, X.6F4, android.view.View, X.6F9] */
    /* JADX WARNING: type inference failed for: r5v13, types: [X.4VZ] */
    /* JADX WARNING: type inference failed for: r5v14, types: [X.6FL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            super.onCreate(r1)
            boolean r1 = r0 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity
            if (r1 == 0) goto L_0x019f
            r2 = 2131624087(0x7f0e0097, float:1.8875344E38)
        L_0x000e:
            r0.setContentView((int) r2)
            X.5jR r4 = r0.A4b()
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "selected_country"
            java.lang.String r2 = r3.getStringExtra(r2)
            X.1DT r3 = r4.A0A
            if (r2 != 0) goto L_0x002f
            X.00H r2 = r4.A0J
            java.lang.Object r2 = r2.get()
            X.6pa r2 = (X.C133836pa) r2
            java.lang.String r2 = r2.A00()
        L_0x002f:
            r3.A0F(r2)
            androidx.appcompat.widget.Toolbar r6 = X.AnonymousClass3Ma.A0G(r0)
            r2 = 2131892563(0x7f121953, float:1.9419878E38)
            r6.setTitle((int) r2)
            X.01n r3 = X.C72463Mc.A0S(r0, r6)
            X.C18070vi.A0X(r3)
            r2 = 1
            r3.A0W(r2)
            X.0vb r5 = r0.A00
            X.C18070vi.A0W(r5)
            r2 = 2131434898(0x7f0b1d92, float:1.8491623E38)
            android.view.View r7 = X.AnonymousClass3MY.A0H(r0, r2)
            r2 = 3
            X.79p r4 = new X.79p
            r4.<init>(r0, r2)
            X.0vl r3 = r0.A0P
            boolean r3 = X.C72453Mb.A1a(r3)
            if (r3 == 0) goto L_0x0193
            X.6FL r3 = new X.6FL
            r8 = r4
            r9 = r6
            r10 = r5
            r5 = r3
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x006b:
            r0.A0C = r3
            if (r1 == 0) goto L_0x012b
            r15 = r0
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity r15 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity) r15
            X.6ZW r3 = r15.A01
            if (r3 == 0) goto L_0x0332
            X.1K2 r3 = r3.A00
            X.10E r4 = r3.A01
            X.1Vd r9 = X.AnonymousClass3MZ.A0i(r4)
            X.10I r19 = X.AnonymousClass10E.AL1(r4)
            X.1M9 r8 = X.AnonymousClass10E.A4z(r4)
            X.118 r10 = X.AnonymousClass3MZ.A0l(r4)
            X.0vb r11 = X.AnonymousClass10E.A6Q(r4)
            X.1c4 r13 = X.C108965cb.A0T(r4)
            X.1K1 r5 = r3.A00
            X.00S r3 = r5.A0x
            java.lang.Object r6 = r3.get()
            X.6ZX r6 = (X.AnonymousClass6ZX) r6
            X.10G r3 = r4.A00
            X.00S r3 = r3.A1X
            java.lang.Object r14 = r3.get()
            X.6lO r14 = (X.C131616lO) r14
            X.1KB r7 = X.AnonymousClass10E.A12(r4)
            X.00S r3 = r5.A51
            java.lang.Object r5 = r3.get()
            X.2hT r5 = (X.C56442hT) r5
            X.0ve r12 = X.AnonymousClass10E.A8r(r4)
            r17 = r15
            r18 = r15
            X.5lQ r4 = new X.5lQ
            r16 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15.A03 = r4
            X.5jR r3 = r15.A4b()
            X.1Dg r4 = r3.A09
            X.80O r3 = new X.80O
            r3.<init>(r15)
            r5 = 48
            X.AnonymousClass7AT.A01(r15, r4, r3, r5)
            X.5jR r3 = r15.A4b()
            X.1DT r4 = r3.A0B
            X.80P r3 = new X.80P
            r3.<init>(r15)
            X.AnonymousClass7AT.A01(r15, r4, r3, r5)
        L_0x00e1:
            X.1Lf r4 = r0.A07
            if (r4 == 0) goto L_0x0325
            X.1Gv r3 = r0.A0O
            r4.registerObserver(r3)
            X.5jR r3 = r0.A4b()
            X.1DS r4 = r3.A08
            X.80J r3 = new X.80J
            r3.<init>(r0)
            r5 = 47
            X.AnonymousClass7AT.A01(r0, r4, r3, r5)
            X.1c4 r3 = X.C108985cd.A0V(r0)
            boolean r3 = r3.A04()
            if (r3 == 0) goto L_0x0112
            X.5jR r3 = r0.A4b()
            X.1DS r4 = r3.A07
            X.80K r3 = new X.80K
            r3.<init>(r0)
            X.AnonymousClass7AT.A01(r0, r4, r3, r5)
        L_0x0112:
            if (r1 == 0) goto L_0x0216
            r4 = r0
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity r4 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity) r4
            r1 = 2131430005(0x7f0b0a75, float:1.8481699E38)
            android.view.View r9 = X.AnonymousClass3MY.A0C(r4, r1)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            X.5lQ r1 = r4.A03
            java.lang.String r7 = "newsletterDirectoryCategoriesAdapter"
            r8 = 0
            if (r1 != 0) goto L_0x01a4
            X.C18070vi.A11(r7)
            throw r8
        L_0x012b:
            r13 = r0
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r13 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r13
            X.6ZU r3 = r13.A04
            if (r3 == 0) goto L_0x032f
            X.1K2 r4 = r3.A00
            X.10E r3 = r4.A01
            X.0ve r6 = X.AnonymousClass10E.A8r(r3)
            X.1K1 r3 = r4.A00
            X.00S r3 = r3.A36
            java.lang.Object r5 = r3.get()
            X.6ZV r5 = (X.AnonymousClass6ZV) r5
            X.0zB r4 = X.C19890zB.A00
            X.5kw r3 = new X.5kw
            r3.<init>(r4, r5, r6, r13)
            r13.A07 = r3
            X.6ZT r3 = r13.A03
            if (r3 == 0) goto L_0x032c
            X.1K2 r3 = r3.A00
            X.10E r4 = r3.A01
            X.1Vd r8 = X.AnonymousClass3MZ.A0i(r4)
            X.118 r9 = X.AnonymousClass3MZ.A0l(r4)
            X.10I r15 = X.AnonymousClass10E.AL1(r4)
            X.1M9 r7 = X.AnonymousClass10E.A4z(r4)
            X.1KB r6 = X.AnonymousClass10E.A12(r4)
            X.1K1 r3 = r3.A00
            X.00S r3 = r3.A51
            java.lang.Object r5 = r3.get()
            X.2hT r5 = (X.C56442hT) r5
            X.00S r3 = r4.A7M
            java.lang.Object r12 = r3.get()
            X.74D r12 = (X.AnonymousClass74D) r12
            X.10G r3 = r4.A00
            X.00S r3 = r3.A1X
            java.lang.Object r11 = r3.get()
            X.6lO r11 = (X.C131616lO) r11
            X.1c4 r10 = X.C108965cb.A0T(r4)
            X.5lR r4 = new X.5lR
            r14 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r13.A06 = r4
            goto L_0x00e1
        L_0x0193:
            X.4VZ r3 = new X.4VZ
            r8 = r4
            r9 = r6
            r10 = r5
            r5 = r3
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x006b
        L_0x019f:
            r2 = 2131624086(0x7f0e0096, float:1.8875342E38)
            goto L_0x000e
        L_0x01a4:
            r9.setAdapter(r1)
            r9.setItemAnimator(r8)
            r6 = 1
            r3 = 0
            com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager r1 = new com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager
            r1.<init>(r4, r6, r3)
            r9.setLayoutManager(r1)
            r4.A00 = r9
            X.5lQ r3 = r4.A03
            if (r3 != 0) goto L_0x01be
            X.C18070vi.A11(r7)
            throw r8
        L_0x01be:
            java.lang.String r7 = "recyclerView"
            r6 = 9
            X.28K r1 = new X.28K
            r1.<init>(r9, r6)
            r4.A01 = r1
            r3.CDq(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r4.A00
            if (r3 != 0) goto L_0x01d4
            X.C18070vi.A11(r7)
            throw r8
        L_0x01d4:
            X.5lx r1 = new X.5lx
            r1.<init>(r4, r6)
            r3.A0t(r1)
            r4.A02 = r1
            r1 = 2131428920(0x7f0b0638, float:1.8479498E38)
            X.1bI r1 = X.AnonymousClass3Ma.A0x(r4, r1)
            r4.A04 = r1
            android.view.View r3 = X.AnonymousClass3MX.A0D(r1)
            r1 = 8
            r3.setVisibility(r1)
            X.1bI r1 = r4.A04
            if (r1 != 0) goto L_0x01fa
            java.lang.String r0 = "categorySearchLayout"
            X.C18070vi.A11(r0)
            throw r8
        L_0x01fa:
            android.view.View r3 = r1.A02()
            r1 = 2131429100(0x7f0b06ec, float:1.8479863E38)
            android.view.View r3 = X.C18070vi.A05(r3, r1)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.6F4 r1 = new X.6F4
            r1.<init>(r4)
            r1.A03()
            r4.A02 = r1
            r3.addView(r1)
            goto L_0x02a1
        L_0x0216:
            r7 = r0
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r7 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r7
            r1 = 2131433052(0x7f0b165c, float:1.8487879E38)
            android.view.View r11 = X.AnonymousClass3MY.A0C(r7, r1)
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            X.5lR r1 = r7.A06
            java.lang.String r4 = "newsletterDirectoryAdapter"
            r10 = 0
            if (r1 != 0) goto L_0x022d
            X.C18070vi.A11(r4)
            throw r10
        L_0x022d:
            r11.setAdapter(r1)
            r11.setItemAnimator(r10)
            r6 = 0
            r9 = 1
            com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager r1 = new com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager
            r1.<init>(r7, r9, r6)
            r11.setLayoutManager(r1)
            r7.A00 = r11
            X.5lR r3 = r7.A06
            if (r3 != 0) goto L_0x0247
            X.C18070vi.A11(r4)
            throw r10
        L_0x0247:
            java.lang.String r8 = "directoryRecyclerView"
            r4 = 9
            X.28K r1 = new X.28K
            r1.<init>(r11, r4)
            r7.A01 = r1
            r3.CDq(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r7.A00
            if (r3 != 0) goto L_0x025d
            X.C18070vi.A11(r8)
            throw r10
        L_0x025d:
            X.5lx r1 = new X.5lx
            r1.<init>(r7, r4)
            r3.A0t(r1)
            r7.A02 = r1
            r1 = 2131430854(0x7f0b0dc6, float:1.848342E38)
            android.view.View r1 = X.C110885hR.A0A(r7, r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r7.A01 = r1
            r7.A4n(r9)
            r1 = 2131430853(0x7f0b0dc5, float:1.8483419E38)
            android.view.View r1 = X.C110885hR.A0A(r7, r1)
            r1.setVisibility(r6)
            X.5kw r4 = r7.A07
            if (r4 == 0) goto L_0x028c
            X.6Rt r3 = X.C122746Rt.EXPLORE
            java.lang.String r1 = X.C111285jR.A00(r7)
            r4.A0U(r3, r1)
        L_0x028c:
            androidx.recyclerview.widget.RecyclerView r3 = r7.A01
            if (r3 == 0) goto L_0x0295
            X.5kw r1 = r7.A07
            r3.setAdapter(r1)
        L_0x0295:
            androidx.recyclerview.widget.RecyclerView r3 = r7.A01
            if (r3 == 0) goto L_0x02a1
            com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager r1 = new com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager
            r1.<init>(r7, r6, r6)
            r3.setLayoutManager(r1)
        L_0x02a1:
            X.4Jn r4 = r0.A06
            if (r4 == 0) goto L_0x0322
            r3 = 4
            X.4g3 r1 = new X.4g3
            r1.<init>(r4, r3)
            X.1It r3 = new X.1It
            r3.<init>(r1, r0)
            java.lang.Class<X.3VT> r1 = X.AnonymousClass3VT.class
            X.1J2 r3 = r3.A00(r1)
            X.3VT r3 = (X.AnonymousClass3VT) r3
            X.1Fv r1 = r0.getLifecycle()
            r1.A05(r3)
            r0.A0B = r3
            java.lang.String r4 = "newsletterListViewModel"
            if (r3 == 0) goto L_0x031e
            X.4mD r1 = r3.A02
            X.1DT r3 = r1.A00
            X.80L r1 = new X.80L
            r1.<init>(r0)
            X.AnonymousClass7AT.A01(r0, r3, r1, r5)
            X.3VT r1 = r0.A0B
            if (r1 == 0) goto L_0x031e
            X.1DT r3 = r1.A01
            X.5Tf r1 = new X.5Tf
            r1.<init>(r0)
            X.AnonymousClass7AT.A01(r0, r3, r1, r5)
            X.3VT r1 = r0.A0B
            if (r1 == 0) goto L_0x031e
            X.1DT r3 = r1.A00
            X.80M r1 = new X.80M
            r1.<init>(r0)
            X.AnonymousClass7AT.A01(r0, r3, r1, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            r0.A4m(r2, r1)
            X.5jR r5 = r0.A4b()
            X.9Ir r2 = r0.A09
            X.9Ir r1 = X.C179619Ir.EXPLORE
            if (r2 != r1) goto L_0x030e
            X.1OX r4 = X.C41561wd.A00(r5)
            X.0wl r3 = r5.A0L
            r2 = 0
            com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$maybeFetchWamoNewsletters$1 r1 = new com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$maybeFetchWamoNewsletters$1
            r1.<init>(r5, r2)
            X.AnonymousClass3MW.A1X(r3, r1, r4)
        L_0x030e:
            X.1GP r3 = r0.getSupportFragmentManager()
            r1 = 1
            X.7A8 r2 = new X.7A8
            r2.<init>(r0, r1)
            java.lang.String r1 = "wamo_waist_hide_after_exit_result_key"
            r3.A0t(r2, r0, r1)
            return
        L_0x031e:
            X.C18070vi.A11(r4)
            goto L_0x032a
        L_0x0322:
            java.lang.String r0 = "newsletterListViewModelFactory"
            goto L_0x0327
        L_0x0325:
            java.lang.String r0 = "contactObservers"
        L_0x0327:
            X.C18070vi.A11(r0)
        L_0x032a:
            r0 = 0
            throw r0
        L_0x032c:
            java.lang.String r0 = "newsletterDirectoryAdapterFactory"
            goto L_0x0334
        L_0x032f:
            java.lang.String r0 = "newsletterDirectoryFilterAdapterFactory"
            goto L_0x0334
        L_0x0332:
            java.lang.String r0 = "directoryCategoriesAdapterFactory"
        L_0x0334:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BJ.onCreate(android.os.Bundle):void");
    }

    public static final int A0V(AnonymousClass6BJ r2) {
        C111285jR A4b = r2.A4b();
        if (!C18070vi.A18(A4b.A0A.A06(), ((C133836pa) A4b.A0J.get()).A00())) {
            return 2131233306;
        }
        return 2131233305;
    }

    public static final Integer A0c(AnonymousClass6BJ r2) {
        Integer num;
        if (r2.A4p()) {
            num = AnonymousClass00R.A18;
        } else {
            num = AnonymousClass00R.A0Y;
        }
        AnonymousClass00H r0 = r2.A0J;
        if (r0 != null) {
            return ((A6Q) r0.get()).A04((Integer) null, C1402570p.A00(num));
        }
        C18070vi.A11("newsletterPerfTracker");
        throw null;
    }

    public static final Integer A0d(AnonymousClass6BJ r2) {
        Integer num;
        if (r2.A4p()) {
            num = AnonymousClass00R.A18;
        } else {
            num = AnonymousClass00R.A0Y;
        }
        AnonymousClass00H r0 = r2.A0J;
        if (r0 != null) {
            return ((A6Q) r0.get()).A05((Integer) null, C1402570p.A00(num));
        }
        C18070vi.A11("newsletterPerfTracker");
        throw null;
    }

    private final AnonymousClass1D6 A0q(AnonymousClass6B5 r5) {
        int valueOf;
        String str = null;
        if (!C108985cd.A1b(A4d())) {
            valueOf = -1;
        } else {
            String str2 = r5.A03;
            if (str2 == null) {
                C179619Ir r0 = this.A09;
                if (r0 != null) {
                    str = r0.name();
                }
            } else {
                str = str2;
            }
            int i = r5.A00;
            if (i <= -1) {
                i = (int) this.A00;
            }
            valueOf = Integer.valueOf(i);
        }
        return AnonymousClass1D6.A01(str, valueOf);
    }

    private final void A0r() {
        AnonymousClass4VZ A4c = A4c();
        C18100vl r5 = this.A0P;
        A4c.A06(C72453Mb.A1a(r5));
        A4n(false);
        A4o(true);
        AnonymousClass3Ma.A19(findViewById(2131434851), this, 12);
        String stringExtra = getIntent().getStringExtra("selected_category_title");
        if (!(stringExtra == null || getIntent().getIntExtra("selected_category", -1) == -1)) {
            A4c().A00.setQueryHint(C17890vO.A0R(this, stringExtra, 1, 0, 2131889451));
        }
        if (C72453Mb.A1a(r5)) {
            View findViewById = A4c().A00.findViewById(2131434969);
            findViewById.setOnKeyListener(new AnonymousClass78Y(findViewById, this, 1));
        }
    }

    public static void A0v(C46162Dk r3, C112405lQ r4, Map map) {
        C179509Ig r0;
        C86924Tp r02 = (C86924Tp) map.get(r3.A0M());
        if (r02 != null) {
            C46162Dk r2 = r02.A00;
            if (C18070vi.A18(r3.A08(), r2.A08()) && r3.A02 != (r0 = r2.A02)) {
                r3.A02 = r0;
                r4.A0H.CGN(new C21458AkP(r4, r3, 37));
            }
        }
    }

    public final void A4i() {
        String A002 = C111285jR.A00(this);
        CountrySelectorBottomSheet countrySelectorBottomSheet = new CountrySelectorBottomSheet();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("SELECTED_COUNTRY_ISO", A002);
        countrySelectorBottomSheet.A1R(A0D2);
        countrySelectorBottomSheet.A03 = new C127576ea(this, countrySelectorBottomSheet);
        CMl(countrySelectorBottomSheet);
    }

    public final void A4k(AnonymousClass6B5 r15, int i, boolean z) {
        String str;
        Integer num;
        int i2;
        Integer num2;
        AnonymousClass1D6 A0q = A0q(r15);
        String str2 = (String) A0q.first;
        int A092 = C108955ca.A09(A0q);
        boolean z2 = this instanceof NewsletterDirectoryCategoriesActivity;
        AnonymousClass74D r4 = (AnonymousClass74D) A4e().get();
        C29681ch A0M2 = r15.A06.A0M();
        boolean A4p = A4p();
        if (this instanceof NewsletterDirectoryActivity) {
            switch (((NewsletterDirectoryActivity) this).A08.ordinal()) {
                case 0:
                    str = "explore";
                    break;
                case 1:
                    str = "most_active";
                    break;
                case 2:
                    str = "featured";
                    break;
                case 3:
                    str = "new";
                    break;
                case 4:
                    str = "popular";
                    break;
                case 5:
                    str = "region";
                    break;
                case 6:
                    str = "discovery";
                    break;
                default:
                    throw AnonymousClass3MW.A14();
            }
        } else {
            str = null;
        }
        C18070vi.A0d(A0M2, 0);
        AnonymousClass00H r2 = r4.A07;
        boolean A1b = C108985cd.A1b(r2);
        int i3 = i;
        if (z) {
            if (A4p) {
                if (!z2 || !A1b) {
                    num2 = AnonymousClass00R.A18;
                } else {
                    num2 = AnonymousClass00R.A0I;
                }
            } else if (!z2 || !A1b) {
                num2 = AnonymousClass00R.A0Y;
            } else {
                num2 = AnonymousClass00R.A0H;
            }
            r4.A0H(A0M2, num2, num2, (Long) null, str, (String) null, str2, i3, A092);
            if (!C108985cd.A1b(r2)) {
                i2 = 7;
            } else {
                return;
            }
        } else {
            if (A4p) {
                if (!z2 || !A1b) {
                    num = AnonymousClass00R.A18;
                } else {
                    num = AnonymousClass00R.A0I;
                }
            } else if (!z2 || !A1b) {
                num = AnonymousClass00R.A0Y;
            } else {
                num = AnonymousClass00R.A0H;
            }
            r4.A0I(A0M2, num, num, (Long) null, str, (String) null, str2, i3, A092);
            if (!C108985cd.A1b(r2)) {
                i2 = 8;
            } else {
                return;
            }
        }
        AnonymousClass74D.A06(A0M2, r4, i2, i3, A4p);
    }

    public final boolean A4q() {
        String str;
        C129166hM r0 = (C129166hM) A4b().A08.A06();
        if (r0 == null || (str = r0.A02) == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public void onBackPressed() {
        if (A4c().A0C()) {
            A4c().A05(true);
            A4n(true);
            A4m((Integer) null, false);
            return;
        }
        super.onBackPressed();
        A4f();
    }

    public void onDestroy() {
        super.onDestroy();
        C24671Lf r1 = this.A07;
        if (r1 != null) {
            r1.unregisterObserver(this.A0O);
            Runnable runnable = this.A0L;
            if (runnable != null) {
                this.A0N.removeCallbacks(runnable);
            }
            BaseNewslettersJob baseNewslettersJob = A4b().A00;
            if (baseNewslettersJob != null) {
                baseNewslettersJob.cancel();
            }
            getSupportFragmentManager().A0u("wamo_waist_hide_after_exit_result_key");
            return;
        }
        C18070vi.A11("contactObservers");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 10001) {
            onSearchRequested();
        } else if (A0B2 == 10002) {
            A4i();
        } else if (A0B2 == 16908332) {
            A4f();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onSearchRequested() {
        String str;
        String str2 = null;
        if (C108985cd.A1b(A4d())) {
            str = C111285jR.A00(this);
        } else {
            str = null;
        }
        AnonymousClass74D r2 = (AnonymousClass74D) C18070vi.A0E(A4e());
        C179619Ir r0 = this.A09;
        if (r0 != null) {
            str2 = r0.name();
        }
        r2.A0L((Integer) null, (Integer) null, str, str2, 3, this.A00);
        ((AnonymousClass74D) C18070vi.A0E(A4e())).A0L((Integer) null, (Integer) null, (String) null, (String) null, 13, -1);
        A0r();
        return false;
    }
}
