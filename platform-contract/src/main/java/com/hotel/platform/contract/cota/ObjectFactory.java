
package com.hotel.platform.contract.cota;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OTAHotelResModifyRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelResModifyRS");
    private final static QName _OTAHotelResRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelResRS");
    private final static QName _ClientName_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ClientName");
    private final static QName _Remarks_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Remarks");
    private final static QName _OTANotifReportRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_NotifReportRS");
    private final static QName _TPAExtensions_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opentravel.ota._2003._05
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAHotelAvailRQ }
     * 
     */
    public OTAHotelAvailRQ createOTAHotelAvailRQ() {
        return new OTAHotelAvailRQ();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS }
     * 
     */
    public OTAHotelAvailRS createOTAHotelAvailRS() {
        return new OTAHotelAvailRS();
    }

    /**
     * Create an instance of {@link OTACancelRQ }
     * 
     */
    public OTACancelRQ createOTACancelRQ() {
        return new OTACancelRQ();
    }

    /**
     * Create an instance of {@link OTAReadRQ }
     * 
     */
    public OTAReadRQ createOTAReadRQ() {
        return new OTAReadRQ();
    }

    /**
     * Create an instance of {@link OTAReadRS }
     * 
     */
    public OTAReadRS createOTAReadRS() {
        return new OTAReadRS();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS }
     * 
     */
    public OTAResRetrieveRS createOTAResRetrieveRS() {
        return new OTAResRetrieveRS();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType }
     * 
     */
    public RatePlanCandidatesType createRatePlanCandidatesType() {
        return new RatePlanCandidatesType();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType }
     * 
     */
    public ItemSearchCriterionType createItemSearchCriterionType() {
        return new ItemSearchCriterionType();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType }
     * 
     */
    public HotelSearchCriteriaType createHotelSearchCriteriaType() {
        return new HotelSearchCriteriaType();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType }
     * 
     */
    public HotelSearchCriterionType createHotelSearchCriterionType() {
        return new HotelSearchCriterionType();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.RoomStayCandidates }
     * 
     */
    public HotelSearchCriterionType.RoomStayCandidates createHotelSearchCriterionTypeRoomStayCandidates() {
        return new HotelSearchCriterionType.RoomStayCandidates();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType }
     * 
     */
    public AvailRequestSegmentsType createAvailRequestSegmentsType() {
        return new AvailRequestSegmentsType();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment createAvailRequestSegmentsTypeAvailRequestSegment() {
        return new AvailRequestSegmentsType.AvailRequestSegment();
    }

    /**
     * Create an instance of {@link AccessesType }
     * 
     */
    public AccessesType createAccessesType() {
        return new AccessesType();
    }

    /**
     * Create an instance of {@link HotelResModifyType }
     * 
     */
    public HotelResModifyType createHotelResModifyType() {
        return new HotelResModifyType();
    }

    /**
     * Create an instance of {@link ResCommonDetailType }
     * 
     */
    public ResCommonDetailType createResCommonDetailType() {
        return new ResCommonDetailType();
    }

    /**
     * Create an instance of {@link TransportInfoType }
     * 
     */
    public TransportInfoType createTransportInfoType() {
        return new TransportInfoType();
    }

    /**
     * Create an instance of {@link SpecialRequestType }
     * 
     */
    public SpecialRequestType createSpecialRequestType() {
        return new SpecialRequestType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link RoomStaysType }
     * 
     */
    public RoomStaysType createRoomStaysType() {
        return new RoomStaysType();
    }

    /**
     * Create an instance of {@link RoomStayType }
     * 
     */
    public RoomStayType createRoomStayType() {
        return new RoomStayType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates }
     * 
     */
    public RoomStayType.RoomRates createRoomStayTypeRoomRates() {
        return new RoomStayType.RoomRates();
    }

    /**
     * Create an instance of {@link RoomRateType }
     * 
     */
    public RoomRateType createRoomRateType() {
        return new RoomRateType();
    }

    /**
     * Create an instance of {@link RoomRateType.Features }
     * 
     */
    public RoomRateType.Features createRoomRateTypeFeatures() {
        return new RoomRateType.Features();
    }

    /**
     * Create an instance of {@link RoomStayType.RatePlans }
     * 
     */
    public RoomStayType.RatePlans createRoomStayTypeRatePlans() {
        return new RoomStayType.RatePlans();
    }

    /**
     * Create an instance of {@link RatePlanType }
     * 
     */
    public RatePlanType createRatePlanType() {
        return new RatePlanType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomTypes }
     * 
     */
    public RoomStayType.RoomTypes createRoomStayTypeRoomTypes() {
        return new RoomStayType.RoomTypes();
    }

    /**
     * Create an instance of {@link RevenueCategoryType }
     * 
     */
    public RevenueCategoryType createRevenueCategoryType() {
        return new RevenueCategoryType();
    }

    /**
     * Create an instance of {@link PaymentFormType }
     * 
     */
    public PaymentFormType createPaymentFormType() {
        return new PaymentFormType();
    }

    /**
     * Create an instance of {@link MembershipType }
     * 
     */
    public MembershipType createMembershipType() {
        return new MembershipType();
    }

    /**
     * Create an instance of {@link HotelReservationType }
     * 
     */
    public HotelReservationType createHotelReservationType() {
        return new HotelReservationType();
    }

    /**
     * Create an instance of {@link HotelReservationIDsType }
     * 
     */
    public HotelReservationIDsType createHotelReservationIDsType() {
        return new HotelReservationIDsType();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType }
     * 
     */
    public RequiredPaymentsType createRequiredPaymentsType() {
        return new RequiredPaymentsType();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment createRequiredPaymentsTypeGuaranteePayment() {
        return new RequiredPaymentsType.GuaranteePayment();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link GuaranteeType }
     * 
     */
    public GuaranteeType createGuaranteeType() {
        return new GuaranteeType();
    }

    /**
     * Create an instance of {@link GuaranteeType.GuaranteesAccepted }
     * 
     */
    public GuaranteeType.GuaranteesAccepted createGuaranteeTypeGuaranteesAccepted() {
        return new GuaranteeType.GuaranteesAccepted();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link GuestCountType }
     * 
     */
    public GuestCountType createGuestCountType() {
        return new GuestCountType();
    }

    /**
     * Create an instance of {@link TextDescriptionType }
     * 
     */
    public TextDescriptionType createTextDescriptionType() {
        return new TextDescriptionType();
    }

    /**
     * Create an instance of {@link ProfilesType }
     * 
     */
    public ProfilesType createProfilesType() {
        return new ProfilesType();
    }

    /**
     * Create an instance of {@link ContactPersonType }
     * 
     */
    public ContactPersonType createContactPersonType() {
        return new ContactPersonType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link OTAReadRQ.ReadRequests }
     * 
     */
    public OTAReadRQ.ReadRequests createOTAReadRQReadRequests() {
        return new OTAReadRQ.ReadRequests();
    }

    /**
     * Create an instance of {@link HotelReservationsType }
     * 
     */
    public HotelReservationsType createHotelReservationsType() {
        return new HotelReservationsType();
    }

    /**
     * Create an instance of {@link HotelResModifiesType }
     * 
     */
    public HotelResModifiesType createHotelResModifiesType() {
        return new HotelResModifiesType();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.HotelStays }
     * 
     */
    public OTAHotelAvailRS.HotelStays createOTAHotelAvailRSHotelStays() {
        return new OTAHotelAvailRS.HotelStays();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.HotelStays.HotelStay }
     * 
     */
    public OTAHotelAvailRS.HotelStays.HotelStay createOTAHotelAvailRSHotelStaysHotelStay() {
        return new OTAHotelAvailRS.HotelStays.HotelStay();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.RoomStays }
     * 
     */
    public OTAHotelAvailRS.RoomStays createOTAHotelAvailRSRoomStays() {
        return new OTAHotelAvailRS.RoomStays();
    }

    /**
     * Create an instance of {@link HotelResModifyResponseType }
     * 
     */
    public HotelResModifyResponseType createHotelResModifyResponseType() {
        return new HotelResModifyResponseType();
    }

    /**
     * Create an instance of {@link POSType }
     * 
     */
    public POSType createPOSType() {
        return new POSType();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRQ.AvailRequestSegments }
     * 
     */
    public OTAHotelAvailRQ.AvailRequestSegments createOTAHotelAvailRQAvailRequestSegments() {
        return new OTAHotelAvailRQ.AvailRequestSegments();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link OTACancelRQ.Reasons }
     * 
     */
    public OTACancelRQ.Reasons createOTACancelRQReasons() {
        return new OTACancelRQ.Reasons();
    }

    /**
     * Create an instance of {@link OTACancelRS }
     * 
     */
    public OTACancelRS createOTACancelRS() {
        return new OTACancelRS();
    }

    /**
     * Create an instance of {@link OTAHotelResModifyRQ }
     * 
     */
    public OTAHotelResModifyRQ createOTAHotelResModifyRQ() {
        return new OTAHotelResModifyRQ();
    }

    /**
     * Create an instance of {@link HotelResModifyRequestType }
     * 
     */
    public HotelResModifyRequestType createHotelResModifyRequestType() {
        return new HotelResModifyRequestType();
    }

    /**
     * Create an instance of {@link OTAHotelResRQ }
     * 
     */
    public OTAHotelResRQ createOTAHotelResRQ() {
        return new OTAHotelResRQ();
    }

    /**
     * Create an instance of {@link HotelResRequestType }
     * 
     */
    public HotelResRequestType createHotelResRequestType() {
        return new HotelResRequestType();
    }

    /**
     * Create an instance of {@link HotelResResponseType }
     * 
     */
    public HotelResResponseType createHotelResResponseType() {
        return new HotelResResponseType();
    }

    /**
     * Create an instance of {@link OTAReadRS.HotelReservations }
     * 
     */
    public OTAReadRS.HotelReservations createOTAReadRSHotelReservations() {
        return new OTAReadRS.HotelReservations();
    }

    /**
     * Create an instance of {@link CompanyName }
     * 
     */
    public CompanyName createCompanyName() {
        return new CompanyName();
    }

    /**
     * Create an instance of {@link HotelID }
     * 
     */
    public HotelID createHotelID() {
        return new HotelID();
    }

    /**
     * Create an instance of {@link HotelIDs }
     * 
     */
    public HotelIDs createHotelIDs() {
        return new HotelIDs();
    }

    /**
     * Create an instance of {@link HotelReservationID }
     * 
     */
    public HotelReservationID createHotelReservationID() {
        return new HotelReservationID();
    }

    /**
     * Create an instance of {@link HotelReservationIDs }
     * 
     */
    public HotelReservationIDs createHotelReservationIDs() {
        return new HotelReservationIDs();
    }

    /**
     * Create an instance of {@link OTAHotelResPaymentNotifRQ }
     * 
     */
    public OTAHotelResPaymentNotifRQ createOTAHotelResPaymentNotifRQ() {
        return new OTAHotelResPaymentNotifRQ();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link RequestorID }
     * 
     */
    public RequestorID createRequestorID() {
        return new RequestorID();
    }

    /**
     * Create an instance of {@link ResPayment }
     * 
     */
    public ResPayment createResPayment() {
        return new ResPayment();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link TotalAmount }
     * 
     */
    public TotalAmount createTotalAmount() {
        return new TotalAmount();
    }

    /**
     * Create an instance of {@link GuestRoom }
     * 
     */
    public GuestRoom createGuestRoom() {
        return new GuestRoom();
    }

    /**
     * Create an instance of {@link ResGuest }
     * 
     */
    public ResGuest createResGuest() {
        return new ResGuest();
    }

    /**
     * Create an instance of {@link GuestRooms }
     * 
     */
    public GuestRooms createGuestRooms() {
        return new GuestRooms();
    }

    /**
     * Create an instance of {@link OTAHotelStayInfoNotifRS }
     * 
     */
    public OTAHotelStayInfoNotifRS createOTAHotelStayInfoNotifRS() {
        return new OTAHotelStayInfoNotifRS();
    }

    /**
     * Create an instance of {@link StayInfos }
     * 
     */
    public StayInfos createStayInfos() {
        return new StayInfos();
    }

    /**
     * Create an instance of {@link StayInfo }
     * 
     */
    public StayInfo createStayInfo() {
        return new StayInfo();
    }

    /**
     * Create an instance of {@link ReservationID }
     * 
     */
    public ReservationID createReservationID() {
        return new ReservationID();
    }

    /**
     * Create an instance of {@link MessageAcknowledgementType }
     * 
     */
    public MessageAcknowledgementType createMessageAcknowledgementType() {
        return new MessageAcknowledgementType();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList }
     * 
     */
    public OTAResRetrieveRS.ReservationsList createOTAResRetrieveRSReservationsList() {
        return new OTAResRetrieveRS.ReservationsList();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link ProfileType }
     * 
     */
    public ProfileType createProfileType() {
        return new ProfileType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link TotalType }
     * 
     */
    public TotalType createTotalType() {
        return new TotalType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType }
     * 
     */
    public BasicPropertyInfoType createBasicPropertyInfoType() {
        return new BasicPropertyInfoType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link DateTimeSpanType }
     * 
     */
    public DateTimeSpanType createDateTimeSpanType() {
        return new DateTimeSpanType();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link CancelPenaltiesType }
     * 
     */
    public CancelPenaltiesType createCancelPenaltiesType() {
        return new CancelPenaltiesType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link RoomTypeType }
     * 
     */
    public RoomTypeType createRoomTypeType() {
        return new RoomTypeType();
    }

    /**
     * Create an instance of {@link RoomAmenityPrefType }
     * 
     */
    public RoomAmenityPrefType createRoomAmenityPrefType() {
        return new RoomAmenityPrefType();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link ResGuestType }
     * 
     */
    public ResGuestType createResGuestType() {
        return new ResGuestType();
    }

    /**
     * Create an instance of {@link ResGuestsType }
     * 
     */
    public ResGuestsType createResGuestsType() {
        return new ResGuestsType();
    }

    /**
     * Create an instance of {@link RevenueCategoriesType }
     * 
     */
    public RevenueCategoriesType createRevenueCategoriesType() {
        return new RevenueCategoriesType();
    }

    /**
     * Create an instance of {@link RevenueDetailsType }
     * 
     */
    public RevenueDetailsType createRevenueDetailsType() {
        return new RevenueDetailsType();
    }

    /**
     * Create an instance of {@link RevenueDetailType }
     * 
     */
    public RevenueDetailType createRevenueDetailType() {
        return new RevenueDetailType();
    }

    /**
     * Create an instance of {@link ResGlobalInfoType }
     * 
     */
    public ResGlobalInfoType createResGlobalInfoType() {
        return new ResGlobalInfoType();
    }

    /**
     * Create an instance of {@link ResGuestRPHsType }
     * 
     */
    public ResGuestRPHsType createResGuestRPHsType() {
        return new ResGuestRPHsType();
    }

    /**
     * Create an instance of {@link StayInfosType }
     * 
     */
    public StayInfosType createStayInfosType() {
        return new StayInfosType();
    }

    /**
     * Create an instance of {@link StayInfoType }
     * 
     */
    public StayInfoType createStayInfoType() {
        return new StayInfoType();
    }

    /**
     * Create an instance of {@link FolioIDsType }
     * 
     */
    public FolioIDsType createFolioIDsType() {
        return new FolioIDsType();
    }

    /**
     * Create an instance of {@link AcceptedPaymentsType }
     * 
     */
    public AcceptedPaymentsType createAcceptedPaymentsType() {
        return new AcceptedPaymentsType();
    }

    /**
     * Create an instance of {@link InvoiceContactTypeTelephone }
     * 
     */
    public InvoiceContactTypeTelephone createInvoiceContactTypeTelephone() {
        return new InvoiceContactTypeTelephone();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     * 
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link InvoiceContactType }
     * 
     */
    public InvoiceContactType createInvoiceContactType() {
        return new InvoiceContactType();
    }

    /**
     * Create an instance of {@link RoomStayCandidateType }
     * 
     */
    public RoomStayCandidateType createRoomStayCandidateType() {
        return new RoomStayCandidateType();
    }

    /**
     * Create an instance of {@link VerificationType }
     * 
     */
    public VerificationType createVerificationType() {
        return new VerificationType();
    }

    /**
     * Create an instance of {@link CancelRuleType }
     * 
     */
    public CancelRuleType createCancelRuleType() {
        return new CancelRuleType();
    }

    /**
     * Create an instance of {@link CancelInfoRSType }
     * 
     */
    public CancelInfoRSType createCancelInfoRSType() {
        return new CancelInfoRSType();
    }

    /**
     * Create an instance of {@link RatePlanCandidatesType.RatePlanCandidate }
     * 
     */
    public RatePlanCandidatesType.RatePlanCandidate createRatePlanCandidatesTypeRatePlanCandidate() {
        return new RatePlanCandidatesType.RatePlanCandidate();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.HotelRef }
     * 
     */
    public ItemSearchCriterionType.HotelRef createItemSearchCriterionTypeHotelRef() {
        return new ItemSearchCriterionType.HotelRef();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.Criterion }
     * 
     */
    public HotelSearchCriteriaType.Criterion createHotelSearchCriteriaTypeCriterion() {
        return new HotelSearchCriteriaType.Criterion();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.RoomStayCandidates.RoomStayCandidate }
     * 
     */
    public HotelSearchCriterionType.RoomStayCandidates.RoomStayCandidate createHotelSearchCriterionTypeRoomStayCandidatesRoomStayCandidate() {
        return new HotelSearchCriterionType.RoomStayCandidates.RoomStayCandidate();
    }

    /**
     * Create an instance of {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
     * 
     */
    public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria createAvailRequestSegmentsTypeAvailRequestSegmentHotelSearchCriteria() {
        return new AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria();
    }

    /**
     * Create an instance of {@link AccessesType.Access }
     * 
     */
    public AccessesType.Access createAccessesTypeAccess() {
        return new AccessesType.Access();
    }

    /**
     * Create an instance of {@link HotelResModifyType.ResGlobalInfo }
     * 
     */
    public HotelResModifyType.ResGlobalInfo createHotelResModifyTypeResGlobalInfo() {
        return new HotelResModifyType.ResGlobalInfo();
    }

    /**
     * Create an instance of {@link ResCommonDetailType.TimeSpan }
     * 
     */
    public ResCommonDetailType.TimeSpan createResCommonDetailTypeTimeSpan() {
        return new ResCommonDetailType.TimeSpan();
    }

    /**
     * Create an instance of {@link TransportInfoType.TransportInfo }
     * 
     */
    public TransportInfoType.TransportInfo createTransportInfoTypeTransportInfo() {
        return new TransportInfoType.TransportInfo();
    }

    /**
     * Create an instance of {@link SpecialRequestType.SpecialRequest }
     * 
     */
    public SpecialRequestType.SpecialRequest createSpecialRequestTypeSpecialRequest() {
        return new SpecialRequestType.SpecialRequest();
    }

    /**
     * Create an instance of {@link ParagraphType.ListItem }
     * 
     */
    public ParagraphType.ListItem createParagraphTypeListItem() {
        return new ParagraphType.ListItem();
    }

    /**
     * Create an instance of {@link RoomStaysType.RoomStay }
     * 
     */
    public RoomStaysType.RoomStay createRoomStaysTypeRoomStay() {
        return new RoomStaysType.RoomStay();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate }
     * 
     */
    public RoomStayType.RoomRates.RoomRate createRoomStayTypeRoomRatesRoomRate() {
        return new RoomStayType.RoomRates.RoomRate();
    }

    /**
     * Create an instance of {@link RoomRateType.Features.Feature }
     * 
     */
    public RoomRateType.Features.Feature createRoomRateTypeFeaturesFeature() {
        return new RoomRateType.Features.Feature();
    }

    /**
     * Create an instance of {@link RoomStayType.RatePlans.RatePlan }
     * 
     */
    public RoomStayType.RatePlans.RatePlan createRoomStayTypeRatePlansRatePlan() {
        return new RoomStayType.RatePlans.RatePlan();
    }

    /**
     * Create an instance of {@link RatePlanType.MealsIncluded }
     * 
     */
    public RatePlanType.MealsIncluded createRatePlanTypeMealsIncluded() {
        return new RatePlanType.MealsIncluded();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomTypes.RoomType }
     * 
     */
    public RoomStayType.RoomTypes.RoomType createRoomStayTypeRoomTypesRoomType() {
        return new RoomStayType.RoomTypes.RoomType();
    }

    /**
     * Create an instance of {@link RevenueCategoryType.SummaryAmount }
     * 
     */
    public RevenueCategoryType.SummaryAmount createRevenueCategoryTypeSummaryAmount() {
        return new RevenueCategoryType.SummaryAmount();
    }

    /**
     * Create an instance of {@link PaymentFormType.MiscChargeOrder }
     * 
     */
    public PaymentFormType.MiscChargeOrder createPaymentFormTypeMiscChargeOrder() {
        return new PaymentFormType.MiscChargeOrder();
    }

    /**
     * Create an instance of {@link PaymentFormType.Cash }
     * 
     */
    public PaymentFormType.Cash createPaymentFormTypeCash() {
        return new PaymentFormType.Cash();
    }

    /**
     * Create an instance of {@link MembershipType.Membership }
     * 
     */
    public MembershipType.Membership createMembershipTypeMembership() {
        return new MembershipType.Membership();
    }

    /**
     * Create an instance of {@link HotelReservationType.ResGlobalInfo }
     * 
     */
    public HotelReservationType.ResGlobalInfo createHotelReservationTypeResGlobalInfo() {
        return new HotelReservationType.ResGlobalInfo();
    }

    /**
     * Create an instance of {@link HotelReservationIDsType.HotelReservationID }
     * 
     */
    public HotelReservationIDsType.HotelReservationID createHotelReservationIDsTypeHotelReservationID() {
        return new HotelReservationIDsType.HotelReservationID();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.AmountPercent createRequiredPaymentsTypeGuaranteePaymentAmountPercent() {
        return new RequiredPaymentsType.GuaranteePayment.AmountPercent();
    }

    /**
     * Create an instance of {@link RateType.Rate }
     * 
     */
    public RateType.Rate createRateTypeRate() {
        return new RateType.Rate();
    }

    /**
     * Create an instance of {@link AmountType.Discount }
     * 
     */
    public AmountType.Discount createAmountTypeDiscount() {
        return new AmountType.Discount();
    }

    /**
     * Create an instance of {@link GuaranteeType.GuaranteesAccepted.GuaranteeAccepted }
     * 
     */
    public GuaranteeType.GuaranteesAccepted.GuaranteeAccepted createGuaranteeTypeGuaranteesAcceptedGuaranteeAccepted() {
        return new GuaranteeType.GuaranteesAccepted.GuaranteeAccepted();
    }

    /**
     * Create an instance of {@link CancelPenaltyType.Deadline }
     * 
     */
    public CancelPenaltyType.Deadline createCancelPenaltyTypeDeadline() {
        return new CancelPenaltyType.Deadline();
    }

    /**
     * Create an instance of {@link GuestCountType.GuestCount }
     * 
     */
    public GuestCountType.GuestCount createGuestCountTypeGuestCount() {
        return new GuestCountType.GuestCount();
    }

    /**
     * Create an instance of {@link TextDescriptionType.Description }
     * 
     */
    public TextDescriptionType.Description createTextDescriptionTypeDescription() {
        return new TextDescriptionType.Description();
    }

    /**
     * Create an instance of {@link ProfilesType.ProfileInfo }
     * 
     */
    public ProfilesType.ProfileInfo createProfilesTypeProfileInfo() {
        return new ProfilesType.ProfileInfo();
    }

    /**
     * Create an instance of {@link ContactPersonType.Telephone }
     * 
     */
    public ContactPersonType.Telephone createContactPersonTypeTelephone() {
        return new ContactPersonType.Telephone();
    }

    /**
     * Create an instance of {@link SourceType.RequestorID }
     * 
     */
    public SourceType.RequestorID createSourceTypeRequestorID() {
        return new SourceType.RequestorID();
    }

    /**
     * Create an instance of {@link OTAReadRQ.ReadRequests.ReadRequest }
     * 
     */
    public OTAReadRQ.ReadRequests.ReadRequest createOTAReadRQReadRequestsReadRequest() {
        return new OTAReadRQ.ReadRequests.ReadRequest();
    }

    /**
     * Create an instance of {@link HotelReservationsType.HotelReservation }
     * 
     */
    public HotelReservationsType.HotelReservation createHotelReservationsTypeHotelReservation() {
        return new HotelReservationsType.HotelReservation();
    }

    /**
     * Create an instance of {@link HotelResModifiesType.HotelResModify }
     * 
     */
    public HotelResModifiesType.HotelResModify createHotelResModifiesTypeHotelResModify() {
        return new HotelResModifiesType.HotelResModify();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo }
     * 
     */
    public OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo createOTAHotelAvailRSHotelStaysHotelStayBasicPropertyInfo() {
        return new OTAHotelAvailRS.HotelStays.HotelStay.BasicPropertyInfo();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS.RoomStays.RoomStay }
     * 
     */
    public OTAHotelAvailRS.RoomStays.RoomStay createOTAHotelAvailRSRoomStaysRoomStay() {
        return new OTAHotelAvailRS.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelResModifyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelResModifyRS")
    public JAXBElement<HotelResModifyResponseType> createOTAHotelResModifyRS(HotelResModifyResponseType value) {
        return new JAXBElement<HotelResModifyResponseType>(_OTAHotelResModifyRS_QNAME, HotelResModifyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelResResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelResRS")
    public JAXBElement<HotelResResponseType> createOTAHotelResRS(HotelResResponseType value) {
        return new JAXBElement<HotelResResponseType>(_OTAHotelResRS_QNAME, HotelResResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ClientName")
    public JAXBElement<String> createClientName(String value) {
        return new JAXBElement<String>(_ClientName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Remarks")
    public JAXBElement<String> createRemarks(String value) {
        return new JAXBElement<String>(_Remarks_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageAcknowledgementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_NotifReportRS")
    public JAXBElement<MessageAcknowledgementType> createOTANotifReportRS(MessageAcknowledgementType value) {
        return new JAXBElement<MessageAcknowledgementType>(_OTANotifReportRS_QNAME, MessageAcknowledgementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPAExtensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TPA_Extensions")
    public JAXBElement<TPAExtensionsType> createTPAExtensions(TPAExtensionsType value) {
        return new JAXBElement<TPAExtensionsType>(_TPAExtensions_QNAME, TPAExtensionsType.class, null, value);
    }

}
