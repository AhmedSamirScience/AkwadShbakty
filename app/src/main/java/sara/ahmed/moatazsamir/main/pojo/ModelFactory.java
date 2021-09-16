package sara.ahmed.moatazsamir.main.pojo;

public class ModelFactory
{
    public static Model createModel(String modelType, String bundleTypeName)
    {
        switch (modelType)
        {
            case "Etisalat":
                return new Etisalat(bundleTypeName);
            case "Orange":
                return new Orange (bundleTypeName);
            case "We":
                return new We (bundleTypeName);
            case "Vodafone":
                return new Vodafone (bundleTypeName);
            default:
                return null;

        }
    }
}
