package X;

import com.google.protobuf.CodedOutputStream;
import java.nio.charset.Charset;

public final class CVN {
    public final CodedOutputStream A00;

    public void A00(EAO eao, Object obj, int i) {
        CodedOutputStream codedOutputStream = this.A00;
        int i2 = i << 3;
        codedOutputStream.A08(i2 | 3);
        eao.CSV(codedOutputStream.A00, obj);
        codedOutputStream.A08(i2 | 4);
    }

    public CVN(CodedOutputStream codedOutputStream) {
        Charset charset = CIC.A04;
        this.A00 = codedOutputStream;
        codedOutputStream.A00 = this;
    }
}
