package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Uu  reason: invalid class name and case insensitive filesystem */
public class C27121Uu {
    public final C27111Ut A00;

    public void A05(C60072nL r7) {
        C28791au A06 = this.A00.A06();
        try {
            ContentValues contentValues = new ContentValues();
            UserJid userJid = r7.A06;
            contentValues.put("jid", userJid.getRawString());
            contentValues.put("latitude", Double.valueOf(r7.A00));
            contentValues.put("longitude", Double.valueOf(r7.A01));
            contentValues.put("accuracy", Integer.valueOf(r7.A03));
            contentValues.put("speed", Float.valueOf(r7.A02));
            contentValues.put("bearing", Integer.valueOf(r7.A04));
            contentValues.put("location_ts", Long.valueOf(r7.A05));
            ((C28801av) A06).A02.A08("location_cache", "saveUserLocation/REPLACE_LOCATION_CACHE", contentValues);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/saveUserLocation/saved user location; jid=");
            sb.append(userJid);
            sb.append("; timestamp=");
            sb.append(r7.A05);
            Log.i(sb.toString());
            A06.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C27121Uu(C27111Ut r1) {
        this.A00 = r1;
    }

    public static ArrayList A00(C27121Uu r9, long j, boolean z) {
        String str;
        Cursor A0A;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            C28781at A05 = r9.A00.get();
            try {
                C23141Ev r5 = ((C28801av) A05).A02;
                String str2 = C50682Vj.A00;
                String[] strArr = new String[2];
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr[0] = str;
                strArr[1] = Long.toString(j);
                A0A = r5.A0A(str2, "getAllLocationSharers/QUERY_LOCATION_SHARER", strArr);
                while (A0A.moveToNext()) {
                    AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(A0A.getString(0));
                    C61582pv r1 = null;
                    if (A02 != null) {
                        r1 = new C61582pv(A0A, A02, UserJid.Companion.A04(A0A.getString(2)));
                    }
                    if (r1 != null) {
                        arrayList.add(r1);
                    }
                }
                A0A.close();
                A05.close();
                int i = Log.level;
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/getAllLocationSharers/returned ");
                sb.append(arrayList.size());
                sb.append(" location sharer; fromMe=");
                sb.append(z);
                sb.append(" | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return arrayList;
            } catch (Throwable th) {
                A05.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/getAllLocationSharers/error getting sharers", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    @Deprecated
    public static void A01(AnonymousClass1BI r13, C27121Uu r14, Collection collection, boolean z) {
        C41851xA BD1;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C28791au A06 = r14.A00.A06();
            try {
                BD1 = A06.BD1();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C23141Ev r5 = ((C28801av) A06).A02;
                    String[] strArr = new String[3];
                    strArr[0] = r13.getRawString();
                    strArr[1] = ((UserJid) it.next()).getRawString();
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    strArr[2] = str;
                    i += r5.A04("location_sharer", "remote_jid = ? AND remote_resource = ? AND from_me = ?", "deleteLocationSharers/DELETE_LOCATION_SHARERS", strArr);
                }
                BD1.A00();
                BD1.close();
                A06.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteLocationSharers/deleted ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    @Deprecated
    public static void A02(C27121Uu r9, long j, boolean z) {
        C28791au A06;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            A06 = r9.A00.A06();
            C23141Ev r5 = ((C28801av) A06).A02;
            String[] strArr = new String[3];
            strArr[0] = Long.toString(j);
            strArr[1] = Long.toString(0);
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[2] = str;
            int A04 = r5.A04("location_sharer", "expires < ? AND expires > ? AND from_me = ?", "deleteOldLocationSharers/DELETE_LOCATION_SHARER", strArr);
            A06.close();
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/deleteOldLocationSharers/deleted ");
            sb.append(A04);
            sb.append(" location sharers | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
            return;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteOldLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    @Deprecated
    public static void A03(C27121Uu r13, Iterable iterable, boolean z) {
        C41851xA BD0;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C28791au A06 = r13.A00.A06();
            try {
                BD0 = A06.BD0();
                Iterator it = iterable.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C23141Ev r5 = ((C28801av) A06).A02;
                    String[] strArr = new String[2];
                    strArr[0] = ((AnonymousClass1BI) it.next()).getRawString();
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    strArr[1] = str;
                    i += r5.A04("location_sharer", "remote_jid = ? AND from_me = ?", "deleteLocationSharers/DELETE_LOCATION_SHARER", strArr);
                }
                BD0.A00();
                BD0.close();
                A06.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteLocationSharers/deleted ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    @Deprecated
    public HashSet A04() {
        Cursor A0A;
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        try {
            C28781at A05 = this.A00.get();
            try {
                A0A = ((C28801av) A05).A02.A0A("SELECT jid FROM location_key_distribution WHERE sent_to_server = ?", "getAllLocationReceiverHasKey/QUERY_LOCATION_KEY_DISTRIBUTION", new String[]{"1"});
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("jid");
                while (A0A.moveToNext()) {
                    UserJid A04 = UserJid.Companion.A04(A0A.getString(columnIndexOrThrow));
                    if (A04 != null) {
                        hashSet.add(A04);
                    }
                }
                A0A.close();
                A05.close();
                int i = Log.level;
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/getAllLocationReceiverHasKey/returned ");
                sb.append(hashSet.size());
                sb.append(" location receivers has key | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return hashSet;
            } catch (Throwable th) {
                A05.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/getAllLocationReceiverHasKey/error reading database", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    @Deprecated
    public void A06(Collection collection) {
        C41851xA BD1;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C28791au A06 = this.A00.A06();
            try {
                BD1 = A06.BD1();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((C28801av) A06).A02.A04("location_cache", "jid = ?", "deleteUserLocations/DELETE_LOCATION_CACHE", new String[]{((UserJid) it.next()).getRawString()});
                }
                BD1.A00();
                BD1.close();
                A06.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteUserLocations/deleted ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteUserLocations/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    @Deprecated
    public void A07(Collection collection, long j) {
        C41851xA BD1;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C28791au A06 = this.A00.A06();
            try {
                BD1 = A06.BD1();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C54882er r7 = (C54882er) it.next();
                    for (UserJid rawString : r7.A03) {
                        ContentValues contentValues = new ContentValues();
                        AnonymousClass205 r8 = r7.A02;
                        AnonymousClass1BI r0 = r8.A00;
                        C17960vV.A07(r0);
                        contentValues.put("remote_jid", r0.getRawString());
                        contentValues.put("from_me", true);
                        contentValues.put("remote_resource", rawString.getRawString());
                        contentValues.put("expires", Long.valueOf(Math.min(r7.A01, j)));
                        contentValues.put("message_id", r8.A01);
                        int i2 = 0;
                        if (((C28801av) A06).A02.A08("location_sharer", "updateSharingExpire/REPLACE_LOCATION_SHARER", contentValues) >= 0) {
                            i2 = 1;
                        }
                        i += i2;
                    }
                }
                BD1.A00();
                BD1.close();
                A06.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/updateSharingExpire/update ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/updateSharingExpire/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A08(List list) {
        C41851xA BD1;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C28791au A06 = this.A00.A06();
            try {
                BD1 = A06.BD1();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C61582pv r5 = (C61582pv) it.next();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("remote_jid", r5.A01.getRawString());
                    UserJid userJid = r5.A02;
                    String str = null;
                    if (userJid != null) {
                        str = userJid.getRawString();
                    }
                    contentValues.put("remote_resource", str);
                    AnonymousClass205 r3 = r5.A03;
                    contentValues.put("from_me", Boolean.valueOf(r3.A02));
                    contentValues.put("expires", Long.valueOf(r5.A00));
                    contentValues.put("message_id", r3.A01);
                    ((C28801av) A06).A02.A08("location_sharer", "saveLocationSharer/REPLACE_LOCATION_SHARER", contentValues);
                }
                BD1.A00();
                BD1.close();
                A06.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/saveLocationSharer/saved ");
                sb.append(list.size());
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/saveLocationSharer/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A09(List list, boolean z) {
        C41851xA BD0;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C28791au A06 = this.A00.A06();
            try {
                BD0 = A06.BD0();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("jid", ((UserJid) it.next()).getRawString());
                    contentValues.put("sent_to_server", Boolean.valueOf(z));
                    ((C28801av) A06).A02.A08("location_key_distribution", "storeLocationReceiverHasKey/REPLACE_LOCATION_KEY_DISTRIBUTION", contentValues);
                }
                BD0.A00();
                BD0.close();
                A06.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/storeLocationReceiverHasKey/saved ");
                sb.append(list.size());
                sb.append(" location receiver has key: ");
                sb.append(z);
                sb.append(" | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/storeLocationReceiverHasKey/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }
}
