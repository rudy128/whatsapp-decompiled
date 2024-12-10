package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9uU  reason: invalid class name and case insensitive filesystem */
public final class C196119uU {
    public final List A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196119uU) {
                C196119uU r8 = (C196119uU) obj;
                if (this.A01 != r8.A01 || !C18070vi.A18(this.A00, r8.A00) || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C193369py A00(long j) {
        long j2 = j - this.A01;
        if (j2 > 259200000) {
            return null;
        }
        boolean z = true;
        if (j2 <= 86400000) {
            if (!C18070vi.A18(Locale.getDefault().toString(), this.A02)) {
                List list = this.A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AnonymousClass000.A1a(((AM8) it.next()).A01.A0C)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        return new C193369py(this.A00, z);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass8BV.A00(this.A01)));
    }

    public C196119uU(String str, List list, long j) {
        this.A01 = j;
        this.A00 = list;
        this.A02 = str;
    }

    public final JSONObject A01() {
        JSONObject A15 = C17880vN.A15();
        A15.put("write_time_ms", this.A01);
        List<AM8> list = this.A00;
        ArrayList A0D = C29351c6.A0D(list);
        for (AM8 am8 : list) {
            JSONObject A152 = C17880vN.A15();
            A152.put("thumbnailUrl", am8.A00.A00);
            AM9 am9 = am8.A01;
            List<ARCapabilityMinVersionModeling> list2 = am9.A0B;
            ArrayList A0E = C29351c6.A0E(list2);
            for (ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling : list2) {
                JSONObject A0u = C108985cd.A0u(aRCapabilityMinVersionModeling);
                A0u.put("capability", aRCapabilityMinVersionModeling.mCapability.getXplatValue());
                A0u.put("minVersion", aRCapabilityMinVersionModeling.mMinVersion);
                A0E.add(A0u);
            }
            JSONArray jSONArray = new JSONArray(A0E);
            List<C193389q1> list3 = am9.A0C;
            ArrayList A0E2 = C29351c6.A0E(list3);
            for (C193389q1 r6 : list3) {
                JSONObject A153 = C17880vN.A15();
                A153.put("token", r6.A01);
                A153.put("text", r6.A00);
                A0E2.add(A153);
            }
            JSONArray jSONArray2 = new JSONArray(A0E2);
            JSONObject A154 = C17880vN.A15();
            A154.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, am9.A03.A00);
            A154.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, am9.A05.A00);
            A154.put("instanceId", am9.A04.A00);
            A154.put("cacheKey", am9.A06);
            A154.put("uri", am9.A0A);
            A154.put("md5Hash", am9.A08);
            A154.put("requiredSdkVersion", am9.A09);
            A154.put("fileSizeBytes", am9.A00);
            A154.put("uncompressedFileSizeBytes", am9.A01);
            A154.put("compressionMethod", am9.A02.name());
            A154.put("arCapabilityMinVersionModelings", jSONArray);
            A154.put("manifestJson", am9.A07);
            A154.put("usesFlmCapability", am9.A0E);
            A154.put("effectInstructions", jSONArray2);
            A152.put("metadata", A154);
            A0D.add(A152);
        }
        A15.put("effects", new JSONArray(A0D));
        A15.put("locale", this.A02);
        return A15;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InternalCacheData(writeTimeMs=");
        A10.append(this.A01);
        A10.append(", effects=");
        A10.append(this.A00);
        A10.append(", locale=");
        return C17900vP.A0B(this.A02, A10);
    }
}
