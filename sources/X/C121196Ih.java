package X;

import android.os.SystemClock;
import android.text.Editable;
import android.util.Range;
import android.view.View;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.notification.PopupNotification;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Ih  reason: invalid class name and case insensitive filesystem */
public class C121196Ih extends C89564cf {
    public final int A00;
    public final Object A01;

    public static final Range A00(Editable editable, List list) {
        int i;
        List A0R = AnonymousClass1YF.A0R(editable, new char[]{' '});
        Object obj = null;
        if (!AnonymousClass000.A1a(A0R)) {
            return null;
        }
        String A0d = C108975cc.A0d(C17880vN.A0w(A0R, 0));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (A0d.equals(next)) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        return new Range(0, Integer.valueOf(i));
    }

    public C121196Ih(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        AnonymousClass6R4 r0;
        boolean z;
        Number number;
        Editable text;
        String obj;
        String A1H;
        Editable editable2 = editable;
        switch (this.A00) {
            case 0:
                if (editable != null) {
                    C111225jD r4 = ((AiImagineBottomSheet) this.A01).A0J;
                    if (r4 == null) {
                        AnonymousClass3MW.A1H();
                        throw null;
                    }
                    r4.A0Q.A0F(false);
                    boolean A1R = AnonymousClass000.A1R(editable2.length());
                    AnonymousClass3MY.A1L(r4.A0K, A1R);
                    boolean A18 = C18070vi.A18(editable2.toString(), r4.A06);
                    if (AnonymousClass3MW.A0X(r4.A0o).A02()) {
                        Range A002 = A00(editable2, C18070vi.A0M("me"));
                        C137196v4.A01(r4.A0L, A002);
                        if (A002 == null || ((number = (Number) A002.getUpper()) != null && number.intValue() == 0)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        AnonymousClass1DT r5 = r4.A0U;
                        Object A06 = r5.A06();
                        AnonymousClass6RH r1 = AnonymousClass6RH.IMAGINE_ME;
                        if (A06 != r1 && z) {
                            r4.A0O.A0F((Object) null);
                            r5.A0F(r1);
                            r4.A0T();
                            r4.A0D = true;
                            r4.A0Z.A01 = 2;
                            if (A18 && C18070vi.A18(r4.A0S.A06(), false)) {
                                C111225jD.A04(editable2, r4);
                            }
                        } else if (r5.A06() == r1 && !z) {
                            r4.A0O.A0F((Object) null);
                            r5.A0F(AnonymousClass6RH.INIT);
                            r4.A0T();
                            r4.A0D = false;
                            r4.A0Z.A01 = 1;
                        }
                    }
                    if (editable2.length() == 0) {
                        C111225jD.A07(r4);
                        r4.A0Z.A06(2, false);
                    }
                    C25781Pp r02 = r4.A0Z;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    List<C55902gY> list = (List) AnonymousClass000.A0w(r02.A07, 0);
                    if (list != null) {
                        for (C55902gY r10 : list) {
                            if (!r10.A06 || !r10.A01) {
                                r10.A01 = true;
                                r10.A00 = elapsedRealtime - r10.A05;
                            }
                        }
                    }
                    if (!A18) {
                        r4.A06 = null;
                    }
                    AnonymousClass1DT r52 = r4.A0U;
                    Object A062 = r52.A06();
                    if (((A062 == null || !(A062 == AnonymousClass6RH.INIT || A062 == AnonymousClass6RH.GENERATING_IMAGINE_FLASH)) && r52.A06() != AnonymousClass6RH.FLASH_ERROR_STATE) || !C18070vi.A18(r4.A0S.A06(), false) || (!r4.A0D && editable2.length() < 7)) {
                        Object A063 = r52.A06();
                        if (A063 != null && (A063 == AnonymousClass6RH.IMAGINE_EDIT_PREFIX_SELECTED || A063 == AnonymousClass6RH.IMAGINE_EDIT)) {
                            AnonymousClass1DT r2 = r4.A0J;
                            if (A1R) {
                                r0 = AnonymousClass6R4.SMALL_TO_MEDIUM;
                            } else {
                                if (r2.A06() != AnonymousClass6R4.LARGE_TO_SMALL) {
                                    r0 = AnonymousClass6R4.MEDIUM_TO_SMALL;
                                }
                                C137196v4.A01(r4.A0L, A00(editable2, r4.A07));
                            }
                            C137196v4.A01(r2, r0);
                            C137196v4.A01(r4.A0L, A00(editable2, r4.A07));
                        }
                    } else {
                        int A003 = r4.A0b.A00();
                        if (!A1R) {
                            r4.A0O.A0E((Object) null);
                            r4.A0V(AnonymousClass6RH.INIT);
                            return;
                        }
                        AnonymousClass6RH r6 = AnonymousClass6RH.GENERATING_IMAGINE_FLASH;
                        if (A18) {
                            r6 = AnonymousClass6RH.SELECTING_OPTION;
                            r4.A0V(r6);
                            r4.A0P.A0E(editable2);
                            r4.A09 = false;
                            r4.A0B = false;
                            r4.A0G.A0F(AnonymousClass000.A13());
                        } else {
                            r4.A0V(r6);
                        }
                        r4.A0a.A01(new AnonymousClass7D4(r6, r4, editable2.toString(), A003, false));
                    }
                    r4.A0S.A0E(false);
                    return;
                }
                return;
            case 1:
                if (editable != null) {
                    SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.A01;
                    String obj2 = editable2.toString();
                    WaEditText waEditText = searchFunStickersBottomSheet.A0A;
                    if (waEditText != null) {
                        if (obj2.length() > 0) {
                            A1H = "";
                        } else {
                            A1H = searchFunStickersBottomSheet.A1H(2131890542);
                        }
                        waEditText.setHint(A1H);
                    }
                    WaImageButton waImageButton = searchFunStickersBottomSheet.A0B;
                    if (waImageButton != null) {
                        int i = 0;
                        if (obj2 == null || obj2.length() == 0) {
                            i = 8;
                        }
                        waImageButton.setVisibility(i);
                    }
                    if (SearchFunStickersBottomSheet.A0C(obj2)) {
                        String str = searchFunStickersBottomSheet.A0S;
                        if (str != null) {
                            String str2 = null;
                            String A0I = AnonymousClass1YF.A0I(str);
                            WaEditText waEditText2 = searchFunStickersBottomSheet.A0A;
                            if (!(waEditText2 == null || (text = waEditText2.getText()) == null || (obj = text.toString()) == null)) {
                                str2 = AnonymousClass1YF.A0I(obj);
                            }
                            if (C18070vi.A18(A0I, str2)) {
                                return;
                            }
                        }
                        SearchFunStickersBottomSheet.A0A(searchFunStickersBottomSheet, true);
                        return;
                    }
                    C108955ca.A0Q(searchFunStickersBottomSheet).A0U(false);
                    return;
                }
                return;
            case 6:
                PopupNotification popupNotification = (PopupNotification) this.A01;
                C62332rE.A00(popupNotification.A0v, true);
                String obj3 = editable2.toString();
                AnonymousClass1E7 r12 = popupNotification.A0i;
                if (r12 != null) {
                    int length = obj3.length();
                    C33251iW r22 = popupNotification.A0H;
                    AnonymousClass1BI A004 = AnonymousClass1E7.A00(r12);
                    if (length != 0) {
                        r22.A0Q(A004, 0);
                    } else {
                        r22.A0P(A004);
                    }
                }
                C18030ve r53 = popupNotification.A0E;
                AnonymousClass1KW r42 = popupNotification.A0D;
                AnonymousClass11C r3 = popupNotification.A08;
                AnonymousClass11C r17 = r3;
                C26302CxJ.A0L(popupNotification, editable2, popupNotification.A0V.getPaint(), r17, r42, r53, popupNotification.A0u, AnonymousClass1YL.A00(popupNotification, 2130970892, 2131102330), AnonymousClass1YL.A00(popupNotification, 2130970132, 2131101250), true);
                popupNotification.A0Z.A0X(AnonymousClass1EG.A0H(obj3));
                return;
            default:
                super.afterTextChanged(editable2);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.A00) {
            case 2:
                ExpressionsSearchView expressionsSearchView = (ExpressionsSearchView) this.A01;
                C108965cb.A0N(expressionsSearchView).A0U(String.valueOf(charSequence), expressionsSearchView.A0S);
                expressionsSearchView.A0S = false;
                return;
            case 3:
                C18070vi.A0d(charSequence, 0);
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A01;
                gifSearchContainer.A0M = charSequence;
                WaEditText waEditText = gifSearchContainer.A06;
                if (waEditText != null) {
                    waEditText.removeCallbacks(gifSearchContainer.A0Q);
                }
                WaEditText waEditText2 = gifSearchContainer.A06;
                if (waEditText2 != null) {
                    waEditText2.postDelayed(gifSearchContainer.A0Q, 500);
                }
                View view = gifSearchContainer.A01;
                if (view != null) {
                    int i4 = 0;
                    if (charSequence.length() == 0) {
                        i4 = 4;
                    }
                    view.setVisibility(i4);
                    return;
                }
                return;
            case 4:
            case 5:
                C136916uc r4 = ((ContactUsActivity) this.A01).A0F;
                ContactUsActivity contactUsActivity = r4.A00;
                C17960vV.A07(contactUsActivity);
                boolean A1R = AnonymousClass000.A1R(charSequence.length());
                int i5 = 2131429469;
                if (C18020vd.A05(C18040vf.A02, contactUsActivity.A0E, 7044)) {
                    i5 = 2131434781;
                }
                contactUsActivity.findViewById(i5).setEnabled(A1R);
                if (C108985cd.A0h(r4.A00.A00).length() >= 10) {
                    ContactUsActivity contactUsActivity2 = r4.A00;
                    if (contactUsActivity2.A01.getVisibility() == 0) {
                        contactUsActivity2.A00.setBackgroundDrawable(C24261Jm.A00(contactUsActivity2, 2131231322));
                        contactUsActivity2.A01.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
    }
}
