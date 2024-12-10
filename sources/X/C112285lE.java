package X;

import android.os.Bundle;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.contact.photos.MultiContactThumbnail;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5lE  reason: invalid class name and case insensitive filesystem */
public class C112285lE extends C38391rD {
    public static final Range A0M = new Range(C17880vN.A0i(), C17880vN.A0k());
    public int A00 = 2132084310;
    public RecyclerView A01;
    public AnonymousClass6bT A02;
    public C108525bq A03;
    public CallGridViewModel A04;
    public boolean A05;
    public boolean A06;
    public final C23581Gv A07 = new AnonymousClass7E0(this, 3);
    public final AnonymousClass1DC A08;
    public final List A09 = AnonymousClass000.A13();
    public final C124706Zj A0A;
    public final C124766Zp A0B;
    public final C124776Zq A0C;
    public final C18030ve A0D;
    public final C18140vp A0E;
    public final C124716Zk A0F;
    public final C124726Zl A0G;
    public final C124736Zm A0H;
    public final C124746Zn A0I;
    public final C124756Zo A0J;
    public final C124786Zr A0K;
    public final C143867Fc A0L;

    public void A0T(RecyclerView recyclerView) {
        this.A01 = null;
    }

    public C113615nN A0V(View view, int i) {
        return A0W(view, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r29 != 0) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r3 != 2) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C113615nN A0W(android.view.View r28, int r29, boolean r30) {
        /*
            r27 = this;
            r9 = 0
            r2 = 1
            r1 = 2
            r0 = r27
            r13 = r28
            r3 = r29
            r26 = r30
            if (r3 == r1) goto L_0x0060
            if (r3 == r2) goto L_0x0060
            r25 = 0
            switch(r29) {
                case 3: goto L_0x0063;
                case 4: goto L_0x009f;
                case 5: goto L_0x00db;
                case 6: goto L_0x0063;
                case 7: goto L_0x0063;
                case 8: goto L_0x0063;
                case 9: goto L_0x0117;
                case 10: goto L_0x0134;
                case 11: goto L_0x0150;
                case 12: goto L_0x018c;
                case 13: goto L_0x0117;
                case 14: goto L_0x01ed;
                default: goto L_0x0014;
            }
        L_0x0014:
            if (r29 == 0) goto L_0x001a
        L_0x0016:
            if (r3 == r2) goto L_0x001a
            if (r3 != r1) goto L_0x001b
        L_0x001a:
            r9 = 1
        L_0x001b:
            java.lang.String r1 = "Unknown view holder type"
            X.C17960vV.A0F(r9, r1)
            X.6Zj r1 = r0.A0A
            X.6bT r3 = r0.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r0.A04
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r2 = r0.A01
            X.0ve r22 = X.AnonymousClass10E.A8r(r2)
            X.1Me r20 = X.AnonymousClass3MZ.A0g(r2)
            X.1VW r19 = X.AnonymousClass3MZ.A0e(r2)
            X.00S r0 = r2.ABO
            java.lang.Object r1 = r0.get()
            X.AfC r1 = (X.C21141AfC) r1
            X.1Lp r14 = X.C108965cb.A0K(r2)
            X.1DC r23 = X.AnonymousClass3MZ.A13(r2)
            X.1VF r15 = X.AnonymousClass10E.A3a(r2)
            X.0vb r21 = X.AnonymousClass10E.A6Q(r2)
            X.00S r0 = r2.A8t
            X.5wX r12 = new X.5wX
            r16 = r3
            r17 = r4
            r18 = r1
            r24 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r12
        L_0x0060:
            r25 = 1
            goto L_0x0016
        L_0x0063:
            X.6Zl r1 = r0.A0G
            X.6bT r4 = r0.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r0.A04
            X.7Fc r2 = r0.A0L
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r1 = r0.A01
            X.0ve r22 = X.AnonymousClass10E.A8r(r1)
            X.1Me r20 = X.AnonymousClass3MZ.A0g(r1)
            X.1VW r19 = X.AnonymousClass3MZ.A0e(r1)
            X.1Lp r15 = X.C108965cb.A0K(r1)
            X.0vb r21 = X.AnonymousClass10E.A6Q(r1)
            X.10G r0 = r1.A00
            X.3Kk r14 = X.AnonymousClass3MZ.A0T(r0)
            X.1DC r23 = X.AnonymousClass3MZ.A13(r1)
            X.00S r0 = r1.A8t
            X.5wV r12 = new X.5wV
            r16 = r2
            r17 = r4
            r18 = r3
            r24 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r12
        L_0x009f:
            X.6Zm r1 = r0.A0H
            X.6bT r4 = r0.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r0.A04
            X.7Fc r2 = r0.A0L
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r1 = r0.A01
            X.0ve r22 = X.AnonymousClass10E.A8r(r1)
            X.1Me r20 = X.AnonymousClass3MZ.A0g(r1)
            X.1VW r19 = X.AnonymousClass3MZ.A0e(r1)
            X.1Lp r15 = X.C108965cb.A0K(r1)
            X.0vb r21 = X.AnonymousClass10E.A6Q(r1)
            X.10G r0 = r1.A00
            X.3Kk r14 = X.AnonymousClass3MZ.A0T(r0)
            X.1DC r23 = X.AnonymousClass3MZ.A13(r1)
            X.00S r0 = r1.A8t
            X.5wT r12 = new X.5wT
            r16 = r2
            r17 = r4
            r18 = r3
            r24 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r12
        L_0x00db:
            X.6Zk r1 = r0.A0F
            X.6bT r4 = r0.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r0.A04
            X.7Fc r2 = r0.A0L
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r1 = r0.A01
            X.0ve r22 = X.AnonymousClass10E.A8r(r1)
            X.1Me r20 = X.AnonymousClass3MZ.A0g(r1)
            X.1VW r19 = X.AnonymousClass3MZ.A0e(r1)
            X.1Lp r15 = X.C108965cb.A0K(r1)
            X.0vb r21 = X.AnonymousClass10E.A6Q(r1)
            X.10G r0 = r1.A00
            X.3Kk r14 = X.AnonymousClass3MZ.A0T(r0)
            X.1DC r23 = X.AnonymousClass3MZ.A13(r1)
            X.00S r0 = r1.A8t
            X.5wS r12 = new X.5wS
            r16 = r2
            r17 = r4
            r18 = r3
            r24 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r12
        L_0x0117:
            X.6Zo r1 = r0.A0J
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r0 = r0.A01
            X.1Me r18 = X.AnonymousClass3MZ.A0g(r0)
            X.1VW r17 = X.AnonymousClass3MZ.A0e(r0)
            X.1Lp r14 = X.C108965cb.A0K(r0)
            r15 = 0
            X.5wP r12 = new X.5wP
            r16 = r15
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        L_0x0134:
            X.6Zn r1 = r0.A0I
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r15 = r0.A04
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r0 = r0.A01
            X.1Lp r14 = X.C108965cb.A0K(r0)
            X.1VW r16 = X.AnonymousClass3MZ.A0e(r0)
            X.1Me r17 = X.AnonymousClass3MZ.A0g(r0)
            X.5wR r12 = new X.5wR
            r12.<init>(r13, r14, r15, r16, r17)
            return r12
        L_0x0150:
            X.6Zp r1 = r0.A0B
            X.6bT r4 = r0.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r0.A04
            X.7Fc r2 = r0.A0L
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r1 = r0.A01
            X.0ve r22 = X.AnonymousClass10E.A8r(r1)
            X.1Me r20 = X.AnonymousClass3MZ.A0g(r1)
            X.1VW r19 = X.AnonymousClass3MZ.A0e(r1)
            X.1Lp r15 = X.C108965cb.A0K(r1)
            X.0vb r21 = X.AnonymousClass10E.A6Q(r1)
            X.10G r0 = r1.A00
            X.3Kk r14 = X.AnonymousClass3MZ.A0T(r0)
            X.1DC r23 = X.AnonymousClass3MZ.A13(r1)
            X.00S r0 = r1.A8t
            X.5wU r12 = new X.5wU
            r16 = r2
            r17 = r4
            r18 = r3
            r24 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r12
        L_0x018c:
            X.6Zq r1 = r0.A0C
            X.6bT r10 = r0.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r11 = r0.A04
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r1.A00
            X.10E r1 = r0.A01
            X.0ve r8 = X.AnonymousClass10E.A8r(r1)
            X.1Me r7 = X.AnonymousClass3MZ.A0g(r1)
            X.1VW r6 = X.AnonymousClass3MZ.A0e(r1)
            X.00S r0 = r1.ABO
            java.lang.Object r5 = r0.get()
            X.AfC r5 = (X.C21141AfC) r5
            X.1Lp r4 = X.C108965cb.A0K(r1)
            X.1DC r3 = X.AnonymousClass3MZ.A13(r1)
            X.1VF r15 = X.AnonymousClass10E.A3a(r1)
            X.0vb r2 = X.AnonymousClass10E.A6Q(r1)
            X.00S r1 = r1.A8t
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            X.C18070vi.A0x(r8, r7, r6, r5, r4)
            r0 = 11
            X.C18070vi.A0d(r3, r0)
            r0 = 13
            X.C18070vi.A0d(r2, r0)
            r0 = 14
            X.C18070vi.A0d(r1, r0)
            X.5wW r12 = new X.5wW
            r14 = r4
            r16 = r10
            r17 = r11
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r2
            r22 = r8
            r23 = r3
            r24 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r12
        L_0x01ed:
            X.6Zr r2 = r0.A0K
            X.6bT r15 = r0.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r0.A04
            java.util.List r0 = X.C42011xT.A0I
            X.1K2 r0 = r2.A00
            X.10E r0 = r0.A01
            X.1Lp r14 = X.C108965cb.A0K(r0)
            X.1VW r17 = X.AnonymousClass3MZ.A0e(r0)
            X.1Me r18 = X.AnonymousClass3MZ.A0g(r0)
            X.5wQ r12 = new X.5wQ
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112285lE.A0W(android.view.View, int, boolean):X.5nN");
    }

    public int A0Q() {
        return this.A09.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r1) {
        ((C113615nN) r1).A0B();
    }

    /* renamed from: A0Y */
    public void A0P(C113615nN r8, List list, int i) {
        int i2;
        AnonymousClass1E7 r0;
        C37451pZ r1;
        if (i >= 0) {
            List list2 = this.A09;
            if (i < list2.size()) {
                r8.A0J((AnonymousClass70A) list2.get(i));
                boolean z = false;
                if (list.size() > 0 && (list.get(0) instanceof Bundle) && ((Bundle) list.get(0)).getBoolean("update_contact")) {
                    if (r8 instanceof C116165wV) {
                        C116165wV r2 = (C116165wV) r8;
                        AnonymousClass70A r12 = r2.A05;
                        if (!(r12 == null || r2.A0H == null)) {
                            r2.A0L(r12, true);
                        }
                    } else if (r8 instanceof C116185wX) {
                        C116185wX r3 = (C116185wX) r8;
                        AnonymousClass70A r02 = r3.A05;
                        if (r02 != null) {
                            r3.A0H(r3.A0L, r02.A0g, true, true);
                            r3.A0H(r3.A0S, r3.A05.A0g, false, false);
                        }
                    } else if (!(r8 instanceof C116125wR) && (r8 instanceof C116115wQ)) {
                        C116115wQ r6 = (C116115wQ) r8;
                        AnonymousClass1E7[] r13 = new AnonymousClass1E7[1];
                        AnonymousClass70A r03 = r6.A05;
                        if (!(r03 == null || (r0 = r03.A0g) == null)) {
                            r13[0] = r0;
                            ArrayList A062 = AnonymousClass1ZU.A06(r13);
                            MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) AnonymousClass3MX.A14(r6.A01);
                            AnonymousClass6bT r04 = r6.A0A;
                            if (!(r04 == null || (r1 = (C37451pZ) AnonymousClass000.A0w(r04.A00, 3)) == null)) {
                                multiContactThumbnail.A00(r6.A0B, r1, A062);
                            }
                        }
                    }
                }
                if (this.A05) {
                    i2 = 2;
                } else if ((r8 instanceof C116165wV) && this.A01 != null && !(this instanceof C116095wO) && !this.A06) {
                    int size = list2.size();
                    C143867Fc r22 = this.A0L;
                    int height = this.A01.getHeight();
                    CallGridViewModel callGridViewModel = this.A04;
                    if (callGridViewModel != null && C72463Mc.A1O(callGridViewModel.A0n)) {
                        z = true;
                    }
                    int A002 = r22.A00(size, height, z);
                    Log.i("VoiceParticipantViewHolder/setItemViewHeight get called");
                    View view = r8.A0H;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i3 = layoutParams.height;
                    if (i3 != A002) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("VoiceParticipantViewHolder/setItemViewHeight Height Mismatch, layoutParams.height: ");
                        A10.append(i3);
                        C17900vP.A0j(", itemViewHeightPx: ", A10, A002);
                        layoutParams.height = A002;
                        view.setLayoutParams(layoutParams);
                    }
                    i2 = 2;
                    if (size <= 2) {
                        i2 = 0;
                    } else if (size <= 8) {
                        i2 = 1;
                    }
                } else {
                    return;
                }
                r8.A0E(i2);
                return;
            }
        }
        Log.w("CallGridAdapter/onCreateViewHolder index out of bounds");
    }

    public void A0Z(UserJid userJid) {
        if (userJid != null) {
            int i = 0;
            while (true) {
                List list = this.A09;
                if (i >= list.size()) {
                    return;
                }
                if (!userJid.equals(((AnonymousClass70A) list.get(i)).A0h)) {
                    i++;
                } else if (i != -1) {
                    Bundle A0D2 = C17880vN.A0D();
                    A0D2.putBoolean("update_contact", true);
                    this.A01.A04(A0D2, i, 1);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5jb, X.C6i] */
    public void A0a(List list) {
        List list2 = this.A09;
        ? obj = new Object();
        obj.A01 = list2;
        obj.A00 = list;
        C25734Cl4 A002 = C25367CeS.A00(obj);
        this.A06 = AnonymousClass000.A1S(list2.size(), list.size());
        list2.clear();
        list2.addAll(list);
        A002.A02(this);
    }

    public int getItemViewType(int i) {
        AnonymousClass70A r5;
        AnonymousClass70A r1;
        if (this instanceof C116095wO) {
            if (i < 0) {
                return 9;
            }
            List list = this.A09;
            if (i >= list.size() || (r1 = (AnonymousClass70A) list.get(i)) == null || r1.A0E) {
                return 9;
            }
            if (r1.A0G) {
                return 13;
            }
            if (r1.A0D) {
                return 3;
            }
            return 0;
        } else if (i < 0) {
            return 9;
        } else {
            List list2 = this.A09;
            if (i >= list2.size() || (r5 = (AnonymousClass70A) list2.get(i)) == null || r5.A0E) {
                return 9;
            }
            if (r5.A0M) {
                return 10;
            }
            if (!this.A05) {
                int size = list2.size();
                if (r5.A0O) {
                    if (!r5.A0D) {
                        return 0;
                    }
                    if (this.A05 || r5.A0F || r5.A0H || !C72463Mc.A1Z(this.A0E)) {
                        if (size <= 4) {
                            return 6;
                        }
                    }
                } else if (size == 1) {
                    if (r5.A0F) {
                        return 4;
                    }
                    if (!C72463Mc.A1Z(this.A0E)) {
                        return 5;
                    }
                } else if (A0M.contains(Integer.valueOf(size))) {
                    if (C18020vd.A05(C18040vf.A02, this.A0D, 5055)) {
                        return 6;
                    }
                }
                return 14;
            }
            return 3;
        }
    }

    public C112285lE(C124706Zj r3, C124716Zk r4, C124726Zl r5, C124736Zm r6, C124746Zn r7, C124756Zo r8, C124766Zp r9, C124776Zq r10, C124786Zr r11, C143867Fc r12, C18030ve r13, AnonymousClass1DC r14, C18140vp r15) {
        this.A0D = r13;
        this.A0A = r3;
        this.A0F = r4;
        this.A0G = r5;
        this.A0H = r6;
        this.A0I = r7;
        this.A0J = r8;
        this.A0B = r9;
        this.A08 = r14;
        this.A0L = r12;
        this.A0C = r10;
        this.A0K = r11;
        this.A0E = r15;
    }

    public View A0U(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        int i2;
        C003101k r1 = new C003101k(viewGroup.getContext(), this.A00);
        switch (i) {
            case 1:
                from = LayoutInflater.from(r1);
                i2 = 2131627344;
                break;
            case 3:
                from = LayoutInflater.from(r1);
                i2 = 2131624226;
                break;
            case 4:
                from = LayoutInflater.from(r1);
                i2 = 2131624225;
                break;
            case 5:
                from = LayoutInflater.from(r1);
                i2 = 2131624224;
                break;
            case 6:
                from = LayoutInflater.from(r1);
                i2 = 2131624222;
                break;
            case 7:
                from = LayoutInflater.from(r1);
                i2 = 2131624223;
                break;
            case 8:
                from = LayoutInflater.from(r1);
                i2 = 2131624221;
                break;
            case 9:
                FrameLayout frameLayout = new FrameLayout(r1);
                C108965cb.A12(frameLayout, -1);
                return frameLayout;
            case 10:
                from = LayoutInflater.from(r1);
                i2 = 2131626878;
                break;
            case 11:
                from = LayoutInflater.from(r1);
                i2 = 2131624227;
                break;
            case 13:
                View view = new View(r1);
                C108965cb.A12(view, -1);
                view.setBackgroundColor(r1.getResources().getColor(2131099872));
                return view;
            case 14:
                from = LayoutInflater.from(r1);
                i2 = 2131626457;
                break;
            default:
                from = LayoutInflater.from(r1);
                i2 = 2131627345;
                break;
        }
        return from.inflate(i2, viewGroup, false);
    }

    /* renamed from: A0X */
    public void Bmc(C113615nN r2, int i) {
        A0P(r2, AnonymousClass000.A13(), i);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C17900vP.A0j("CallGridAdapter/onCreateViewHolder, viewType: ", AnonymousClass000.A10(), i);
        C113615nN A0V = A0V(A0U(i, viewGroup), i);
        boolean z = true;
        if (!(i == 7 || i == 8 || i == 1)) {
            z = false;
        }
        A0V.A07 = z;
        A0V.A0I(this.A03);
        return A0V;
    }

    public void A0S(RecyclerView recyclerView) {
        this.A01 = recyclerView;
    }
}
