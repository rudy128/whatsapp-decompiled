package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1To  reason: invalid class name and case insensitive filesystem */
public class C26811To implements C26181Rd, C26701Td, C26791Tm, C26801Tn, C26361Rv {
    public AnonymousClass37K A00;
    public C51782Zp A01 = null;
    public Runnable A02;
    public boolean A03;
    public C63922tu A04;
    public final C19880zA A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass18O A08;
    public final C26671Ta A09;
    public final C26711Te A0A;
    public final C26731Tg A0B;
    public final AnonymousClass1TQ A0C;
    public final AnonymousClass1TP A0D;
    public final C26761Tj A0E;
    public final C26841Tr A0F = new C26841Tr(this);
    public final C26371Rw A0G;
    public final AnonymousClass1TZ A0H;
    public final C25851Pw A0I;
    public final AnonymousClass1S4 A0J;
    public final AnonymousClass1S3 A0K;
    public final AnonymousClass1S0 A0L;
    public final AnonymousClass1S2 A0M;
    public final AnonymousClass11Q A0N;
    public final AnonymousClass1CJ A0O;
    public final C25551Oq A0P;
    public final AnonymousClass1RK A0Q;
    public final AnonymousClass1TS A0R;
    public final C26331Rs A0S;
    public final AnonymousClass1S1 A0T;
    public final AnonymousClass1SB A0U;
    public final C200710s A0V;
    public final AnonymousClass10I A0W;
    public final C26301Rp A0X;
    public final C26311Rq A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b = C221618v.A00(AnonymousClass16O.class);
    public final C26681Tb A0c;
    public final C26741Th A0d;
    public final AnonymousClass1TR A0e;
    public final AnonymousClass1M9 A0f;
    public final C26781Tl A0g;
    public final C25161Nd A0h;
    public final AnonymousClass11P A0i;
    public final AnonymousClass1TT A0j;
    public final C18030ve A0k;
    public final C24811Lt A0l;
    public final AnonymousClass00H A0m;
    public final AnonymousClass00H A0n;
    public final AnonymousClass00H A0o;

    public static void A02(C26811To r1, boolean z) {
        synchronized (r1) {
            r1.A03 = false;
            if (z) {
                r1.A0J();
            }
        }
    }

    public void A0H() {
        AnonymousClass00H r4;
        Cursor A0A2;
        C60192nY A002;
        synchronized (this) {
            if (A0T()) {
                if (!this.A07.A0N()) {
                    Class<UserJid> cls = UserJid.class;
                    C26301Rp r42 = this.A0X;
                    ArrayList A0A3 = C22971Dz.A0A(cls, r42.A0M("SYNC_MANAGER_CONTACTS_JID_ADDED"));
                    ArrayList A0A4 = C22971Dz.A0A(cls, r42.A0M("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
                    C46032Cp r6 = (C46032Cp) ((C58862lN) this.A0a.get()).A00("contact");
                    A0A3.size();
                    A0A4.size();
                    if (r6 != null) {
                        C17960vV.A0H(!r6.A03.A0N(), "Companion cannot create contact mutations");
                        ArrayList arrayList = new ArrayList(A0A3);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = A0A4.iterator();
                        while (it.hasNext()) {
                            AnonymousClass1BI r7 = (AnonymousClass1BI) it.next();
                            if (!arrayList.contains(r7)) {
                                AnonymousClass1E7 A0I2 = r6.A04.A0I(r7, false);
                                if (A0I2 == null || !A0I2.A0H() || !A0I2.A10) {
                                    arrayList2.add(r7);
                                } else {
                                    arrayList.add(r7);
                                }
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(r6.A0K(C62382rJ.A03, arrayList));
                        arrayList3.addAll(r6.A0K(C62382rJ.A02, arrayList2));
                        A0D(arrayList3);
                    }
                    C26301Rp.A04(r42, "SYNC_MANAGER_CONTACTS_JID_ADDED", (String) null);
                    C26301Rp.A04(r42, "SYNC_MANAGER_CONTACTS_JID_REMOVED", (String) null);
                }
                AnonymousClass1S3 r2 = this.A0K;
                synchronized (r2) {
                    r4 = r2.A03;
                    Iterator it2 = ((C58862lN) r4.get()).A01().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                C26331Rs r72 = this.A0S;
                ArrayList arrayList4 = new ArrayList();
                C28781at A052 = r72.A00.get();
                try {
                    A0A2 = ((C28801av) A052).A02.A0A("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 0  ORDER BY _id ASC ", "PendingMutationsTable.SELECT_NOT_READY_TO_SYNC_MUTATIONS", (String[]) null);
                    while (A0A2.moveToNext()) {
                        arrayList4.add(C26331Rs.A00(A0A2, r72));
                    }
                    A0A2.close();
                    A052.close();
                    StringBuilder sb = new StringBuilder();
                    sb.append("sync-manager/handleNotReadyToSyncPendingMutations count: ");
                    sb.append(arrayList4.size());
                    Log.i(sb.toString());
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        C20126A8l a8l = (C20126A8l) it3.next();
                        C58862lN r1 = (C58862lN) r4.get();
                        if (!(a8l == null || (A002 = r1.A00(a8l.A0B())) == null)) {
                            A002.A0H(a8l);
                        }
                    }
                    A0I();
                } catch (Throwable th) {
                    try {
                        A052.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
        }
        return;
        throw th;
    }

    public void A0I() {
        synchronized (this) {
            Runnable runnable = this.A02;
            if (runnable != null) {
                this.A0W.CEz(runnable);
                this.A02 = null;
                Log.i("sync-manager/forceSync removed scheduled sync");
            }
            A0J();
        }
    }

    public void A0K(int i) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/deleteAllSyncdData: isSyncing = ");
            sb.append(this.A03);
            Log.i(sb.toString());
            this.A01 = new C45942Cg(this, i);
            if (!this.A03) {
                A0S();
            }
        }
    }

    public void A0M(Integer num) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/handleFatalFailure: errorCode = ");
            sb.append(num);
            sb.append("; isSyncing = ");
            sb.append(this.A03);
            Log.i(sb.toString());
            this.A01 = new C45952Ch(this, num);
            if (!this.A03) {
                A0S();
            }
        }
    }

    public boolean A0S() {
        synchronized (this) {
            C51782Zp r2 = this.A01;
            if (r2 == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/handleSyncdStateIfRequired: syncdState = ");
            sb.append(r2);
            Log.i(sb.toString());
            C51782Zp r1 = this.A01;
            if (r1 instanceof C45952Ch) {
                C45952Ch r12 = (C45952Ch) r1;
                A01(r12.A01).A06(r12.A00, (String) null);
            } else {
                ((C45942Cg) r1).A00.A0A.A03(false);
            }
            this.A01 = null;
            return true;
        }
    }

    public boolean A0V(int i) {
        boolean A2S = ((AnonymousClass1HV) this.A0n.get()).A01.A2S();
        if (i != 0) {
            return A2S || this.A07.A0N();
        }
        if (!A2S || this.A07.A0N()) {
            return false;
        }
    }

    public /* synthetic */ void BqZ(C59312m6 r1, boolean z) {
    }

    public /* synthetic */ void BrL(C59312m6 r1) {
    }

    public /* synthetic */ void BrP(C199410f r1, String str, int i) {
    }

    public /* synthetic */ void BrS(C59312m6 r1) {
    }

    public /* synthetic */ void BrU() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public void C35() {
    }

    public void C8F(Pair pair) {
    }

    private Pair A00(Collection collection, Collection collection2) {
        Class<UserJid> cls = UserJid.class;
        C26301Rp r2 = this.A0X;
        ArrayList A0A2 = C22971Dz.A0A(cls, r2.A0M("SYNC_MANAGER_CONTACTS_JID_ADDED"));
        ArrayList A0A3 = C22971Dz.A0A(cls, r2.A0M("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
        collection.addAll(A0A2);
        collection2.addAll(A0A3);
        HashSet hashSet = new HashSet();
        C22971Dz.A0H(collection, hashSet);
        HashSet hashSet2 = new HashSet();
        C22971Dz.A0H(collection2, hashSet2);
        return new Pair(hashSet, hashSet2);
    }

    public static synchronized C63922tu A01(C26811To r40) {
        C63922tu r13;
        C26811To r7 = r40;
        synchronized (r7) {
            r13 = r7.A04;
            if (r13 == null) {
                AnonymousClass11P r20 = r7.A0i;
                C18030ve r19 = r7.A0k;
                AnonymousClass190 r18 = r7.A06;
                AnonymousClass11S r17 = r7.A07;
                C25551Oq r16 = r7.A0P;
                AnonymousClass1S0 r15 = r7.A0L;
                AnonymousClass1S3 r12 = r7.A0K;
                C26371Rw r11 = r7.A0G;
                C26331Rs r10 = r7.A0S;
                AnonymousClass1TR r9 = r7.A0e;
                AnonymousClass1TS r8 = r7.A0R;
                AnonymousClass1RK r5 = r7.A0Q;
                AnonymousClass1TT r4 = r7.A0j;
                C25851Pw r3 = r7.A0I;
                C26681Tb r2 = r7.A0c;
                C26741Th r1 = r7.A0d;
                AnonymousClass11Q r0 = r7.A0N;
                AnonymousClass1NV r33 = new AnonymousClass1NV(new Random(), 20, 3600000, 1000);
                C18030ve r32 = r19;
                C25551Oq r28 = r16;
                C51772Zo r192 = new C51772Zo(r7);
                C26371Rw r202 = r11;
                C25851Pw r21 = r3;
                AnonymousClass1S3 r22 = r12;
                AnonymousClass1TR r23 = r9;
                AnonymousClass190 r14 = r18;
                AnonymousClass11S r152 = r17;
                A5M a5m = (A5M) r7.A0m.get();
                C26681Tb r172 = r2;
                C26741Th r182 = r1;
                r13 = new C63922tu(r14, r152, a5m, r172, r182, r192, r202, r21, r22, r23, r15, r0, r20, r4, r28, r5, r8, r10, r32, r33);
                r7.A04 = r13;
            }
        }
        return r13;
    }

    public Set A03(AnonymousClass1BI r11, long j, boolean z) {
        C169678mi r0 = (C169678mi) ((C58862lN) this.A0a.get()).A00("mute");
        if (r0 == null) {
            return Collections.emptySet();
        }
        return A0D(Collections.singletonList(new C170458pt((C19999A2n) null, r11, (String) null, j, AnonymousClass11P.A01(r0.A00), z, false)));
    }

    public Set A04(AnonymousClass1BI r11, AnonymousClass201 r12) {
        C169688mj r2 = (C169688mj) ((C58862lN) this.A0a.get()).A00("notificationActivitySetting");
        if (r2 != null) {
            AnonymousClass11S r0 = this.A07;
            r0.A0I();
            if (r0.A0E != null && A0T()) {
                ArrayList arrayList = new ArrayList();
                AnonymousClass1BI r4 = r11;
                arrayList.add(new C170438pr((C19999A2n) null, r4, C181309Py.A00(r12), (String) null, AnonymousClass11P.A01(r2.A00), false));
                return A0D(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A05(AnonymousClass1BI r7, boolean z) {
        AnonymousClass00H r5 = this.A0a;
        AnonymousClass8n2 r4 = (AnonymousClass8n2) ((C58862lN) r5.get()).A00("archive");
        if (r4 != null) {
            AnonymousClass11S r0 = this.A07;
            r0.A0I();
            if (r0.A0E != null && A0T()) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    AnonymousClass8n1 r02 = (AnonymousClass8n1) ((C58862lN) r5.get()).A00("pin_v1");
                    if (r02 != null) {
                        arrayList.add(r02.A0K(r7, false));
                    }
                    AnonymousClass8n3 r03 = (AnonymousClass8n3) ((C58862lN) r5.get()).A00("lock");
                    if (r03 != null) {
                        arrayList.add(r03.A0K(r7, false));
                    }
                }
                arrayList.add(r4.A0K(r7, z));
                return A0D(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A06(AnonymousClass1BI r7, boolean z) {
        AnonymousClass00H r5 = this.A0a;
        AnonymousClass8n1 r4 = (AnonymousClass8n1) ((C58862lN) r5.get()).A00("pin_v1");
        if (r4 != null) {
            AnonymousClass11S r0 = this.A07;
            r0.A0I();
            if (r0.A0E != null && A0T()) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    AnonymousClass8n2 r02 = (AnonymousClass8n2) ((C58862lN) r5.get()).A00("archive");
                    if (r02 != null) {
                        arrayList.add(r02.A0K(r7, false));
                    }
                    AnonymousClass8n3 r03 = (AnonymousClass8n3) ((C58862lN) r5.get()).A00("lock");
                    if (r03 != null) {
                        arrayList.add(r03.A0K(r7, false));
                    }
                }
                arrayList.add(r4.A0K(r7, z));
                return A0D(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A07(AnonymousClass1BI r11, boolean z) {
        C169818mw r3 = (C169818mw) ((C58862lN) this.A0a.get()).A00("deleteChat");
        if (r3 == null || !A0T()) {
            return Collections.emptySet();
        }
        AnonymousClass1S3 r2 = this.A0K;
        AnonymousClass1BI r4 = r11;
        Set A062 = A06(r11, false);
        C18070vi.A0d(A062, 0);
        synchronized (r2) {
            r2.A01.A0K(A062);
        }
        C18070vi.A0d(r11, 0);
        r3.A01.A08(3);
        return A0D(Collections.singletonList(new C170508py((C19999A2n) null, r3.A00.A01(r11), r4, (String) null, AnonymousClass11P.A01(r3.A03), z, true)));
    }

    public Set A08(AnonymousClass1BI r7, boolean z) {
        AnonymousClass00H r5 = this.A0a;
        AnonymousClass8n3 r4 = (AnonymousClass8n3) ((C58862lN) r5.get()).A00("lock");
        if (r4 != null) {
            AnonymousClass11S r0 = this.A07;
            r0.A0I();
            if (r0.A0E != null && A0T()) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    AnonymousClass8n1 r02 = (AnonymousClass8n1) ((C58862lN) r5.get()).A00("pin_v1");
                    if (r02 != null) {
                        arrayList.add(r02.A0K(r7, false));
                    }
                    AnonymousClass8n2 r03 = (AnonymousClass8n2) ((C58862lN) r5.get()).A00("archive");
                    if (r03 != null) {
                        arrayList.add(r03.A0K(r7, false));
                    }
                }
                arrayList.add(r4.A0K(r7, z));
                return A0D(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A09(AnonymousClass1BI r10, boolean z) {
        AnonymousClass8n0 r1 = (AnonymousClass8n0) ((C58862lN) this.A0a.get()).A00("markChatAsRead");
        if (r1 == null) {
            return Collections.emptySet();
        }
        C18070vi.A0d(r10, 0);
        long A012 = AnonymousClass11P.A01(r1.A02);
        return A0D(Collections.singletonList(new AnonymousClass8q0((C19999A2n) null, r1.A00.A02(r10, false), r10, (String) null, A012, z, false)));
    }

    public Set A0A(AnonymousClass1BI r11, boolean z, boolean z2) {
        C169828mx r2 = (C169828mx) ((C58862lN) this.A0a.get()).A00("clearChat");
        if (r2 != null) {
            AnonymousClass11S r0 = this.A07;
            r0.A0I();
            if (r0.A0E != null) {
                AnonymousClass1BI r3 = r11;
                C18070vi.A0d(r11, 0);
                C26371Rw r1 = r2.A01;
                int i = 5;
                boolean z3 = z;
                if (z) {
                    i = 4;
                }
                r1.A08(i);
                return A0D(Collections.singletonList(new C170518pz((C19999A2n) null, r2.A00.A01(r11), r3, (String) null, AnonymousClass11P.A01(r2.A03), z3, z2, true)));
            }
        }
        return Collections.emptySet();
    }

    public Set A0B(C1418377d r20, long j, boolean z) {
        List singletonList;
        C116385xB r3 = (C116385xB) ((C58862lN) this.A0a.get()).A00("favoriteSticker");
        if (r3 != null) {
            C1418377d r2 = r20;
            if (!r2.A0N) {
                if (TextUtils.isEmpty(r2.A0F)) {
                    Log.e("FavoriteStickerHandler/empty sticker fileHash");
                    singletonList = Collections.emptyList();
                } else {
                    int A062 = r3.A00.A06();
                    String str = r2.A0F;
                    C17960vV.A07(str);
                    singletonList = Collections.singletonList(new C116955yu(new C136536ty(str, r2.A0I, r2.A0A, r2.A0D, r2.A0E, r2.A08, r2.A03, r2.A02, (long) r2.A00, r2.A02()), (C19999A2n) null, (String) null, A062, j, false, z));
                }
                return A0D(singletonList);
            }
        }
        return Collections.emptySet();
    }

    public Set A0C(String str, long j) {
        AnonymousClass8my r0 = (AnonymousClass8my) ((C58862lN) this.A0a.get()).A00("removeRecentSticker");
        if (r0 == null) {
            return Collections.emptySet();
        }
        return A0D(Collections.singletonList(new C170528qA((C19999A2n) null, (String) null, str, AnonymousClass11P.A01(r0.A00), j, false)));
    }

    public Set A0E(Collection collection, boolean z) {
        AnonymousClass1BI A0H2;
        C169698mk r1 = (C169698mk) ((C58862lN) this.A0a.get()).A00("star");
        if (r1 != null) {
            AnonymousClass11S r0 = this.A07;
            r0.A0I();
            if (r0.A0E != null) {
                long A012 = AnonymousClass11P.A01(r1.A00);
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 r2 = (AnonymousClass206) it.next();
                    AnonymousClass1BI r12 = r2.A0v.A00;
                    if (C22971Dz.A0e(r12) || C22971Dz.A0N(r12)) {
                        A0H2 = r2.A0H();
                    } else {
                        A0H2 = null;
                    }
                    AnonymousClass205 A0A2 = AnonymousClass25A.A0A(r2);
                    C18070vi.A0X(A0A2);
                    arrayList.add(new C170488pw((C19999A2n) null, A0H2, A0A2, (String) null, A012, z, false));
                }
                return A0D(arrayList);
            }
        }
        return Collections.emptySet();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0F(java.util.Collection r19, boolean r20) {
        /*
            r18 = this;
            r4 = r18
            X.00H r0 = r4.A0a
            java.lang.Object r1 = r0.get()
            X.2lN r1 = (X.C58862lN) r1
            java.lang.String r0 = "deleteMessageForMe"
            X.2nY r1 = r1.A00(r0)
            X.8mt r1 = (X.C169788mt) r1
            if (r1 != 0) goto L_0x0019
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
        L_0x0019:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x0082
            X.11P r0 = r1.A01
            long r12 = X.AnonymousClass11P.A01(r0)
            int r0 = r19.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r6 = r19.iterator()
        L_0x0032:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r5 = r6.next()
            X.206 r5 = (X.AnonymousClass206) r5
            X.205 r2 = r5.A0v
            X.1BI r1 = r2.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 != 0) goto L_0x007d
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 != 0) goto L_0x007d
            r9 = 0
        L_0x004f:
            boolean r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L_0x007a
            int r0 = r5.A0D()
            if (r0 != 0) goto L_0x0073
            r14 = 0
        L_0x005d:
            X.205 r10 = X.AnonymousClass25A.A0A(r5)
            X.C18070vi.A0X(r10)
            r8 = 0
            r17 = 0
            X.8pv r7 = new X.8pv
            r16 = r20
            r11 = r8
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r17)
            r3.add(r7)
            goto L_0x0032
        L_0x0073:
            long r14 = r5.A0H
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            goto L_0x005d
        L_0x007a:
            long r14 = r5.A0I
            goto L_0x005d
        L_0x007d:
            X.1BI r9 = r5.A0H()
            goto L_0x004f
        L_0x0082:
            X.0wS r3 = X.C18460wS.A00
        L_0x0084:
            java.util.Set r0 = r4.A0D(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26811To.A0F(java.util.Collection, boolean):java.util.Set");
    }

    public void A0L(C193759qc r7, Integer num) {
        C60192nY r2;
        Object obj;
        String str;
        C58862lN r5 = (C58862lN) this.A0a.get();
        synchronized (r5) {
            Iterator it = ((Map) r5.A00.getValue()).values().iterator();
            while (true) {
                r2 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C60192nY r1 = (C60192nY) obj;
                if (r1 instanceof C169808mv) {
                    if (((C169808mv) r1).A0K() == num) {
                        break;
                    }
                } else if (C18070vi.A18(r1.A0E(), AnonymousClass9QQ.A00(num))) {
                    break;
                }
            }
            if (obj instanceof C60192nY) {
                r2 = (C60192nY) obj;
            }
        }
        C169808mv r22 = (C169808mv) r2;
        StringBuilder sb = new StringBuilder();
        sb.append("There was no handler for ");
        switch (num.intValue()) {
            case 0:
                str = "Nux";
                break;
            case 1:
                str = "EXTERNAL_WEB_BETA";
                break;
            case 2:
                str = "UGC_BOT";
                break;
            case 3:
                str = "PRIVACY_SETTING_RELAY_ALL_CALLS";
                break;
            case 4:
                str = "PRIVACY_SETTING_DISABLE_LINK_PREVIEWS";
                break;
            default:
                str = "BOT_WELCOME_REQUEST";
                break;
        }
        sb.append(str);
        C17960vV.A08(r22, sb.toString());
        C170558qD A002 = ((AnonymousClass9j5) this.A0o.get()).A00(r22, r7);
        if (!r22.A0J() || !A0T()) {
            r22.A0N(A002);
            return;
        }
        Set A0D2 = A0D(Collections.singletonList(A002));
        r22.A0N(A002);
        A0R(A0D2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0407, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x040b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x021e A[Catch:{ all -> 0x037a, all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0229 A[Catch:{ all -> 0x037a, all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0230 A[Catch:{ all -> 0x037a, all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x032e A[Catch:{ all -> 0x037a, all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0351 A[Catch:{ all -> 0x037a, all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0174 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(java.util.Collection r31, java.util.Collection r32, boolean r33) {
        /*
            r30 = this;
            r4 = r30
            X.11S r0 = r4.A07
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x044c
            monitor-enter(r4)
            r3 = 0
            boolean r0 = r4.A0V(r3)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0447
            X.00H r0 = r4.A0a     // Catch:{ all -> 0x0449 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0449 }
            X.2lN r1 = (X.C58862lN) r1     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "contact"
            X.2nY r0 = r1.A00(r0)     // Catch:{ all -> 0x0449 }
            X.2Cp r0 = (X.C46032Cp) r0     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x002b
            boolean r0 = r4.A0T()     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x002b
            r3 = 1
        L_0x002b:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0449 }
            r5.<init>()     // Catch:{ all -> 0x0449 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0449 }
            r2.<init>()     // Catch:{ all -> 0x0449 }
            r29 = r31
            if (r3 == 0) goto L_0x00e0
            X.1Rp r9 = r4.A0X     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION"
            java.util.HashSet r7 = r9.A0M(r8)     // Catch:{ all -> 0x0449 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0449 }
            r10.<init>()     // Catch:{ all -> 0x0449 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0449 }
            r5.<init>()     // Catch:{ all -> 0x0449 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0449 }
            r6.<init>()     // Catch:{ all -> 0x0449 }
            java.util.Iterator r12 = r29.iterator()     // Catch:{ all -> 0x0449 }
        L_0x0054:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0449 }
            X.1E7 r11 = (X.AnonymousClass1E7) r11     // Catch:{ all -> 0x0449 }
            X.2lf r0 = r11.A0H     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x0449 }
            java.lang.String r1 = "+"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.replace(r1, r0)     // Catch:{ all -> 0x0449 }
            if (r1 == 0) goto L_0x007a
            boolean r0 = r7.contains(r1)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x007a
            r6.add(r1)     // Catch:{ all -> 0x0449 }
            goto L_0x0054
        L_0x007a:
            boolean r0 = r11.A10     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0054
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r11.A06(r0)     // Catch:{ all -> 0x0449 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0054
            r10.add(r0)     // Catch:{ all -> 0x0449 }
            goto L_0x0054
        L_0x008c:
            java.util.Iterator r12 = r32.iterator()     // Catch:{ all -> 0x0449 }
        L_0x0090:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0449 }
            X.1E7 r11 = (X.AnonymousClass1E7) r11     // Catch:{ all -> 0x0449 }
            X.2lf r0 = r11.A0H     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x0449 }
            java.lang.String r1 = "+"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.replace(r1, r0)     // Catch:{ all -> 0x0449 }
            if (r1 == 0) goto L_0x00b6
            boolean r0 = r7.contains(r1)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x00b6
            r6.add(r1)     // Catch:{ all -> 0x0449 }
            goto L_0x0090
        L_0x00b6:
            boolean r0 = r11.A10     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0090
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r11.A06(r0)     // Catch:{ all -> 0x0449 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0090
            r5.add(r0)     // Catch:{ all -> 0x0449 }
            goto L_0x0090
        L_0x00c8:
            android.util.Pair r0 = r4.A00(r10, r5)     // Catch:{ all -> 0x0449 }
            java.lang.Object r5 = r0.first     // Catch:{ all -> 0x0449 }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x0449 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x0449 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0449 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0449 }
            if (r0 != 0) goto L_0x00e0
            r7.removeAll(r6)     // Catch:{ all -> 0x0449 }
            r9.A0N(r8, r7)     // Catch:{ all -> 0x0449 }
        L_0x00e0:
            X.1Lt r0 = r4.A0l     // Catch:{ all -> 0x0449 }
            X.1au r27 = r0.A06()     // Catch:{ all -> 0x0449 }
            X.1xA r26 = r27.BD0()     // Catch:{ all -> 0x043a }
            if (r3 == 0) goto L_0x00f8
            X.1Rp r1 = r4.A0X     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            r1.A0N(r0, r5)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            r1.A0N(r0, r2)     // Catch:{ all -> 0x0430 }
        L_0x00f8:
            X.1M9 r2 = r4.A0f     // Catch:{ all -> 0x0430 }
            X.1Nd r7 = r4.A0h     // Catch:{ all -> 0x0430 }
            java.util.HashMap r25 = new java.util.HashMap     // Catch:{ all -> 0x0430 }
            r25.<init>()     // Catch:{ all -> 0x0430 }
            java.util.Iterator r6 = r32.iterator()     // Catch:{ all -> 0x0430 }
        L_0x0105:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x012a
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0430 }
            X.1E7 r5 = (X.AnonymousClass1E7) r5     // Catch:{ all -> 0x0430 }
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r5.A06(r0)     // Catch:{ all -> 0x0430 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x0430 }
            boolean r0 = r7.A0G(r0)     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x0127
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0430 }
        L_0x0121:
            r0 = r25
            r0.put(r5, r1)     // Catch:{ all -> 0x0430 }
            goto L_0x0105
        L_0x0127:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0430 }
            goto L_0x0121
        L_0x012a:
            r28 = r33
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r28)     // Catch:{ all -> 0x0430 }
            java.util.Set r5 = r25.keySet()     // Catch:{ all -> 0x0430 }
            java.lang.String r1 = "dbinfo/manager/deleteContacts"
            java.lang.String r0 = "del"
            X.AnonymousClass1M9.A04(r1, r0, r5)     // Catch:{ all -> 0x0430 }
            java.util.Set r0 = r25.keySet()     // Catch:{ all -> 0x0430 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0430 }
            r6.<init>()     // Catch:{ all -> 0x0430 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0430 }
        L_0x0148:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x0166
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0430 }
            X.1E7 r1 = (X.AnonymousClass1E7) r1     // Catch:{ all -> 0x0430 }
            if (r1 == 0) goto L_0x0148
            X.1BI r0 = r1.A0J     // Catch:{ all -> 0x0430 }
            boolean r0 = r0 instanceof X.C173458v6     // Catch:{ all -> 0x0430 }
            if (r0 != 0) goto L_0x0148
            boolean r0 = r1.A0F()     // Catch:{ all -> 0x0430 }
            if (r0 != 0) goto L_0x0148
            r6.add(r1)     // Catch:{ all -> 0x0430 }
            goto L_0x0148
        L_0x0166:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0430 }
            r5.<init>()     // Catch:{ all -> 0x0430 }
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ all -> 0x0430 }
            r23.<init>()     // Catch:{ all -> 0x0430 }
            java.util.Iterator r22 = r6.iterator()     // Catch:{ all -> 0x0430 }
        L_0x0174:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x037f
            java.lang.Object r7 = r22.next()     // Catch:{ all -> 0x0430 }
            X.1E7 r7 = (X.AnonymousClass1E7) r7     // Catch:{ all -> 0x0430 }
            boolean r0 = r7.A10     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x0364
            X.1M2 r6 = r2.A04     // Catch:{ all -> 0x0430 }
            r0 = 1
            X.1Ez r9 = new X.1Ez     // Catch:{ all -> 0x0430 }
            r9.<init>((boolean) r0)     // Catch:{ all -> 0x0430 }
            r9.A04()     // Catch:{ all -> 0x0430 }
            X.1BI r10 = r7.A0J     // Catch:{ all -> 0x0430 }
            r14 = 0
            if (r10 == 0) goto L_0x01de
            X.1Lt r0 = r6.A00     // Catch:{ all -> 0x0430 }
            X.1at r12 = r0.get()     // Catch:{ all -> 0x0430 }
            java.lang.String r11 = "SELECT count(*) AS _count FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE wa_contacts.jid = ?"
            java.lang.String r8 = "COUNT_DUPLICATES"
            r13 = r10
            boolean r0 = X.C22971Dz.A0d(r10)     // Catch:{ all -> 0x0375 }
            r1 = 1
            if (r0 == 0) goto L_0x01ae
            X.1Lx r0 = r6.A04     // Catch:{ all -> 0x0375 }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ all -> 0x0375 }
            com.whatsapp.jid.UserJid r13 = r0.A00(r13)     // Catch:{ all -> 0x0375 }
        L_0x01ae:
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0375 }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x0375 }
            r1[r14] = r0     // Catch:{ all -> 0x0375 }
            android.database.Cursor r13 = X.C24861Ly.A03(r12, r11, r8, r1)     // Catch:{ all -> 0x0375 }
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0369 }
            if (r0 == 0) goto L_0x01da
            java.lang.String r0 = "_count"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0369 }
            long r10 = r13.getLong(r0)     // Catch:{ all -> 0x0369 }
            r8 = 1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d1
            r14 = 1
        L_0x01d1:
            r13.close()     // Catch:{ all -> 0x0375 }
            r12.close()     // Catch:{ all -> 0x0430 }
            if (r14 != 0) goto L_0x0364
            goto L_0x0204
        L_0x01da:
            r13.close()     // Catch:{ all -> 0x0375 }
            goto L_0x01e1
        L_0x01de:
            java.lang.String r0 = "ContactManagerDatabase/hasDuplicate - contact jid is null."
            goto L_0x0201
        L_0x01e1:
            r12.close()     // Catch:{ all -> 0x0430 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0430 }
            r8.<init>()     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "ContactManagerDatabase/hasDuplicate failed during duplicate contact detection for jid ("
            r8.append(r0)     // Catch:{ all -> 0x0430 }
            r8.append(r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = ") | time: "
            r8.append(r0)     // Catch:{ all -> 0x0430 }
            long r0 = r9.A01()     // Catch:{ all -> 0x0430 }
            r8.append(r0)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0430 }
        L_0x0201:
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0430 }
        L_0x0204:
            r0 = r25
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0430 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0430 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0430 }
            if (r0 != 0) goto L_0x0230
            long r0 = r7.A0D     // Catch:{ all -> 0x0430 }
            X.11P r8 = r2.A09     // Catch:{ all -> 0x0430 }
            long r9 = X.AnonymousClass11P.A01(r8)     // Catch:{ all -> 0x0430 }
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0230
            r5.add(r7)     // Catch:{ all -> 0x0430 }
        L_0x0221:
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r7.A06(r0)     // Catch:{ all -> 0x0430 }
            if (r1 == 0) goto L_0x0174
            r0 = r23
            r0.add(r1)     // Catch:{ all -> 0x0430 }
            goto L_0x0174
        L_0x0230:
            X.2lf r0 = r7.A0H     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x0221
            r1 = 1
            X.1Ez r21 = new X.1Ez     // Catch:{ all -> 0x0430 }
            r0 = r21
            r0.<init>((boolean) r1)     // Catch:{ all -> 0x0430 }
            r21.A04()     // Catch:{ all -> 0x0430 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0430 }
            r13.<init>()     // Catch:{ all -> 0x0430 }
            long r0 = r7.A0D     // Catch:{ all -> 0x0430 }
            X.11P r8 = r6.A05     // Catch:{ all -> 0x0430 }
            long r10 = X.AnonymousClass11P.A01(r8)     // Catch:{ all -> 0x0430 }
            r12 = 1
            r8 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r20 = 0
            if (r9 <= 0) goto L_0x0256
            r20 = 1
        L_0x0256:
            r0 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "raw_contact_id"
            r13.put(r0, r1)     // Catch:{ all -> 0x0430 }
            r10 = 0
            if (r20 != 0) goto L_0x0269
            java.lang.String r0 = "display_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
        L_0x0269:
            java.lang.String r0 = "given_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "family_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "sort_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r1 = "phone_type"
            r0 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0430 }
            r13.put(r1, r9)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "phone_label"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "nickname"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "company"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "title"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "is_starred"
            r13.put(r0, r10)     // Catch:{ all -> 0x0430 }
            X.1BI r14 = r7.A0J     // Catch:{ all -> 0x0430 }
            X.1Lt r0 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0313 }
            X.1au r11 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x0313 }
            X.1xA r19 = r11.BD0()     // Catch:{ all -> 0x0305 }
            java.lang.String r17 = "wa_contacts"
            java.lang.String r16 = "wa_contacts._id = ?"
            java.lang.String[] r15 = new java.lang.String[r12]     // Catch:{ all -> 0x02f5 }
            long r0 = r7.A0J()     // Catch:{ all -> 0x02f5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02f5 }
            r15[r8] = r0     // Catch:{ all -> 0x02f5 }
            r1 = r17
            r0 = r16
            long r17 = X.C24861Ly.A01(r13, r11, r1, r0, r15)     // Catch:{ all -> 0x02f7 }
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r16 = 0
            if (r0 != 0) goto L_0x02cd
            r16 = 1
        L_0x02cd:
            boolean r0 = r14 instanceof X.AnonymousClass1EC     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x02d9
            r1 = r14
            X.1EC r1 = (X.AnonymousClass1EC) r1     // Catch:{ all -> 0x02f3 }
            r0 = r19
            X.AnonymousClass1M2.A0E(r0, r11, r1, r10)     // Catch:{ all -> 0x02f3 }
        L_0x02d9:
            java.lang.String r15 = "wa_group_admin_settings"
            java.lang.String r13 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = X.C22971Dz.A06(r14)     // Catch:{ all -> 0x02f3 }
            r1[r8] = r0     // Catch:{ all -> 0x02f3 }
            X.C24861Ly.A02(r11, r15, r13, r1)     // Catch:{ all -> 0x02f3 }
            r19.A00()     // Catch:{ all -> 0x02f3 }
            r19.close()     // Catch:{ all -> 0x0303 }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x0311 }
            goto L_0x032a
        L_0x02f3:
            r1 = move-exception
            goto L_0x02fa
        L_0x02f5:
            r1 = move-exception
            goto L_0x02f8
        L_0x02f7:
            r1 = move-exception
        L_0x02f8:
            r16 = 0
        L_0x02fa:
            r19.close()     // Catch:{ all -> 0x02fe }
            goto L_0x0302
        L_0x02fe:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0303 }
        L_0x0302:
            throw r1     // Catch:{ all -> 0x0303 }
        L_0x0303:
            r1 = move-exception
            goto L_0x0308
        L_0x0305:
            r1 = move-exception
            r16 = 0
        L_0x0308:
            r11.close()     // Catch:{ all -> 0x030c }
            goto L_0x0310
        L_0x030c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0311 }
        L_0x0310:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0311 }
        L_0x0311:
            r11 = move-exception
            goto L_0x0316
        L_0x0313:
            r11 = move-exception
            r16 = 0
        L_0x0316:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0430 }
            r1.<init>()     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "ContactManagerDatabase/unable to nullify contact android info "
            r1.append(r0)     // Catch:{ all -> 0x0430 }
            r1.append(r7)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0430 }
            X.C17960vV.A09(r0, r11)     // Catch:{ all -> 0x0430 }
        L_0x032a:
            r7.A0H = r10     // Catch:{ all -> 0x0430 }
            if (r20 == 0) goto L_0x0334
            java.lang.String r0 = r7.A0K()     // Catch:{ all -> 0x0430 }
            r7.A0P = r0     // Catch:{ all -> 0x0430 }
        L_0x0334:
            r7.A0R = r10     // Catch:{ all -> 0x0430 }
            r7.A0N = r9     // Catch:{ all -> 0x0430 }
            r7.A0X = r10     // Catch:{ all -> 0x0430 }
            r7.A0T = r10     // Catch:{ all -> 0x0430 }
            r7.A0S = r10     // Catch:{ all -> 0x0430 }
            r7.A0Y = r10     // Catch:{ all -> 0x0430 }
            r7.A0W = r10     // Catch:{ all -> 0x0430 }
            r7.A0Q = r10     // Catch:{ all -> 0x0430 }
            r7.A0b = r10     // Catch:{ all -> 0x0430 }
            X.1yX r0 = X.C42661yX.A05     // Catch:{ all -> 0x0430 }
            r7.A0M = r0     // Catch:{ all -> 0x0430 }
            r7.A0s = r8     // Catch:{ all -> 0x0430 }
            r21.A01()     // Catch:{ all -> 0x0430 }
            if (r16 == 0) goto L_0x0221
            X.00H r0 = r6.A09     // Catch:{ all -> 0x0430 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0430 }
            X.2Kb r6 = (X.C47812Kb) r6     // Catch:{ all -> 0x0430 }
            r1 = 7
            X.35V r0 = new X.35V     // Catch:{ all -> 0x0430 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0430 }
            r6.notifyAllObservers(r0)     // Catch:{ all -> 0x0430 }
            goto L_0x0221
        L_0x0364:
            r5.add(r7)     // Catch:{ all -> 0x0430 }
            goto L_0x0174
        L_0x0369:
            r1 = move-exception
            if (r13 == 0) goto L_0x0374
            r13.close()     // Catch:{ all -> 0x0370 }
            goto L_0x0374
        L_0x0370:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0375 }
        L_0x0374:
            throw r1     // Catch:{ all -> 0x0375 }
        L_0x0375:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x037a }
            goto L_0x037e
        L_0x037a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0430 }
        L_0x037e:
            throw r1     // Catch:{ all -> 0x0430 }
        L_0x037f:
            boolean r0 = r23.isEmpty()     // Catch:{ all -> 0x0430 }
            if (r0 != 0) goto L_0x0399
            X.00H r0 = r2.A0L     // Catch:{ all -> 0x0430 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0430 }
            X.2kZ r7 = (X.C58362kZ) r7     // Catch:{ all -> 0x0430 }
            r6 = 15
            X.3Bv r1 = new X.3Bv     // Catch:{ all -> 0x0430 }
            r0 = r23
            r1.<init>(r2, r0, r6)     // Catch:{ all -> 0x0430 }
            r7.A01(r1)     // Catch:{ all -> 0x0430 }
        L_0x0399:
            int r0 = r5.size()     // Catch:{ all -> 0x0430 }
            if (r0 <= 0) goto L_0x03a4
            r0 = r24
            X.AnonymousClass1M9.A00(r2, r0, r5)     // Catch:{ all -> 0x0430 }
        L_0x03a4:
            r1 = r29
            r0 = r28
            r2.A0s(r1, r0)     // Catch:{ all -> 0x0430 }
            X.1Tl r5 = r4.A0g     // Catch:{ all -> 0x0430 }
            java.util.Iterator r12 = r32.iterator()     // Catch:{ all -> 0x0430 }
        L_0x03b1:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x0424
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0430 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x0430 }
            X.1Tk r2 = r5.A00     // Catch:{ all -> 0x0430 }
            X.1BI r0 = r0.A0J     // Catch:{ all -> 0x0430 }
            if (r0 == 0) goto L_0x0422
            java.lang.String r1 = r0.user     // Catch:{ all -> 0x0430 }
        L_0x03c5:
            java.lang.String r11 = ""
            if (r1 == 0) goto L_0x03cf
            java.lang.String r0 = "\\D"
            java.lang.String r11 = r1.replaceAll(r0, r11)     // Catch:{ all -> 0x0430 }
        L_0x03cf:
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x0430 }
            r1 = 0
            java.lang.String r10 = "ContactsCreatedWithinWaStore/deleteContactCreatedWithinWa"
            X.1Lt r0 = r2.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
            X.1au r9 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
            java.lang.String r8 = "\n                _id = ?\n                AND NOT EXISTS \n            (SELECT 1 FROM wa_contacts\n            WHERE jid LIKE ?\n            AND raw_contact_id IS NOT NULL\n            AND raw_contact_id != -1)\n        \n            "
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0405 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0405 }
            java.lang.String r6 = "wa_contacts_created_within_wa"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0405 }
            r2[r1] = r11     // Catch:{ all -> 0x0405 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            r1.<init>()     // Catch:{ all -> 0x0405 }
            r1.append(r11)     // Catch:{ all -> 0x0405 }
            java.lang.String r0 = "@%"
            r1.append(r0)     // Catch:{ all -> 0x0405 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0405 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0405 }
            r7.A04(r6, r8, r10, r2)     // Catch:{ all -> 0x0405 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
            goto L_0x03b1
        L_0x0405:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0407 }
        L_0x0407:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
        L_0x040c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0430 }
            r1.<init>()     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = "ContactsCreatedWithinWaStore/Failed to delete "
            r1.append(r0)     // Catch:{ all -> 0x0430 }
            r1.append(r2)     // Catch:{ all -> 0x0430 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0430 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0430 }
            goto L_0x03b1
        L_0x0422:
            r1 = 0
            goto L_0x03c5
        L_0x0424:
            r26.A00()     // Catch:{ all -> 0x0430 }
            r26.close()     // Catch:{ all -> 0x043a }
            r27.close()     // Catch:{ all -> 0x0449 }
            if (r3 == 0) goto L_0x0447
            goto L_0x0444
        L_0x0430:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x0435 }
            goto L_0x0439
        L_0x0435:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x043a }
        L_0x0439:
            throw r1     // Catch:{ all -> 0x043a }
        L_0x043a:
            r1 = move-exception
            r27.close()     // Catch:{ all -> 0x043f }
            goto L_0x0443
        L_0x043f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0449 }
        L_0x0443:
            throw r1     // Catch:{ all -> 0x0449 }
        L_0x0444:
            r4.A0H()     // Catch:{ all -> 0x0449 }
        L_0x0447:
            monitor-exit(r4)     // Catch:{ all -> 0x0449 }
            return
        L_0x0449:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0449 }
            throw r0
        L_0x044c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26811To.A0O(java.util.Collection, java.util.Collection, boolean):void");
    }

    public void A0P(Collection collection, boolean z, boolean z2) {
        C41851xA BD0;
        AnonymousClass1E7 r0;
        if (!this.A07.A0N()) {
            synchronized (this) {
                boolean z3 = false;
                if (A0V(0)) {
                    if (((C46032Cp) ((C58862lN) this.A0a.get()).A00("contact")) != null && A0T()) {
                        z3 = true;
                    }
                    Set hashSet = new HashSet();
                    Set hashSet2 = new HashSet();
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            AnonymousClass1E7 r2 = (AnonymousClass1E7) it.next();
                            UserJid userJid = (UserJid) r2.A06(UserJid.class);
                            if (userJid != null) {
                                if (r2.A10) {
                                    arrayList.add(userJid);
                                } else {
                                    arrayList2.add(userJid);
                                }
                            }
                        }
                        Pair A002 = A00(arrayList, arrayList2);
                        hashSet = (Set) A002.first;
                        hashSet2 = (Set) A002.second;
                    }
                    C28791au A062 = this.A0l.A06();
                    try {
                        BD0 = A062.BD0();
                        C26301Rp r1 = this.A0X;
                        r1.A0N("SYNC_MANAGER_CONTACTS_JID_ADDED", hashSet);
                        r1.A0N("SYNC_MANAGER_CONTACTS_JID_REMOVED", hashSet2);
                        AnonymousClass1BI r12 = null;
                        if (collection.size() > 0 && (r0 = (AnonymousClass1E7) collection.iterator().next()) != null) {
                            r12 = r0.A0J;
                        }
                        collection.size();
                        if (r12 != null) {
                            r12.toString();
                        }
                        if (z) {
                            this.A0f.A0p(collection);
                        } else {
                            this.A0f.A0t(collection, z2);
                        }
                        BD0.A00();
                        BD0.close();
                        A062.close();
                        if (z3) {
                            A0H();
                        }
                    } catch (Throwable th) {
                        try {
                            A062.close();
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                        }
                        throw th;
                    }
                }
            }
            return;
        }
        return;
        throw th;
    }

    public boolean A0U() {
        if (this.A0A.A03.A08()) {
            return true;
        }
        C26731Tg r1 = this.A0B;
        if (!r1.A00.A0N() || !AnonymousClass11Q.A01(r1.A03).getBoolean("companion_syncd_dirty", false)) {
            return false;
        }
        return true;
    }

    public void BrO(C59312m6 r11) {
        if (this.A0Q.A07().size() == 1 && !this.A07.A0N()) {
            C26371Rw r8 = this.A0G;
            long A012 = AnonymousClass11P.A01(r8.A04);
            C25851Pw r9 = r8.A03;
            C25851Pw.A00(r9).edit().putLong("syncd_first_companion_reg_logging_time", A012).apply();
            long j = C25851Pw.A00(r9).getLong("syncd_last_companion_dereg_logging_time", 0);
            if (j != 0) {
                C25851Pw.A00(r9).edit().remove("syncd_last_companion_dereg_logging_time").apply();
                C46412El r1 = new C46412El();
                r1.A00 = Long.valueOf(A012 - j);
                r8.A08.CC7(r1);
            }
            A0G();
            A0I();
        }
    }

    public void BrT(C199410f r3) {
        if (!this.A07.A0N()) {
            this.A0W.CGF(new AnonymousClass2PF(r3, this));
        }
    }

    public void Btg(AnonymousClass231 r4) {
        if (r4 instanceof AnonymousClass23F) {
            try {
                AnonymousClass1S0 r1 = this.A0L;
                AnonymousClass23F r42 = (AnonymousClass23F) r4;
                C18070vi.A0d(r42, 0);
                if (r42.A01 && !r1.A0B()) {
                    AnonymousClass1S0.A02(r1);
                    r1.A0A(C29431cG.A12(r42.A17().values()));
                    this.A0W.CGF(new AnonymousClass2PE(this, 1));
                }
            } catch (C26831Tq e) {
                A0M(Integer.valueOf(e.errorCode));
            }
        }
    }

    public void BvR() {
        this.A0W.CGL(new C146437Pc(this, 3), "SyncManager/onHandlerConnected");
    }

    public void C8E() {
        AnonymousClass1S2 r1 = this.A0M;
        synchronized (r1) {
            Set set = r1.A00;
            if (set != null) {
                set.clear();
            }
        }
        this.A0P.A08();
        SharedPreferences.Editor edit = C25851Pw.A00(this.A0I).edit();
        for (String remove : C25851Pw.A03) {
            edit.remove(remove);
        }
        edit.apply();
        C26301Rp r2 = this.A0X;
        C26301Rp.A04(r2, "SYNC_MANAGER_CONTACTS_JID_ADDED", (String) null);
        C26301Rp.A04(r2, "SYNC_MANAGER_CONTACTS_JID_REMOVED", (String) null);
    }

    public void C9r(String str, UserJid userJid, String str2) {
        if (!this.A07.A0N() && str.isEmpty() && !str2.isEmpty()) {
            this.A0W.CGF(new C146437Pc(this, 5));
        }
    }

    public Set A0D(Collection collection) {
        HashSet A0F2;
        if (!A0T()) {
            return Collections.emptySet();
        }
        AnonymousClass1S3 r2 = this.A0K;
        C18070vi.A0d(collection, 0);
        ArrayList A002 = AnonymousClass1S3.A00(collection);
        synchronized (r2) {
            A0F2 = r2.A01.A0F(A002);
        }
        return A0F2;
    }

    public void A0G() {
        C46012Cn r0;
        if (A0T() && !this.A07.A0N() && (r0 = (C46012Cn) ((C58862lN) this.A0a.get()).A00("primary_feature")) != null) {
            A0N(r0.A0L());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r4.isEmpty() != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J() {
        /*
            r10 = this;
            boolean r0 = r10.A0U()
            if (r0 != 0) goto L_0x01a5
            monitor-enter(r10)
            boolean r0 = r10.A03     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x01a0
            X.1TS r0 = r10.A0R     // Catch:{ all -> 0x01a2 }
            X.1Oq r0 = r0.A00     // Catch:{ all -> 0x01a2 }
            X.1at r4 = r0.get()     // Catch:{ all -> 0x01a2 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0194 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0194 }
            java.lang.String r2 = "SELECT collection_name FROM collection_versions WHERE dirty_version = 0 OR dirty_version > version"
            java.lang.String r1 = "CollectionVersionsTable.SELECT_DIRTY_COLLECTIONS"
            r0 = 0
            android.database.Cursor r2 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x0194 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0188 }
            r5.<init>()     // Catch:{ all -> 0x0188 }
        L_0x0026:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0188 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "collection_name"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0188 }
            r5.add(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0026
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x0194 }
            r4.close()     // Catch:{ all -> 0x01a2 }
            X.1Rs r7 = r10.A0S     // Catch:{ all -> 0x01a2 }
            boolean r0 = r7.A0L()     // Catch:{ all -> 0x01a2 }
            r0 = r0 ^ 1
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L_0x0076
            java.util.Set r0 = X.C20126A8l.A09     // Catch:{ all -> 0x01a2 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x01a2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "critical_unblock_low"
            r1.remove(r0)     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r4 = r7.A0D(r1, r8)     // Catch:{ all -> 0x01a2 }
            java.util.Set r2 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x01a2 }
            X.18O r1 = r10.A08     // Catch:{ all -> 0x01a2 }
            X.18Q r0 = X.AnonymousClass18O.A0w     // Catch:{ all -> 0x01a2 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r0 = r7.A0D(r2, r0)     // Catch:{ all -> 0x01a2 }
            r4.addAll(r0)     // Catch:{ all -> 0x01a2 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x00bf
        L_0x0076:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01a2 }
            r4.<init>()     // Catch:{ all -> 0x01a2 }
            X.1Oq r0 = r7.A00     // Catch:{ all -> 0x01a2 }
            X.1at r9 = r0.get()     // Catch:{ all -> 0x01a2 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b6 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 1  ORDER BY _id ASC  LIMIT ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00b6 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "PendingMutationsTable.SELECT_MUTATIONS_WITH_LIMIT"
            android.database.Cursor r2 = r6.A0A(r3, r0, r2)     // Catch:{ all -> 0x00b6 }
        L_0x0098:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x00a6
            X.A8l r0 = X.C26331Rs.A00(r2, r7)     // Catch:{ all -> 0x00aa }
            r4.add(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x0098
        L_0x00a6:
            r2.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x00bc
        L_0x00aa:
            r1 = move-exception
            if (r2 == 0) goto L_0x00b5
            r2.close()     // Catch:{ all -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019d
        L_0x00bc:
            r9.close()     // Catch:{ all -> 0x01a2 }
        L_0x00bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r1.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "sync-manager/prepareAndSendRequest loaded "
            r1.append(r0)     // Catch:{ all -> 0x01a2 }
            int r0 = r4.size()     // Catch:{ all -> 0x01a2 }
            r1.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = " pending mutation(s)"
            r1.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01a2 }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x01a2 }
            r1 = 0
        L_0x00e2:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x00e2
            r2.remove()     // Catch:{ all -> 0x01a2 }
            r1 = 1
            goto L_0x00e2
        L_0x00f3:
            if (r1 == 0) goto L_0x00fd
            X.1Rw r2 = r10.A0G     // Catch:{ all -> 0x01a2 }
            r1 = 12
            r0 = 0
            r2.A09(r1, r0)     // Catch:{ all -> 0x01a2 }
        L_0x00fd:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x010a
            goto L_0x0186
        L_0x010a:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x01a2 }
            r3.<init>()     // Catch:{ all -> 0x01a2 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01a2 }
        L_0x0113:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x01a2 }
            X.A8l r2 = (X.C20126A8l) r2     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x0137
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x01a2 }
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x01a2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x0133
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01a2 }
            r0.<init>()     // Catch:{ all -> 0x01a2 }
            r3.put(r1, r0)     // Catch:{ all -> 0x01a2 }
        L_0x0133:
            r0.add(r2)     // Catch:{ all -> 0x01a2 }
            goto L_0x0113
        L_0x0137:
            java.lang.String r0 = "sync-manager/splitByCollectionName: null mutation or collection name in a mutations list"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01a2 }
            goto L_0x0113
        L_0x013e:
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x01a2 }
        L_0x0142:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x015a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01a2 }
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x0142
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x01a2 }
            r3.put(r1, r0)     // Catch:{ all -> 0x01a2 }
            goto L_0x0142
        L_0x015a:
            X.1S0 r0 = r10.A0L     // Catch:{ all -> 0x01a2 }
            X.1Rz r0 = r0.A0A     // Catch:{ all -> 0x01a2 }
            java.util.LinkedHashSet r0 = r0.A00()     // Catch:{ all -> 0x01a2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01a2 }
        L_0x0166:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01a2 }
            r3.remove(r0)     // Catch:{ all -> 0x01a2 }
            goto L_0x0166
        L_0x0174:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x0186
            X.10I r1 = r10.A0W     // Catch:{ all -> 0x01a2 }
            X.2PF r0 = new X.2PF     // Catch:{ all -> 0x01a2 }
            r0.<init>((X.C26811To) r10, (java.util.Map) r3)     // Catch:{ all -> 0x01a2 }
            r1.CGF(r0)     // Catch:{ all -> 0x01a2 }
            r0 = 1
            goto L_0x019e
        L_0x0186:
            r0 = 0
            goto L_0x019e
        L_0x0188:
            r1 = move-exception
            if (r2 == 0) goto L_0x0193
            r2.close()     // Catch:{ all -> 0x018f }
            goto L_0x0193
        L_0x018f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0194 }
        L_0x0193:
            throw r1     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01a2 }
        L_0x019d:
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x019e:
            r10.A03 = r0     // Catch:{ all -> 0x01a2 }
        L_0x01a0:
            monitor-exit(r10)     // Catch:{ all -> 0x01a2 }
            return
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01a2 }
            throw r0
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26811To.A0J():void");
    }

    public void A0N(Collection collection) {
        if (A0T()) {
            this.A0K.A07(collection);
        }
    }

    public void A0Q(Set set) {
        C41851xA BD0;
        if (!set.isEmpty()) {
            AnonymousClass1S3 r4 = this.A0K;
            synchronized (r4) {
                C28791au A062 = r4.A01.A00.A06();
                try {
                    BD0 = A062.BD0();
                    C26331Rs.A06(((C28801av) A062).A02, (String[]) set.toArray(C19620yd.A0M));
                    BD0.A00();
                    BD0.close();
                    A062.close();
                } catch (Throwable th) {
                    try {
                        A062.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
            return;
        }
        return;
        throw th;
    }

    public void A0R(Set set) {
        if (!set.isEmpty()) {
            AnonymousClass1S3 r1 = this.A0K;
            synchronized (r1) {
                r1.A01.A0K(set);
            }
            A0I();
        }
    }

    public boolean A0T() {
        Cursor A0A2;
        if (!A0U() && A0V(1)) {
            C26331Rs r1 = this.A0S;
            if (r1.A0L()) {
                return true;
            }
            C28781at A052 = r1.A00.get();
            try {
                A0A2 = ((C28801av) A052).A02.A0A("SELECT _id FROM pending_mutations WHERE is_ready_to_sync = 1  LIMIT 1", "PendingMutationsTable.SELECT_ANY_MUTATION", (String[]) null);
                boolean z = false;
                if (A0A2.moveToNext() && A0A2.getString(A0A2.getColumnIndexOrThrow("_id")) != null) {
                    z = true;
                }
                A0A2.close();
                A052.close();
                if (z) {
                    return true;
                }
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        }
        return false;
        throw th;
    }

    public C26811To(C19880zA r4, AnonymousClass190 r5, AnonymousClass11S r6, AnonymousClass18O r7, C26671Ta r8, C26711Te r9, C26681Tb r10, C26731Tg r11, C26741Th r12, AnonymousClass1TQ r13, AnonymousClass1TP r14, C26761Tj r15, C26371Rw r16, AnonymousClass1TZ r17, C25851Pw r18, AnonymousClass1S4 r19, AnonymousClass1S3 r20, AnonymousClass1TR r21, AnonymousClass1S0 r22, AnonymousClass1S2 r23, AnonymousClass1M9 r24, C26781Tl r25, C25161Nd r26, AnonymousClass11Q r27, AnonymousClass11P r28, AnonymousClass1TT r29, AnonymousClass1CJ r30, C25551Oq r31, AnonymousClass1RK r32, AnonymousClass1TS r33, C26331Rs r34, AnonymousClass1S1 r35, C18030ve r36, AnonymousClass1SB r37, AnonymousClass10I r38, C26301Rp r39, C24811Lt r40, C26311Rq r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46) {
        this.A0i = r28;
        this.A0k = r36;
        this.A06 = r5;
        this.A07 = r6;
        AnonymousClass10I r2 = r38;
        this.A0W = r2;
        this.A0O = r30;
        this.A08 = r7;
        this.A0P = r31;
        this.A0Y = r41;
        this.A0X = r39;
        this.A0Z = r42;
        this.A0f = r24;
        this.A0L = r22;
        this.A0K = r20;
        this.A0G = r16;
        this.A0l = r40;
        this.A0n = r43;
        this.A0J = r19;
        this.A0U = r37;
        this.A0m = r44;
        this.A0C = r13;
        this.A0S = r34;
        this.A0h = r26;
        this.A0e = r21;
        this.A0H = r17;
        this.A0R = r33;
        this.A0Q = r32;
        this.A0D = r14;
        this.A0j = r29;
        this.A0I = r18;
        this.A0a = r45;
        this.A09 = r8;
        this.A0c = r10;
        this.A0T = r35;
        this.A0A = r9;
        this.A0B = r11;
        this.A0d = r12;
        this.A0E = r15;
        this.A0o = r46;
        this.A0g = r25;
        this.A0M = r23;
        this.A0N = r27;
        this.A05 = r4;
        this.A0V = new C200710s(r2, false);
    }
}
