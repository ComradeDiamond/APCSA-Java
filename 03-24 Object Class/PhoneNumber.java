public class PhoneNumber
{
    private int areaCode;
    private int middleCode;
    private int endCode;

    public PhoneNumber(int areaCode, int middleCode, int endCode)
    {
        this.areaCode = areaCode;
        this.middleCode = middleCode;
        this.endCode = endCode;
    }

    public String toString()
    {
        return areaCode + "-" + middleCode + "-" + endCode;
    }

    public boolean equals(PhoneNumber other)
    {
        return this.areaCode == other.areaCode;
    }
}