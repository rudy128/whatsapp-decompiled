package X;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.MenuItem;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Pr  reason: invalid class name and case insensitive filesystem */
public class C49232Pr extends A34 {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass11C A01;
    public final C18030ve A02;
    public final WeakReference A03;
    public final C219217x A04;
    public final /* synthetic */ PhoneContactsSelector A05;

    public C49232Pr(AnonymousClass1M9 r2, PhoneContactsSelector phoneContactsSelector, PhoneContactsSelector phoneContactsSelector2, AnonymousClass11C r5, C219217x r6, C18030ve r7) {
        this.A05 = phoneContactsSelector;
        this.A01 = r5;
        this.A04 = r6;
        this.A03 = new WeakReference(phoneContactsSelector2);
        this.A00 = r2;
        this.A02 = r7;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C53142c3 r14 = (C53142c3) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A03.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.Bed()) {
            phoneContactsSelector.A0H = null;
            List<AnonymousClass25N> list = phoneContactsSelector.A0h;
            list.removeAll(r14.A00);
            phoneContactsSelector.A0e.notifyDataSetChanged();
            ArrayList arrayList = phoneContactsSelector.A0g;
            arrayList.clear();
            arrayList.addAll(r14.A01);
            for (AnonymousClass25N r7 : list) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass25N r5 = (AnonymousClass25N) it.next();
                    if (r5.A04 == r7.A04) {
                        r5.A03 = true;
                    }
                }
            }
            if (list.isEmpty()) {
                PhoneContactsSelector.A11(phoneContactsSelector);
            }
            PhoneContactsSelector.A12(phoneContactsSelector, list.size());
            MenuItem menuItem = phoneContactsSelector.A00;
            if (menuItem != null) {
                menuItem.setVisible(C17880vN.A1X(arrayList));
            }
            phoneContactsSelector.A4c();
        }
    }

    private HashSet A00() {
        Cursor A032;
        C17960vV.A01();
        AnonymousClass11C r2 = this.A01;
        C219217x r1 = this.A04;
        HashMap A11 = C17880vN.A11();
        if (r1.A02("android.permission.READ_CONTACTS") != 0) {
            Log.w("returning empty name map because contact permissions are denied");
        } else {
            Cursor A033 = r2.A0O().A03(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "mimetype", "data2"}, "mimetype IN (?)", new String[]{"vnd.android.cursor.item/name"}, (String) null);
            if (A033 == null) {
                try {
                    Log.e("null cursor returned from structured name query");
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            } else {
                int columnIndex = A033.getColumnIndex("contact_id");
                if (columnIndex == -1) {
                    Log.e("invalid column index for the raw contact id");
                } else {
                    int columnIndex2 = A033.getColumnIndex("mimetype");
                    if (columnIndex2 == -1) {
                        Log.e("invalid column index for the mimetype");
                    } else {
                        int columnIndex3 = A033.getColumnIndex("data2");
                        if (columnIndex3 == -1) {
                            Log.e("invalid column index for the given name");
                        } else {
                            while (A033.moveToNext()) {
                                if (A033.isNull(columnIndex)) {
                                    Log.e("null raw contact id for record; skipping");
                                } else if (A033.isNull(columnIndex2)) {
                                    Log.e("null mimetype for record; skipping");
                                } else {
                                    Long A0M = C17890vO.A0M(A033, columnIndex);
                                    if (((String) A11.get(A0M)) == null) {
                                        String string = A033.getString(columnIndex2);
                                        if (string == null) {
                                            Log.e("mimetype was returned as null even though cursor said it wasn't null; skipping");
                                        } else if (string.equals("vnd.android.cursor.item/name")) {
                                            A11.put(A0M, A033.getString(columnIndex3));
                                        } else {
                                            C17900vP.A0e("unrecognized mimetype; skipping; mimetype=", string, AnonymousClass000.A10());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                A033.close();
            }
        }
        HashSet A12 = C17880vN.A12();
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "_id";
        A1Z[1] = "display_name";
        AnonymousClass11B A0O = r2.A0O();
        if (A0O == null) {
            Log.w("phone-contacts-selector/contact cr=null");
            return null;
        }
        try {
            A032 = A0O.A03(C17890vO.A0C(ContactsContract.Contacts.CONTENT_URI.buildUpon(), "directory", String.valueOf(0)), A1Z, (String) null, (String[]) null, (String) null);
            if (A032 == null) {
                Log.e("phone-contacts-selector/contact cursor was null");
                return null;
            }
            while (A032.moveToNext()) {
                long j = A032.getLong(0);
                String string2 = A032.getString(1);
                String str = (String) A11.get(Long.valueOf(j));
                if (!TextUtils.isEmpty(string2)) {
                    A12.add(new AnonymousClass25N(string2, j, str));
                }
            }
            A032.close();
            return A12;
        } catch (Exception e) {
            Log.e("phone-contacts-selector/contact exception", e);
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Cursor A032;
        Cursor A033;
        HashSet A12 = C17880vN.A12();
        PhoneContactsSelector phoneContactsSelector = this.A05;
        if (((C30191dX) phoneContactsSelector.A0Q.get()).A00() && A00() != null) {
            A12.addAll(A00());
        }
        if (C18020vd.A05(C18040vf.A02, this.A02, 5868)) {
            AnonymousClass1M2 r7 = this.A00.A04;
            AnonymousClass1Ez r6 = new AnonymousClass1Ez(true);
            r6.A04();
            ArrayList A13 = AnonymousClass000.A13();
            int i = 0;
            try {
                C28781at A002 = C24801Ls.A00(r7);
                try {
                    A033 = C24861Ly.A03(A002, C42631yU.A0A, "NATIVE_CONTACTS_NOT_SYNC_WITH_DEVICE", (String[]) null);
                    A033.getCount();
                    i = A033.getCount();
                    while (A033.moveToNext()) {
                        A13.add(C42651yW.A02(A033, r7.A00));
                    }
                    A033.close();
                    A002.close();
                } catch (Throwable th) {
                    A002.close();
                    throw th;
                }
            } catch (IllegalStateException e) {
                AnonymousClass1M2.A0G(e, "ContactManagerDatabase/getWaOnlyNativeContacts/", i, A13.size());
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            r7.A07.A0J(A13);
            A13.size();
            r6.A01();
            HashSet A122 = C17880vN.A12();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0O = C17880vN.A0O(it);
                AnonymousClass25N r0 = new AnonymousClass25N(phoneContactsSelector.A0A.A0F(A0O, -1, false, true).A01, A0O.A0J(), A0O.A0K());
                r0.A01 = A0O;
                A122.add(r0);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("phone-contacts-selector/getWaOnlyNativeContacts size: ");
            C17900vP.A0o(A10, A122.size());
            A12.addAll(A122);
        }
        ArrayList A132 = AnonymousClass000.A13();
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "contact_id";
        AnonymousClass11B A0O2 = this.A01.A0O();
        if (A0O2 == null) {
            Log.w("phone-contacts-selector/contact cr=null");
        } else {
            try {
                A032 = A0O2.A03(ContactsContract.DeletedContacts.CONTENT_URI, A1Y, (String) null, (String[]) null, (String) null);
                if (A032 != null) {
                    int columnIndex = A032.getColumnIndex("contact_id");
                    while (A032.moveToNext()) {
                        A132.add(new AnonymousClass25N((String) null, (long) A032.getInt(columnIndex), (String) null));
                    }
                    A032.close();
                    return new C53142c3(A132, A12);
                }
                Log.e("phone-contacts-selector/search deleted contact cursor was null");
            } catch (Exception e2) {
                Log.e("phone-contacts-selector/query deleted contact exception", e2);
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th, th3);
            }
        }
        A132 = AnonymousClass000.A13();
        return new C53142c3(A132, A12);
        throw th;
        throw th;
    }
}
