package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class agm extends aqp {
    public int mGb;
    public LinkedList<arf> mGc = new LinkedList();
    public int mGd;
    public LinkedList<arf> mGe = new LinkedList();
    public String mpB;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mpB != null) {
                aVar.e(2, this.mpB);
            }
            aVar.dV(3, this.mGb);
            aVar.d(4, 8, this.mGc);
            aVar.dV(5, this.mGd);
            aVar.d(6, 8, this.mGe);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mpB != null) {
                r0 += a.a.a.b.b.a.f(2, this.mpB);
            }
            return (((r0 + a.a.a.a.dS(3, this.mGb)) + a.a.a.a.c(4, 8, this.mGc)) + a.a.a.a.dS(5, this.mGd)) + a.a.a.a.c(6, 8, this.mGe);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mGc.clear();
            this.mGe.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            agm com_tencent_mm_protocal_c_agm = (agm) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            com.tencent.mm.ba.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agm.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_agm.mpB = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_agm.mGb = aVar3.pMj.mH();
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new arf();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agm.mGc.add(enVar);
                    }
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_agm.mGd = aVar3.pMj.mH();
                    return 0;
                case 6:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new arf();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agm.mGe.add(enVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
