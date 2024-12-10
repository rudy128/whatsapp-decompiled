package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Button;
import android.widget.DatePicker;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.util.Calendar;
import org.json.JSONException;

/* renamed from: X.74z  reason: invalid class name and case insensitive filesystem */
public class C1412774z implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C1412774z(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1LU, java.lang.Object] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        Button button;
        Calendar calendar;
        int i2;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A02;
                AnonymousClass1E7 r1 = (AnonymousClass1E7) this.A03;
                if (((ContactFormBottomSheetFragment) this.A01).A08 == null) {
                    C18070vi.A11("contactFormContactOnWhatsAppController");
                    throw null;
                } else if (r1.A0H != null) {
                    context.startActivity(new Object().A1u(context, r1));
                    return;
                } else {
                    return;
                }
            case 1:
                C116665yQ r5 = (C116665yQ) this.A01;
                Context context2 = (Context) this.A02;
                C20271AEe aEe = (C20271AEe) this.A03;
                C010105w r0 = r5.A00;
                if (r0 != null) {
                    button = r0.A00.A0H;
                } else {
                    button = null;
                }
                int i3 = i;
                if (button != null) {
                    button.setEnabled(AnonymousClass000.A1S(i3, 3));
                }
                Calendar instance = Calendar.getInstance();
                C18070vi.A0X(instance);
                r5.A03 = instance;
                Calendar instance2 = Calendar.getInstance();
                C18070vi.A0X(instance2);
                r5.A02 = instance2;
                int i4 = 11;
                if (i != 0) {
                    if (i3 != 1) {
                        i4 = 5;
                        if (i3 == 2) {
                            calendar = r5.A03;
                            if (calendar == null) {
                                C18070vi.A11("reminderDateTime");
                                throw null;
                            }
                            i2 = 7;
                        } else if (i3 == 3) {
                            C1411374l r11 = new C1411374l(context2, r5, 0);
                            Calendar calendar2 = r5.A03;
                            if (calendar2 == null) {
                                C18070vi.A11("reminderDateTime");
                                throw null;
                            }
                            int i5 = calendar2.get(1);
                            Calendar calendar3 = r5.A03;
                            if (calendar3 == null) {
                                C18070vi.A11("reminderDateTime");
                                throw null;
                            }
                            int i6 = calendar3.get(2);
                            Calendar calendar4 = r5.A03;
                            if (calendar4 == null) {
                                C18070vi.A11("reminderDateTime");
                                throw null;
                            }
                            DatePickerDialog datePickerDialog = new DatePickerDialog(context2, r11, i5, i6, calendar4.get(5));
                            DatePicker datePicker = datePickerDialog.getDatePicker();
                            C18070vi.A0X(datePicker);
                            datePicker.setMinDate(Calendar.getInstance().getTimeInMillis());
                            String str = aEe.A00;
                            if (str != null) {
                                try {
                                    long j = C17880vN.A16(str).getLong("max_reminder_time_since_epoch_in_milliseconds");
                                    if (Long.valueOf(j) != null) {
                                        datePicker.setMaxDate(j);
                                    }
                                } catch (JSONException e) {
                                    Log.e("ReminderSetupAction: Unable to parse max timestamp out of params json", e);
                                }
                            }
                            datePickerDialog.show();
                            return;
                        } else if (i3 == 4) {
                            Calendar calendar5 = r5.A03;
                            if (calendar5 == null) {
                                C18070vi.A11("reminderDateTime");
                                throw null;
                            } else {
                                calendar5.add(13, 10);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        calendar = r5.A03;
                        if (calendar == null) {
                            C18070vi.A11("reminderDateTime");
                            throw null;
                        }
                        i2 = 24;
                    }
                    calendar.add(i4, i2);
                    return;
                }
                Calendar calendar6 = r5.A03;
                if (calendar6 == null) {
                    C18070vi.A11("reminderDateTime");
                    throw null;
                } else {
                    calendar6.add(11, 1);
                    return;
                }
            case 2:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A01;
                if (viewSharedContactArrayActivity.A01.A0D(viewSharedContactArrayActivity, AnonymousClass700.A00(viewSharedContactArrayActivity, (Bitmap) this.A03, (AnonymousClass73C) this.A02, true), 1)) {
                    ((C37721q1) viewSharedContactArrayActivity.A0M.get()).A06(true, 10);
                    return;
                }
                return;
            case 3:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = (ViewSharedContactArrayActivity) this.A01;
                if (viewSharedContactArrayActivity2.A01.A0D(viewSharedContactArrayActivity2, AnonymousClass700.A00(viewSharedContactArrayActivity2, (Bitmap) this.A03, (AnonymousClass73C) this.A02, false), 1)) {
                    ((C37721q1) viewSharedContactArrayActivity2.A0M.get()).A06(false, 10);
                    return;
                }
                return;
            default:
                WaInAppBrowsingActivity waInAppBrowsingActivity = (WaInAppBrowsingActivity) this.A01;
                Uri uri = (Uri) this.A02;
                C131856lm r12 = (C131856lm) this.A03;
                C131846ll r02 = waInAppBrowsingActivity.A09;
                if (r02 != null) {
                    r02.A00(waInAppBrowsingActivity, uri, r12);
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    waInAppBrowsingActivity.A01 = null;
                    return;
                }
                C18070vi.A11("appsStoreDeeplinkManager");
                throw null;
        }
    }
}
