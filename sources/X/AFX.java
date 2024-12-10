package X;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.whatsapp.WaEditText;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.payments.ui.BrazilAddPixFragment;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import com.whatsapp.polls.creator.PollCreatorViewModel;
import com.whatsapp.registration.RegisterName;
import java.util.List;

public class AFX implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public AFX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnFocusChangeListener(new AFX(obj, i));
    }

    public final void onFocusChange(View view, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String A0g;
        switch (this.A00) {
            case 0:
                if (!((EditText[]) this.A01)[0].hasFocus()) {
                    C25932Cow A0G = AnonymousClass1HF.A0G(view);
                    if (A0G != null) {
                        A0G.A00.A02(8);
                        return;
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) C19740yt.A06(view.getContext(), InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A01;
                if (z) {
                    C18100vl r0 = catalogSearchFragment.A0P;
                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r0.getValue();
                    AEW aew = catalogSearchFragment.A09;
                    String A1F = C108945cZ.A1F(((CatalogSearchViewModel) r0.getValue()).A00);
                    if (A1F == null) {
                        A1F = "";
                    }
                    catalogSearchViewModel.A0U(aew, A1F);
                    return;
                }
                return;
            case 2:
                C175218yL r2 = (C175218yL) this.A01;
                if (z) {
                    r2.A0M = AnonymousClass3MZ.A17(r2.A4c());
                    return;
                } else if (r2.A4h().length() > 0) {
                    String str5 = r2.A0M;
                    if (str5 == null) {
                        C18070vi.A11("tempNameText");
                        throw null;
                    } else if (!str5.equals(AnonymousClass3MZ.A17(r2.A4c()))) {
                        r2.A4r(6);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                C175218yL r22 = (C175218yL) this.A01;
                if (z) {
                    r22.A0L = AnonymousClass3MZ.A17(r22.A4b());
                    return;
                } else if (r22.A4g() != null) {
                    String str6 = r22.A0L;
                    if (str6 == null) {
                        C18070vi.A11("tempDescriptionText");
                        throw null;
                    } else if (!str6.equals(AnonymousClass3MZ.A17(r22.A4b()))) {
                        r22.A4r(11);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                BrazilAddPixFragment brazilAddPixFragment = (BrazilAddPixFragment) this.A01;
                if (!z) {
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = brazilAddPixFragment.A05;
                    if (brazilAddPixKeyViewModel != null) {
                        C194929sW r02 = (C194929sW) brazilAddPixKeyViewModel.A01.A06();
                        if (r02 != null) {
                            str = r02.A03;
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = brazilAddPixFragment.A05;
                            if (brazilAddPixKeyViewModel2 != null) {
                                BrazilAddPixKeyViewModel.A05(brazilAddPixKeyViewModel2, (String) null, brazilAddPixFragment.A0F, brazilAddPixFragment.A0A, 191);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C18070vi.A11("brazilAddPixKeyViewModel");
                    throw null;
                }
                return;
            case 5:
                BrazilAddPixFragment brazilAddPixFragment2 = (BrazilAddPixFragment) this.A01;
                if (!z) {
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel3 = brazilAddPixFragment2.A05;
                    if (brazilAddPixKeyViewModel3 != null) {
                        C194929sW r03 = (C194929sW) brazilAddPixKeyViewModel3.A01.A06();
                        if (r03 != null) {
                            str2 = r03.A01;
                        } else {
                            str2 = null;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel4 = brazilAddPixFragment2.A05;
                            if (brazilAddPixKeyViewModel4 != null) {
                                BrazilAddPixKeyViewModel.A05(brazilAddPixKeyViewModel4, (String) null, brazilAddPixFragment2.A0F, brazilAddPixFragment2.A0A, 192);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C18070vi.A11("brazilAddPixKeyViewModel");
                    throw null;
                }
                return;
            case 6:
                C166718dr r04 = (C166718dr) this.A01;
                if (z) {
                    AnonymousClass8G3 r1 = r04.A05;
                    BD4 bd4 = r1.A07;
                    String A0U = r1.A0U();
                    C20112A7u A02 = C20112A7u.A02();
                    A02.A07("product_flow", "p2m");
                    bd4.BiM(A02, 116, A0U, (String) null, 1);
                    return;
                }
                return;
            case 7:
                BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet = (BrazilPaymentMethodAddPixBottomSheet) this.A01;
                if (!z) {
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel5 = brazilPaymentMethodAddPixBottomSheet.A05;
                    if (brazilAddPixKeyViewModel5 != null) {
                        C194929sW r05 = (C194929sW) brazilAddPixKeyViewModel5.A01.A06();
                        if (r05 != null) {
                            str3 = r05.A03;
                        } else {
                            str3 = null;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel6 = brazilPaymentMethodAddPixBottomSheet.A05;
                            if (brazilAddPixKeyViewModel6 != null) {
                                BrazilAddPixKeyViewModel.A05(brazilAddPixKeyViewModel6, (String) null, brazilPaymentMethodAddPixBottomSheet.A0E, brazilPaymentMethodAddPixBottomSheet.A09, 191);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C18070vi.A11("brazilAddPixKeyViewModel");
                    throw null;
                }
                return;
            case 8:
                BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet2 = (BrazilPaymentMethodAddPixBottomSheet) this.A01;
                if (!z) {
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel7 = brazilPaymentMethodAddPixBottomSheet2.A05;
                    if (brazilAddPixKeyViewModel7 != null) {
                        C194929sW r06 = (C194929sW) brazilAddPixKeyViewModel7.A01.A06();
                        if (r06 != null) {
                            str4 = r06.A01;
                        } else {
                            str4 = null;
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel8 = brazilPaymentMethodAddPixBottomSheet2.A05;
                            if (brazilAddPixKeyViewModel8 != null) {
                                BrazilAddPixKeyViewModel.A05(brazilAddPixKeyViewModel8, (String) null, brazilPaymentMethodAddPixBottomSheet2.A0E, brazilPaymentMethodAddPixBottomSheet2.A09, 192);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C18070vi.A11("brazilAddPixKeyViewModel");
                    throw null;
                }
                return;
            case 9:
                IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) this.A01;
                if (z && !TextUtils.isEmpty(indiaUpiDisplaySecureQrCodeView.A0F.getText())) {
                    PaymentAmountInputField paymentAmountInputField = indiaUpiDisplaySecureQrCodeView.A0F;
                    paymentAmountInputField.setSelection(AnonymousClass3Ma.A03(paymentAmountInputField));
                    return;
                }
                return;
            case 10:
                View.OnFocusChangeListener onFocusChangeListener = ((AQ4) this.A01).A00;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                    return;
                }
                return;
            case 11:
                C1769296h r5 = (C1769296h) this.A01;
                List list = C42011xT.A0I;
                C18070vi.A0d(r5, 0);
                int i = 0;
                if (z) {
                    WaEditText waEditText = r5.A02;
                    Editable text = waEditText.getText();
                    if (text != null) {
                        i = text.length();
                    }
                    waEditText.setSelection(i);
                    if (r5.A05() != -1) {
                        int A05 = r5.A05() - 2;
                        PollCreatorViewModel pollCreatorViewModel = r5.A04;
                        if (pollCreatorViewModel.A0W(A05) && A05 != pollCreatorViewModel.A00) {
                            AnonymousClass3MX.A1K(pollCreatorViewModel.A04, AnonymousClass3MX.A01(pollCreatorViewModel.A0D));
                            pollCreatorViewModel.A00 = A05;
                            pollCreatorViewModel.A0B.A0E(C17880vN.A0p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                PollCreatorViewModel pollCreatorViewModel2 = r5.A04;
                pollCreatorViewModel2.A0T(false);
                if ((view instanceof WaEditText) && r5.A05() != -1) {
                    EditText editText = (EditText) view;
                    if (editText.getText() == null) {
                        A0g = "";
                    } else {
                        String A17 = AnonymousClass3MZ.A17(editText);
                        int length = A17.length() - 1;
                        int i2 = 0;
                        while (i2 <= length) {
                            int i3 = length;
                            if (i == 0) {
                                i3 = i2;
                            }
                            boolean A0u = C109005cf.A0u(A17, i3);
                            if (i == 0) {
                                if (!A0u) {
                                    i = 1;
                                } else {
                                    i2++;
                                }
                            } else if (A0u) {
                                length--;
                            } else {
                                A0g = C108985cd.A0g(length, i2, A17);
                            }
                        }
                        A0g = C108985cd.A0g(length, i2, A17);
                    }
                    int A052 = r5.A05() - 2;
                    if (A0g.length() > 0) {
                        pollCreatorViewModel2.A0X(A0g, A052);
                        return;
                    }
                    List list2 = pollCreatorViewModel2.A0D;
                    if (list2.size() > 2 && AnonymousClass3MX.A01(list2) != A052) {
                        list2.remove(A052);
                        PollCreatorViewModel.A03(pollCreatorViewModel2);
                        return;
                    }
                    return;
                }
                return;
            default:
                RegisterName registerName = (RegisterName) this.A01;
                if (z) {
                    throw AnonymousClass8BX.A0X(registerName);
                }
                return;
        }
    }
}
