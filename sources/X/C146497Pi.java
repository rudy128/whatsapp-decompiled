package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.conversation.ConversationEntryActionButton;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Pi  reason: invalid class name and case insensitive filesystem */
public class C146497Pi implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C146497Pi(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v85, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v18, types: [X.1LU, java.lang.Object] */
    public final void run() {
        AnonymousClass1E7 r3;
        View view;
        Intent A06;
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                ((ContactPickerFragment) this.A01).A2S((Bundle) this.A02);
                return;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                contactPickerFragment.A1z.A02((C33281iZ) this.A02);
                contactPickerFragment.A2F();
                return;
            case 2:
                ContactPickerFragment contactPickerFragment2 = (ContactPickerFragment) this.A01;
                C188829i3 r6 = (C188829i3) this.A02;
                C37511pf r4 = contactPickerFragment2.A0h;
                UserJid userJid = r6.A0D;
                if (userJid == null || TextUtils.isEmpty(contactPickerFragment2.A2u) || TextUtils.isEmpty(contactPickerFragment2.A31)) {
                    str = "click_to_chat_link";
                } else {
                    str = "ctwa";
                }
                r4.A01(new C61532pq(userJid, str, (String) null));
                int A002 = ((C60122nQ) contactPickerFragment2.A2s.get()).A00(r6.A0D);
                if (A002 == 1 || A002 == 2) {
                    ((C132176mK) contactPickerFragment2.A23.get()).A00(2, 4, A002);
                    return;
                }
                return;
            case 3:
                AnonymousClass7E0 r2 = (AnonymousClass7E0) this.A01;
                AnonymousClass7E0.A01(r2, new C133356oc(((ContactPickerFragment) r2.A01).A0f.A0H((AnonymousClass1BI) this.A02)));
                return;
            case 4:
                AnonymousClass7E0 r22 = (AnonymousClass7E0) this.A01;
                AnonymousClass7E0.A01(r22, new C133356oc(((ContactPickerFragment) r22.A01).A0f.A0H((AnonymousClass1BI) this.A02)));
                return;
            case 5:
                AnonymousClass7E0 r23 = (AnonymousClass7E0) this.A01;
                AnonymousClass7E0.A01(r23, new C133356oc(((ContactPickerFragment) r23.A01).A0f.A0H((AnonymousClass1BI) this.A02)));
                return;
            case 6:
                C133266oT r32 = (C133266oT) this.A01;
                List<AnonymousClass205> list = (List) this.A02;
                AnonymousClass1W2 r24 = r32.A0G.A01;
                AnonymousClass206 A05 = r24.A05((AnonymousClass205) C108955ca.A0p(list));
                boolean z = false;
                if (A05 != null && ((r32.A00 || (!(A05 instanceof C438421d) && !(A05 instanceof AnonymousClass21Y) && !(A05 instanceof C440021t))) && r32.A0O)) {
                    z = true;
                }
                r32.A02 = z;
                if (r32.A0N || z) {
                    C108965cb.A19(r32.A09, r32, 11);
                }
                for (AnonymousClass205 A052 : list) {
                    AnonymousClass206 A053 = r24.A05(A052);
                    if (A053 != null && (((A053 instanceof C438421d) || (A053 instanceof AnonymousClass21Y) || (A053 instanceof C440021t)) && (!r32.A00 || r32.A0M || AnonymousClass9RY.A00(A053) != null))) {
                        r32.A0I.A0E(A053);
                    }
                }
                return;
            case 7:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A01;
                AnonymousClass25N r42 = (AnonymousClass25N) this.A02;
                r42.A02 = PhoneContactsSelector.A0z(phoneContactsSelector.A05, phoneContactsSelector.A07, phoneContactsSelector.A09, r42, phoneContactsSelector.A08, phoneContactsSelector.A0L, phoneContactsSelector.A0N);
                return;
            case 8:
                C113675nX r8 = (C113675nX) this.A01;
                List<AnonymousClass6UQ> list2 = (List) this.A02;
                for (AnonymousClass6UQ r25 : list2) {
                    C42011xT r7 = r25.A04;
                    int i3 = r25.A00;
                    int i4 = r25.A01;
                    int i5 = r25.A02;
                    int i6 = r25.A03;
                    View view2 = r7.A0H;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        AnonymousClass1HF.A0B(view2).A06(0.0f);
                    }
                    if (i8 != 0) {
                        AnonymousClass1HF.A0B(view2).A07(0.0f);
                    }
                    AnonymousClass1HC A0B = AnonymousClass1HF.A0B(view2);
                    r8.A05.add(r7);
                    A0B.A08(r8.A0A());
                    A0B.A0B(new C116615yJ(A0B, r7, r8, i7, i8));
                    A0B.A02();
                }
                list2.clear();
                r8.A06.remove(list2);
                return;
            case 9:
                C113675nX r62 = (C113675nX) this.A01;
                List<C123346Ub> list3 = (List) this.A02;
                for (C123346Ub r43 : list3) {
                    C42011xT r0 = r43.A05;
                    View view3 = null;
                    if (r0 == null) {
                        view = null;
                    } else {
                        view = r0.A0H;
                    }
                    C42011xT r02 = r43.A04;
                    if (r02 != null) {
                        view3 = r02.A0H;
                    }
                    if (view != null) {
                        AnonymousClass1HC A0B2 = AnonymousClass1HF.A0B(view);
                        A0B2.A08(r62.A09());
                        r62.A03.add(r43.A05);
                        A0B2.A06((float) (r43.A02 - r43.A00));
                        A0B2.A07((float) (r43.A03 - r43.A01));
                        A0B2.A03(0.0f);
                        A0B2.A0B(new C116595yH(r43, A0B2, r62, 2));
                        A0B2.A02();
                    }
                    if (view3 != null) {
                        AnonymousClass1HC A0B3 = AnonymousClass1HF.A0B(view3);
                        r62.A03.add(r43.A04);
                        A0B3.A06(0.0f);
                        A0B3.A07(0.0f);
                        A0B3.A08(r62.A09());
                        A0B3.A03(1.0f);
                        A0B3.A0B(new C116605yI(view3, A0B3, r43, r62));
                        A0B3.A02();
                    }
                }
                list3.clear();
                r62.A04.remove(list3);
                return;
            case 10:
                C113675nX r63 = (C113675nX) this.A01;
                List<C42011xT> list4 = (List) this.A02;
                for (C42011xT r33 : list4) {
                    AnonymousClass1HC A0B4 = AnonymousClass1HF.A0B(r33.A0H);
                    r63.A01.add(r33);
                    A0B4.A04(1.0f);
                    A0B4.A05(1.0f);
                    A0B4.A08(r63.A00);
                    A0B4.A0B(new C116595yH(A0B4, r33, r63, 1));
                    A0B4.A02();
                }
                list4.clear();
                r63.A02.remove(list4);
                return;
            case 11:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A01;
                AnonymousClass4UI r26 = (AnonymousClass4UI) this.A02;
                sharedTextPreviewDialogFragment.A1B().getWindow().setSoftInputMode(1);
                if (r26.A01()) {
                    InputMethodManager A0N = sharedTextPreviewDialogFragment.A08.A0N();
                    if (A0N != null) {
                        A0N.hideSoftInputFromWindow(sharedTextPreviewDialogFragment.A0D.getWindowToken(), 0);
                    }
                    r26.A00(true);
                }
                int selectionStart = sharedTextPreviewDialogFragment.A0D.getSelectionStart();
                int selectionEnd = sharedTextPreviewDialogFragment.A0D.getSelectionEnd();
                MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A0D;
                mentionableEntry.setText(mentionableEntry.getStringText());
                sharedTextPreviewDialogFragment.A0D.setSelection(selectionStart, selectionEnd);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                sharedTextPreviewDialogFragment.A0D.getLocationOnScreen(iArr);
                sharedTextPreviewDialogFragment.A03.getLocationOnScreen(iArr2);
                MentionableEntry mentionableEntry2 = sharedTextPreviewDialogFragment.A0D;
                int i9 = iArr[0];
                mentionableEntry2.A00 = new Rect(i9, iArr[1], mentionableEntry2.getWidth() + i9, iArr2[1]);
                return;
            case 12:
                ((ContactPickerFragment) this.A01).A2Q(((C28931bI) this.A02).A02().getHeight(), 0);
                return;
            case 13:
                C36261nb r34 = (C36261nb) this.A01;
                C23838Bqv bqv = (C23838Bqv) this.A02;
                C18070vi.A0d(bqv, 1);
                Integer A003 = AnonymousClass2T4.A00(r34.A01, r34.A02);
                if (A003 != null) {
                    bqv.A05 = C17890vO.A0N(A003);
                }
                ArrayList A13 = AnonymousClass000.A13();
                r34.A00.A0m(A13);
                bqv.A06 = C17880vN.A0n(A13.size());
                r34.A03.CC7(bqv);
                return;
            case 14:
                ((C34351kL) this.A01).A0H.A01((UserJid) this.A02);
                return;
            case 15:
                C34351kL r5 = (C34351kL) this.A01;
                AnonymousClass1BI r44 = (AnonymousClass1BI) this.A02;
                r5.A0N.A08(r44, 2, 0);
                ((C35751mk) r5.A0R.get()).A00(r44);
                return;
            case 16:
                ((C34351kL) this.A01).A0N.A0B((AnonymousClass1BI) this.A02);
                return;
            case 17:
                C62592re r27 = (C62592re) this.A02;
                C18070vi.A0d(r27, 1);
                AnonymousClass12E.A00(((C34351kL) this.A01).A0C, r27, true);
                return;
            case 18:
                AnonymousClass37P r45 = (AnonymousClass37P) this.A01;
                Object obj = this.A02;
                r45.A01.A0P(C18070vi.A0P(obj), false, false);
                r45.A00.A0J(new C146497Pi(obj, r45, 19));
                return;
            case 19:
                AnonymousClass37P r03 = (AnonymousClass37P) this.A02;
                Jid A012 = AnonymousClass1E7.A01((AnonymousClass1E7) this.A01);
                if (A012 != null) {
                    AnonymousClass35V.A00(r03.A02, A012, 16);
                    return;
                }
                return;
            case 20:
                List list5 = (List) this.A02;
                C18070vi.A0d(list5, 1);
                ((C26961Ue) this.A01).A00.A0W(list5, 0);
                return;
            case 21:
                AnonymousClass1US.A03((AnonymousClass1US) this.A01, (C62592re) this.A02);
                return;
            case 22:
                C62602rf r1 = (C62602rf) this.A02;
                C17880vN.A0V(((AnonymousClass1US) this.A01).A0T).notifyAllObservers(new AnonymousClass35W((Collection) r1.A01, 2, r1.A01()));
                return;
            case 23:
                C28751aq r12 = (C28751aq) this.A01;
                AnonymousClass1E2 r64 = (AnonymousClass1E2) ((UserJid) this.A02);
                r12.A07.A07(r64);
                PhoneUserJid A0D = r12.A06.A0D(r64);
                C26811To r35 = (C26811To) r12.A0D.get();
                C29691ci A0A = r35.A0O.A0A(r64);
                if (A0A != null && C49502Qs.USERNAME.equals(A0A.A0b)) {
                    r35.A0G();
                }
                C116355x8 r13 = (C116355x8) ((C58862lN) r35.A0a.get()).A00("pnForLidChat");
                if (r13 != null) {
                    if (A0D != null) {
                        C18070vi.A0d(r64, 0);
                        r35.A0N(Collections.singleton(new C116975yw((C19999A2n) null, r64, A0D, (String) null, AnonymousClass11P.A01(r13.A00))));
                    } else {
                        return;
                    }
                } else if (A0D == null) {
                    return;
                }
                r35.A0P(Collections.singletonList(new AnonymousClass1E7(A0D)), true, false);
                return;
            case 24:
                CommentsBottomSheet commentsBottomSheet = (CommentsBottomSheet) this.A01;
                String stringText = ((MentionableEntry) this.A02).getStringText();
                C18070vi.A0X(stringText);
                ((AnonymousClass3VA) commentsBottomSheet.A0W.getValue()).A0T(stringText);
                Context A14 = commentsBottomSheet.A14();
                AnonymousClass11C r14 = commentsBottomSheet.A07;
                if (r14 != null) {
                    AnonymousClass1Y5.A00(A14, r14, commentsBottomSheet.A1H(2131888477));
                    return;
                } else {
                    AnonymousClass3MW.A1N();
                    throw null;
                }
            case 25:
                C77833rZ r28 = (C77833rZ) this.A01;
                r28.A01 = true;
                C77833rZ.A04((Menu) this.A02, r28);
                return;
            case 26:
                C77833rZ r46 = (C77833rZ) this.A01;
                Object obj2 = this.A02;
                AEW A08 = r46.A07.A08(AnonymousClass3MZ.A0x(r46.A00));
                if (A08 != null && A08.A0W && (A08.A01 & 1) == 0) {
                    r46.A04.A0J(new C146497Pi(r46, obj2, 25));
                    return;
                }
                return;
            case 27:
                ((A5M) ((AnonymousClass3rW) this.A01).A0I.get()).A03((AnonymousClass1BI) this.A02, (Integer) null, (String) null, (String) null, 0, 15, true, false);
                return;
            case 28:
                C115095tO r15 = (C115095tO) this.A01;
                Object obj3 = this.A02;
                r15.A0c.get();
                AnonymousClass01E r47 = r15.A06;
                AnonymousClass1BI r04 = r15.A0S;
                C18070vi.A0n(r47, r04, obj3);
                AiImagineBottomSheet aiImagineBottomSheet = new AiImagineBottomSheet();
                aiImagineBottomSheet.A0R = r04;
                r47.getSupportFragmentManager().A0t(new AnonymousClass7A8(obj3, 0), r47, "IMAGINE_BOTTOM_SHEET_REQUEST_KEY");
                C20098A7b.A01(aiImagineBottomSheet, r47.getSupportFragmentManager());
                return;
            case 29:
                ConversationEntryActionButton conversationEntryActionButton = (ConversationEntryActionButton) this.A01;
                AnonymousClass3V4 r36 = (AnonymousClass3V4) this.A02;
                int i10 = conversationEntryActionButton.A00;
                if (i10 <= 0 || System.currentTimeMillis() - conversationEntryActionButton.A01 >= ((long) i10)) {
                    AnonymousClass4VJ r05 = r36.A01;
                    int i11 = r05.A00;
                    if (i11 != 0) {
                        C88134Yl r06 = (C88134Yl) r36.A05.A06();
                        if (i11 != 1) {
                            r36.A0Y(!r06.A08);
                            return;
                        }
                        r36.A0U(AnonymousClass000.A1P(r06.A00) ? 1 : 0);
                        AnonymousClass4a5.A01(conversationEntryActionButton, conversationEntryActionButton.A05);
                        return;
                    } else if (r05.A0G) {
                        r36.A0V(0);
                        AnonymousClass4a5.A02(conversationEntryActionButton, conversationEntryActionButton.A05);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 30:
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.A02;
                C18070vi.A0d(onGlobalLayoutListener, 1);
                AnonymousClass3MY.A1D((View) this.A01, onGlobalLayoutListener);
                return;
            case 31:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                AnonymousClass1BI r48 = (AnonymousClass1BI) this.A02;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    if (childAt instanceof AnonymousClass3uP) {
                        ((AnonymousClass3uP) childAt).A2I(r48);
                    }
                }
                return;
            case 32:
                C32791hl r07 = (C32791hl) this.A01;
                AnonymousClass1Nb r65 = r07.A01;
                long A013 = AnonymousClass11P.A01(r07.A00);
                C42551yM A0a = r65.A0a((AnonymousClass1BI) this.A02);
                if (A0a.A05 != A013) {
                    A0a.A05 = A013;
                    AnonymousClass1Nb.A07(A0a, r65);
                    return;
                }
                return;
            case 33:
                HashSet A004 = ((C77843ra) this.A01).A08.A00((Collection) this.A02, true);
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A14("groupconversationmenu/maybeprefetchvoicechat prefetch e2ee sessions for group call, ", A10, A004);
                C17890vO.A1B(A10, " session missing");
                return;
            case 34:
                C77803rV r52 = (C77803rV) this.A01;
                Object obj4 = this.A02;
                AnonymousClass1EC A054 = r52.A06.A05(r52.A0F);
                if (A054 != null) {
                    r3 = r52.A08.A0E(A054);
                } else {
                    r3 = null;
                }
                r52.A0W.CGP(new C70773Cl(r52, r3, obj4, 20));
                return;
            case 35:
                ((C77943rr) this.A01).A03.A01((AnonymousClass1FL) this.A02, "events");
                return;
            case 36:
                C32951i1 r66 = (C32951i1) this.A01;
                r66.A09();
                Iterator it = ((Collection) this.A02).iterator();
                while (it.hasNext()) {
                    AnonymousClass1E7 A0O = C17880vN.A0O(it);
                    SharedPreferences A005 = C32951i1.A00(r66);
                    String A03 = AnonymousClass72V.A03(A0O.A0J.getRawString());
                    C123356Uc A006 = AnonymousClass72V.A00(A005, A03);
                    A006.A02 = Boolean.valueOf(A0O.A0B());
                    C17880vN.A1E(A005.edit(), A03, A006.toString());
                }
                return;
            case 37:
                C32951i1 r67 = (C32951i1) this.A01;
                AnonymousClass206 r16 = (AnonymousClass206) this.A02;
                synchronized (r67) {
                    SharedPreferences A007 = C32951i1.A00(r67);
                    long A014 = r67.A0O.A01();
                    AnonymousClass1BI r37 = r16.A0v.A00;
                    if (r16.A0I >= A014 && r37 != null) {
                        String rawString = r37.getRawString();
                        C18070vi.A0d(rawString, 0);
                        AnonymousClass2S9 A008 = C60332nq.A00(A007.getString(rawString, C60332nq.A01()));
                        A008.A00(AnonymousClass2R2.A1H);
                        C32951i1.A02(A007, A008, rawString);
                    }
                }
                r67.A09();
                return;
            case 38:
                C32951i1 r68 = (C32951i1) this.A01;
                r68.A09();
                SharedPreferences A009 = C32951i1.A00(r68);
                for (AnonymousClass1E9 r82 : (Set) this.A02) {
                    String rawString2 = r82.getRawString();
                    StringBuilder A0K = C18070vi.A0K(rawString2);
                    A0K.append(rawString2);
                    String A0y = AnonymousClass000.A0y("_group", A0K);
                    C19810z2<AnonymousClass6RI> r08 = AnonymousClass6RI.A00;
                    ArrayList A0D2 = C29351c6.A0D(r08);
                    for (AnonymousClass6RI r09 : r08) {
                        A0D2.add(r09.defaultValue);
                    }
                    String string = A009.getString(A0y, C29431cG.A0g(",", "", "", A0D2, (C22821Di) null));
                    C18070vi.A0d(string, 0);
                    C63782tg.A05(C108955ca.A1b(AnonymousClass1YF.A0S(string, C17880vN.A1a(",", 0), 0)), AnonymousClass6RI.A02.ordinal());
                    C17880vN.A1E(A009.edit(), A0y, C29431cG.A0g(",", "", "", C18070vi.A0M(C17880vN.A0n(((AnonymousClass1MW) r68.A0c.get()).A09(r82))), (C22821Di) null));
                }
                return;
            case 39:
                C32951i1 r38 = (C32951i1) this.A01;
                AnonymousClass1BI r29 = (AnonymousClass1BI) this.A02;
                r38.A09();
                AnonymousClass1M9 r17 = r38.A05;
                AnonymousClass1E7 A0E = r17.A0E(r29);
                if (A0E == null) {
                    return;
                }
                if (!A0E.A0F() || (A0E = r17.A0E(A0E.A0K)) != null) {
                    SharedPreferences A0010 = C32951i1.A00(r38);
                    String A032 = AnonymousClass72V.A03(r29.getRawString());
                    C123356Uc A0011 = AnonymousClass72V.A00(A0010, A032);
                    A0011.A03 = Boolean.valueOf(A0E.A0B());
                    C17880vN.A1E(A0010.edit(), A032, A0011.toString());
                    return;
                }
                return;
            case 40:
                C32951i1 r18 = (C32951i1) this.A01;
                r18.A09();
                SharedPreferences A0012 = C32951i1.A00(r18);
                String A033 = AnonymousClass72V.A03(((Jid) this.A02).getRawString());
                C123356Uc A0013 = AnonymousClass72V.A00(A0012, A033);
                A0013.A01 = AnonymousClass000.A0i();
                C17880vN.A1E(A0012.edit(), A033, A0013.toString());
                return;
            case 41:
                try {
                    InetAddress.getByName(new URL(((C61762qD) this.A02).A01).getHost());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 42:
                AnonymousClass206 r210 = (AnonymousClass206) this.A02;
                C18070vi.A0d(r210, 0);
                C1407672y.A02((C1407672y) ((AnonymousClass3uP) this.A01).A2I.get(), r210, (Integer) null, (Integer) null, (Long) null, (String) null, (String) null, 17, 4);
                return;
            case 43:
                AnonymousClass3uP r39 = (AnonymousClass3uP) this.A01;
                AnonymousClass206 r211 = (AnonymousClass206) this.A02;
                if (!((C86224Qu) r39.A2U.get()).A00(r211.A0v.A00)) {
                    ((A5M) r39.A1c.get()).A05((Integer) null, Collections.singletonList(r211), 6);
                    return;
                }
                return;
            case 44:
                View view4 = (View) this.A01;
                AnonymousClass206 r49 = (AnonymousClass206) this.A02;
                AnonymousClass1FU r310 = (AnonymousClass1FU) C88404Zo.A03(view4.getContext(), AnonymousClass1FU.class);
                if (r310 != null) {
                    if (r49 == null) {
                        i = 2131897371;
                        i2 = 2131897370;
                    } else if (AnonymousClass25A.A0p(r49)) {
                        i = 2131897375;
                        i2 = 2131897374;
                    }
                    r310.A40(i, Integer.valueOf(i2), (Integer) null, (Object[]) null);
                    return;
                }
                C108885cS r010 = (C108885cS) C88404Zo.A03(view4.getContext(), C108885cS.class);
                if (r010 != null) {
                    r010.CH3(r49);
                    return;
                }
                return;
            case 45:
                AnonymousClass3uP.A0g((AnonymousClass3uP) this.A01, (AnonymousClass206) this.A02);
                return;
            case 46:
                AnonymousClass3uP r53 = (AnonymousClass3uP) this.A01;
                C691936g A0014 = AnonymousClass2UY.A00((AnonymousClass206) this.A02);
                if (A0014 != null) {
                    UserJid userJid2 = A0014.A01;
                    if (C18020vd.A05(C18040vf.A02, r53.A0F, 5431)) {
                        A06 = new Object().A1w(r53.getContext(), userJid2, 10);
                        A06.putExtra("entry_point_conversion_source", "forwarded_biz_msg");
                        A06.putExtra("entry_point_conversion_app", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME);
                    } else {
                        A06 = AnonymousClass3MY.A06(r53.getContext(), new Object(), userJid2);
                    }
                    r53.A0Q.A09(r53.getContext(), A06);
                    return;
                }
                return;
            case 47:
                AnonymousClass3uP r311 = (AnonymousClass3uP) this.A01;
                r311.A2A(r311.A08.findViewById(2131434306), (AnonymousClass22Q) ((AnonymousClass206) this.A02), true);
                return;
            case 48:
                ((Context) this.A01).startActivity((Intent) this.A02);
                return;
            default:
                C108885cS r212 = (C108885cS) this.A02;
                View view5 = ((AnonymousClass3tC) this.A01).A00;
                if (view5 != null) {
                    r212.scrollBy(view5.getHeight(), 0);
                    return;
                }
                return;
        }
    }
}
