package com.whatsapp.polls.results;

import X.AGE;
import X.AH2;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass22H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aU;
import X.AnonymousClass8BR;
import X.AnonymousClass8GV;
import X.AnonymousClass8HS;
import X.AnonymousClass9V7;
import X.AnonymousClass9V8;
import X.AnonymousClass9V9;
import X.AnonymousClass9VA;
import X.AnonymousClass9VB;
import X.C000200d;
import X.C003401n;
import X.C1183863g;
import X.C137116uw;
import X.C1406072e;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18070vi;
import X.C19996A2j;
import X.C20339AGv;
import X.C21535Ali;
import X.C22380B5j;
import X.C22381B5k;
import X.C27201Vd;
import X.C37451pZ;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

public final class PollResultsActivity extends AnonymousClass1FY implements C22380B5j, C22381B5k {
    public AnonymousClass9V7 A00;
    public AnonymousClass9V8 A01;
    public AnonymousClass9V9 A02;
    public AnonymousClass9VA A03;
    public AnonymousClass9VB A04;
    public C37451pZ A05;
    public C27201Vd A06;
    public AnonymousClass122 A07;
    public AnonymousClass8HS A08;
    public AnonymousClass8GV A09;
    public AnonymousClass22H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public boolean A0G;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.1uf, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        String str;
        AnonymousClass00H r0;
        super.onCreate(bundle);
        setTitle(2131895328);
        setContentView(2131626487);
        C003401n A0K = AnonymousClass3MY.A0K(this, AnonymousClass3Ma.A0G(this));
        if (A0K != null) {
            A0K.A0W(true);
            A0K.A0M(2131895328);
            AnonymousClass205 A022 = AnonymousClass4aU.A02(getIntent());
            AnonymousClass00H r02 = this.A0B;
            if (r02 != null) {
                AnonymousClass206 A012 = AnonymousClass1W2.A01(A022, r02);
                C17960vV.A07(A012);
                this.A0A = (AnonymousClass22H) A012;
                C27201Vd r2 = this.A06;
                if (r2 != null) {
                    this.A05 = r2.A06(getBaseContext(), "poll-results-activity");
                    AnonymousClass22H r03 = this.A0A;
                    if (r03 != null) {
                        if (r03.A0w()) {
                            r0 = this.A0D;
                            if (r0 == null) {
                                str = "newsletterPollUseCase";
                            }
                        } else {
                            r0 = this.A0C;
                            if (r0 == null) {
                                str = "localPollUseCase";
                            }
                        }
                        Object obj = r0.get();
                        C19996A2j a2j = (C19996A2j) obj;
                        AnonymousClass22H r04 = this.A0A;
                        if (r04 != null) {
                            a2j.A02 = r04;
                            C18070vi.A0b(obj);
                            AnonymousClass9VB r22 = this.A04;
                            if (r22 != null) {
                                AnonymousClass8GV r1 = (AnonymousClass8GV) AnonymousClass8BR.A0C(new AH2(a2j, r22, 8), this).A00(AnonymousClass8GV.class);
                                getLifecycle().A05(r1);
                                this.A09 = r1;
                                if (r1 != null) {
                                    C20339AGv.A00(this, r1.A03.A06, C21535Ali.A00(this, 32), 47);
                                }
                                AnonymousClass8GV r05 = this.A09;
                                if (r05 != null) {
                                    C20339AGv.A00(this, r05.A05, C21535Ali.A00(this, 33), 47);
                                }
                                AnonymousClass8GV r06 = this.A09;
                                if (r06 != null) {
                                    r06.A02.registerObserver(r06.A01);
                                }
                                RecyclerView recyclerView = (RecyclerView) C18070vi.A05(this.A00, 2131433957);
                                AnonymousClass3Ma.A15(this, recyclerView);
                                AnonymousClass8GV r14 = this.A09;
                                if (r14 != null) {
                                    ? obj2 = new Object();
                                    C37451pZ r11 = this.A05;
                                    if (r11 == null) {
                                        str = "contactPhotoLoader";
                                    } else {
                                        AnonymousClass9V8 r8 = this.A01;
                                        if (r8 != null) {
                                            AnonymousClass9V9 r9 = this.A02;
                                            if (r9 != null) {
                                                AnonymousClass9VA r10 = this.A03;
                                                if (r10 != null) {
                                                    AnonymousClass9V7 r7 = this.A00;
                                                    if (r7 != null) {
                                                        AnonymousClass8HS r5 = new AnonymousClass8HS(obj2, r7, r8, r9, r10, r11, this, this, r14);
                                                        this.A08 = r5;
                                                        recyclerView.setAdapter(r5);
                                                    } else {
                                                        str = "pollResultsNonContactUserViewHolderFactory";
                                                    }
                                                } else {
                                                    str = "pollResultsUserViewHolderFactory";
                                                }
                                            } else {
                                                str = "pollResultsQuestionViewHolderFactory";
                                            }
                                        } else {
                                            str = "pollResultsOptionViewHolderFactory";
                                        }
                                    }
                                }
                                AnonymousClass00H r07 = this.A0E;
                                if (r07 != null) {
                                    C1406072e r3 = (C1406072e) r07.get();
                                    AnonymousClass22H r23 = this.A0A;
                                    if (r23 != null) {
                                        C1183863g r12 = new C1183863g();
                                        AnonymousClass1BI r08 = r23.A0v.A00;
                                        if (r08 != null) {
                                            C1406072e.A00(r12, r08, r3);
                                        }
                                        C1406072e.A02(r12, r23);
                                        r12.A04 = C17880vN.A0k();
                                        C1406072e.A01(r12, (AnonymousClass1BI) null, r23);
                                        r3.A00.CC7(r12);
                                        AnonymousClass8GV r13 = this.A09;
                                        if (r13 != null) {
                                            AnonymousClass22H r09 = this.A0A;
                                            if (r09 != null) {
                                                r13.A0T(r09);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    str = "pollEventStatLogger";
                                }
                            } else {
                                str = "pollResultsViewModelFactory";
                            }
                        }
                    }
                    C18070vi.A11("fMessagePoll");
                    throw null;
                }
                str = "contactPhotos";
            } else {
                str = "fMessageDatabase";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw C17890vO.A0K();
    }

    public void A2y() {
        if (!this.A0G) {
            this.A0G = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r3 = r1.A00;
            C63932tv.A01(r1, r3, this);
            C63662tU.A00(r1, r3, this, r3.A5A);
            this.A06 = AnonymousClass3MZ.A0i(r1);
            this.A07 = AnonymousClass3MZ.A0n(r1);
            this.A0B = C000200d.A00(r1.A3w);
            this.A0C = C000200d.A00(A002.A4a);
            this.A0D = C000200d.A00(A002.A5A);
            this.A0E = C000200d.A00(r3.A3q);
            this.A00 = (AnonymousClass9V7) A002.A3G.get();
            this.A01 = (AnonymousClass9V8) A002.A3H.get();
            this.A02 = (AnonymousClass9V9) A002.A3I.get();
            this.A03 = (AnonymousClass9VA) A002.A3J.get();
            this.A04 = (AnonymousClass9VB) A002.A3K.get();
            this.A0F = AnonymousClass3MW.A0s(r1);
        }
    }

    public void onBackPressed() {
        AnonymousClass8GV r0 = this.A09;
        if (r0 != null) {
            C19996A2j a2j = r0.A03;
            if (a2j.A01 != -1) {
                a2j.A01 = -1;
                a2j.A02();
                return;
            }
        }
        super.onBackPressed();
    }

    public PollResultsActivity(int i) {
        this.A0G = false;
        AGE.A00(this, 13);
    }

    public PollResultsActivity() {
        this(0);
    }
}
