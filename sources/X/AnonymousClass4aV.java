package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;

/* renamed from: X.4aV  reason: invalid class name */
public final class AnonymousClass4aV {
    public static final AnonymousClass4aV A00 = new Object();

    public static final void A01(View view, C31131f4 r3) {
        C128596gN r1;
        C18070vi.A0d(r3, 0);
        C145777Mo A002 = r3.A00();
        if (A002 != null && view != null && (r1 = A002.A0J) != null && r1.A00 == view) {
            r1.A00 = null;
        }
    }

    public static final void A03(View view, C31131f4 r4, AnonymousClass00H r5) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0j(r5, view);
        r4.A0A(false);
        View findViewById = view.findViewById(2131433352);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            ViewParent parent = findViewById.getParent();
            C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getLayoutTransition() == null) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.addTransitionListener(new C88674ab(layoutTransition, findViewById, viewGroup));
                viewGroup.setLayoutTransition(layoutTransition);
            }
            findViewById.setVisibility(8);
            A08(r4, r5);
        }
    }

    public static final void A04(ImageButton imageButton) {
        C18070vi.A0d(imageButton, 0);
        imageButton.setImageResource(2131232493);
        AnonymousClass3MY.A0w(imageButton.getContext(), imageButton, 2131893587);
    }

    public static final void A05(ImageButton imageButton) {
        C18070vi.A0d(imageButton, 0);
        AnonymousClass3MX.A1B(imageButton.getContext(), imageButton, 2131232494);
        AnonymousClass3MY.A0w(imageButton.getContext(), imageButton, 2131899314);
    }

    public static final void A06(C31131f4 r3) {
        C18070vi.A0d(r3, 0);
        C145777Mo A002 = r3.A00();
        if (A002 != null) {
            Activity activity = A002.A09;
            if (activity instanceof AnonymousClass1F9) {
                A002.A0k.A09((AnonymousClass1F9) activity);
            }
            A002.A09 = null;
        }
    }

    public static final void A08(C31131f4 r4, AnonymousClass00H r5) {
        r4.A0A(false);
        r4.A06();
        r4.A07();
        C31161f7 r2 = (C31161f7) r5.get();
        if (r2.A01) {
            r2.A06.unregisterObserver(r2.A08);
            r2.A01 = false;
        }
        r2.A00 = null;
    }

    public static final void A0A(AnonymousClass1BI r5, AnonymousClass1L1 r6) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        String str;
        if (r5 != null) {
            if (C22971Dz.A0N(r5)) {
                C19830z4 r0 = r6.A01;
                r6.A00(r0);
                sharedPreferences = r6.A00;
                edit = sharedPreferences.edit();
                C18070vi.A0X(edit);
                r6.A00(r0);
                str = "ptt_out_of_chat_broadcast";
            } else if (C22971Dz.A0e(r5)) {
                C19830z4 r02 = r6.A01;
                r6.A00(r02);
                sharedPreferences = r6.A00;
                edit = sharedPreferences.edit();
                C18070vi.A0X(edit);
                r6.A00(r02);
                str = "ptt_out_of_chat_group";
            } else {
                boolean A0S = C22971Dz.A0S(r5);
                C19830z4 r03 = r6.A01;
                r6.A00(r03);
                sharedPreferences = r6.A00;
                edit = sharedPreferences.edit();
                C18070vi.A0X(edit);
                if (A0S) {
                    r6.A00(r03);
                    str = "ptt_out_of_chat_interop";
                } else {
                    r6.A00(r03);
                    str = "ptt_out_of_chat_individual";
                }
            }
            C17880vN.A1D(edit, str, C17890vO.A05(sharedPreferences, str) + 1);
        }
    }

    public static final void A02(View view, C31131f4 r2) {
        r2.A0A(C18070vi.A15(r2, view));
        View findViewById = view.findViewById(2131433352);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            r2.A04();
        }
    }

    public static final void A07(C31131f4 r3, AnonymousClass1BI r4, AnonymousClass1L1 r5, AnonymousClass10I r6) {
        boolean A16 = C18070vi.A16(r3, r5);
        C18070vi.A0d(r6, 3);
        if (r3.A0B()) {
            synchronized (r3) {
                C145777Mo r1 = r3.A00;
                if (r1 != null) {
                    r1.A0U = false;
                    r1.A0e.A03();
                }
            }
            r3.A0A(A16);
            r6.CGF(new C70653Bz(r5, r4, 21));
        }
    }

    public static final void A09(C31131f4 r2, AnonymousClass00H r3) {
        C441822l r0;
        boolean A15 = C18070vi.A15(r2, r3);
        synchronized (r2) {
            C145777Mo r02 = r2.A00;
            if (r02 != null) {
                r0 = r02.A0K;
            } else {
                r0 = r2.A01;
            }
            r2.A02 = r0;
        }
        r2.A0A(A15);
        r2.A06();
        r2.A07();
        C31161f7 r22 = (C31161f7) r3.get();
        if (r22.A01) {
            r22.A06.unregisterObserver(r22.A08);
            r22.A01 = false;
        }
        r22.A00 = null;
    }

    public static final Pair A00(Activity activity, View view, View view2, AnonymousClass1KB r26, AnonymousClass11S r27, AnonymousClass1M9 r28, C24921Me r29, C37451pZ r30, C27201Vd r31, C134196qC r32, C31131f4 r33, C18000vb r34, C18030ve r35, AnonymousClass1L1 r36, AnonymousClass10I r37, AnonymousClass00H r38, AnonymousClass00H r39, String str) {
        C37451pZ r3 = r30;
        View view3 = view2;
        Activity activity2 = activity;
        View view4 = view;
        C18070vi.A0d(view4, 0);
        C18030ve r11 = r35;
        AnonymousClass10I r10 = r37;
        C18070vi.A0w(r11, activity2, r26, r27, r10);
        C18000vb r7 = r34;
        C134196qC r20 = r32;
        C27201Vd r13 = r31;
        C18070vi.A0x(r13, r28, r29, r7, r20);
        C31131f4 r5 = r33;
        AnonymousClass00H r2 = r38;
        AnonymousClass00H r1 = r39;
        C18070vi.A0r(r5, r2, r1);
        AnonymousClass1L1 r12 = r36;
        C18070vi.A0d(r12, 16);
        if (r30 == null) {
            Context baseContext = activity2.getBaseContext();
            C18070vi.A0X(baseContext);
            r3 = r13.A06(baseContext, AnonymousClass001.A1H("out-of-chat-", str, AnonymousClass000.A10()));
        }
        if (view2 == null) {
            view3 = C18070vi.A05(view4, 2131433352);
            activity2.getLayoutInflater().inflate(2131626299, (ViewGroup) view3, true);
            AnonymousClass3MZ.A1O(C18070vi.A05(view3, 2131433343), r5, r2, 49);
            C18070vi.A05(view3, 2131433351).setOnClickListener(new C89844d7(activity2, view3, r27, r28, r29, r3, r20, r5, r7, r12));
            C18070vi.A05(view3, 2131433345).setOnClickListener(new AFT(r5, r2, 0));
        }
        AnonymousClass4aV r25 = A00;
        C145777Mo A002 = r5.A00();
        if (A002 != null) {
            C18030ve r21 = r11;
            Activity activity3 = activity2;
            View view5 = view3;
            AnonymousClass1KB r132 = r26;
            AnonymousClass11S r14 = r27;
            A002.A0G = new C94934lQ(activity3, view5, r132, r14, r28, r29, r3, r20, r5, r7, r21, r12, r10, r1);
            Activity activity4 = A002.A09;
            if (activity4 instanceof AnonymousClass1F9) {
                A002.A0k.A09((AnonymousClass1F9) activity4);
            }
            A002.A09 = activity2;
            if (activity2 instanceof AnonymousClass1F9) {
                A002.A0k.A0A((AnonymousClass1F9) activity2, A002.A0F);
            }
        }
        C145777Mo A003 = r5.A00();
        if (A003 != null) {
            A003.A0J = new C128596gN(view3, r5, r2);
        }
        r25.A0B(view3, r27, r28, r29, r3, r5, r7);
        view3.setVisibility(0);
        C31161f7 r22 = (C31161f7) r2.get();
        if (!r22.A01) {
            r22.A06.registerObserver(r22.A08);
            r22.A01 = true;
        }
        if (r5.A0B()) {
            r5.A05();
        }
        C145777Mo A004 = r5.A00();
        if (A004 != null) {
            A004.A0T = true;
        }
        return new Pair(view3, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0188, code lost:
        if (r0 != null) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(android.view.View r11, X.AnonymousClass11S r12, X.AnonymousClass1M9 r13, X.C24921Me r14, X.C37451pZ r15, X.C31131f4 r16, X.C18000vb r17) {
        /*
            r10 = this;
            r4 = 0
            r0 = 2131433351(0x7f0b1787, float:1.8488485E38)
            android.view.View r3 = X.C18070vi.A05(r11, r0)
            com.whatsapp.WaImageButton r3 = (com.whatsapp.WaImageButton) r3
            boolean r0 = r16.A0B()
            if (r0 == 0) goto L_0x01b4
            A04(r3)
        L_0x0013:
            X.7Mo r2 = r16.A00()
            X.22l r9 = r16.A01()
            if (r9 == 0) goto L_0x0111
            r0 = 2131433353(0x7f0b1789, float:1.848849E38)
            android.view.View r1 = X.C18070vi.A05(r11, r0)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r1 = (com.whatsapp.voicerecorder.VoiceNoteSeekBar) r1
            r1.setEnabled(r4)
            r1.setLongClickable(r4)
            r0 = 1
            r1.A04 = r0
            if (r2 == 0) goto L_0x0044
            int r0 = r2.A01
            r1.setMax(r0)
            int r0 = r2.A09()
            r1.setProgress(r0)
            X.4lR r0 = new X.4lR
            r0.<init>(r3, r9, r1)
            r2.A0H = r0
        L_0x0044:
            r0 = 2131433348(0x7f0b1784, float:1.848848E38)
            android.widget.ImageView r8 = X.AnonymousClass3Ma.A0C(r11, r0)
            r0 = 2131433346(0x7f0b1782, float:1.8488475E38)
            android.view.View r7 = X.C18070vi.A05(r11, r0)
            r0 = 2131433342(0x7f0b177e, float:1.8488467E38)
            android.widget.ImageView r6 = X.AnonymousClass3Ma.A0C(r11, r0)
            r0 = 2131433347(0x7f0b1783, float:1.8488477E38)
            android.view.View r5 = X.C18070vi.A05(r11, r0)
            r0 = 2131433344(0x7f0b1780, float:1.8488471E38)
            android.view.View r4 = X.C18070vi.A05(r11, r0)
            boolean r1 = r9.A0w()
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r9)
            r3 = 0
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2 = 8
            if (r1 != 0) goto L_0x01ae
            if (r0 == 0) goto L_0x014a
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r9)
            if (r0 == 0) goto L_0x0147
            X.1ch r0 = r0.A01
        L_0x0082:
            X.C17960vV.A07(r0)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.C18070vi.A0b(r0)
            X.1E7 r0 = r13.A0H(r0)
            r15.A07(r8, r0)
            r7.setVisibility(r2)
            r6.setVisibility(r2)
            boolean r1 = r9.A1L()
            int r0 = X.C72453Mb.A07(r1)
            r5.setVisibility(r0)
            if (r1 == 0) goto L_0x00a6
            r3 = 8
        L_0x00a6:
            r4.setVisibility(r3)
        L_0x00a9:
            r0 = 2131433354(0x7f0b178a, float:1.8488491E38)
            com.whatsapp.TextEmojiLabel r2 = X.C72453Mb.A0c(r11, r0)
            android.content.Context r8 = X.AnonymousClass3MY.A04(r11)
            r4 = 0
            r5 = 1
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            boolean r7 = r9.A0w()
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r9)
            boolean r1 = X.AnonymousClass000.A1W(r0)
            X.205 r0 = r9.A0v
            X.1BI r6 = r0.A00
            boolean r0 = r0.A02
            r3 = 0
            if (r0 == 0) goto L_0x0117
            if (r7 != 0) goto L_0x0117
            if (r1 != 0) goto L_0x013e
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r7 = r8.getString(r0)
        L_0x00da:
            boolean r0 = X.C22971Dz.A0e(r6)
            if (r0 == 0) goto L_0x00fa
            if (r6 == 0) goto L_0x00fa
            X.1E7 r0 = r13.A0H(r6)
            java.lang.String r6 = r14.A0K(r0)
            boolean r1 = X.AnonymousClass3MW.A1Z(r17)
            java.lang.String r0 = " • "
            if (r1 == 0) goto L_0x0112
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r6, r0, r7)
        L_0x00f6:
            java.lang.String r7 = r0.toString()
        L_0x00fa:
            r2.setSelected(r5)
            r0 = 100
            r2.A0S(r7, r3, r0, r4)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            if (r0 == 0) goto L_0x0111
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 27
            X.C90584eJ.A00(r1, r2, r0)
        L_0x0111:
            return
        L_0x0112:
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r7, r0, r6)
            goto L_0x00f6
        L_0x0117:
            if (r1 != 0) goto L_0x013e
            boolean r0 = X.C22971Dz.A0e(r6)
            if (r0 == 0) goto L_0x013c
            X.1BI r0 = r9.A0H()
        L_0x0123:
            if (r0 == 0) goto L_0x0111
            X.1E7 r1 = r13.A0H(r0)
            java.lang.String r7 = r14.A0M(r1)
            if (r7 != 0) goto L_0x00da
            boolean r0 = X.C22971Dz.A0e(r0)
            int r0 = X.C72453Mb.A04(r0)
            java.lang.String r7 = r14.A0U(r1, r0, r4)
            goto L_0x00da
        L_0x013c:
            r0 = r6
            goto L_0x0123
        L_0x013e:
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r9)
            if (r0 == 0) goto L_0x0111
            X.1ch r0 = r0.A01
            goto L_0x0123
        L_0x0147:
            r0 = 0
            goto L_0x0082
        L_0x014a:
            boolean r0 = r9.A1L()
            if (r0 != 0) goto L_0x016a
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r8.setImageResource(r0)
            r7.setVisibility(r2)
            r0 = 2131231967(0x7f0804df, float:1.808003E38)
        L_0x015c:
            r6.setImageResource(r0)
            r6.setVisibility(r3)
            r5.setVisibility(r2)
        L_0x0165:
            r4.setVisibility(r2)
            goto L_0x00a9
        L_0x016a:
            boolean r0 = r9.A1K()
            if (r0 == 0) goto L_0x017d
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            r8.setImageResource(r0)
            r7.setVisibility(r2)
            r0 = 2131232107(0x7f08056b, float:1.8080314E38)
            goto L_0x015c
        L_0x017d:
            X.205 r1 = r9.A0v
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0197
            r12.A0I()
            X.1E8 r0 = r12.A0D
            if (r0 == 0) goto L_0x00a9
        L_0x018a:
            r15.A07(r8, r0)
            r7.setVisibility(r2)
            r6.setVisibility(r2)
            r5.setVisibility(r3)
            goto L_0x0165
        L_0x0197:
            X.1BI r1 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x01a3
            X.1BI r1 = r9.A0H()
        L_0x01a3:
            X.C17960vV.A07(r1)
            X.C18070vi.A0b(r1)
            X.1E7 r0 = r13.A0H(r1)
            goto L_0x018a
        L_0x01ae:
            X.205 r0 = r9.A0v
            X.1BI r0 = r0.A00
            goto L_0x0082
        L_0x01b4:
            A05(r3)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aV.A0B(android.view.View, X.11S, X.1M9, X.1Me, X.1pZ, X.1f4, X.0vb):void");
    }
}
