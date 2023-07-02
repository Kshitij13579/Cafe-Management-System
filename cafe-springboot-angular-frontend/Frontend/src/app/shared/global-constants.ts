export class GlobalConstants{

    //Message
    public static generiError: string = "Something went worng. Please try again later";

    public static unathorized:string = "You are not authorized person to access this page.";

    public static productExistsError:string = "Product already exists";

    public static productAdded:string ="Product added successfully";
    //Regex
    public static nameRegex:string = "[a-zA-Z0-9 ]*";

    public static emailRegex:string = "[A-Za-z0-9._%-]+@[A-Za-z0-9._%-]+\\.[a-z]{2,3}";

    public static contactNumberRegex:string = "^[e0-9]{10,10}$";

    //Variable
    public static error:string = "error";
}