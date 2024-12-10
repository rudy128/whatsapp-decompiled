package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass126;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1D7;
import X.AnonymousClass1DF;
import X.AnonymousClass1E2;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1L4;
import X.AnonymousClass1MS;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y5;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3U0;
import X.AnonymousClass3gf;
import X.AnonymousClass3rC;
import X.AnonymousClass4GT;
import X.AnonymousClass4J8;
import X.AnonymousClass4L6;
import X.AnonymousClass4L7;
import X.AnonymousClass4SL;
import X.AnonymousClass4SV;
import X.AnonymousClass4TN;
import X.AnonymousClass4U5;
import X.AnonymousClass5N2;
import X.AnonymousClass5N3;
import X.AnonymousClass5N4;
import X.AnonymousClass5PO;
import X.C000200d;
import X.C102145Fi;
import X.C102155Fj;
import X.C102165Fk;
import X.C102175Fl;
import X.C102185Fm;
import X.C102195Fn;
import X.C102205Fo;
import X.C102215Fp;
import X.C102225Fq;
import X.C102235Fr;
import X.C102245Fs;
import X.C102255Ft;
import X.C102265Fu;
import X.C108265bP;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C22971Dz;
import X.C24751Ln;
import X.C24921Me;
import X.C29431cG;
import X.C30391dr;
import X.C32101gd;
import X.C36401np;
import X.C41561wd;
import X.C42141xh;
import X.C42751yg;
import X.C56552he;
import X.C70833Cr;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C83694Gh;
import X.C84964Ln;
import X.C91004ez;
import X.C96294nc;
import X.C98494rF;
import X.C99274sY;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1;
import com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel;
import com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class AddGroupParticipantsSelector extends AnonymousClass3gf implements C108265bP {
    public static final AnonymousClass4U5 A0d = new AnonymousClass4U5(new C42751yg((String) null, AnonymousClass00R.A00), (AnonymousClass1E2) null, false);
    public AnonymousClass4J8 A00;
    public C56552he A01;
    public C32101gd A02;
    public AnonymousClass4TN A03;
    public AnonymousClass4L6 A04;
    public AnonymousClass1CJ A05;
    public AnonymousClass1MS A06;
    public AnonymousClass1MZ A07;
    public C24751Ln A08;
    public AnonymousClass126 A09;
    public GroupMemberSuggestionsViewModel A0A;
    public C36401np A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public Map A0H;
    public View A0I;
    public boolean A0J;
    public final Map A0K;
    public final Set A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;
    public final C18100vl A0T;
    public final C18100vl A0U;
    public final C18100vl A0V;
    public final C18100vl A0W;
    public final C18100vl A0X;
    public final C18100vl A0Y;
    public final C18100vl A0Z;
    public final C18100vl A0a;
    public final C18100vl A0b;
    public final AnonymousClass3L6 A0c;

    public AddGroupParticipantsSelector() {
        this(0);
        this.A0L = C17880vN.A14();
        this.A0K = C17880vN.A13();
        this.A0V = AnonymousClass1DF.A01(new C102205Fo(this));
        this.A0U = AnonymousClass1DF.A01(new C102195Fn(this));
        this.A0M = AnonymousClass1DF.A01(new C102145Fi(this));
        this.A0X = AnonymousClass1DF.A01(new C102225Fq(this));
        this.A0Y = AnonymousClass1DF.A01(new C102235Fr(this));
        this.A0a = AnonymousClass1DF.A01(new C102245Fs(this));
        this.A0O = AnonymousClass1DF.A01(new C102165Fk(this));
        this.A0W = AnonymousClass1DF.A01(new C102215Fp(this));
        Integer num = AnonymousClass00R.A01;
        this.A0Q = AnonymousClass1DF.A00(num, new AnonymousClass5N2(this));
        this.A0T = AnonymousClass1DF.A00(num, new AnonymousClass5PO(this, "is_cag_and_community_add"));
        this.A0P = C83694Gh.A00(this, "entry_point", 6);
        this.A0Z = AnonymousClass1DF.A00(num, new AnonymousClass5N3(this));
        this.A0N = AnonymousClass1DF.A01(new C102155Fj(this));
        this.A0S = AnonymousClass1DF.A01(new C102185Fm(this));
        this.A0R = AnonymousClass1DF.A01(new C102175Fl(this));
        this.A0c = new C96294nc(this, 7);
        this.A0b = C99274sY.A00(new C102255Ft(this), new C102265Fu(this), new AnonymousClass5N4(this), AnonymousClass3MW.A15(AnonymousClass3U0.class));
    }

    public static final void A11(AddGroupParticipantsSelector addGroupParticipantsSelector, AnonymousClass4SL r6, C42751yg r7, AnonymousClass1E7 r8) {
        C42751yg r3 = r7;
        AnonymousClass1E7 r4 = r8;
        if (r7.A00 == AnonymousClass00R.A0Y) {
            TextEmojiLabel textEmojiLabel = r6.A03;
            C18070vi.A0W(textEmojiLabel);
            C72453Mb.A1L(textEmojiLabel, C24921Me.A01(addGroupParticipantsSelector.A08, r8, true).A01);
        }
        r6.A04.A04(r3, r4, addGroupParticipantsSelector.A0S, 7, r8.A0P());
    }

    public void A4u(int i) {
    }

    public void A4y(AnonymousClass4SL r8, AnonymousClass1E7 r9) {
        AnonymousClass4SL r5 = r8;
        AnonymousClass1E7 r4 = r9;
        C18070vi.A0h(r8, r9);
        super.A4y(r8, r9);
        C98494rF A002 = C98494rF.A00();
        C42751yg r1 = C74803cp.A0V(this, r9).A00;
        A002.element = r1;
        if (C18070vi.A18(r1, A0d.A00)) {
            this.A05.CGF(new C70833Cr((Object) A002, (Object) this, (Object) r4, (Object) r5, 4));
            return;
        }
        A11(this, r8, (C42751yg) A002.element, r9);
        A12(this, r8, r9);
    }

    public void A55(ArrayList arrayList) {
        AnonymousClass4TN r1;
        UserJid userJid;
        C18070vi.A0d(arrayList, 0);
        AnonymousClass1EC A0p = AnonymousClass3MX.A0p(this.A0Q);
        if (A0p != null) {
            try {
                r1 = (AnonymousClass4TN) AnonymousClass4GT.A00(AnonymousClass3MZ.A0H(this).A01, new CompoundContactsLoader$loadContacts$3((AnonymousClass4L7) this.A0N.getValue(), A0p, (C30391dr) null, 5));
            } catch (CancellationException e) {
                Log.e((Throwable) e);
                r1 = new AnonymousClass4TN(AnonymousClass1D7.A0I());
            }
            this.A03 = r1;
            arrayList.addAll((Collection) r1.A01.getValue());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0O2 = C17880vN.A0O(it);
                AnonymousClass1BI r5 = A0O2.A0J;
                if (r5 != null) {
                    C42751yg A0D2 = this.A08.A0D(A0O2, 7);
                    AnonymousClass1E2 r3 = null;
                    if (C72453Mb.A1a(this.A0U) || C72453Mb.A1a(this.A0W)) {
                        PhoneUserJid phoneUserJid = (PhoneUserJid) A0O2.A06(PhoneUserJid.class);
                        if (phoneUserJid != null) {
                            C24751Ln r0 = this.A08;
                            if (r0 != null) {
                                userJid = r0.A0A(phoneUserJid);
                            } else {
                                C18070vi.A11("jidMapRepository");
                                throw null;
                            }
                        } else {
                            userJid = null;
                        }
                        if (userJid instanceof AnonymousClass1E2) {
                            r3 = (AnonymousClass1E2) userJid;
                        }
                    }
                    this.A0K.put(r5, new AnonymousClass4U5(A0D2, r3, AnonymousClass3MW.A0V(this.A0J).A0P(AnonymousClass3MZ.A0x(A0O2))));
                }
            }
        }
    }

    public void A57(List list) {
        C18070vi.A0d(list, 0);
        String str = this.A0R;
        if (str != null && str.length() != 0 && list.isEmpty() && !C72453Mb.A1a(this.A0a)) {
            A56(list);
        }
        super.A57(list);
    }

    public void A59(List list) {
        C18070vi.A0d(list, 0);
        String str = this.A0R;
        if (str != null && str.length() != 0 && AnonymousClass000.A1a(list) && C72453Mb.A1a(this.A0V)) {
            list.add(new AnonymousClass3rC(C18070vi.A0F(this, 2131899186), false));
        }
        super.A59(list);
        A5A(list);
    }

    public void A5A(List list) {
        C18070vi.A0d(list, 0);
        if (C72453Mb.A1a(this.A0V)) {
            if (this.A0I == null) {
                C18100vl r2 = this.A0R;
                this.A0I = AnonymousClass3MW.A0A(r2);
                ViewGroup A0F2 = AnonymousClass3MX.A0F(this, 2131434940);
                if (A0F2 != null) {
                    A0F2.addView(AnonymousClass3MW.A0A(this.A0S));
                }
                this.A02.addFooterView(AnonymousClass3MW.A0A(r2), (Object) null, true);
            }
            String str = this.A0R;
            if (str == null || str.length() == 0 || !list.isEmpty()) {
                C72453Mb.A1U(this.A0R, 0);
                C72453Mb.A1U(this.A0S, 8);
            } else {
                C72453Mb.A1U(this.A0R, 8);
                C72453Mb.A1U(this.A0S, 0);
            }
        }
        super.A5A(list);
    }

    public void BEb(AnonymousClass1E7 r7) {
        AnonymousClass1OX A002;
        C18600wl r3;
        AnonymousClass1OS addGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1;
        C18070vi.A0d(r7, 0);
        if (!C29431cG.A18(this.A0L, AnonymousClass1E7.A01(r7))) {
            super.BEb(r7);
            GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel = this.A0A;
            if (groupMemberSuggestionsViewModel != null) {
                A002 = C41561wd.A00(groupMemberSuggestionsViewModel);
                r3 = groupMemberSuggestionsViewModel.A05;
                addGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1 = new GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1(r7, groupMemberSuggestionsViewModel, (C30391dr) null, 90);
            } else {
                AnonymousClass3U0 r1 = (AnonymousClass3U0) this.A0b.getValue();
                A002 = C41561wd.A00(r1);
                r3 = r1.A09;
                addGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1 = new AddGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1(r1, r7, (C30391dr) null);
            }
            AnonymousClass3MW.A1X(r3, addGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1, A002);
        }
    }

    public void Bmf(String str) {
    }

    public /* synthetic */ void Bnk(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e2, code lost:
        if (r0.A0K(r1) != true) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0y(com.whatsapp.TextEmojiLabel r9, com.whatsapp.contact.picker.AddGroupParticipantsSelector r10, X.AnonymousClass1EC r11) {
        /*
            X.1M9 r0 = r10.A06
            X.1MA r0 = r0.A03
            X.1E7 r0 = r0.A0A(r11)
            if (r0 == 0) goto L_0x007b
            boolean r0 = X.C62822s3.A02(r0)
            if (r0 == 0) goto L_0x00e9
            X.0vl r0 = r10.A0X
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00cc
            X.0vl r1 = r10.A0M
            java.lang.Object r0 = r1.getValue()
            X.4RP r0 = (X.AnonymousClass4RP) r0
            if (r0 == 0) goto L_0x00cc
            X.0ve r0 = r0.A05
            boolean r0 = X.AnonymousClass3MX.A1Y(r0)
            r5 = 1
            if (r0 != r5) goto L_0x00cc
            java.lang.Object r1 = r1.getValue()
            X.4RP r1 = (X.AnonymousClass4RP) r1
            r2 = 0
            if (r1 == 0) goto L_0x00c9
            X.0ve r0 = r1.A05
            boolean r0 = X.AnonymousClass3MX.A1Y(r0)
            if (r0 != 0) goto L_0x00bf
            r6 = 0
        L_0x003d:
            X.0vl r0 = r10.A0V
            boolean r0 = X.C72453Mb.A1a(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0086
            boolean r0 = X.C18070vi.A19(r6, r5)
            if (r0 == 0) goto L_0x007c
            r2 = 2131886496(0x7f1201a0, float:1.9407572E38)
        L_0x004f:
            java.lang.String r6 = r10.getString(r2)
            if (r6 == 0) goto L_0x007b
            X.1np r3 = r10.A0B
            if (r3 == 0) goto L_0x00ee
            android.content.Context r4 = r9.getContext()
            android.content.Context r2 = r9.getContext()
            r1 = 2130968627(0x7f040033, float:1.7545913E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r8 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r0 = 44
            X.3Bv r5 = new X.3Bv
            r5.<init>(r10, r11, r0)
            java.lang.String r7 = "edit_group_permissions"
            android.text.SpannableStringBuilder r0 = r3.A06(r4, r5, r6, r7, r8)
            r9.setText(r0)
        L_0x007b:
            return
        L_0x007c:
            boolean r0 = X.C18070vi.A19(r6, r4)
            if (r0 == 0) goto L_0x007b
            r2 = 2131886495(0x7f12019f, float:1.940757E38)
            goto L_0x004f
        L_0x0086:
            X.126 r1 = r10.A09
            if (r1 == 0) goto L_0x00f1
            X.0vl r0 = r10.A0Q
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r3 = r1.A0K(r0)
            boolean r0 = X.C18070vi.A19(r6, r5)
            r2 = 4
            if (r0 == 0) goto L_0x00a3
            if (r3 != r2) goto L_0x00a3
            r2 = 2131892974(0x7f121aee, float:1.9420711E38)
            goto L_0x004f
        L_0x00a3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C18070vi.A18(r6, r1)
            if (r0 == 0) goto L_0x00b3
            if (r3 != r2) goto L_0x00b3
            r2 = 2131892973(0x7f121aed, float:1.942071E38)
            goto L_0x004f
        L_0x00b3:
            boolean r0 = X.C18070vi.A18(r6, r1)
            if (r0 == 0) goto L_0x007b
            if (r3 != r5) goto L_0x007b
            r2 = 2131892972(0x7f121aec, float:1.9420707E38)
            goto L_0x004f
        L_0x00bf:
            boolean r0 = r1.A00()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            goto L_0x003d
        L_0x00c9:
            r6 = r2
            goto L_0x003d
        L_0x00cc:
            X.0vl r0 = r10.A0Q
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x00e4
            X.1MZ r0 = r10.A07
            if (r0 == 0) goto L_0x00f7
            boolean r1 = r0.A0K(r1)
            r0 = 1
            r2 = 2131886498(0x7f1201a2, float:1.9407577E38)
            if (r1 == r0) goto L_0x004f
        L_0x00e4:
            r2 = 2131886499(0x7f1201a3, float:1.9407579E38)
            goto L_0x004f
        L_0x00e9:
            r2 = 2131886497(0x7f1201a1, float:1.9407575E38)
            goto L_0x004f
        L_0x00ee:
            java.lang.String r0 = "linkifier"
            goto L_0x00f9
        L_0x00f1:
            java.lang.String r0 = "groupChatManager"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00f7:
            java.lang.String r0 = "groupParticipantsManager"
        L_0x00f9:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0y(com.whatsapp.TextEmojiLabel, com.whatsapp.contact.picker.AddGroupParticipantsSelector, X.1EC):void");
    }

    public static final void A0z(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        AnonymousClass1L4 r1 = addGroupParticipantsSelector.A09;
        ListView listView = addGroupParticipantsSelector.getListView();
        C18070vi.A0X(listView);
        r1.A01(listView);
        Intent A0A2 = C17880vN.A0A();
        A0A2.putExtra("contacts", C22971Dz.A0B(addGroupParticipantsSelector.A4p()));
        C72453Mb.A16(addGroupParticipantsSelector, A0A2);
    }

    public static final void A12(AddGroupParticipantsSelector addGroupParticipantsSelector, AnonymousClass4SL r7, AnonymousClass1E7 r8) {
        boolean z;
        int i;
        if (C72453Mb.A1a(addGroupParticipantsSelector.A0U) || C72453Mb.A1a(addGroupParticipantsSelector.A0W)) {
            AnonymousClass1E2 r1 = C74803cp.A0V(addGroupParticipantsSelector, r8).A01;
            z = false;
            if (r1 != null && addGroupParticipantsSelector.A0L.contains(r1)) {
                z = true;
            }
        } else {
            z = C29431cG.A18(addGroupParticipantsSelector.A0L, AnonymousClass1E7.A01(r8));
        }
        boolean z2 = C74803cp.A0V(addGroupParticipantsSelector, r8).A02;
        View view = r7.A01;
        AnonymousClass1Y5.A01(view);
        if (z || z2) {
            boolean A1a = C72453Mb.A1a(addGroupParticipantsSelector.A0T);
            TextEmojiLabel textEmojiLabel = r7.A03;
            if (A1a) {
                i = 2131888745;
            } else {
                i = 2131888746;
            }
            if (!z) {
                i = 2131896778;
            }
            textEmojiLabel.setText(i);
            r7.A02.setEnabled(false);
            textEmojiLabel.A0K();
            textEmojiLabel.setVisibility(0);
            C42141xh r2 = r7.A04;
            r2.A01.setTextColor(AnonymousClass3Ma.A00(addGroupParticipantsSelector, 2130970337, 2131101306));
            if (z) {
                view.setOnClickListener((View.OnClickListener) null);
                view.setClickable(false);
                view.setFocusable(true);
                return;
            }
            return;
        }
        r7.A03.A0L();
        C42141xh r22 = r7.A04;
        r22.A01.setTextColor(AnonymousClass3Ma.A00(addGroupParticipantsSelector, 2130970343, 2131101314));
    }

    public static final boolean A13(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        return C72453Mb.A1a(addGroupParticipantsSelector.A0T);
    }

    public static final boolean A14(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        if (!C72453Mb.A1a(addGroupParticipantsSelector.A0X) && !C72453Mb.A1a(addGroupParticipantsSelector.A0T)) {
            AnonymousClass00H r0 = addGroupParticipantsSelector.A0F;
            if (r0 != null) {
                C18030ve r1 = ((C84964Ln) r0.get()).A00;
                C18040vf r2 = C18040vf.A02;
                if (C18020vd.A05(r2, r1, 7809)) {
                    AnonymousClass00H r02 = addGroupParticipantsSelector.A0F;
                    if (r02 != null) {
                        if (C18020vd.A05(r2, ((C84964Ln) r02.get()).A00, 9015)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            C18070vi.A11("groupMemberSuggestionsExperimentUtils");
            throw null;
        }
        return false;
    }

    public void A2y() {
        if (!this.A0J) {
            this.A0J = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            C74803cp.A0t(A0K2, r2, r3, this, A0K2.A63);
            C74803cp.A0s(A0K2, r2, r3, this);
            this.A05 = AnonymousClass3Ma.A0d(r2);
            this.A0C = C000200d.A00(r2.A2L);
            this.A01 = (C56552he) r2.A45.get();
            this.A02 = AnonymousClass10E.A46(r2);
            this.A04 = (AnonymousClass4L6) r3.AAV.get();
            this.A0H = r3.A0B();
            this.A09 = AnonymousClass3MY.A0X(r2);
            this.A0D = C000200d.A00(r2.A4m);
            this.A0E = C000200d.A00(A0K2.A4A);
            this.A0F = C000200d.A00(A0K2.A4B);
            this.A06 = (AnonymousClass1MS) r2.A4s.get();
            this.A07 = AnonymousClass3MY.A0V(r2);
            this.A08 = AnonymousClass3MZ.A0q(r2);
            this.A0B = AnonymousClass3MY.A0e(r3);
            this.A0G = AnonymousClass3MX.A11(r2);
            this.A00 = (AnonymousClass4J8) A0K2.A25.get();
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A0G;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(AnonymousClass3MX.A0m(this.A0Q), 90);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void BsU(int i, String str) {
        AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A0Q);
        if (A0m != null) {
            AnonymousClass00H r0 = this.A0E;
            if (r0 != null) {
                ((AnonymousClass4SV) r0.get()).A01(this, A0m, str);
            } else {
                C18070vi.A11("groupInviteClickUtils");
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r2 != null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            X.0vl r3 = r8.A0Q
            java.lang.Object r1 = r3.getValue()
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            if (r1 == 0) goto L_0x0040
            X.1MS r0 = r8.A06
            if (r0 == 0) goto L_0x00c4
            X.2tp r1 = r0.A0A(r1)
            if (r1 == 0) goto L_0x0033
            X.0vl r0 = r8.A0U
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x00b5
            X.0vl r0 = r8.A0W
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x00b5
            X.10f r1 = r1.A0C()
        L_0x002b:
            X.C18070vi.A0b(r1)
            java.util.Set r0 = r8.A0L
            r0.addAll(r1)
        L_0x0033:
            X.00H r0 = r8.A0D
            if (r0 == 0) goto L_0x00c1
            X.1Uw r1 = X.AnonymousClass3MW.A0e(r0)
            X.3L6 r0 = r8.A0c
            r1.A00(r0)
        L_0x0040:
            X.01n r1 = r8.getSupportActionBar()
            if (r1 == 0) goto L_0x004d
            int r0 = r8.A4c()
            r1.A0M(r0)
        L_0x004d:
            r8.CRZ()
            com.whatsapp.wds.components.search.WDSSearchBar r2 = r8.A0H
            if (r2 == 0) goto L_0x0063
            com.whatsapp.wds.components.search.WDSSearchView r1 = r2.A08
            X.4CC r0 = X.AnonymousClass4CC.A00
            r1.setTrailingButtonIcon(r0)
            com.whatsapp.wds.components.search.WDSSearchView r1 = r2.A08
            r0 = 2131895490(0x7f1224c2, float:1.9425814E38)
            r1.setHint((int) r0)
        L_0x0063:
            X.1pm r2 = X.AnonymousClass3MZ.A0H(r8)
            r7 = 0
            com.whatsapp.contact.picker.AddGroupParticipantsSelector$onCreate$3 r1 = new com.whatsapp.contact.picker.AddGroupParticipantsSelector$onCreate$3
            r1.<init>(r8, r7)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Integer r6 = X.AnonymousClass3MW.A0w(r0, r1, r2)
            boolean r0 = A14(r8)
            if (r0 == 0) goto L_0x0094
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel r2 = r8.A0A
            if (r2 != 0) goto L_0x008d
            X.1It r1 = X.AnonymousClass3MW.A0N(r8)
            java.lang.Class<com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel> r0 = com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel.class
            X.1J2 r2 = r1.A00(r0)
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel r2 = (com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel) r2
            r8.A0A = r2
            if (r2 == 0) goto L_0x0094
        L_0x008d:
            r1 = 90
            java.util.Set r0 = r8.A0L
            r2.A0U(r0, r1)
        L_0x0094:
            X.0vl r0 = r8.A0b
            java.lang.Object r5 = r0.getValue()
            X.3U0 r5 = (X.AnonymousClass3U0) r5
            X.0vl r0 = r8.A0P
            int r4 = X.C72453Mb.A0I(r0)
            X.1EC r3 = X.AnonymousClass3MX.A0p(r3)
            X.1OX r2 = X.C41561wd.A00(r5)
            X.0wl r1 = r5.A09
            com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$maybeLogAddMemberPageOpened$1 r0 = new com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$maybeLogAddMemberPageOpened$1
            r0.<init>(r5, r3, r7, r4)
            X.C30451dy.A02(r6, r1, r0, r2)
            return
        L_0x00b5:
            java.util.Map r0 = r1.A08
            java.util.Set r0 = r0.keySet()
            X.10f r1 = X.C199410f.copyOf((java.util.Collection) r0)
            goto L_0x002b
        L_0x00c1:
            java.lang.String r0 = "groupDataObservers"
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r0 = "groupParticipantCache"
        L_0x00c6:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.AddGroupParticipantsSelector.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            AnonymousClass3MW.A0e(r0).A01(this.A0c);
        } else {
            C18070vi.A11("groupDataObservers");
            throw null;
        }
    }

    public AddGroupParticipantsSelector(int i) {
        this.A0J = false;
        C91004ez.A00(this, 19);
    }
}
